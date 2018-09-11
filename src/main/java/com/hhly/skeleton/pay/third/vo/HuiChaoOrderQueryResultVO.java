package com.hhly.skeleton.pay.third.vo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.hhly.skeleton.base.util.JaxbUtil;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "root")
public class HuiChaoOrderQueryResultVO {
	private String merCode;// 商户号
	private String resultCount;// 商户订单号
	private String beginDate;// 商户交易开始时间 YYYYMMDDHHMMSS
	private String endDate;// 商户交易结束时间 YYYYMMDDHHMMSS
	private String pageIndex;// 查询分页 默认1
	private String pageSize;//
	private String resultCode;//

	@XmlElement
	private List<HuiChaoOrderQueryResultListVO> list;//

	public String getMerCode() {
		return merCode;
	}

	public void setMerCode(String merCode) {
		this.merCode = merCode;
	}

	public String getResultCount() {
		return resultCount;
	}

	public void setResultCount(String resultCount) {
		this.resultCount = resultCount;
	}

	public String getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(String pageIndex) {
		this.pageIndex = pageIndex;
	}

	public String getPageSize() {
		return pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public List<HuiChaoOrderQueryResultListVO> getList() {
		return list;
	}

	public void setList(List<HuiChaoOrderQueryResultListVO> list) {
		this.list = list;
	}

	public static void main(String[] args) {
		HuiChaoOrderQueryResultVO huiChaoOrderQueryVO = new HuiChaoOrderQueryResultVO();
		huiChaoOrderQueryVO.setMerCode("merchcode");
		huiChaoOrderQueryVO.setBeginDate("beginDate");
		huiChaoOrderQueryVO.setEndDate("endDate");
		huiChaoOrderQueryVO.setResultCount("resultCount");
		huiChaoOrderQueryVO.setPageIndex("pageIndex");
		huiChaoOrderQueryVO.setPageSize("pageSize");
		huiChaoOrderQueryVO.setResultCode("resultCode");

		List<HuiChaoOrderQueryResultListVO> list = new ArrayList<>();
		HuiChaoOrderQueryResultListVO huiChaoOrderQueryResultListVO = new HuiChaoOrderQueryResultListVO();
		huiChaoOrderQueryResultListVO.setOrderNumber("orderNumber");
		huiChaoOrderQueryResultListVO.setOrderDate("orderDate");
		huiChaoOrderQueryResultListVO.setOrderAmount("orderAmount");
		huiChaoOrderQueryResultListVO.setGouduiStatus("gouduiStatus");
		huiChaoOrderQueryResultListVO.setOrderStatus("orderStatus");
		huiChaoOrderQueryResultListVO.setRefundStatus("refundStatus");
		list.add(huiChaoOrderQueryResultListVO);
		huiChaoOrderQueryVO.setList(list);

		String xml = JaxbUtil.convertToXml(huiChaoOrderQueryVO);
		System.out.println(xml);
	}
}
