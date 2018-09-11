package com.hhly.skeleton.pay.vo;

import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 给移动端提供的交易记录列表
 * @author xiongJinGang
 * @date 2017年4月26日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class AppTransUserVO extends BaseBO {
	private static final long serialVersionUID = -4686346924681346158L;
	private String month;
	private List<?> list;

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}

}
