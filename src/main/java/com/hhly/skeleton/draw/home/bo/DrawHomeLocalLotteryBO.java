package com.hhly.skeleton.draw.home.bo;

import java.util.List;

/**
 * @author chenkn679
 * @version 1.0
 * @desc 地方彩列表
 * @date 2018/1/3
 * @company 益彩网络科技公司
 */
public class DrawHomeLocalLotteryBO extends DrawHomeLotteryIssueBO {

	private static final long serialVersionUID = -2729237341012066890L;
	/**
	 * 省份
	 */
	private String area;
	private String areaName;

	private List<DrawHomeLotteryIssueBO> list;

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public List<DrawHomeLotteryIssueBO> getList() {
		return list;
	}

	public void setList(List<DrawHomeLotteryIssueBO> list) {
		this.list = list;
	}
}
