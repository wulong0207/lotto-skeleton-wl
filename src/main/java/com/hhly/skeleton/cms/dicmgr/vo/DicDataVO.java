package com.hhly.skeleton.cms.dicmgr.vo;

import com.hhly.skeleton.base.valid.*;
import com.hhly.skeleton.base.vo.PageVO;


/**
 * 
 * @author jiangwei
 * @Version 1.0
 * @CreatDate 2016-11-11 上午11:31:25
 * @desc 系统字典数据查询
 */
public class DicDataVO extends PageVO{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8366546631086525187L;    
    /**
	 * 名称
	 */
	@Group({"add","upd"})
	@NotNull(msg="字典名称")
	@LenRange(min=1,max=16,msg="字典名称")
	private String dicName;
    /**
     * 编码
     */
	@Group({"add"})
	@NotNull(msg="字典编码")
	@Pattern(value=MatchPattern.NUM,msg="字典编码(必须是数字)")
    private String dicCode;
    /**
     * 描述
     */
    private String remark;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getDicName() {
		return dicName;
	}

	public void setDicName(String dicName) {
		this.dicName = dicName;
	}

	public String getDicCode() {
		return dicCode;
	}

	public void setDicCode(String dicCode) {
		this.dicCode = dicCode;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
    
}
