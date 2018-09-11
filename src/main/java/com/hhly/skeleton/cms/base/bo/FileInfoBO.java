package com.hhly.skeleton.cms.base.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @desc    图片或文件信息
 * @author  Tony Wang
 * @date    2017年2月24日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class FileInfoBO {

	/** 文件名 */
	private final String name;
	/** 格式 */
	private final String format;
	/** 存储路径 */
	private final String path;
	/** 宽度 */
	private final int width;
	/** 高度 */
	private final int height;
	/** 大小 */
	private final long size;
	/** 创建日期 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private final Date createTime;
	
	public FileInfoBO(String name, String format, String path, int width, int height, long size) {
		this.name = name;
		this.format = format;
		this.path = path;
		this.width = width;
		this.height = height;
		this.size = size;
		this.createTime = new Date();
	}

	public String getName() {
		return name;
	}

	public String getFormat() {
		return format;
	}

	public String getPath() {
		return path;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public long getSize() {
		return size;
	}

	public Date getCreateTime() {
		return createTime;
	}
}
