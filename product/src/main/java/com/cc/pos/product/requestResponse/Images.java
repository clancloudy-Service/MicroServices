package com.cc.pos.product.requestResponse;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Images {
	
	private Long id;
	private String label;
	private String desc;
	private String url;
	private String altTxt;
	private String type;
	public Images() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Images(Long id, String label, String desc, String url, String altTxt, String type) {
		super();
		this.id = id;
		this.label = label;
		this.desc = desc;
		this.url = url;
		this.altTxt = altTxt;
		this.type = type;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getAltTxt() {
		return altTxt;
	}
	public void setAltTxt(String altTxt) {
		this.altTxt = altTxt;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
   
	

}
