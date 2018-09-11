package com.hhly.skeleton.pay.agent.vo;

import java.io.Serializable;
import java.util.Date;

import com.hhly.skeleton.pay.vo.BasePageVo;

/**
 * @desc 代理系统交易流水列表
 * @author xiongJinGang
 * @date 2018年3月3日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class AgentTransLogParamVO extends BasePageVo implements Serializable {
	private static final long serialVersionUID = 7616000548669603396L;
	private String token;// 用户登录的token
	private Short queryType;// 查询类型 为1时，不包括结算佣金的流水，为2时，包括所有记录
	private Date startDate;// 查询开始时间
	private Date endDate;// 查询结束时间
	private String transCode;// 交易流水编号

	private Integer userId;// 用户ID
	private Integer agentId;// 代理ID

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getAgentId() {
		return agentId;
	}

	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}

	public Short getQueryType() {
		return queryType;
	}

	public void setQueryType(Short queryType) {
		this.queryType = queryType;
	}

	public String getTransCode() {
		return transCode;
	}

	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	@Override
	public String toString() {
		return "参数 [token=" + token + ", queryType=" + queryType + ", startDate=" + startDate + ", endDate=" + endDate + ", transCode=" + transCode + "]";
	}

}
