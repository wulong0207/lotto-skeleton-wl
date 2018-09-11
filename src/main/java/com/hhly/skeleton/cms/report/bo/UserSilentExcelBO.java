package com.hhly.skeleton.cms.report.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;
import com.hhly.skeleton.base.util.DateUtil;

/**
 * 
* @Description: 沉默用户数据报表 
* @author HouXiangBao289
* @date 2017年9月12日 下午6:00:36 
* @version V1.0.0
 */
@SuppressWarnings("serial")
public class UserSilentExcelBO extends BaseBO{
		@ExcelHeader("序号")
		private String id;
		@ExcelHeader("日期")
		@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
		private String date;//投注时间
		@ExcelHeader("近3天未登录")
		private String noLoginDay3;//近3天未登录
		@ExcelHeader("近7天未登录")
		private String noLoginDay7;//近7天未登录
		@ExcelHeader("近15天未登录")
		private String noLoginDay15;//近15天未登录
		@ExcelHeader("近30天未登录")
		private String noLoginDay30;//近30天未登录
		@ExcelHeader("近60天未登录")
		private String noLoginDay60;//近60天未登录
		@ExcelHeader("近90天未登录")
		private String noLoginDay90;//近90天未登录
		@ExcelHeader("近3天未投注")
		private String noBuyDay3;//近3天未投注
		@ExcelHeader("近7天未投注")
		private String noBuyDay7;//近7天未投注
		@ExcelHeader("近15天未投注")
		private String noBuyDay15;//近15天未投注
		@ExcelHeader("近30天未投注")
		private String noBuyDay30;//近30天未投注
		@ExcelHeader("近60天未投注")
		private String noBuyDay60;//近60天未投注
		@ExcelHeader("近90天未投注")
		private String noBuyDay90;//近90天未投注
		
		public UserSilentExcelBO(){}
		
		public UserSilentExcelBO(int id,UserSilentBO bo){
			this.id = String.valueOf(id);
			this.date = DateUtil.convertDateToStr(bo.getDate());
			this.noLoginDay3 = String.valueOf(bo.getNoLoginDay3());
			this.noLoginDay7 = String.valueOf(bo.getNoLoginDay7());
			this.noLoginDay15 = String.valueOf(bo.getNoLoginDay15());
			this.noLoginDay30 = String.valueOf(bo.getNoLoginDay30());
			this.noLoginDay60 = String.valueOf(bo.getNoLoginDay60());
			this.noLoginDay90 = String.valueOf(bo.getNoLoginDay90());
			
			this.noBuyDay3 = String.valueOf(bo.getNoBuyDay3());
			this.noBuyDay7 = String.valueOf(bo.getNoBuyDay7());
			this.noBuyDay15 = String.valueOf(bo.getNoBuyDay15());
			this.noBuyDay30 = String.valueOf(bo.getNoBuyDay30());
			this.noBuyDay60 = String.valueOf(bo.getNoBuyDay60());
			this.noBuyDay90 = String.valueOf(bo.getNoBuyDay90());
		}
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getNoLoginDay3() {
			return noLoginDay3;
		}
		public void setNoLoginDay3(String noLoginDay3) {
			this.noLoginDay3 = noLoginDay3;
		}
		public String getNoLoginDay7() {
			return noLoginDay7;
		}
		public void setNoLoginDay7(String noLoginDay7) {
			this.noLoginDay7 = noLoginDay7;
		}
		public String getNoLoginDay15() {
			return noLoginDay15;
		}
		public void setNoLoginDay15(String noLoginDay15) {
			this.noLoginDay15 = noLoginDay15;
		}
		public String getNoLoginDay30() {
			return noLoginDay30;
		}
		public void setNoLoginDay30(String noLoginDay30) {
			this.noLoginDay30 = noLoginDay30;
		}
		public String getNoLoginDay60() {
			return noLoginDay60;
		}
		public void setNoLoginDay60(String noLoginDay60) {
			this.noLoginDay60 = noLoginDay60;
		}
		public String getNoLoginDay90() {
			return noLoginDay90;
		}
		public void setNoLoginDay90(String noLoginDay90) {
			this.noLoginDay90 = noLoginDay90;
		}
		public String getNoBuyDay3() {
			return noBuyDay3;
		}
		public void setNoBuyDay3(String noBuyDay3) {
			this.noBuyDay3 = noBuyDay3;
		}
		public String getNoBuyDay7() {
			return noBuyDay7;
		}
		public void setNoBuyDay7(String noBuyDay7) {
			this.noBuyDay7 = noBuyDay7;
		}
		public String getNoBuyDay15() {
			return noBuyDay15;
		}
		public void setNoBuyDay15(String noBuyDay15) {
			this.noBuyDay15 = noBuyDay15;
		}
		public String getNoBuyDay30() {
			return noBuyDay30;
		}
		public void setNoBuyDay30(String noBuyDay30) {
			this.noBuyDay30 = noBuyDay30;
		}
		public String getNoBuyDay60() {
			return noBuyDay60;
		}
		public void setNoBuyDay60(String noBuyDay60) {
			this.noBuyDay60 = noBuyDay60;
		}
		public String getNoBuyDay90() {
			return noBuyDay90;
		}
		public void setNoBuyDay90(String noBuyDay90) {
			this.noBuyDay90 = noBuyDay90;
		}
		
		
}
