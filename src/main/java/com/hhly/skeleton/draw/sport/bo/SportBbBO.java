package com.hhly.skeleton.draw.sport.bo;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.common.SportEnum;
import com.hhly.skeleton.base.constants.SportConstants;
import com.hhly.skeleton.base.util.CustomDoubleSerialize;
import com.hhly.skeleton.base.util.ObjectUtil;

/**
 * @desc 竞彩蓝球
 * @author huangchengfang1219
 * @date 2017年9月23日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class SportBbBO extends SportBaseBO {

	private static final long serialVersionUID = 5268382541903551262L;

	/**
	 * 第一节比分
	 */
	private String firstScore;

	/**
	 * 第二节比分
	 */
	private String secondScore;

	/**
	 * 第三节比分
	 */
	private String thirdScore;

	/**
	 * 第四节比分
	 */
	private String fourthScore;

	/**
	 * 加时比分
	 */
	private String outTimeScore;

	/**
	 * 总球数
	 */
	private Integer totalScore;

	/**
	 * 胜负，0：负；3：胜
	 */
	private Short fullWdf;

	/**
	 * 让分胜负 ，0：负；3：胜，格式-8.5|3,-9.5|3
	 */
	private String letWdf;

	/**
	 * 让分胜负结果，3主胜、0客胜
	 */
	private Short lastLetWdf;

	/**
	 * 让分胜负，-7.5让分主胜,-8.5让分主胜
	 */
	private String letWdfAllText;

	/**
	 * 最新预设总分
	 */
	private Double presetScore;

	/**
	 * 大小分，00：小分；99：大分，格式155.5|99,158.5|00
	 */
	private String sizeScore;

	/**
	 * 大小分结果，99大分，00小分
	 */
	private String lastSizeScore;

	/**
	 * 大小分结果
	 */
	private String sizeScoreAllText;

	/**
	 * 胜分差，格式01:主胜1-5；11:客胜1-5
	 */
	private String winScore;

	/**
	 * 胜负SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spFullWdf;

	/**
	 * 让分胜负SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spLetWdf;

	/**
	 * 大小分SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spSizeScore;

	/**
	 * 胜分差SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spWinScore;

	/**
	 * 胜负历史SP值
	 */
	private List<SportDataWdfBO> sportDataWdfs;

	/**
	 * 让分胜负历史SP值
	 */
	private List<SportDataWdfBO> sportDataLetWdfs;

	/**
	 * 大小分历史SP值
	 */
	private List<SportDataBbSizeScoreBO> sportDataSizeScores;

	/**
	 * 胜分差历史SP值
	 */
	private List<SportDataBbWinScoreBO> sportDataWinScores;

	public String getFirstScore() {
		return firstScore;
	}

	public void setFirstScore(String firstScore) {
		this.firstScore = firstScore;
	}

	public String getSecondScore() {
		return secondScore;
	}

	public void setSecondScore(String secondScore) {
		this.secondScore = secondScore;
	}

	public String getThirdScore() {
		return thirdScore;
	}

	public void setThirdScore(String thirdScore) {
		this.thirdScore = thirdScore;
	}

	public String getFourthScore() {
		return fourthScore;
	}

	public void setFourthScore(String fourthScore) {
		this.fourthScore = fourthScore;
	}

	public String getOutTimeScore() {
		return outTimeScore;
	}

	public void setOutTimeScore(String outTimeScore) {
		this.outTimeScore = outTimeScore;
	}

	public Integer getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(Integer totalScore) {
		this.totalScore = totalScore;
	}

	public Short getFullWdf() {
		return fullWdf;
	}

	public void setFullWdf(Short fullWdf) {
		this.fullWdf = fullWdf;
	}

	public String getFullWdfText() {
		String result = SportEnum.SportWDFEnum.getWdfName(fullWdf);
		return !ObjectUtil.isBlank(result) ? (SportConstants.HOME + result) : null;
	}

	public String getLetWdf() {
		return letWdf;
	}

	public void setLetWdf(String letWdf) {
		this.letWdf = letWdf;
	}

	public Short getLastLetWdf() {
		return lastLetWdf;
	}

	public void setLastLetWdf(Short lastLetWdf) {
		this.lastLetWdf = lastLetWdf;
	}

	public String getLetWdfText() {
		String result = SportEnum.SportWDFEnum.getWdfName(lastLetWdf);
		return !ObjectUtil.isBlank(result) ? (SportConstants.LET_HOME + result) : null;
	}

	public String getLetWdfAllText() {
		return letWdfAllText;
	}

	public void setLetWdfAllText(String letWdfAllText) {
		this.letWdfAllText = letWdfAllText;
	}

	public Double getPresetScore() {
		return presetScore;
	}

	public void setPresetScore(Double presetScore) {
		this.presetScore = presetScore;
	}

	public String getSizeScore() {
		return sizeScore;
	}

	public void setSizeScore(String sizeScore) {
		this.sizeScore = sizeScore;
	}

	public String getLastSizeScore() {
		return lastSizeScore;
	}

	public void setLastSizeScore(String lastSizeScore) {
		this.lastSizeScore = lastSizeScore;
	}

	public String getSizeScoreText() {
		return SportEnum.SportSizeScoreEnum.getSizeScoreName(lastSizeScore);
	}

	public String getSizeScoreAllText() {
		return sizeScoreAllText;
	}

	public void setSizeScoreAllText(String sizeScoreAllText) {
		this.sizeScoreAllText = sizeScoreAllText;
	}

	public String getWinScore() {
		return winScore;
	}

	public void setWinScore(String winScore) {
		this.winScore = winScore;
	}

	public String getWinScoreText() {
		return SportEnum.SportWinScoreEnum.getWinScoreName(winScore);
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

	public Double getSpSizeScore() {
		return spSizeScore;
	}

	public void setSpSizeScore(Double spSizeScore) {
		this.spSizeScore = spSizeScore;
	}

	public Double getSpWinScore() {
		return spWinScore;
	}

	public void setSpWinScore(Double spWinScore) {
		this.spWinScore = spWinScore;
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

	public List<SportDataBbSizeScoreBO> getSportDataSizeScores() {
		return sportDataSizeScores;
	}

	public void setSportDataSizeScores(List<SportDataBbSizeScoreBO> sportDataSizeScores) {
		this.sportDataSizeScores = sportDataSizeScores;
	}

	public List<SportDataBbWinScoreBO> getSportDataWinScores() {
		return sportDataWinScores;
	}

	public void setSportDataWinScores(List<SportDataBbWinScoreBO> sportDataWinScores) {
		this.sportDataWinScores = sportDataWinScores;
	}

}