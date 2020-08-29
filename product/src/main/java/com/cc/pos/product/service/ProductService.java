package com.cc.pos.product.service;

import com.cc.pos.product.requestResponse.MenuRequest;
import com.cc.pos.product.requestResponse.MenuResponse;

public interface ProductService {
	
	public MenuResponse menu(MenuRequest pr);

}
