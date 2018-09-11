package com.hhly.skeleton.cms.operatemgr.vo;

import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;
import java.util.List;

/**
 * @desc    文章VO
 * @author  Tony Wang
 * @date    2017年3月17日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class OperateArticleVO extends PageVO{
	/**自增长主键ID*/
	private Long id;
	/**文章编号*/
	private String articleId;
	/**文章标题*/
	private String articleTitle;
	/**文章内容*/
	private String articleContent;
	/**栏目ID*/
	private Long typeId;
	/**栏目名称*/
	private String typeName;
	/**文章状态:0被驳回;1编辑中;2待审核;3审核通过,4已发布*/
	private Integer status;
	/**文章显示:0不显示;1WEB,2WAP,3ANDROID,4IPHONE,9所有显示
	private Byte display;
	*/
	/**PC端:0不显示;1显示*/
	private Byte web;
	/**H5端:0不显示;1显示*/
	private Byte wap;
	/**android端:0不显示;1显示*/
	private Byte android;
	/**ios端:0不显示;1显示*/
	private Byte ios;
	/**排序ID*/
	private Integer orderId;
	/**文章来源*/
	private String articleFrom;
	/**文章来源链接*/
	private String fromUrl;
	/**文章本地链接*/
	private String articleUrl;
	/**封面图片*/
	private String articleImg;
	/**封面图片创建时间*/
	private Date articleImgCreateTime;
	/**封面图片显示:0不显示;1显示
	private Byte articleImgDisplay;*/
	/**摘要*/
	private String articleSummary;
	/**标签*/
	private String articleLabel;
	/**阅读数量*/
	private Long click;
	/**创建人*/
	private String createBy;
	/**修改人*/
	private String modifyBy;
	/**审核人*/
	private String auditBy;
	/**更新时间
	private Date updateTime;*/
	/**发布时间*/
	private Date releaseTime;
	/**审核时间*/
	private Date auditTime;
	/**创建时间*/
	private Date createTime;
	/**修改时间*/
	private Date modifyTime;
	/**
	 * 栏目编号
	 */
	private String typeCode;
	/**
	 * 文章置顶列表，可置顶到本栏目或其他栏目
	 */
	private List<OperateArticleTopVO> articleTops;
	/**
	 * 时间搜索类型
	 */
	private Byte searchTimeType;
	private Date startTime;
	private Date endTime;
	
	
	/**
	 * 操作人员，根据不同操作保存为不同字段，如是"审核通过"操作则保存为"审核人"
	 */
	private String operator;
	/**
	 * 新状态，用于修改文章状态
	 */
	private Integer newStatus;
	
	/**
	 * 创建人id
	 */
	private Long creatorId;
	
	private boolean shwoArticleContent;
	
	public OperateArticleVO() {
	}
	public OperateArticleVO(long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getArticleId() {
		return articleId;
	}
	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}
	public String getArticleTitle() {
		return articleTitle;
	}
	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}
	public String getArticleContent() {
		return articleContent;
	}
	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
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
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getArticleFrom() {
		return articleFrom;
	}
	public void setArticleFrom(String articleFrom) {
		this.articleFrom = articleFrom;
	}
	public String getArticleUrl() {
		return articleUrl;
	}
	public void setArticleUrl(String articleUrl) {
		this.articleUrl = articleUrl;
	}
	public String getArticleImg() {
		return articleImg;
	}
	public void setArticleImg(String articleImg) {
		this.articleImg = articleImg;
	}
	public Date getArticleImgCreateTime() {
		return articleImgCreateTime;
	}
	public void setArticleImgCreateTime(Date articleImgCreateTime) {
		this.articleImgCreateTime = articleImgCreateTime;
	}
	public String getArticleSummary() {
		return articleSummary;
	}
	public void setArticleSummary(String articleSummary) {
		this.articleSummary = articleSummary;
	}
	public String getArticleLabel() {
		return articleLabel;
	}
	public void setArticleLabel(String articleLabel) {
		this.articleLabel = articleLabel;
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
		this.createBy = createBy == null ? null : createBy.trim();
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
	public Byte getSearchTimeType() {
		return searchTimeType;
	}
	public void setSearchTimeType(Byte searchTimeType) {
		this.searchTimeType = searchTimeType;
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
	public List<OperateArticleTopVO> getArticleTops() {
		return articleTops;
	}
	public void setArticleTops(List<OperateArticleTopVO> articleTops) {
		this.articleTops = articleTops;
	}
	public Integer getNewStatus() {
		return newStatus;
	}
	public void setNewStatus(Integer newStatus) {
		this.newStatus = newStatus;
	}
	public String getFromUrl() {
		return fromUrl;
	}
	public void setFromUrl(String fromUrl) {
		this.fromUrl = fromUrl;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public Date getReleaseTime() {
		return releaseTime;
	}
	public void setReleaseTime(Date releaseTime) {
		this.releaseTime = releaseTime;
	}
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public Date getAuditTime() {
		return auditTime;
	}
	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	public Long getCreatorId() {
		return creatorId;
	}
	public void setCreatorId(Long creatorId) {
		this.creatorId = creatorId;
	}
	public boolean isShwoArticleContent() {
		return shwoArticleContent;
	}
	public void setShwoArticleContent(boolean shwoArticleContent) {
		this.shwoArticleContent = shwoArticleContent;
	}
}