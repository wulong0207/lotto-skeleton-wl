package com.hhly.skeleton.draw.sport.bo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.common.SportEnum;
import com.hhly.skeleton.base.util.CustomDoubleSerialize;
import com.hhly.skeleton.base.util.SportUtil;

/**
 * @desc 北京单场
 * @author huangchengfang1219
 * @date 2017年9月23日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class SportBjBO extends SportBaseBO {

	private static final long serialVersionUID = 5268382541903551262L;

	/**
	 * 半场比分
	 */
	private String halfScore;

	/**
	 * 让球胜平负；0：负；1：平；3：胜
	 */
	private Short letWdf;

	/**
	 * 1：上单；2：上双；3：下单；4：下双；
	 */
	private Short udSd;

	/**
	 * 比分玩法结果
	 */
	private String score;

	/**
	 * 总进球数
	 */
	private Integer goalNum;

	/**
	 * 半全场胜平负， 33；31；13；11；01***3：胜；1：平；0：负
	 */
	private String hfWdf;

	/**
	 * 让球胜平负SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spLetWdf;

	/**
	 * 上下盘单双SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spUdSd;

	/**
	 * 单场比分SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spScore;

	/**
	 * 总进球数SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spGoalNum;

	/**
	 * 半全场胜平负SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spHfWdf;

	public String getHalfScore() {
		return halfScore;
	}

	public void setHalfScore(String halfScore) {
		this.halfScore = halfScore;
	}

	public Short getLetWdf() {
		return letWdf;
	}

	public void setLetWdf(Short letWdf) {
		this.letWdf = letWdf;
	}

	public String getLetWdfText() {
		return SportEnum.SportWDFEnum.getWdfName(letWdf);
	}

	public Short getUdSd() {
		return udSd;
	}

	public void setUdSd(Short udSd) {
		this.udSd = udSd;
	}

	public String getUdSdText() {
		return SportEnum.SportUdSdEnum.getUdSdName(udSd);
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getScoreText() {
		return SportUtil.getScoreText(score);
	}

	public Integer getGoalNum() {
		return goalNum;
	}

	public void setGoalNum(Integer goalNum) {
		this.goalNum = goalNum;
	}

	public String getHfWdf() {
		return hfWdf;
	}

	public void setHfWdf(String hfWdf) {
		this.hfWdf = hfWdf;
	}

	public String getHfWdfText() {
		return SportEnum.SportWDFEnum.getHfWdfName(hfWdf);
	}

	public Double getSpLetWdf() {
		return spLetWdf;
	}

	public void setSpLetWdf(Double spLetWdf) {
		this.spLetWdf = spLetWdf;
	}

	public Double getSpUdSd() {
		return spUdSd;
	}

	public void setSpUdSd(Double spUdSd) {
		this.spUdSd = spUdSd;
	}

	public Double getSpScore() {
		return spScore;
	}

	public void setSpScore(Double spScore) {
		this.spScore = spScore;
	}

	public Double getSpGoalNum() {
		return spGoalNum;
	}

	public void setSpGoalNum(Double spGoalNum) {
		this.spGoalNum = spGoalNum;
	}

	public Double getSpHfWdf() {
		return spHfWdf;
	}

	public void setSpHfWdf(Double spHfWdf) {
		this.spHfWdf = spHfWdf;
	}

}
