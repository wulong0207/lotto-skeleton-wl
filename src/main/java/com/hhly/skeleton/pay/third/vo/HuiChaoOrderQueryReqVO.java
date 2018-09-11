package com.hhly.skeleton.pay.third.vo;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "root")
public class HuiChaoOrderQueryReqVO {
	@XmlAttribute(name = "tx")
	private String tx;// 查询类型 1001 表示订单查询
	private String merCode;// 商户号
	private String orderNumber;// 商户订单号
	private String beginTime;// 商户交易开始时间 YYYYMMDDHHMMSS
	private String endTime;// 商户交易结束时间 YYYYMMDDHHMMSS
	private String pageIndex;// 查询分页 默认1
	private String sign;// md5签名

	public String getMerCode() {
		return merCode;
	}

	public void setMerCode(String merCode) {
		this.merCode = merCode;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(String pageIndex) {
		this.pageIndex = pageIndex;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getTx() {
		return tx;
	}

	public void setTx(String tx) {
		this.tx = tx;
	}

	/*	public static void main(String[] args) {
			HuiChaoOrderQueryReqVO huiChaoOrderQueryVO = new HuiChaoOrderQueryReqVO();
			huiChaoOrderQueryVO.setName("3223");
			huiChaoOrderQueryVO.setMerCode("merchcode");
			huiChaoOrderQueryVO.setOrderNumber("orderNumber");
			huiChaoOrderQueryVO.setSign("sign");
			String xml = JaxbUtil.convertToXml(huiChaoOrderQueryVO);
			System.out.println(xml);
		}*/
}
