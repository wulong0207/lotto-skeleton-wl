package com.hhly.skeleton.base.bo;
/**
 * @desc 文件上传
 * @author jiangwei
 * @date 2017年4月19日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class UploadFileBO {
	/**
	 * 保存服务器相对路径
	 */
	private String dir;
	/**
	 * 文件上传名
	 */
	private String name;
	/**
	 * 图片分辨率
	 */
	private String resolution;
	/**
	 * 文件大小
	 */
	private String sizes;
	/**
	 * 文件访问url
	 */
	private String url;

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public String getSizes() {
		return sizes;
	}

	public void setSizes(String sizes) {
		this.sizes = sizes;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
