package com.xmg.mall.base.upload;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.IOException;


public interface FileUploader {

	/**
	 * 获取所上传文件的基本 URI
	 */
	public String getBaseURI();

	/**
	 * 上传指定文件，使用随机文件名称。
	 * @param file 文件
	 * @return URI
	 */
	public String upload(MultipartFile file) throws IOException;
	/**
	 * 上传指定文件，使用随机文件名称。
	 * @param name 文件名称
	 * @param namespace 命名空间
	 * @param file 文件
	 * @return URI
	 */
	public String upload(String namespace, String name, MultipartFile file) throws IOException;


	/**
	 * 给定一个文件名称，上传指定文件。
	 * @param name 文件名称
	 * @param file 文件
	 * @return URI
	 * @throws IOException
	 */
	public String upload(String name, MultipartFile file) throws IOException;

	public void delete(String filename);
}
