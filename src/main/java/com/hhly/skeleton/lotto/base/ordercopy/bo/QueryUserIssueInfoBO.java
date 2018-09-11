package com.hhly.skeleton.lotto.base.ordercopy.bo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hhly.skeleton.base.bo.BaseBO;
/**
 * 动态列表  - 我的关注 
 * @author longguoyou
 * @date 2017年9月28日
 * @compay 益彩网络科技有限公司
 */
public class QueryUserIssueInfoBO extends BaseBO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String recentRecord;//最近战况
	@JsonIgnore
	private Double hitRateDb;
	private String hitRate;//命中率
	private Integer issueNum;//发单数
	@JsonIgnore
	private Integer hitNum;//命中数
	@JsonIgnore
	private Integer focusNum;//关注总人数
	private String focusNumStr;
	private String headUrl;//头像图像地址
	private String nickName;//昵称
	private Integer level;//专家级别
	private Integer updateNum;//今天有更新
	private Integer userId;//发单专家用户ID
	@JsonIgnore
	private Integer continueHitDb;
	private String continueHit;//最大连红
	@JsonIgnore
	private Float bonusRateDb;//盈利率
	private String bonusRate;//UI 
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRecentRecord() {
		return recentRecord;
	}
	public void setRecentRecord(String recentRecord) {
		this.recentRecord = recentRecord;
	}
	
	public Double getHitRateDb() {
		return hitRateDb;
	}
	public void setHitRateDb(Double hitRateDb) {
		this.hitRateDb = hitRateDb;
	}
	public String getHitRate() {
		return hitRate;
	}
	public void setHitRate(String hitRate) {
		this.hitRate = hitRate;
	}
	public Integer getContinueHitDb() {
		return continueHitDb;
	}
	public void setContinueHitDb(Integer continueHitDb) {
		this.continueHitDb = continueHitDb;
	}
	public String getContinueHit() {
		return continueHit;
	}
	public void setContinueHit(String continueHit) {
		this.continueHit = continueHit;
	}
	public Integer getIssueNum() {
		return issueNum;
	}
	public void setIssueNum(Integer issueNum) {
		this.issueNum = issueNum;
	}
	public Integer getHitNum() {
		return hitNum;
	}
	public void setHitNum(Integer hitNum) {
		this.hitNum = hitNum;
	}
	public Integer getFocusNum() {
		return focusNum;
	}
	public void setFocusNum(Integer focusNum) {
		this.focusNum = focusNum;
	}
	public String getFocusNumStr() {
		return focusNumStr;
	}
	public void setFocusNumStr(String focusNumStr) {
		this.focusNumStr = focusNumStr;
	}
	public String getHeadUrl() {
		return headUrl;
	}
	public void setHeadUrl(String headUrl) {
		this.headUrl = headUrl;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public Integer getUpdateNum() {
		return updateNum;
	}
	public void setUpdateNum(Integer updateNum) {
		this.updateNum = updateNum;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Float getBonusRateDb() {
		return bonusRateDb;
	}
	public void setBonusRateDb(Float bonusRateDb) {
		this.bonusRateDb = bonusRateDb;
	}
	public String getBonusRate() {
		return bonusRate;
	}
	public void setBonusRate(String bonusRate) {
		this.bonusRate = bonusRate;
	}
}
