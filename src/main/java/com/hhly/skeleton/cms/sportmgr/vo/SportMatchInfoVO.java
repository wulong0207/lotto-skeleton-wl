package com.hhly.skeleton.cms.sportmgr.vo;

import com.hhly.skeleton.base.vo.PageVO;

public class SportMatchInfoVO extends PageVO {

	private static final long serialVersionUID = -3794982338037186108L;
	
	private Long id;

	/**
	 * 赛事ID
	 */
	private Long matchId;

	/**
	 * 赛事资料URL，唯一，从第三方获取，例如：一比分。以便链接到一比分的赛事详情页面
	 */
	private String matchDataUrl;

	/**
	 * 赛事全称
	 */
	private String matchFullName;

	/**
	 * 赛事简称
	 */
	private String matchShortName;

	/**
	 * logo Ulr地址
	 */
	private String logoUrl;

	/**
	 * 赛事类型：1：足球赛事；2：篮球赛事；3：网球；4：橄榄球；5：排球；6：羽毛球；7：乒乓球；8：沙滩排球；9：冰球；10：曲棍球；11：手球；
	 * 12：水球
	 */
	private Short matchType;

	/**
	 * 赛事颜色
	 */
	private String matchColor;

	/**
	 * 修改人
	 */
	private String modifyBy;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 是否是5大联赛，0否，1是
	 */
	private Short fiveLeague;

	/**
	 * sp值变化比较
	 */
	private String md5Value;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMatchId() {
		return matchId;
	}

	public void setMatchId(Long matchId) {
		this.matchId = matchId;
	}

	public String getMatchDataUrl() {
		return matchDataUrl;
	}

	public void setMatchDataUrl(String matchDataUrl) {
		this.matchDataUrl = matchDataUrl;
	}

	public String getMatchFullName() {
		return matchFullName;
	}

	public void setMatchFullName(String matchFullName) {
		this.matchFullName = matchFullName;
	}

	public String getMatchShortName() {
		return matchShortName;
	}

	public void setMatchShortName(String matchShortName) {
		this.matchShortName = matchShortName;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public Short getMatchType() {
		return matchType;
	}

	public void setMatchType(Short matchType) {
		this.matchType = matchType;
	}

	public String getMatchColor() {
		return matchColor;
	}

	public void setMatchColor(String matchColor) {
		this.matchColor = matchColor;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Short getFiveLeague() {
		return fiveLeague;
	}

	public void setFiveLeague(Short fiveLeague) {
		this.fiveLeague = fiveLeague;
	}

	public String getMd5Value() {
		return md5Value;
	}

	public void setMd5Value(String md5Value) {
		this.md5Value = md5Value;
	}
}
