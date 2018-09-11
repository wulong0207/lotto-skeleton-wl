
package com.hhly.skeleton.draw.issue.bo;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.util.LotUtil;
import com.hhly.skeleton.base.util.ObjectUtil;

/**
 * @desc
 * @author cheng chen
 * @date 2017年10月11日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class DrawLotteryBO extends BaseBO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6397165666060925951L;

	/**
	 * 彩种编号
	 */
	private Integer lotteryCode;

	/**
	 * 彩种名称
	 */
	private String lotteryName;

	/**
	 * 彩种开奖时间
	 */
	private String lotteryDrawTime;

	/**
	 * 彩种开奖文本
	 */
	private String lotteryDrawTimeText;

	/**
	 * 彩种logoUrl
	 */
	private String lotteryLogoUrl;

	/**
	 * 当前期彩期期号
	 */
	private String curIssueCode;

	/**
	 * 当前期官方开奖时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private String curLotteryTime;

	/**
	 * 最新开奖期彩期期号
	 */
	private String preIssueCode;

	/**
	 * 上一期官方开奖时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date preLotteryTime;

	/**
	 * 上一期官方开奖
	 */
	private String preLotteryTimeText;

	/**
	 * 奖池金额
	 */
	private Long preJackpot;
	/**
	 * 开奖号码
	 */
	private String preDrawCode;

	/**
	 * 试机号
	 */
	private String preDrawCodeTest;
	/**
	 * 格式例如： 一等奖,2,10000000 | 二等奖,5,200000 |用 | 线隔开；代表 奖项，注数，每注中奖金额
	 */
	@JsonIgnore
	private String preDrawDetail;

	/**
	 * 是否今日开奖 0:否, 1:是
	 */
	private Short isAward;

	/**
	 * 一等奖显示信息
	 */
	private DrawDetailBO preDrawDetailView;

	/**
	 * 排列三，福彩3D显示所有开奖信息
	 */
	private List<DrawDetailBO> preDrawDetailList;

	/**
	 * 竞足已开奖列表
	 */
	private List<?> matchList;

	/**
	 * 竞彩可售统计
	 */
	private Integer sportMatchCount;

	/**
	 * 关键字
	 */
	private String lotteryKey;

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public String getLotteryName() {
		return lotteryName;
	}

	public void setLotteryName(String lotteryName) {
		this.lotteryName = lotteryName;
	}

	public String getLotteryLogoUrl() {
		return lotteryLogoUrl;
	}

	public void setLotteryLogoUrl(String lotteryLogoUrl) {
		this.lotteryLogoUrl = lotteryLogoUrl;
	}

	public String getLotteryDrawTimeText() {
		return lotteryDrawTimeText;
	}

	public void setLotteryDrawTimeText(String lotteryDrawTimeText) {
		this.lotteryDrawTimeText = lotteryDrawTimeText;
	}

	public String getLotteryDrawTime() {
		return lotteryDrawTime;
	}

	public void setLotteryDrawTime(String lotteryDrawTime) {
		this.lotteryDrawTime = lotteryDrawTime;
	}

	public String getCurIssueCode() {
		return curIssueCode;
	}

	public void setCurIssueCode(String curIssueCode) {
		this.curIssueCode = curIssueCode;
	}

	public String getCurLotteryTime() {
		return curLotteryTime;
	}

	public void setCurLotteryTime(String curLotteryTime) {
		this.curLotteryTime = curLotteryTime;
	}

	public String getPreIssueCode() {
		return preIssueCode;
	}

	public void setPreIssueCode(String preIssueCode) {
		this.preIssueCode = preIssueCode;
	}

	public String getPreLotteryTimeText() {
		return preLotteryTimeText;
	}

	public void setPreLotteryTimeText(String preLotteryTimeText) {
		this.preLotteryTimeText = preLotteryTimeText;
	}

	public Date getPreLotteryTime() {
		return preLotteryTime;
	}

	public void setPreLotteryTime(Date preLotteryTime) {
		this.preLotteryTime = preLotteryTime;
	}

	public Long getPreJackpot() {
		return preJackpot;
	}

	public void setPreJackpot(Long preJackpot) {
		this.preJackpot = preJackpot;
	}

	public String getPreDrawCode() {
		return preDrawCode;
	}

	public void setPreDrawCode(String preDrawCode) {
		if (!ObjectUtil.isBlank(preDrawCode)) {
			this.preDrawCode = preDrawCode;
		}
	}

	@JsonIgnore
	public String[] getPreDrawCodeArr() {
		return LotUtil.split(this.preDrawCode);
	}

	public String getPreDrawCodeTest() {
		return preDrawCodeTest;
	}

	public void setPreDrawCodeTest(String preDrawCodeTest) {
		this.preDrawCodeTest = preDrawCodeTest;
	}

	@JsonIgnore
	public String[] getPreDrawCodeTestArr() {
		return LotUtil.split(this.preDrawCodeTest);
	}

	public String getPreDrawDetail() {
		return preDrawDetail;
	}

	public void setPreDrawDetail(String preDrawDetail) {
		this.preDrawDetail = preDrawDetail;
	}

	public Short getIsAward() {
		return isAward;
	}

	public void setIsAward(Short isAward) {
		this.isAward = isAward;
	}

	public DrawDetailBO getPreDrawDetailView() {
		return preDrawDetailView;
	}

	public void setPreDrawDetailView(DrawDetailBO preDrawDetailView) {
		this.preDrawDetailView = preDrawDetailView;
	}

	public List<DrawDetailBO> getPreDrawDetailList() {
		return preDrawDetailList;
	}

	public void setPreDrawDetailList(List<DrawDetailBO> preDrawDetailList) {
		this.preDrawDetailList = preDrawDetailList;
	}

	public List<?> getMatchList() {
		return matchList;
	}

	public void setMatchList(List<?> matchList) {
		this.matchList = matchList;
	}

	public Integer getSportMatchCount() {
		return sportMatchCount;
	}

	public void setSportMatchCount(Integer sportMatchCount) {
		this.sportMatchCount = sportMatchCount;
	}

	public String getLotteryKey() {
		return lotteryKey;
	}

	public void setLotteryKey(String lotteryKey) {
		this.lotteryKey = lotteryKey;
	}

}
