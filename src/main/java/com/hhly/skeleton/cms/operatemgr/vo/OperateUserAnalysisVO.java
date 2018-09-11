package com.hhly.skeleton.cms.operatemgr.vo;

import com.hhly.skeleton.base.vo.PageVO;
import com.hhly.skeleton.cms.customermgr.vo.LottoCustomerVO;

import java.util.Date;
import java.util.List;

/**
 * @desc 会员访问分析
 * @author huangb
 * @date 2017年2月9日
 * @company 益彩网络
 * @version v1.0
 */
public class OperateUserAnalysisVO extends PageVO {

	private static final long serialVersionUID = 7437509319640785909L;
	/**
	 * 关联的用户对象
	 */
	private LottoCustomerVO user;
	/**
	 * 渠道商号
	 */
	private String channelId;
	/**
	 * 访问开始时间
	 */
	private Date startTime;
	/**
	 * 访问结束时间
	 */
	private Date endTime;
	/**
	 * 判断是否关联用户表
	 */
	private Boolean joinUser;
	/**
	 * 用于上传文件查询:查询类型(eg:昵称，账户名，手机号)
	 */
	private String typeField;
	/**
	 * 用于上传文件查询:查询类型对应的值列表
	 */
	private List<String> typeValues;

	public LottoCustomerVO getUser() {
		return user;
	}

	public void setUser(LottoCustomerVO user) {
		this.user = user;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Boolean getJoinUser() {
		return joinUser;
	}

	public void setJoinUser(Boolean joinUser) {
		this.joinUser = joinUser;
	}

	public String getTypeField() {
		return typeField;
	}

	public void setTypeField(String typeField) {
		this.typeField = typeField;
	}

	public List<String> getTypeValues() {
		return typeValues;
	}

	public void setTypeValues(List<String> typeValues) {
		this.typeValues = typeValues;
	}
}
