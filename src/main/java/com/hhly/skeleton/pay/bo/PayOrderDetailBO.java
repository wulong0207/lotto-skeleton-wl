package com.hhly.skeleton.pay.bo;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.common.LotteryEnum;
import com.hhly.skeleton.base.constants.Constants;
import com.hhly.skeleton.base.constants.PayConstants;
import com.hhly.skeleton.base.constants.PayConstants.BatchPayEnum;
import com.hhly.skeleton.base.constants.PayConstants.TakenPlatformEnum;
import com.hhly.skeleton.base.util.DateUtil;
import com.hhly.skeleton.base.util.MathUtil;
import com.hhly.skeleton.base.util.ObjectUtil;
import com.hhly.skeleton.base.util.StringUtil;
import com.hhly.skeleton.lotto.base.order.bo.OrderBaseInfoBO;
import com.hhly.skeleton.lotto.base.order.bo.OrderBaseInfoSimpleBO;
import com.hhly.skeleton.lotto.base.ordercopy.bo.OrderCopyPayInfoBO;
import com.hhly.skeleton.pay.trans.vo.PushPayInfoVO;
import com.hhly.skeleton.pay.vo.PayUserWalletVO;
import com.hhly.skeleton.pay.vo.ToPayEndTimeVO;
import com.hhly.skeleton.pay.vo.ToPayParamVO;

