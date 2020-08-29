package com.cc.pos.product.helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.catalina.filters.AddDefaultCharsetFilter;

import com.cc.pos.product.entity.Product;
import com.cc.pos.product.entity.ProductCategory;
import com.cc.pos.product.entity.ProductLineItem;
import com.cc.pos.product.requestResponse.Images;
import com.cc.pos.product.requestResponse.MenuCategory;
import com.cc.pos.product.requestResponse.MenuProduct;
import com.cc.pos.product.requestResponse.MenuProductLineItem;
import com.cc.pos.product.requestResponse.MenuResponse;


public interface MenuResponseHelper {
	
	default MenuResponse getMenuResponse(Map<Long, Product> pidProductMap,Map<Long,List<ProductLineItem>> pidProductLineItemMap)
	{
		MenuResponse menu=new MenuResponse();
		List<MenuProduct> products=new ArrayList<MenuProduct>();
		
		
		
		for(Map.Entry<Long, Product> pair: pidProductMap.entrySet())
		{
			MenuProduct mp=new MenuProduct();
			mp.setProduct(pair.getValue().getName());
			mp.setId(pair.getValue().getId());
			List<MenuProductLineItem> productLineItem=new ArrayList<>();
			
			List<ProductLineItem> plst=pidProductLineItemMap.get(pair.getKey());
			for(ProductLineItem p: plst)
			{
					List<Images> ima=new ArrayList<Images>();;
					MenuProductLineItem mpi=new MenuProductLineItem(p.getId(), p.getName(), p.getName(), 11.0, "Description", createMenuCategory(p.getPcSet()), ima);
					
					productLineItem.add(mpi);
			}
			mp.setProductLineItem(productLineItem);
			
			
			products.add(mp);
		}		
		menu.setProducts(products);
		return menu;
	}
	default List<MenuCategory> createMenuCategory( Set<ProductCategory> pcSet){
		return pcSet.stream().map(v->new MenuCategory(v.getId(),v.getType())).collect(Collectors.toList());
		
	}

}
