package com.hhly.skeleton.draw.sport.bo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.util.CustomDoubleSerialize;

/**
 * @desc 竞彩篮球大小分玩法
 * @author huangchengfang1219
 * @date 2017年9月26日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class SportDataBbSizeScoreBO extends SportDataBaseBO {

	private static final long serialVersionUID = 4497480853946242798L;

	/**
	 * 预设总分
	 */
	private Double presetScore;

	/**
	 * 大分SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spBig;

	/**
	 * 小分SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spSmall;

	public Double getPresetScore() {
		return presetScore;
	}

	public void setPresetScore(Double presetScore) {
		this.presetScore = presetScore;
	}

	public Double getSpBig() {
		return spBig;
	}

	public void setSpBig(Double spBig) {
		this.spBig = spBig;
	}

	public Double getSpSmall() {
		return spSmall;
	}

	public void setSpSmall(Double spSmall) {
		this.spSmall = spSmall;
	}

}
