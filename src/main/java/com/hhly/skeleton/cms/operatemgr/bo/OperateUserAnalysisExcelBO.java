package com.hhly.skeleton.cms.operatemgr.bo;

import java.util.Date;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;
import com.hhly.skeleton.base.util.StringUtil;

/**
 * @desc 会员访问信息分析的导出数据
 * @author huangb
 * @date 2017年2月10日
 * @company 益彩网络
 * @version v1.0
 */
@SuppressWarnings("serial")
public class OperateUserAnalysisExcelBO extends BaseBO {

	@ExcelHeader("序号")
	private Integer id;

	@ExcelHeader("昵称")
	private String nickName;

	@ExcelHeader("渠道号")
	private String channelId;

	@ExcelHeader("操作IP")
	private String ip;

	@ExcelHeader("访问时间")
	private Date createTime;

	@ExcelHeader("停留时长(秒)")
	private Integer seconds;

	@ExcelHeader("访问功能名称")
	private String webName;

	@ExcelHeader("访问Url")
	private String url;

	@ExcelHeader("去向访问功能名称")
	private String goWebName;

	@ExcelHeader("去向访问Url")
	private String goUrl;

	public OperateUserAnalysisExcelBO() {

	}

	/**
	 * @param id
	 *            序号
	 * @param operateUserAnalysis
	 *            数据对象
	 */
	public OperateUserAnalysisExcelBO(int id, OperateUserAnalysisBO operateUserAnalysis) {
		this.id = id;
		if (operateUserAnalysis != null) {
			this.nickName = StringUtil.convertObjToStr(operateUserAnalysis.getNickName());
			this.channelId = StringUtil.convertObjToStr(operateUserAnalysis.getChannelId());
			this.ip = StringUtil.convertObjToStr(operateUserAnalysis.getIp());
			this.createTime = operateUserAnalysis.getCreateTime();
			this.seconds = operateUserAnalysis.getSeconds();
			this.webName = StringUtil.convertObjToStr(operateUserAnalysis.getWebName());
			this.url = StringUtil.convertObjToStr(operateUserAnalysis.getUrl());
			this.goWebName = StringUtil.convertObjToStr(operateUserAnalysis.getGoWebName());
			this.goUrl = StringUtil.convertObjToStr(operateUserAnalysis.getGoUrl());
		}
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getSeconds() {
		return seconds;
	}

	public void setSeconds(Integer seconds) {
		this.seconds = seconds;
	}

	public String getWebName() {
		return webName;
	}

	public void setWebName(String webName) {
		this.webName = webName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getGoWebName() {
		return goWebName;
	}

	public void setGoWebName(String goWebName) {
		this.goWebName = goWebName;
	}

	public String getGoUrl() {
		return goUrl;
	}

	public void setGoUrl(String goUrl) {
		this.goUrl = goUrl;
	}

}
