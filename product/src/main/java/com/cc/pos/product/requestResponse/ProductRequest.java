package com.cc.pos.product.requestResponse;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductRequest {
	
	private String accountId;
	private String branchId;
	/**
	 * 
	 */
	public ProductRequest() {
		super();
	}
	/**
	 * @param accountId
	 * @param branchId
	 */
	public ProductRequest(String accountId, String branchId) {
		super();
		this.accountId = accountId;
		this.branchId = branchId;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getBranchId() {
		return branchId;
	}
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	@Override
	public String toString() {
		return "ProductRequest [accountId=" + accountId + ", branchId=" + branchId + "]";
	}
}
