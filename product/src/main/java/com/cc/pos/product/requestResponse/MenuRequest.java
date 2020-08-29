package com.cc.pos.product.requestResponse;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MenuRequest {
	
	private String accountId;
	private Long branchId;
	/**
	 * 
	 */
	public MenuRequest() {
		super();
	}
	/**
	 * @param accountId
	 * @param branchId
	 */
	public MenuRequest(String accountId, Long branchId) {
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
	public Long getBranchId() {
		return branchId;
	}
	public void setBranchId(Long branchId) {
		this.branchId = branchId;
	}

}
