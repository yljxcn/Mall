package com.xmg.mall.base.upload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;

public class HardDiskFileUploader implements FileUploader {

	private String mappingUrlPrefix = "/files"; //

	private String baseDirectory;			//
	private String[] validFileExtensions; 	// 合法文件扩展名
	private Long maxFileSize; 				// 文件最大大小
	private String namespace;				//

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public void setBaseDirectory(String baseDirectory) {
		this.baseDirectory = baseDirectory;
	}

	public void setMaxFileSize(Long maxFileSize) {
		this.maxFileSize = maxFileSize;
	}

	public Long getMaxFileSize() {
		return maxFileSize;
	}

	public void setValidFileExtensions(String[] validFileExtensions) {
		this.validFileExtensions = validFileExtensions;
	}

	public String[] getValidFileExtensions() {
		return validFileExtensions;
	}

	@Override
	public String getBaseURI() {
		return baseDirectory;
	}

	@Override
	public String upload(UploadFile file) throws IOException {
		return upload(null, file);
	}


	@Override
	public String upload(String name, UploadFile file) throws IOException {

		if (file == null) throw new IllegalArgumentException("必须指定所上传的文件");

		long fileLength = file.getSize() / 1024;
		if (fileLength > maxFileSize)
			throw new IllegalArgumentException("所上传的文件大小（"+ fileLength +"）超过：" + maxFileSize);

		if (name == null) name = UUID.randomUUID().toString();


		String filename = file.getName();
		String extension = FilenameUtils.getExtension(filename);

		boolean validExtension = FilenameUtils.isExtension(filename, validFileExtensions);
		if(!validExtension) {
			throw new IllegalArgumentException("不支持的文件扩展名：" + extension);
		}

		String baseFile = String.format("/%s/%s.%s", namespace, name, extension);
		File destFile = new File(baseDirectory, baseFile);
		File parentFile = destFile.getParentFile();
		if(!parentFile.exists()) parentFile.mkdirs();

		FileOutputStream fos = new FileOutputStream(destFile);
		InputStream is = file.getInputStream();
		IOUtils.copy(is, fos);
		IOUtils.closeQuietly(fos);
		IOUtils.closeQuietly(is);

		return FilenameUtils.separatorsToUnix(mappingUrlPrefix + baseFile);

	}

	@Override
	public void delete(String filename) {
		filename = filename.substring(mappingUrlPrefix.length());
		File destFile = new File(baseDirectory, filename);

		if(!destFile.exists())
			return;
		destFile.delete();
	}
}
