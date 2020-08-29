package com.cc.pos.product.productDAO;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cc.pos.product.entity.Product;
import com.cc.pos.product.entity.ProductLineItem;
import com.cc.pos.product.helper.MenuResponseHelper;
import com.cc.pos.product.repository.ProductLineItemRepository;
import com.cc.pos.product.repository.ProductRepository;
import com.cc.pos.product.requestResponse.MenuRequest;
import com.cc.pos.product.requestResponse.MenuResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class ProductDAOimpl implements ProductDAO,MenuResponseHelper {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ProductLineItemRepository productLineItemRepository;

	@Override
	public MenuResponse menu(MenuRequest pr) {
		
		
		List<ProductLineItem> pliLst=productLineItemRepository.findAllByBranch(pr.getBranchId());
		
		Map<Long,List<ProductLineItem>> pidPliMap=pliLst.stream().collect(Collectors.groupingBy(ProductLineItem::getProduct));
		
		List<Long> lstPro=pliLst.stream().map(v->new Long(v.getProduct())).distinct().collect(Collectors.toList());
		List<Product> producs=productRepository.findAllById(lstPro);
		
		Map<Long, Product> pidProductMap= producs.stream().collect(Collectors.toMap(Product::getId,  Function.identity()));
		System.out.println(pidProductMap);
		
		ObjectMapper mapper= new ObjectMapper();
		try {
			System.out.println(mapper.writeValueAsString(pidProductMap));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		
		
		return getMenuResponse(pidProductMap,pidPliMap);
	}

}
