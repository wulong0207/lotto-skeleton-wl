package com.hhly.skeleton.lotto.base.operate.bo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * 帮助栏目
 *
 * @author huangchengfang1219
 * @date 2017年11月4日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OperateHelpTypeBO extends BaseBO {

	private static final long serialVersionUID = -3742714749886220335L;

	/**
	 * 主键ID
	 */
	@JsonIgnore
	private Integer id;

	/**
	 * 父栏目ID
	 */
	@JsonIgnore
	private Integer parentId;

	/**
	 * 栏目标识符
	 */
	@JsonIgnore
	private String identifiers;

	/**
	 * 栏目编码
	 */
	private String typeCode;

	/**
	 * 栏目名称
	 */
	private String typeName;

	/**
	 * 子栏目
	 */
	private List<OperateHelpTypeBO> childNode;

	/**
	 * 栏目下的帮助
	 */
	private List<OperateHelpBO> helpList;

	/**
	 * 彩种名称
	 */
	private String lotteryName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getIdentifiers() {
		return identifiers;
	}

	public void setIdentifiers(String identifiers) {
		this.identifiers = identifiers;
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

	public List<OperateHelpTypeBO> getChildNode() {
		return childNode;
	}

	public void setChildNode(List<OperateHelpTypeBO> childNode) {
		this.childNode = childNode;
	}

	public List<OperateHelpBO> getHelpList() {
		return helpList;
	}

	public void setHelpList(List<OperateHelpBO> helpList) {
		this.helpList = helpList;
	}

	public String getLotteryName() {
		return lotteryName;
	}

	public void setLotteryName(String lotteryName) {
		this.lotteryName = lotteryName;
	}

}
