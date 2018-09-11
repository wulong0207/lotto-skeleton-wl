package com.hhly.skeleton.lotto.base.trend.bo;

import java.util.ArrayList;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.lotto.base.trend.vo.NumTimeVo;

/**
 * 冷/热/遗漏 数据类
 * 
 * @desc
 * @author chenghougui
 * @Date 2018年1月5日
 * @Company 益彩网络科技公司
 * @version
 */
@SuppressWarnings("serial")
public class ColdHotOmitBo extends BaseBO{

	// 基础次数统计list
	private ArrayList<NumTimeVo> coldBaseList;

	// 像双色球，大乐透有两种数字统计，otherList主要用于他们
	private ArrayList<NumTimeVo> coldOtherList;
	private ArrayList<NumTimeVo> hotBaseList;
	private ArrayList<NumTimeVo> hotOtherList;
	public ArrayList<NumTimeVo> getColdBaseList() {
		return coldBaseList;
	}
	public void setColdBaseList(ArrayList<NumTimeVo> coldBaseList) {
		this.coldBaseList = coldBaseList;
	}
	public ArrayList<NumTimeVo> getColdOtherList() {
		return coldOtherList;
	}
	public void setColdOtherList(ArrayList<NumTimeVo> coldOtherList) {
		this.coldOtherList = coldOtherList;
	}
	public ArrayList<NumTimeVo> getHotBaseList() {
		return hotBaseList;
	}
	public void setHotBaseList(ArrayList<NumTimeVo> hotBaseList) {
		this.hotBaseList = hotBaseList;
	}
	public ArrayList<NumTimeVo> getHotOtherList() {
		return hotOtherList;
	}
	public void setHotOtherList(ArrayList<NumTimeVo> hotOtherList) {
		this.hotOtherList = hotOtherList;
	}

	
}
