package com.cc.pos.product.service;

import com.cc.pos.product.requestResponse.ProductRequest;
import com.cc.pos.product.requestResponse.ProductResponse;

public interface ProductService {
	
	public ProductResponse menu(ProductRequest pr);

}
