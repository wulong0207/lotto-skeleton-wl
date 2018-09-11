package com.hhly.skeleton.user.bo;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc   首页中奖信息统计
 * @author lidecheng
 * @date 2017年3月10日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class UserWinInfoBO extends BaseBO{
	/**用户名称*/
	private String userName;
	/**中奖金额*/
	private Long winInfo;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Long getWinInfo() {
		return winInfo;
	}
	public void setWinInfo(Long winInfo) {
		this.winInfo = winInfo;
	}

}