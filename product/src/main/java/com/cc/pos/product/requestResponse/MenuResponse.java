package com.cc.pos.product.requestResponse;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder(builderMethodName = "builder")
public class MenuResponse {
	
	private List<MenuProduct> products;
	public MenuResponse() {
		super();
	}

	public MenuResponse(List<MenuProduct> products) {
		super();
		this.products = products;
	}

	public List<MenuProduct> getProducts() {
		return products;
	}

	public void setProducts(List<MenuProduct> products) {
		this.products = products;
	}
}
