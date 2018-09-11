package com.hhly.skeleton.cms.report.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * 
* @Description: 沉默用户数据报表 
* @author HouXiangBao289
* @date 2017年9月12日 下午6:00:36 
* @version V1.0.0
 */
@SuppressWarnings("serial")
public class UserSilentBO extends BaseBO{
		@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
		private Date date;//投注时间
		private Integer noLoginDay3 = 0;//近3天未登录
		private Integer noLoginDay7 = 0;//近7天未登录
		private Integer noLoginDay15 = 0;//近15天未登录
		private Integer noLoginDay30 = 0;//近30天未登录
		private Integer noLoginDay60 = 0;//近60天未登录
		private Integer noLoginDay90 = 0;//近90天未登录
		private Integer noBuyDay3 = 0;//近3天未投注
		private Integer noBuyDay7 = 0;//近7天未投注
		private Integer noBuyDay15 = 0;//近15天未投注
		private Integer noBuyDay30 = 0;//近30天未投注
		private Integer noBuyDay60 = 0;//近60天未投注
		private Integer noBuyDay90 = 0;//近90天未投注
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public Integer getNoLoginDay3() {
			return noLoginDay3;
		}
		public void setNoLoginDay3(Integer noLoginDay3) {
			this.noLoginDay3 = noLoginDay3;
		}
		public Integer getNoLoginDay7() {
			return noLoginDay7;
		}
		public void setNoLoginDay7(Integer noLoginDay7) {
			this.noLoginDay7 = noLoginDay7;
		}
		public Integer getNoLoginDay15() {
			return noLoginDay15;
		}
		public void setNoLoginDay15(Integer noLoginDay15) {
			this.noLoginDay15 = noLoginDay15;
		}
		public Integer getNoLoginDay30() {
			return noLoginDay30;
		}
		public void setNoLoginDay30(Integer noLoginDay30) {
			this.noLoginDay30 = noLoginDay30;
		}
		public Integer getNoLoginDay60() {
			return noLoginDay60;
		}
		public void setNoLoginDay60(Integer noLoginDay60) {
			this.noLoginDay60 = noLoginDay60;
		}
		public Integer getNoLoginDay90() {
			return noLoginDay90;
		}
		public void setNoLoginDay90(Integer noLoginDay90) {
			this.noLoginDay90 = noLoginDay90;
		}
		public Integer getNoBuyDay3() {
			return noBuyDay3;
		}
		public void setNoBuyDay3(Integer noBuyDay3) {
			this.noBuyDay3 = noBuyDay3;
		}
		public Integer getNoBuyDay7() {
			return noBuyDay7;
		}
		public void setNoBuyDay7(Integer noBuyDay7) {
			this.noBuyDay7 = noBuyDay7;
		}
		public Integer getNoBuyDay15() {
			return noBuyDay15;
		}
		public void setNoBuyDay15(Integer noBuyDay15) {
			this.noBuyDay15 = noBuyDay15;
		}
		public Integer getNoBuyDay30() {
			return noBuyDay30;
		}
		public void setNoBuyDay30(Integer noBuyDay30) {
			this.noBuyDay30 = noBuyDay30;
		}
		public Integer getNoBuyDay60() {
			return noBuyDay60;
		}
		public void setNoBuyDay60(Integer noBuyDay60) {
			this.noBuyDay60 = noBuyDay60;
		}
		public Integer getNoBuyDay90() {
			return noBuyDay90;
		}
		public void setNoBuyDay90(Integer noBuyDay90) {
			this.noBuyDay90 = noBuyDay90;
		}
		
		
}
