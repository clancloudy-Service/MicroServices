package com.cc.pos.product.requestResponse;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MenuProductLineItem {
	
	private Long id;
	private String name;
	private String label;
	private double price;
	private String desc;
	private List<MenuCategory> category;
	private List<Images> images;
	public MenuProductLineItem() {
		super();
	}
	public MenuProductLineItem(Long id, String name, String label, double price, String desc,
			List<MenuCategory> category, List<Images> images) {
		super();
		this.id = id;
		this.name = name;
		this.label = label;
		this.price = price;
		this.desc = desc;
		this.category = category;
		this.images = images;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public List<MenuCategory> getCategory() {
		return category;
	}
	public void setCategory(List<MenuCategory> category) {
		this.category = category;
	}
	public List<Images> getImages() {
		return images;
	}
	public void setImages(List<Images> images) {
		this.images = images;
	}
}
