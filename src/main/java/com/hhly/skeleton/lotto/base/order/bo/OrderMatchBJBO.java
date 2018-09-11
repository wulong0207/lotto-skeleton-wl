
package com.hhly.skeleton.lotto.base.order.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc    
 * @author  cheng chen
 * @date    2017年8月11日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OrderMatchBJBO extends BaseBO {
	
    /**
     * 半场比分 如 1:1
     */
    private String halfScore;
    /**
     * 全场比分 如 1:1
     */
    private String fullScore;
    /**
     * 让球数
     */
    private Double letNum;
    /**
     * 让分胜平负 3：胜 1 ： 平 0：负
     */
    private String letWdf;
    /**
     * 大于等于7 时为  7
     */
    private String goalNum;
    /**
     * 半全场胜平负 具体 参考足球格式说明
     */
    private String hfWdf;
    
    /**
     * 上盘, 下盘
     */
    private String udSd;
    /**
     * 比分玩法结果  具体 参考足球格式说明
     */
    private String score;
	/**
	 * 让球胜平负SP值    
	 */
    private Double spLetWdf;
    /**
     * 总进球数SP值
     */
    private Double spGoalNum;
    /**
     * 半全场胜平负SP值
     */
    private Double spHfWdf;
    /**
     * 上下盘单双SP值
     */
    private Double spUdSd;
    /**
     * 单场比分SP值
     */
    private Double spScore;
    
    /**
     * 胜负过关sp开奖值
     */
    private String spLetSf;

    /**
     * 1：正常销售；2：暂停销售 让球胜平负玩法
     */
    private Integer statusLetWdf;

    /**
     * 1：正常销售；2：暂停销售 总进球数玩法
     */
    private Integer statusGoal;

    /**
     * 1：正常销售；2：暂停销售 半全场胜平负玩法
     */
    private Integer statusHfWdf;

    /**
     * 1：正常销售；2：暂停销售 上下盘单双玩法
     */
    private Integer statusUdSd;

    /**
     * 1：正常销售；2：暂停销售 单场比分固定玩法
     */
    private Integer statusScore;
    
	public String getHalfScore() {
		return halfScore;
	}
	public void setHalfScore(String halfScore) {
		this.halfScore = halfScore;
	}
	public String getFullScore() {
		return fullScore;
	}
	public void setFullScore(String fullScore) {
		this.fullScore = fullScore;
	}
	public Double getLetNum() {
		return letNum;
	}
	public void setLetNum(Double letNum) {
		this.letNum = letNum;
	}

    public String getLetWdf() {
        return letWdf;
	}

    public void setLetWdf(String letWdf) {
        this.letWdf = letWdf;
	}

    public String getGoalNum() {
        return goalNum;
	}

    public void setGoalNum(String goalNum) {
        this.goalNum = goalNum;
	}
	public String getHfWdf() {
		return hfWdf;
	}
	public void setHfWdf(String hfWdf) {
		this.hfWdf = hfWdf;
	}

    public String getUdSd() {
        return udSd;
	}

    public void setUdSd(String udSd) {
        this.udSd = udSd;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public Double getSpLetWdf() {
		return spLetWdf;
	}
	public void setSpLetWdf(Double spLetWdf) {
		this.spLetWdf = spLetWdf;
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
	public String getSpLetSf() {
		return spLetSf;
	}
	public void setSpLetSf(String spLetSf) {
		this.spLetSf = spLetSf;
	}
	public Integer getStatusLetWdf() {
		return statusLetWdf;
	}
	public void setStatusLetWdf(Integer statusLetWdf) {
		this.statusLetWdf = statusLetWdf;
	}
	public Integer getStatusGoal() {
		return statusGoal;
	}
	public void setStatusGoal(Integer statusGoal) {
		this.statusGoal = statusGoal;
	}
	public Integer getStatusHfWdf() {
		return statusHfWdf;
	}
	public void setStatusHfWdf(Integer statusHfWdf) {
		this.statusHfWdf = statusHfWdf;
	}
	public Integer getStatusUdSd() {
		return statusUdSd;
	}
	public void setStatusUdSd(Integer statusUdSd) {
		this.statusUdSd = statusUdSd;
	}
	public Integer getStatusScore() {
		return statusScore;
	}
	public void setStatusScore(Integer statusScore) {
		this.statusScore = statusScore;
	}
	
}
