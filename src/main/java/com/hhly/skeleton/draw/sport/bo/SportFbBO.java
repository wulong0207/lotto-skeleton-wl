package com.hhly.skeleton.draw.sport.bo;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.common.SportEnum;
import com.hhly.skeleton.base.util.CustomDoubleSerialize;
import com.hhly.skeleton.base.util.SportUtil;

/**
 * @desc 竞彩足球
 * @author huangchengfang1219
 * @date 2017年9月23日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class SportFbBO extends SportBaseBO {

	private static final long serialVersionUID = 5268382541903551262L;

	/**
	 * 半场比分
	 */
	private String halfScore;

	/**
	 * 全场胜平负，0：负；1：平；3：胜
	 */
	private Short fullWdf;

	/**
	 * 让球胜平负，0：负；1：平；3：胜
	 */
	private Short letWdf;

	/**
	 * 比分玩法结果，90表示胜其它，99表示平其它，09表示负其它；其它时候如12表示1:2，24表示2:4
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
	 * 胜平负SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spFullWdf;

	/**
	 * 让球胜平负SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spLetWdf;

	/**
	 * 比分玩法SP值
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

	/**
	 * 胜平负历史SP值
	 */
	private List<SportDataWdfBO> sportDataWdfs;

	/**
	 * 让球胜平负历史SP值
	 */
	private List<SportDataWdfBO> sportDataLetWdfs;

	/**
	 * 全场比分历史SP值
	 */
	private List<SportDataFbScoreBO> sportDataScores;

	/**
	 * 总进球数历史SP值
	 */
	private List<SportDataFbGoalBO> sportDataGoals;

	/**
	 * 半全场胜平负的SP值
	 */
	private List<SportDataFbHfWdfBO> sportDataHfWdfs;

	public String getHalfScore() {
		return halfScore;
	}

	public void setHalfScore(String halfScore) {
		this.halfScore = halfScore;
	}

	public Short getFullWdf() {
		return fullWdf;
	}

	public void setFullWdf(Short fullWdf) {
		this.fullWdf = fullWdf;
	}

	public String getFullWdfText() {
		return SportEnum.SportWDFEnum.getWdfName(fullWdf);
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

	public Double getSpFullWdf() {
		return spFullWdf;
	}

	public void setSpFullWdf(Double spFullWdf) {
		this.spFullWdf = spFullWdf;
	}

	public Double getSpLetWdf() {
		return spLetWdf;
	}

	public void setSpLetWdf(Double spLetWdf) {
		this.spLetWdf = spLetWdf;
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

	public List<SportDataWdfBO> getSportDataWdfs() {
		return sportDataWdfs;
	}

	public void setSportDataWdfs(List<SportDataWdfBO> sportDataWdfs) {
		this.sportDataWdfs = sportDataWdfs;
	}

	public List<SportDataWdfBO> getSportDataLetWdfs() {
		return sportDataLetWdfs;
	}

	public void setSportDataLetWdfs(List<SportDataWdfBO> sportDataLetWdfs) {
		this.sportDataLetWdfs = sportDataLetWdfs;
	}

	public List<SportDataFbScoreBO> getSportDataScores() {
		return sportDataScores;
	}

	public void setSportDataScores(List<SportDataFbScoreBO> sportDataScores) {
		this.sportDataScores = sportDataScores;
	}

	public List<SportDataFbGoalBO> getSportDataGoals() {
		return sportDataGoals;
	}

	public void setSportDataGoals(List<SportDataFbGoalBO> sportDataGoals) {
		this.sportDataGoals = sportDataGoals;
	}

	public List<SportDataFbHfWdfBO> getSportDataHfWdfs() {
		return sportDataHfWdfs;
	}

	public void setSportDataHfWdfs(List<SportDataFbHfWdfBO> sportDataHfWdfs) {
		this.sportDataHfWdfs = sportDataHfWdfs;
	}

}
