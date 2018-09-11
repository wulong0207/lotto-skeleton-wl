package com.hhly.skeleton.cms.payment.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;
import com.hhly.skeleton.base.excel.ReplaceAttribute;
import com.hhly.skeleton.base.model.DicDataEnum;

@SuppressWarnings("serial")
public class PayChannelMgrExcelBO extends BaseBO {

	@ExcelHeader("序号")
    private Integer id;
	
	@ExcelHeader("渠道名称")
    private String name;
	
	@ExcelHeader("渠道编码")
    private String code;
	
	@ExcelHeader("是否可用")
	@ReplaceAttribute(DicDataEnum.LOTTERY_SYN_ISSUE)
	private String available;
	
	@ExcelHeader("启用暂停")
	@ReplaceAttribute(DicDataEnum.LOTTERY_SYN_ISSUE)
	private String pause;
	
	@ExcelHeader("暂停开始时间")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date beginTime;
	
	@ExcelHeader("暂停结束时间")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date endTime;
	
	@ExcelHeader("排序")
    private Integer orderId;
	
	@ExcelHeader("Web")
	@ReplaceAttribute(DicDataEnum.LOTTERY_SYN_ISSUE)
    private String pc;
	
	@ExcelHeader("Wap")
	@ReplaceAttribute(DicDataEnum.LOTTERY_SYN_ISSUE)
    private String h5;
	
	@ExcelHeader("Android")
	@ReplaceAttribute(DicDataEnum.LOTTERY_SYN_ISSUE)
    private String android;
	
	@ExcelHeader("iOS")
	@ReplaceAttribute(DicDataEnum.LOTTERY_SYN_ISSUE)
    private String ios;
    
	@ExcelHeader("创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    
	@ExcelHeader("修改时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date modifyTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAvailable() {
		return available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

	public String getPause() {
		return pause;
	}

	public void setPause(String pause) {
		this.pause = pause;
	}

	public Date getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getPc() {
		return pc;
	}

	public void setPc(String pc) {
		this.pc = pc;
	}

	public String getH5() {
		return h5;
	}

	public void setH5(String h5) {
		this.h5 = h5;
	}

	public String getAndroid() {
		return android;
	}

	public void setAndroid(String android) {
		this.android = android;
	}

	public String getIos() {
		return ios;
	}

	public void setIos(String ios) {
		this.ios = ios;
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
}
