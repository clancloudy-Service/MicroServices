package com.cc.pos.product.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="product_line_item",schema = "public")
@DynamicUpdate
public class ProductLineItem {
	
	
	@Id
	private Long id;
	private String name;
	private Long product;
	private Long branch;
	
	

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "pli_category_junction",
            joinColumns = {@JoinColumn(name = "product_line_item")},
            inverseJoinColumns = {@JoinColumn(name = "product_category")}
    )
    private Set<ProductCategory> pcSet = new HashSet<>();

	private Timestamp modifieddate;
	private String modifiedby;
	@Column( name = "createddate", nullable = false, updatable = false )
	private Timestamp createddate;
	@Column( name = "createdby", nullable = false, updatable = false )
	private String createdby;
	
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
	public Long getProduct() {
		return product;
	}
	public void setProduct(Long product) {
		this.product = product;
	}
	public Long getBranch() {
		return branch;
	}
	public void setBranch(Long branch) {
		this.branch = branch;
	}
	public Timestamp getModifieddate() {
		return modifieddate;
	}
	public void setModifieddate(Timestamp modifieddate) {
		this.modifieddate = modifieddate;
	}
	public String getModifiedby() {
		return modifiedby;
	}
	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}
	public Timestamp getCreateddate() {
		return createddate;
	}
	public void setCreateddate(Timestamp createddate) {
		this.createddate = createddate;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	
	public Set<ProductCategory> getPcSet() {
		return pcSet;
	}
	public void setPcSet(Set<ProductCategory> pcSet) {
		this.pcSet = pcSet;
	}
	
}
