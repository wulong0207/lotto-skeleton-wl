package com.hhly.skeleton.lotto.base.dic.vo;

import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.LenRange;
import com.hhly.skeleton.base.valid.MatchPattern;
import com.hhly.skeleton.base.valid.NotNull;
import com.hhly.skeleton.base.valid.Pattern;
import com.hhly.skeleton.base.vo.PageVO;


public class DicDataDetailVO extends PageVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4776516004928957914L;
	/**
     * 主键
     */
	private Integer id;
	/**
     * 编号
     */
	@Group({"add"})
	@NotNull
	@Pattern(value=MatchPattern.NUM,msg="字典编号(必须是数字)")
    private String dicCode;
    /**
     * 名称
     */
	@Group({"add","upd"})
	@NotNull
	@LenRange(min=1,max=32,msg="字典名称")
    private String dicDataName;
    /**
     * 值
     */
	@Group({"add","upd"})
	@NotNull
	@LenRange(min=1,max=128,msg="字典值")
    private String dicDataValue;
    /**
     * 0：不固定；1：固定；默认为0
     */
	@Group({"add","upd"})
	@NotNull
	@LenRange(min=1,max=1,msg="是否固定")
    private Short isFixed;
    /**
     * 0：无效；1：有效
     */
	@Group({"add","upd"})
	@NotNull
	@LenRange(min=1,max=1,msg="是否有效")
    private Short status;
    /**
     * 排序字段
     */
	@Group({"add","upd"})
	@NotNull
	@LenRange(min=1,max=2,msg="排序")
    private Short orderBy;
    
	/**
	 * 无参构造
	 */
	public DicDataDetailVO() {

	}

	/**
	 * @param dicCode 编号
	 */
	public DicDataDetailVO(String dicCode) {
		this.dicCode = dicCode;
	}

	/**
	 * @param dicCode 编号
	 * @param dicValue 值
	 */
	public DicDataDetailVO(String dicCode, String dicValue) {
		this.dicCode = dicCode;
		this.dicDataValue = dicValue;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDicCode() {
		return dicCode;
	}
	public void setDicCode(String dicCode) {
		this.dicCode = dicCode;
	}
	public String getDicDataName() {
		return dicDataName;
	}
	public void setDicDataName(String dicDataName) {
		this.dicDataName = dicDataName;
	}
	public String getDicDataValue() {
		return dicDataValue;
	}
	public void setDicDataValue(String dicDataValue) {
		this.dicDataValue = dicDataValue;
	}
	public Short getIsFixed() {
		return isFixed;
	}
	public void setIsFixed(Short isFixed) {
		this.isFixed = isFixed;
	}
	public Short getStatus() {
		return status;
	}
	public void setStatus(Short status) {
		this.status = status;
	}
	public Short getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(Short orderBy) {
		this.orderBy = orderBy;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
    
}
