package com.neuedu.ssmdemo.bean;

import java.util.Date;

/**
 * 
 * @author chensw
 *
 */
public class ProductVersion {
	private String versionNo;
	private Date produceDate;
	private String productDesc;
	
	public ProductVersion() {
		super();
	}

	public ProductVersion(String versionNo, Date produceDate, String productDesc) {
		super();
		this.versionNo = versionNo;
		this.produceDate = produceDate;
		this.productDesc = productDesc;
	}

	public String getVersionNo() {
		return versionNo;
	}

	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}

	public Date getProduceDate() {
		return produceDate;
	}

	public void setProduceDate(Date produceDate) {
		this.produceDate = produceDate;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

}
