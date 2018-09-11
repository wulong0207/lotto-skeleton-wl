package com.hhly.skeleton.lotto.base.singleupload.vo;

import com.hhly.skeleton.base.vo.BaseVO;
/**
 * 单式上传对阵信息实体
 * @author longguoyou
 * @date 2017年6月13日
 * @compay 益彩网络科技有限公司
 */
public class SingleUploadAgainstInfoVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1230309163837536209L;
    /**
     * 彩种
     */
	private Integer lotteryCode;
	/**
	 * 彩期
	 */
	private String issueCode;
	/**
	 * 官方赛事编号: 使用逗号分隔
	 */
	private String officalMatchCode;
	/**
	 * 系统编号：使用都号分隔
	 */
	private String systemcodes;
	
	public String getSystemcodes() {
		return systemcodes;
	}
	public void setSystemcodes(String systemcodes) {
		this.systemcodes = systemcodes;
	}
	public Integer getLotteryCode() {
		return lotteryCode;
	}
	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}
	public String getIssueCode() {
		return issueCode;
	}
	public void setIssueCode(String issueCode) {
		this.issueCode = issueCode;
	}
	public String getOfficalMatchCode() {
		return officalMatchCode;
	}
	public void setOfficalMatchCode(String officalMatchCode) {
		this.officalMatchCode = officalMatchCode;
	}
}
