package com.hhly.skeleton.draw.sport.bo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.util.CustomDoubleSerialize;

/**
 * @desc 胜平负和让球胜平负数据
 * @author huangchengfang1219
 * @date 2017年9月25日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class SportDataWdfBO extends SportDataBaseBO {

	private static final long serialVersionUID = 784025640439743904L;

	/**
	 * 让球数
	 */
	private Double letNum;

	/**
	 * 胜SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spWin;

	/**
	 * 平SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spDraw;

	/**
	 * 负SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spFail;

	public Double getLetNum() {
		return letNum;
	}

	public void setLetNum(Double letNum) {
		this.letNum = letNum;
	}

	public Double getSpWin() {
		return spWin;
	}

	public void setSpWin(Double spWin) {
		this.spWin = spWin;
	}

	public Double getSpDraw() {
		return spDraw;
	}

	public void setSpDraw(Double spDraw) {
		this.spDraw = spDraw;
	}

	public Double getSpFail() {
		return spFail;
	}

	public void setSpFail(Double spFail) {
		this.spFail = spFail;
	}

}
