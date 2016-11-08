package com.xmg.mall.base.upload;

public class ImageHardDiskFileUploader extends HardDiskFileUploader{
	
	public ImageHardDiskFileUploader() {
		setValidFileExtensions(new String[]{ "jpg", "png", "gif", "JPG", "PNG", "GIF" });
	}
	
}
