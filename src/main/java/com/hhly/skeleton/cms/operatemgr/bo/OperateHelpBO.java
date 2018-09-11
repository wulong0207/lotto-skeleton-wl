package com.hhly.skeleton.cms.operatemgr.bo;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

@SuppressWarnings("serial")
public class OperateHelpBO extends BaseBO {
	/**自增长主键ID*/
    private Long id;
    /**帮助编号*/
    private String code;
    /**帮助标题*/
    private String title;
    /**栏目ID*/
    private Long typeId;
    /**栏目名称*/
    private String typeName;
    /**帮助状态:0被驳回;1编辑中;2待审核;3审核通过,4已发布*/
    private Integer status;
    /**帮助显示:0不显示;1显示
    private Short display;*/
	/** PC端:0不显示;1显示 */
	private Byte web;
	/** H5端:0不显示;1显示 */
	private Byte wap;
	/** android端:0不显示;1显示 */
	private Byte android;
	/** ios端:0不显示;1显示 */
	private Byte ios;
    /**排序ID*/
    private Integer orderId;
    /**帮助来源*/
    private String sources;
    /**文章来源链接*/
    private String url;
    /**帮助链接*/
    private String helpUrl;
    /**摘票*/
    private String summary;
    /**标签*/
    private String label;
    /**阅读数量*/
    private Long click;
    /**创建人*/
    private String createBy;
    /**修改人*/
    private String modifyBy;
    /**审核人*/
    private String auditBy;
    /**更新时间*/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;
    /**发布时间*/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date releaseTime;
    /**审核时间*/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date auditTime;
    /**创建时间*/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    /**修改时间*/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date modifyTime;
    /**客服语音解答url*/
    private String audio;
    /**满意的*/
    private Integer able;
    /**无用的*/
    private Integer unable;
    /**纠正*/
    private String correct;
    /**图标(彩种)*/
    private String ico;
    /**帮助内容*/
    private String content;
    /**是否显示图标:0不显示;1显示*/
    private Short icoDisplay;
	/**
	 * 帮助文章置顶列表，可置顶到本栏目或其他栏目
	 */
	private List<OperateHelpTopBO> helpTops;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getSources() {
		return sources;
	}

	public void setSources(String sources) {
		this.sources = sources;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Long getClick() {
		return click;
	}

	public void setClick(Long click) {
		this.click = click;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public String getAuditBy() {
		return auditBy;
	}

	public void setAuditBy(String auditBy) {
		this.auditBy = auditBy;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getReleaseTime() {
		return releaseTime;
	}

	public void setReleaseTime(Date releaseTime) {
		this.releaseTime = releaseTime;
	}

	public Date getAuditTime() {
		return auditTime;
	}

	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}

	public String getAudio() {
		return audio;
	}

	public void setAudio(String audio) {
		this.audio = audio;
	}

	public Integer getAble() {
		return able;
	}

	public void setAble(Integer able) {
		this.able = able;
	}

	public Integer getUnable() {
		return unable;
	}

	public void setUnable(Integer unable) {
		this.unable = unable;
	}

	public String getCorrect() {
		return correct;
	}

	public void setCorrect(String correct) {
		this.correct = correct;
	}

	public String getIco() {
		return ico;
	}

	public void setIco(String ico) {
		this.ico = ico;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public List<OperateHelpTopBO> getHelpTops() {
		return helpTops;
	}

	public void setHelpTops(List<OperateHelpTopBO> helpTops) {
		this.helpTops = helpTops;
	}

	public String getHelpUrl() {
		return helpUrl;
	}

	public void setHelpUrl(String helpUrl) {
		this.helpUrl = helpUrl;
	}

	public Short getIcoDisplay() {
		return icoDisplay;
	}

	public void setIcoDisplay(Short icoDisplay) {
		this.icoDisplay = icoDisplay;
	}

	public Byte getWeb() {
		return web;
	}

	public void setWeb(Byte web) {
		this.web = web;
	}

	public Byte getWap() {
		return wap;
	}

	public void setWap(Byte wap) {
		this.wap = wap;
	}

	public Byte getAndroid() {
		return android;
	}

	public void setAndroid(Byte android) {
		this.android = android;
	}

	public Byte getIos() {
		return ios;
	}

	public void setIos(Byte ios) {
		this.ios = ios;
	}
	
}