package com.cc.pos.product.productDAO;

import com.cc.pos.product.requestResponse.ProductRequest;
import com.cc.pos.product.requestResponse.ProductResponse;

public interface ProductDAO {
	
	public ProductResponse menu(ProductRequest pr);

}
