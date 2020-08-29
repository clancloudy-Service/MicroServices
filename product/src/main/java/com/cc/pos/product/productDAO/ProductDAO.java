package com.cc.pos.product.productDAO;

import com.cc.pos.product.requestResponse.MenuRequest;
import com.cc.pos.product.requestResponse.MenuResponse;

public interface ProductDAO {
	
	public MenuResponse menu(MenuRequest pr);

}
