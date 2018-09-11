package com.hhly.skeleton.lotto.base.operate.vo;

import com.hhly.skeleton.base.vo.PageVO;

/**
 * 帮助文章
 *
 * @author huangchengfang1219
 * @date 2017年11月4日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OperateHelpVO extends PageVO {

	private static final long serialVersionUID = 890980759764342420L;

	/**
	 * 帮助文章ID
	 */
	private Integer id;

	/**
	 * 关键字
	 */
	private String keyword;

	/**
	 * 栏目编码
	 */
	private String typeCode;

	/**
	 * 数量
	 */
	private Integer rownum;

	/**
	 * 需要排除的文章ID
	 */
	private Integer outHelpId;
	
	/**
	 * 1:web, 2:wap, 3:android, 4ios
	 */
	private Integer platform;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
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

	public Integer getOutHelpId() {
		return outHelpId;
	}

	public void setOutHelpId(Integer outHelpId) {
		this.outHelpId = outHelpId;
	}

	public Integer getPlatform() {
		return platform;
	}

	public void setPlatform(Integer platform) {
		this.platform = platform;
	}
	
}
