package com.hhly.skeleton.cms.recommend.bo;

import com.hhly.skeleton.lotto.base.recommend.bo.RcmdInfoBO;

@SuppressWarnings("serial")
public class RecommendManagerBO extends RcmdInfoBO {

	// 连中数
	private Integer continueHit;
	// 类型 7天还是15天的
	private Integer type;

	private double hitRate;

	private double profitRate;

	private String nickName;

	private String recommendPlatform;
	private String recommendReason;
	private Integer recommendVal;

	public Integer getContinueHit() {
		return continueHit;
	}

	public void setContinueHit(Integer continueHit) {
		this.continueHit = continueHit;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public double getHitRate() {
		return hitRate;
	}

	public void setHitRate(double hitRate) {
		this.hitRate = hitRate;
	}

	public double getProfitRate() {
		return profitRate;
	}

	public void setProfitRate(double profitRate) {
		this.profitRate = profitRate;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getRecommendPlatform() {
		return recommendPlatform;
	}

	public void setRecommendPlatform(String recommendPlatform) {
		this.recommendPlatform = recommendPlatform;
	}

	public String getRecommendReason() {
		return recommendReason;
	}

	public void setRecommendReason(String recommendReason) {
		this.recommendReason = recommendReason;
	}

	public Integer getRecommendVal() {
		return recommendVal;
	}

	public void setRecommendVal(Integer recommendVal) {
		this.recommendVal = recommendVal;
	}

}
