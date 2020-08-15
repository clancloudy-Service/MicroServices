package com.cc.pos.product.requestResponse;

import java.util.List;

import com.cc.pos.product.bean.Product;

public class ProductResponse {
	
	private String branchId;
	List<Product> product;
	/**
	 * 
	 */
	public ProductResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param branchId
	 * @param product
	 */
	public ProductResponse(String branchId, List<Product> product) {
		super();
		this.branchId = branchId;
		this.product = product;
	}
	public String getBranchId() {
		return branchId;
	}
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "ProductResponse [branchId=" + branchId + ", product=" + product + "]";
	}
	
	

}
