package com.cc.pos.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cc.pos.product.requestResponse.ProductRequest;
import com.cc.pos.product.requestResponse.ProductResponse;
import com.cc.pos.product.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	
	@RequestMapping(value = "/v1/product/menu", method = RequestMethod.POST)
	public ProductResponse getMenu(@RequestBody ProductRequest pr)
	{
		return productService.menu(pr);
		
	}

}
