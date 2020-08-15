package com.cc.pos.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cc.pos.product.productDAO.ProductDAO;
import com.cc.pos.product.requestResponse.ProductRequest;
import com.cc.pos.product.requestResponse.ProductResponse;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductDAO productDAO;

	@Override
	public ProductResponse menu(ProductRequest pr) {
		return productDAO.menu(pr);
	}

}
