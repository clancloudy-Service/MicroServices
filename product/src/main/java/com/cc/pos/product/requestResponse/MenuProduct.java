package com.cc.pos.product.requestResponse;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
@Builder
public class MenuProduct {
	
	private Long id;
	private String product;
	private String desc;
	private List<Images> images;
	private List<MenuProductLineItem> productLineItem;
	public MenuProduct() {
		super();
	}
	
	public MenuProduct(Long id, String product, String desc, List<Images> images,
			List<MenuProductLineItem> productLineItem) {
		super();
		this.id = id;
		this.product = product;
		this.desc = desc;
		this.images = images;
		this.productLineItem = productLineItem;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public List<Images> getImages() {
		return images;
	}
	public void setImages(List<Images> images) {
		this.images = images;
	}
	public List<MenuProductLineItem> getProductLineItem() {
		return productLineItem;
	}
	public void setProductLineItem(List<MenuProductLineItem> productLineItem) {
		this.productLineItem = productLineItem;
	}
}
