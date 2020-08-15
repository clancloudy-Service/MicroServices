package com.cc.pos.product.bean;

public class ProductLineItem {

	private String id;
	private String name;
	private String description;
	private boolean active;
	private String image;
	private Double price;

	/**
	 * 
	 */
	public ProductLineItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param active
	 * @param image
	 * @param price
	 */
	public ProductLineItem(String id, String name, String description, boolean active, String image, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.active = active;
		this.image = image;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductLineItem [id=" + id + ", name=" + name + ", description=" + description + ", active=" + active
				+ ", image=" + image + ", price=" + price + "]";
	}
}
