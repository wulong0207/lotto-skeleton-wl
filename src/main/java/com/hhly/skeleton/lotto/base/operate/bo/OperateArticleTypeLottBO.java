package com.hhly.skeleton.lotto.base.operate.bo;

import java.util.ArrayList;
import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;


/**
 * @desc 文章栏目类
 * @author lidecheng
 * @date 2017年4月10日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class OperateArticleTypeLottBO extends BaseBO{
    /**文件所属栏目类型*/
    private String typeCode; 
    /**文件所属栏目名称*/
    private String typeName;
    /**父栏目类型*/
    private String parentTypeName; 
    /**父栏目名称*/
    private String parentTypeCode;   
     /**子栏目名称*/
    private List<OperateArticleTypeLottBO> childNode  = new ArrayList<OperateArticleTypeLottBO>();



	public String getParentTypeName() {
		return parentTypeName;
	}

	public void setParentTypeName(String parentTypeName) {
		this.parentTypeName = parentTypeName;
	}

	public String getParentTypeCode() {
		return parentTypeCode;
	}

	public void setParentTypeCode(String parentTypeCode) {
		this.parentTypeCode = parentTypeCode;
	}

	public String getTypeCode() {
		return typeCode;
	}
	
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	
	public String getTypeName() {
		return typeName;
	}
	
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	public List<OperateArticleTypeLottBO> getChildNode() {
		return childNode;
	}
	
	public void setChildNode(List<OperateArticleTypeLottBO> childNode) {
		this.childNode = childNode;
	} 
}
