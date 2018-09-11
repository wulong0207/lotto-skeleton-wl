package com.hhly.skeleton.lotto.base.operate.bo;



import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;
/**
 * @desc 文章基本类
 * @author lidecheng
 * @date 2017年3月14日
 * @company 益彩网络科技公司
 * @version 1.0
 */

public class OperateArticleBaseBO extends BaseBO{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8364840078604070408l;
	/**
	 * 
	 */
	/**自增长主键ID*/
  private Long id;
	/**文章标题*/
  private String articleTitle;
  /*** 置顶标题 */
  private String topTitle;
  /**标题颜色*/
  private String color;
	/**文件所属栏目名称*/
  private String typeName;
  /**文件所属栏目名称*/
  private String typeCode;
	/**文章来源*/
  private String articleFrom;
	/**文章链接*/
  private String articleUrl;
	/**标签*/
  private String articleLabel;
    /**父节点id*/
  private Integer typeParent;
   /**创建人*/
  private String createBy;  
  /**置顶栏目编号*/
  private String typeTopCode;  
  /**置顶栏目*/
  private String typeTopName; 
  /**栏目标识符*/
  private String identifiers;
  private Integer userId;
  
    /**
	 * 发布时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date releaseTime;
	
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getArticleTitle() {
		return articleTitle;
	}
	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}
	public String getTopTitle() {
		return topTitle;
	}
	public void setTopTitle(String topTitle) {
		this.topTitle = topTitle;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
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
	public String getArticleLabel() {
		return articleLabel;
	}
	public void setArticleLabel(String articleLabel) {
		this.articleLabel = articleLabel;
	}
	public Integer getTypeParent() {
		return typeParent;
	}
	public void setTypeParent(Integer typeParent) {
		this.typeParent = typeParent;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getTypeTopCode() {
		return typeTopCode;
	}
	public void setTypeTopCode(String typeTopCode) {
		this.typeTopCode = typeTopCode;
	}
	public String getTypeTopName() {
		return typeTopName;
	}
	public void setTypeTopName(String typeTopName) {
		this.typeTopName = typeTopName;
	}
	public Date getReleaseTime() {
		return releaseTime;
	}
	public void setReleaseTime(Date releaseTime) {
		this.releaseTime = releaseTime;
	}
	public String getIdentifiers() {
		return identifiers;
	}
	public void setIdentifiers(String identifiers) {
		this.identifiers = identifiers;
	}
	
}