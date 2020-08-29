package com.cc.pos.product.requestResponse;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MenuCategory {
	
	private Long id;
	private String type;
	public MenuCategory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MenuCategory(Long id, String type) {
		super();
		this.id = id;
		this.type = type;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
