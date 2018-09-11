package com.hhly.skeleton.lotto.base.operate.vo;
import java.util.ArrayList;
import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.lotto.base.operate.bo.OperateArticleLottBO;
/**
 * @desc 前端文章vo类
 * @author lidecheng
 * @date 2017年3月14日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OperateArticleLottVO extends BaseBO{
	/**
	 * 
	 */
    private  static final long serialVersionUID = -7736706803791225535L;
	/**自增长主键ID*/
    private Long id;
    /**文章编号*/
    private String articleId;
    /**文章状态:0被驳回;1编辑中;2待审核;3审核通过,4已发布*/
    private Short status;
    /**文章栏目编号*/
    private String typeCode;
    /**查询行数  包含起始行*/
    private Integer rownum;
    /**查询起始行数 查询包含结束行，从1开始*/
    private Integer startRow;
    /**查询行数*/
    private Integer pageSize; 
    /**查询结束行数*/
    private Integer endRow;
    /**用户名*/
    private String userName;
    /**用户id*/
    private Integer userId;
    /*** 行数不足时是否补足行数  0-否 1-是*/
    private Short isComple;
    /**需要补充哪个节点下的内容**/
    private String compleCode;
    /**发布平台:1WEB;2WAP;3ANDROID;4IOS*/
    private Short platform;
    /**返回结果集*/
    private List<OperateArticleLottBO> article = new ArrayList<OperateArticleLottBO>();
    /**
     * 标签
     */
    private String articleLabel;
    
    /**天数*/
    private Integer days;
    public Integer getPageSize() {   
    	if(endRow!=null&&startRow!=null){
    		pageSize = (endRow - startRow);
    	}
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {		
		this.pageSize = pageSize;
	}
	public String getArticleId() {
		return articleId;
	}
	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}
	public Short getPlatform() {
		return platform;
	}
	public void setPlatform(Short platform) {
		this.platform = platform;
	}	   
	public List<OperateArticleLottBO> getArticle() {
		return article;
	}
	public void setArticle(List<OperateArticleLottBO> article) {
		this.article = article;
	} 
	public String getArticleLabel() {
		return articleLabel;
	}
	public void setArticleLabel(String articleLabel) {
		this.articleLabel = articleLabel;
	}
	public Integer getDays() {
		return days;
	}
	public void setDays(Integer days) {
		this.days = days;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Short getStatus() {
		return status;
	}
	public void setStatus(Short status) {
		this.status = status;
	}
	public String getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	public Integer getRownum() {
		return rownum;
	}
	public void setRownum(Integer rownum) {
		this.rownum = rownum;
	}
	public Integer getStartRow() {		
		return startRow;
	}
	public void setStartRow(Integer startRow) {
		if(startRow!=null&&startRow!=0){
			startRow = startRow-1;
		}
		this.startRow = startRow;
	}
	public Integer getEndRow() {		
		return endRow;
	}
	public void setEndRow(Integer endRow) {
		this.endRow = endRow;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Short getIsComple() {
		return isComple;
	}
	public void setIsComple(Short isComple) {
		this.isComple = isComple;
	}
	public String getCompleCode() {
		return compleCode;
	}
	public void setCompleCode(String compleCode) {
		this.compleCode = compleCode;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
}