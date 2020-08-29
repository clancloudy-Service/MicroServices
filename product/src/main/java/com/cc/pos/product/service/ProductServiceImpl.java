package com.cc.pos.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cc.pos.product.productDAO.ProductDAO;
import com.cc.pos.product.requestResponse.MenuRequest;
import com.cc.pos.product.requestResponse.MenuResponse;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductDAO productDAO;

	@Override
	public MenuResponse menu(MenuRequest pr) {
		return productDAO.menu(pr);
	}

}
