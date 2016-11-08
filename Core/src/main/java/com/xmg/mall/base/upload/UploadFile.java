package com.xmg.mall.base.upload;

import java.io.InputStream;

public class UploadFile {
	
	private String name;
	private long size;
	private InputStream inputStream;
	
	public InputStream getInputStream() {
		return inputStream;
	}

	public UploadFile(InputStream inputStream, String name, long size) {
		super();
		this.inputStream = inputStream;
		this.name = name;
		this.size = size;
	}
	
	public UploadFile() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

}
