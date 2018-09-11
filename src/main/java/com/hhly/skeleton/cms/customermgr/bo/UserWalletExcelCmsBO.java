package com.hhly.skeleton.cms.customermgr.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;
import com.hhly.skeleton.base.excel.ReplaceAttribute;
import com.hhly.skeleton.base.model.DicDataEnum;
import com.hhly.skeleton.base.util.DateUtil;
import com.hhly.skeleton.base.util.StringUtil;

/**
 * @desc 用户钱包导出数据
 * @author huangb
 * @date 2017年2月9日
 * @company 益彩网络
 * @version v1.0
 */
@SuppressWarnings("serial")
public class UserWalletExcelCmsBO extends BaseBO {

	@ExcelHeader("序号")
	private String id;

	@ExcelHeader("会员帐号")
	private String accountName;

	@ExcelHeader("昵称")
	private String nickName;

	@ExcelHeader("现金总余额")
	private String totalCashBalance;

	@ExcelHeader("中奖余额")
	private String winningBalance;

	@ExcelHeader("充值80%余额")
	private String top80Balance;

	@ExcelHeader("充值20%余额")
	private String top20Balance;

	@ExcelHeader("可用红包余额")
	private String effRedBalance;

	@ExcelHeader("待发红包余额")
	private String readyRedBalance;

	@ExcelHeader("状态")
	@ReplaceAttribute(DicDataEnum.CUST_USER_WALLET)
	private String status;

	@ExcelHeader("修改时间")
	private String updateTime;

	@ExcelHeader("创建时间")
	private String createTime;

	public UserWalletExcelCmsBO() {

	}

	/**
	 * @param id
	 *            序号
	 * @param userWalletBO
	 *            数据对象
	 */
	public UserWalletExcelCmsBO(int id, UserWalletBO userWalletBO) {
		this.id = String.valueOf(id);
		if (userWalletBO != null) {
			if (null == userWalletBO.getUser()) {
				this.accountName = "";
				this.nickName = "";
			} else {
				this.accountName = StringUtil.convertObjToStr(userWalletBO.getUser().getAccountName());
				this.nickName = StringUtil.convertObjToStr(userWalletBO.getUser().getNickName());
			}
			this.totalCashBalance = StringUtil.convertObjToStr(userWalletBO.getTotalCashBalance());
			this.winningBalance = StringUtil.convertObjToStr(userWalletBO.getWinningBalance());
			this.top80Balance = StringUtil.convertObjToStr(userWalletBO.getTop80Balance());
			this.top20Balance = StringUtil.convertObjToStr(userWalletBO.getTop20Balance());
			this.effRedBalance = StringUtil.convertObjToStr(userWalletBO.getEffRedBalance());
			this.readyRedBalance = StringUtil.convertObjToStr(userWalletBO.getReadyRedBalance());
			this.status = StringUtil.convertObjToStr(userWalletBO.getStatus());
			this.updateTime = DateUtil.convertDateToStr(userWalletBO.getUpdateTime());
			this.createTime = DateUtil.convertDateToStr(userWalletBO.getCreateTime());
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getTotalCashBalance() {
		return totalCashBalance;
	}

	public void setTotalCashBalance(String totalCashBalance) {
		this.totalCashBalance = totalCashBalance;
	}

	public String getWinningBalance() {
		return winningBalance;
	}

	public void setWinningBalance(String winningBalance) {
		this.winningBalance = winningBalance;
	}

	public String getTop80Balance() {
		return top80Balance;
	}

	public void setTop80Balance(String top80Balance) {
		this.top80Balance = top80Balance;
	}

	public String getTop20Balance() {
		return top20Balance;
	}

	public void setTop20Balance(String top20Balance) {
		this.top20Balance = top20Balance;
	}

	public String getEffRedBalance() {
		return effRedBalance;
	}

	public void setEffRedBalance(String effRedBalance) {
		this.effRedBalance = effRedBalance;
	}

	public String getReadyRedBalance() {
		return readyRedBalance;
	}

	public void setReadyRedBalance(String readyRedBalance) {
		this.readyRedBalance = readyRedBalance;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
}
