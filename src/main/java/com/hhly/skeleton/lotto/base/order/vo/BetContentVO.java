package com.hhly.skeleton.lotto.base.order.vo;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * @desc 投注内容对象，用于将投注选号的字符串按不同规则拆分成选号数组(不同彩种可继续扩展)
 * @author huangb
 * @date 2017年3月13日
 * @company 益彩网络
 * @version v1.0
 */
public class BetContentVO extends BaseVO {

	private static final long serialVersionUID = 8509986153617767214L;
	/**
	 * 选号区域1
	 */
	private String[] area1;
	/**
	 * 选号区域2
	 */
	private String[] area2;
	/**
	 * 选号区域3
	 */
	private String[] area3;
	/**
	 * 选号区域4
	 */
	private String[] area4;
	/**
	 * 选号区域5
	 */
	private String[] area5;
	/**
	 * 选号区域6
	 */
	private String[] area6;
	/**
	 * 选号区域7
	 */
	private String[] area7;

	public BetContentVO() {
	}

	public BetContentVO(String[] area1) {
		this.area1 = area1;
	}
	
	public BetContentVO(String[] area1, String[] area2) {
		this(area1);
		this.area2 = area2;
	}

	public BetContentVO(String[] area1, String[] area2, String[] area3) {
		this(area1, area2);
		this.area3 = area3;
	}

	public BetContentVO(String[] area1, String[] area2, String[] area3, String[] area4) {
		this(area1, area2, area3);
		this.area4 = area4;
	}
	
	public BetContentVO(String[] area1, String[] area2, String[] area3, String[] area4, String[] area5) {
		this(area1, area2, area3, area4);
		this.area5 = area5;
	}

	public BetContentVO(String[] area1, String[] area2, String[] area3, String[] area4, String[] area5, String[] area6, String[] area7) {
		this(area1, area2, area3, area4, area5);
		this.area6 = area6;
		this.area7 = area7;
	}

	public String[] getArea1() {
		return area1;
	}

	public void setArea1(String[] area1) {
		this.area1 = area1;
	}

	public String[] getArea2() {
		return area2;
	}

	public void setArea2(String[] area2) {
		this.area2 = area2;
	}

	public String[] getArea3() {
		return area3;
	}

	public void setArea3(String[] area3) {
		this.area3 = area3;
	}

	public String[] getArea4() {
		return area4;
	}

	public void setArea4(String[] area4) {
		this.area4 = area4;
	}

	public String[] getArea5() {
		return area5;
	}

	public void setArea5(String[] area5) {
		this.area5 = area5;
	}

	public String[] getArea6() {
		return area6;
	}

	public void setArea6(String[] area6) {
		this.area6 = area6;
	}

	public String[] getArea7() {
		return area7;
	}

	public void setArea7(String[] area7) {
		this.area7 = area7;
	}

}