/**
 * @desc 支付订单详情
 * @author xiongjingang
 * @date 2017年3月21日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class PayOrderDetailBO extends BaseBO {
	private static final long serialVersionUID = 5082099717922998491L;
	// 1、订单详情
	private OrderBaseInfoSimpleBO od;
	// 2、红包彩金和优惠券的集合
	private List<OperateCouponSimpleBO> cl;
	// 3、用户的支付渠道
	private List<UserPayTypeBO> ptl;
	// 4、用户钱包余额
	private PayUserWalletVO uw;
	// 5、订单截止投注时间
	private Long lpt;
	// 6、可用红包的个数
	private Integer cn = 0;
	// 7、方案详情信息
	private PushPayInfoVO pi;

	public OrderBaseInfoSimpleBO getOd() {
		return od;
	}

	public void setOd(ToPayParamVO toPayParamVO, BatchPayEnum batchPayEnum, ToPayEndTimeVO toPayEndTimeVO) {
		try {
			OrderBaseInfoBO orderBaseInfoBO = toPayEndTimeVO.getOrderBaseInfo();
			OrderBaseInfoSimpleBO orderBaseInfoSimpleBO = new OrderBaseInfoSimpleBO();
			String lotteryName = StringUtil.isBlank(orderBaseInfoBO.getLotteryChildName()) ? orderBaseInfoBO.getLotteryName() : orderBaseInfoBO.getLotteryChildName();
			orderBaseInfoSimpleBO.setLotteryName(lotteryName);
			orderBaseInfoSimpleBO.setLotteryIssue(orderBaseInfoBO.getLotteryIssue());
			orderBaseInfoSimpleBO.setOrderCode(toPayParamVO.getOrderCode());
			orderBaseInfoSimpleBO.setBuyType(toPayParamVO.getBuyType());
			orderBaseInfoSimpleBO.setOrderAmount(toPayEndTimeVO.getOrderAmount());// 付款总金额
			orderBaseInfoSimpleBO.setLotteryCode(orderBaseInfoBO.getLotteryCode());// 彩种编号
			if (!ObjectUtil.isBlank(orderBaseInfoBO.getLotteryLogoUrl()) && (!orderBaseInfoBO.getLotteryLogoUrl().startsWith("http://") || !orderBaseInfoBO.getLotteryLogoUrl().startsWith("https://"))) {
				orderBaseInfoSimpleBO.setLotteryLogoUrl(toPayParamVO.getImgUrl() + orderBaseInfoBO.getLotteryLogoUrl());// 彩种对应的logo
			} else {
				orderBaseInfoSimpleBO.setLotteryLogoUrl(orderBaseInfoBO.getLotteryLogoUrl());// 彩种对应的logo
			}
			if (batchPayEnum.equals(BatchPayEnum.SINGLE)) {
				// 单个支付
				orderBaseInfoSimpleBO.setBuyTypeName(PayConstants.BuyTypeEnum.getEnum(orderBaseInfoBO.getBuyType()).getValue());
			} else {
				// 批量支付
				orderBaseInfoSimpleBO.setBuyTypeName(Constants.PAY_MERGE_NAME);
			}
			this.od = orderBaseInfoSimpleBO;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**  
	* 方法说明: 方案详情内容
	* @auth: xiongJinGang
	* @param orderCopyPayInfoBO
	* @param toPayEndTimeVO
	* @time: 2018年1月11日 下午4:06:59
	* @return: void 
	*/
	public void setPi(OrderCopyPayInfoBO orderCopyPayInfoBO, ToPayEndTimeVO toPayEndTimeVO) {
		PushPayInfoVO payInfoVO = new PushPayInfoVO();
		payInfoVO.setIssueCode(orderCopyPayInfoBO.getIssueCode());
		payInfoVO.setLotteryCode(orderCopyPayInfoBO.getLotteryCode());
		payInfoVO.setLotteryLogoUrl(orderCopyPayInfoBO.getLotteryLogoUrl());
		payInfoVO.setPrice(orderCopyPayInfoBO.getPrice());
		payInfoVO.setUserIssueId(orderCopyPayInfoBO.getUserIssueId());
		this.pi = payInfoVO;
	}

	public List<OperateCouponSimpleBO> getCl() {
		return cl;
	}

	/**  
	* 方法说明: 订单支付的红包
	* @auth: xiongJinGang
	* @param couponList 优惠券列表
	* @param orderAmount 付款金额
	* @time: 2017年5月9日 下午12:05:11
	* @return: void 
	*/
	public void setCl(List<OperateCouponBO> couponList, Double orderAmount, Double totalRedBalance, String lottoryCode, Short platForm) {
		// List<OperateCouponSimpleBO> simpleList = new ArrayList<OperateCouponSimpleBO>();// 存可以用的
		// List<OperateCouponSimpleBO> unsuitedList = new ArrayList<OperateCouponSimpleBO>();// 存不满足条件的
		List<OperateCouponSimpleBO> redList = new ArrayList<OperateCouponSimpleBO>();// 存彩金红包的列表
		int couponNum = 0;
		Double redAmount = 0d;// 彩金红包总金额
		if (!ObjectUtil.isBlank(couponList)) {
			OperateCouponSimpleBO operateCouponSimpleBO = null;
			for (OperateCouponBO operateCouponBO : couponList) {
				// 不可用的跳过
				if (!operateCouponBO.getRedStatus().equals(PayConstants.RedStatusEnum.NORMAL.getKey())) {
					continue;
				}
				operateCouponSimpleBO = new OperateCouponSimpleBO(operateCouponBO);
				operateCouponSimpleBO.setSort(3);// 不知道什么情况的，排中间
				// 先都设置成可用
				operateCouponSimpleBO.setRedStatus(String.valueOf(PayConstants.BankStatusEnum.OPEN.getKey()));
				// operateCouponSimpleBO.setOverdueTimeTips(MessageFormat.format(Constants.RED_OVERDUE_TIME_TIPS, DateUtil.convertDateToStr(operateCouponBO.getRedOverdueTime(), DateUtil.FORMAT_POINT_YYYYMMDD)));
				Double redValue = operateCouponBO.getRedValue();// 面额
				// 满减红包
				if (operateCouponBO.getRedType().equals(PayConstants.RedTypeEnum.CONSUMPTION_DISCOUNT.getKey())) {
					Integer minSpendAmount = operateCouponBO.getMinSpendAmount();
					Double minAmount = Double.valueOf(minSpendAmount);
					operateCouponSimpleBO.setRedRemark(MessageFormat.format(Constants.FULL_CUT_REMARK, minAmount, redValue));// 红包描述
				}

				// 判断彩种是否可用
				if (!ObjectUtil.isBlank(operateCouponBO.getLimitLottery())) {
					String[] lotteryCodes = operateCouponBO.getLimitLottery().split(",");
					Map<Integer, String> map = LotteryEnum.Lottery.getLotteryCodes();
					boolean flag = true;
					for (String lotteryCode : lotteryCodes) {
						// 如果红包中存在限制列表，需要删除
						if (lottoryCode.startsWith(lotteryCode)) {
							operateCouponSimpleBO.setUseTips(Constants.RED_USER_LOTTERY_TIPS);
							operateCouponSimpleBO.setRedStatus(String.valueOf(PayConstants.BankStatusEnum.DISABLE.getKey()));
							operateCouponSimpleBO.setSort(7);// 彩种不符，排第7位
							flag = false;
							map.remove(Integer.parseInt(lotteryCode));
						}
						if (map.containsKey(Integer.parseInt(lotteryCode))) {
							map.remove(Integer.parseInt(lotteryCode));
						}
					}
					if (map.size() == 1) {
						String tips = "仅用于";
						for (Map.Entry<Integer, String> tip : map.entrySet()) {
							tips += tip.getValue();
						}
						operateCouponSimpleBO.setUseTips(tips);
					}
					if (!flag) {
						redList.add(operateCouponSimpleBO);
						continue;
					}
				}

				// 判断平台是否可用
				if (!ObjectUtil.isBlank(operateCouponBO.getLimitPlatform())) {
					Map<Short, TakenPlatformEnum> map = PayConstants.TakenPlatformEnum.getPlatform();
					// 验证优惠券在当前平台是否受限
					boolean validateFlag = validateLimitPlatform(operateCouponBO.getLimitPlatform(), platForm, map);
					if (!validateFlag) {
						String tips = "";
						// 剩下的平台
						if (map.containsKey(PayConstants.TakenPlatformEnum.WAP.getKey())) {
							tips += PayConstants.TakenPlatformEnum.WAP.getPlatForm() + "、";
						}

						if (map.containsKey(PayConstants.TakenPlatformEnum.ANDROID.getKey()) && !map.containsKey(PayConstants.TakenPlatformEnum.IOS.getKey())) {
							tips += PayConstants.TakenPlatformEnum.ANDROID.getPlatForm() + "、";
						}
						if (!map.containsKey(PayConstants.TakenPlatformEnum.ANDROID.getKey()) && map.containsKey(PayConstants.TakenPlatformEnum.IOS.getKey())) {
							tips += PayConstants.TakenPlatformEnum.IOS.getPlatForm() + "、";
						}

						if (map.containsKey(PayConstants.TakenPlatformEnum.ANDROID.getKey()) && map.containsKey(PayConstants.TakenPlatformEnum.IOS.getKey())) {
							tips += PayConstants.TakenPlatformEnum.IOS.getType() + "、";
						}

						if (ObjectUtil.isBlank(tips) && map.containsKey(PayConstants.TakenPlatformEnum.WEB.getKey())) {
							tips += PayConstants.TakenPlatformEnum.WEB.getType() + "、";
						}

						if (tips.endsWith("、")) {
							tips = tips.substring(0, tips.length() - 1);
						}

						operateCouponSimpleBO.setUseTips("仅限" + tips + "可用");
						operateCouponSimpleBO.setRedStatus(String.valueOf(PayConstants.BankStatusEnum.DISABLE.getKey()));
						operateCouponSimpleBO.setSort(8);// 平台不符，排第8位
						redList.add(operateCouponSimpleBO);
						continue;
					}
				}

				// 彩金红包并且红包余额大于0，才显示
				if (operateCouponBO.getRedType().equals(PayConstants.RedTypeEnum.RED_COLOR.getKey()) && MathUtil.compareTo(operateCouponBO.getRedBalance(), 0d) > 0) {
					redAmount = MathUtil.add(redAmount, operateCouponBO.getRedBalance());// 红包余额
					operateCouponSimpleBO.setRedRemark("￥" + operateCouponBO.getRedBalance());// 红包描述
					operateCouponSimpleBO.setSort(1);// 彩金红包排第2位
				}

				if (!ObjectUtil.isBlank(operateCouponBO.getRedOverdueTime())) {
					operateCouponSimpleBO.setOverdueTimeTips(DateUtil.convertDateToStr(operateCouponBO.getRedOverdueTime(), DateUtil.FORMAT_POINT_YYYYMMDD));
					// 判断非彩金红包是否过期（因为彩金红包可能没有过期时间）。现在彩金红包也要判断过期时间
					// if (!operateCouponBO.getRedType().equals(PayConstants.RedTypeEnum.RED_COLOR.getKey())) {
					int num = DateUtil.compare(operateCouponBO.getRedOverdueTime(), DateUtil.getNowDate());
					if (num <= 0) {
						operateCouponSimpleBO.setUseTips(Constants.RED_USER_EXPIRED_TIPS);
						operateCouponSimpleBO.setRedStatus(String.valueOf(PayConstants.BankStatusEnum.DISABLE.getKey()));
						operateCouponSimpleBO.setSort(10);// 过期了排最后一位
						redList.add(operateCouponSimpleBO);
						continue;
					}
					// 当前时间加3天，大于过期时间
					Date date1 = DateUtil.getDateDit(DateUtil.getNowDate(), 3);
					int num2 = DateUtil.compare(date1, operateCouponBO.getRedOverdueTime());
					if (num2 >= 0) {// 设置成即将到期
						operateCouponSimpleBO.setSoonToExpire(String.valueOf(PayConstants.BankStatusEnum.OPEN.getKey()));
						operateCouponSimpleBO.setSort(0);// 即将过期，排第一位
					}
				}
				// 满减红包
				if (operateCouponBO.getRedType().equals(PayConstants.RedTypeEnum.CONSUMPTION_DISCOUNT.getKey())) {
					Double minAmount = Double.valueOf(operateCouponBO.getMinSpendAmount());
					// 订单金额小于最低消费金额
					if (MathUtil.compareTo(minAmount, orderAmount) > 0) {
						// 计算还差多少钱
						operateCouponSimpleBO.setUseTips(MessageFormat.format(Constants.RED_USER_TIPS, MathUtil.sub(minAmount, orderAmount)));
						operateCouponSimpleBO.setRedStatus(String.valueOf(PayConstants.BankStatusEnum.DISABLE.getKey()));
						operateCouponSimpleBO.setSort(5);// 还差多少钱排第5
						redList.add(operateCouponSimpleBO);
						continue;
					}
				}
				redList.add(operateCouponSimpleBO);
				couponNum++;
			}
		}
		totalRedBalance = ObjectUtil.isBlank(totalRedBalance) ? 0d : totalRedBalance;
		// 彩金红包的总金额 等于账户中红包的总金额，才显示彩金红包
		/* if (MathUtil.compareTo(redAmount, totalRedBalance) == 0) {
		 redList.addAll(simpleList);
		 }*/
		// 按照sort排下序
		Collections.sort(redList, new Comparator<OperateCouponSimpleBO>() {
			@Override
			public int compare(OperateCouponSimpleBO o1, OperateCouponSimpleBO o2) {
				return o1.getSort().compareTo(o2.getSort());
			}
		});
		this.cl = redList;
		setCn(couponNum);
	}

	/**  
	* 方法说明: 充值优惠券
	* @auth: xiongJinGang
	* @param couponList
	* @time: 2017年5月9日 下午12:08:15
	* @return: void 
	*/
	public void setCl(List<OperateCouponBO> couponList, String rechargeAmount, Short platForm) {
		List<OperateCouponSimpleBO> simpleList = new ArrayList<OperateCouponSimpleBO>();
		int couponNum = 0;
		if (!ObjectUtil.isBlank(couponList)) {
			OperateCouponSimpleBO operateCouponSimpleBO = null;
			for (OperateCouponBO operateCouponBO : couponList) {
				// 红包状态不可用的跳过
				if (!operateCouponBO.getRedStatus().equals(PayConstants.RedStatusEnum.NORMAL.getKey())) {
					continue;
				}
				operateCouponSimpleBO = new OperateCouponSimpleBO(operateCouponBO);
				// 先都设置成可用
				operateCouponSimpleBO.setRedStatus(String.valueOf(PayConstants.BankStatusEnum.OPEN.getKey()));

				Double redValue = operateCouponBO.getRedValue();// 面额
				if (!ObjectUtil.isBlank(rechargeAmount)) {
					// 判断否满足最低使用条件
					Double minAmount = Double.valueOf(operateCouponBO.getMinSpendAmount());
					operateCouponSimpleBO.setRedRemark(MessageFormat.format(Constants.RECHARGE_REMARK, minAmount, redValue));// 红包描述
				}
				if (!ObjectUtil.isBlank(operateCouponBO.getRedOverdueTime())) {
					operateCouponSimpleBO.setOverdueTimeTips(DateUtil.convertDateToStr(operateCouponBO.getRedOverdueTime(), DateUtil.FORMAT_POINT_YYYYMMDD));
					// 判断红包是否过期
					int num = DateUtil.compare(operateCouponBO.getRedOverdueTime(), DateUtil.getNowDate());
					if (num <= 0) {
						operateCouponSimpleBO.setUseTips(Constants.RED_USER_EXPIRED_TIPS);
						operateCouponSimpleBO.setRedStatus(String.valueOf(PayConstants.BankStatusEnum.DISABLE.getKey()));
						operateCouponSimpleBO.setSort(10);
						simpleList.add(operateCouponSimpleBO);
						continue;
					}

					// 当前时间加3天，大于过期时间
					Date date1 = DateUtil.getDateDit(DateUtil.getNowDate(), 3);
					int num2 = DateUtil.compare(date1, operateCouponBO.getRedOverdueTime());
					if (num2 >= 0) {// 设置成即将到期
						operateCouponSimpleBO.setSoonToExpire(String.valueOf(PayConstants.BankStatusEnum.OPEN.getKey()));
						operateCouponSimpleBO.setSort(0);
					}
				}

				// 判断平台是否可用
				if (!ObjectUtil.isBlank(operateCouponBO.getLimitPlatform())) {
					Map<Short, TakenPlatformEnum> map = PayConstants.TakenPlatformEnum.getPlatform();
					// 验证优惠券在当前平台是否受限
					boolean validateFlag = validateLimitPlatform(operateCouponBO.getLimitPlatform(), platForm, map);
					if (!validateFlag) {
						String tips = "";
						// 剩下的平台
						if (map.containsKey(PayConstants.TakenPlatformEnum.WAP.getKey())) {
							tips += PayConstants.TakenPlatformEnum.WAP.getPlatForm() + "、";
						}

						if (map.containsKey(PayConstants.TakenPlatformEnum.ANDROID.getKey()) && !map.containsKey(PayConstants.TakenPlatformEnum.IOS.getKey())) {
							tips += PayConstants.TakenPlatformEnum.ANDROID.getPlatForm() + "、";
						}
						if (!map.containsKey(PayConstants.TakenPlatformEnum.ANDROID.getKey()) && map.containsKey(PayConstants.TakenPlatformEnum.IOS.getKey())) {
							tips += PayConstants.TakenPlatformEnum.IOS.getPlatForm() + "、";
						}

						if (map.containsKey(PayConstants.TakenPlatformEnum.ANDROID.getKey()) && map.containsKey(PayConstants.TakenPlatformEnum.IOS.getKey())) {
							tips += PayConstants.TakenPlatformEnum.IOS.getType() + "、";
						}

						if (ObjectUtil.isBlank(tips) && map.containsKey(PayConstants.TakenPlatformEnum.WEB.getKey())) {
							tips += PayConstants.TakenPlatformEnum.WEB.getType() + "、";
						}

						if (tips.endsWith("、")) {
							tips = tips.substring(0, tips.length() - 1);
						}

						operateCouponSimpleBO.setUseTips("仅限" + tips + "可用");
						operateCouponSimpleBO.setRedStatus(String.valueOf(PayConstants.BankStatusEnum.DISABLE.getKey()));
						operateCouponSimpleBO.setSort(8);// 平台不符，排第8位
						simpleList.add(operateCouponSimpleBO);
						continue;
					}
				}

				if (!ObjectUtil.isBlank(rechargeAmount)) {
					// 判断否满足最低使用条件
					Double minAmount = Double.valueOf(operateCouponBO.getMinSpendAmount());
					Double rechargeAmountDou = Double.valueOf(rechargeAmount);
					// 订单金额小于最低消费金额
					if (MathUtil.compareTo(minAmount, rechargeAmountDou) > 0) {
						// 计算还差多少钱
						operateCouponSimpleBO.setUseTips(MessageFormat.format(Constants.RED_USER_TIPS, MathUtil.sub(minAmount, rechargeAmountDou)));
						operateCouponSimpleBO.setRedStatus(String.valueOf(PayConstants.BankStatusEnum.DISABLE.getKey()));
						operateCouponSimpleBO.setSort(9);
						simpleList.add(operateCouponSimpleBO);
						continue;
					}
				}
				operateCouponSimpleBO.setSort(5);
				simpleList.add(operateCouponSimpleBO);
				couponNum++;
			}
		}
		// 按照sort排下序
		Collections.sort(simpleList, new Comparator<OperateCouponSimpleBO>() {
			@Override
			public int compare(OperateCouponSimpleBO o1, OperateCouponSimpleBO o2) {
				return o1.getSort().compareTo(o2.getSort());
			}
		});
		this.cl = simpleList;
		setCn(couponNum);
	}

	public List<UserPayTypeBO> getPtl() {
		return ptl;
	}

	public void setPtl(List<UserPayTypeBO> ptl) {
		this.ptl = ptl;
	}

	public PayUserWalletVO getUw() {
		return uw;
	}

	public void setUw(PayUserWalletVO uw) {
		this.uw = uw;
	}

	public Long getLpt() {
		return lpt;
	}

	public void setLpt(Long lpt) {
		this.lpt = lpt;
	}

	public Integer getCn() {
		return cn;
	}

	public void setCn(Integer cn) {
		this.cn = cn;
	}

	public PushPayInfoVO getPi() {
		return pi;
	}

	/**  
	* 方法说明: 验证传过来的客户端是否有可用的红包优惠券，
	* @auth: xiongJinGang
	* @param limitPlat 存在与platform相同的平台，则不能用，返回false。
	* @param platform
	* @time: 2017年5月12日 下午8:23:30
	* @return: boolean 
	*/
	private boolean validateLimitPlatform(String limitPlat, Short platform, Map<Short, TakenPlatformEnum> map) {
		boolean flag = true;
		if (!ObjectUtil.isBlank(limitPlat)) {
			String[] limitPlats = limitPlat.split(",");
			for (String limit : limitPlats) {
				Short limitPlatShort = Short.parseShort(limit);
				map.remove(limitPlatShort);
				if (limitPlatShort.equals(platform)) {
					flag = false;
				}
			}
		}
		return flag;
	}
}
