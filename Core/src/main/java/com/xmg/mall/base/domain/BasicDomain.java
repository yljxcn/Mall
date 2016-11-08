package com.xmg.mall.base.domain;

import java.io.Serializable;
import java.util.Date;

public class BasicDomain implements Serializable {

	private static final long serialVersionUID = 0L;

	protected Long id;
	private Date createdDate;
	private Date lastModifiedDate;
	private Integer version = 0;

	public void increaseVersion(){
		version += 1;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public BasicDomain setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
		return this;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public BasicDomain setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
		return this;
	}

	public Integer getVersion() {
		return version;
	}

	public BasicDomain setVersion(Integer version) {
		this.version = version;
		return this;
	}
}
