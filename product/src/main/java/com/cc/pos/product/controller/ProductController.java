package com.cc.pos.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cc.pos.product.requestResponse.MenuRequest;
import com.cc.pos.product.requestResponse.MenuResponse;
import com.cc.pos.product.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;

	@RequestMapping(value = "/v1/branch/menu", method = RequestMethod.POST)
	public MenuResponse getBranchMenu(@RequestBody MenuRequest pr) {
		return productService.menu(pr);
	}

}
