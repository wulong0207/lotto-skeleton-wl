package com.hhly.skeleton.draw.sport.bo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.util.CustomDoubleSerialize;

/**
 * @desc 竞彩篮球胜分差玩法
 * @author huangchengfang1219
 * @date 2017年9月26日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class SportDataBbWinScoreBO extends SportDataBaseBO {

	private static final long serialVersionUID = 3752263503254474437L;

	/**
	 * 主胜1-5的SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spWin0105;

	/**
	 * 主胜6-10的SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spWin0610;

	/**
	 * 主胜11-15的SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spWin1115;

	/**
	 * 主胜16-20的SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spWin1620;

	/**
	 * 主胜21-25的SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spWin2125;

	/**
	 * 主胜26+的SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spWin26;

	/**
	 * 客胜1-5的SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spFail0105;

	/**
	 * 客胜6-10的SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spFail0610;

	/**
	 * 客胜11-15的SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spFail1115;

	/**
	 * 客胜16-20的SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spFail1620;

	/**
	 * 客胜21-25的SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spFail2125;

	/**
	 * 客胜26+的SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spFail26;

	public Double getSpWin0105() {
		return spWin0105;
	}

	public void setSpWin0105(Double spWin0105) {
		this.spWin0105 = spWin0105;
	}

	public Double getSpWin0610() {
		return spWin0610;
	}

	public void setSpWin0610(Double spWin0610) {
		this.spWin0610 = spWin0610;
	}

	public Double getSpWin1115() {
		return spWin1115;
	}

	public void setSpWin1115(Double spWin1115) {
		this.spWin1115 = spWin1115;
	}

	public Double getSpWin1620() {
		return spWin1620;
	}

	public void setSpWin1620(Double spWin1620) {
		this.spWin1620 = spWin1620;
	}

	public Double getSpWin2125() {
		return spWin2125;
	}

	public void setSpWin2125(Double spWin2125) {
		this.spWin2125 = spWin2125;
	}

	public Double getSpWin26() {
		return spWin26;
	}

	public void setSpWin26(Double spWin26) {
		this.spWin26 = spWin26;
	}

	public Double getSpFail0105() {
		return spFail0105;
	}

	public void setSpFail0105(Double spFail0105) {
		this.spFail0105 = spFail0105;
	}

	public Double getSpFail0610() {
		return spFail0610;
	}

	public void setSpFail0610(Double spFail0610) {
		this.spFail0610 = spFail0610;
	}

	public Double getSpFail1115() {
		return spFail1115;
	}

	public void setSpFail1115(Double spFail1115) {
		this.spFail1115 = spFail1115;
	}

	public Double getSpFail1620() {
		return spFail1620;
	}

	public void setSpFail1620(Double spFail1620) {
		this.spFail1620 = spFail1620;
	}

	public Double getSpFail2125() {
		return spFail2125;
	}

	public void setSpFail2125(Double spFail2125) {
		this.spFail2125 = spFail2125;
	}

	public Double getSpFail26() {
		return spFail26;
	}

	public void setSpFail26(Double spFail26) {
		this.spFail26 = spFail26;
	}

}
