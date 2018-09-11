package com.hhly.skeleton.cms.ticketmgr.bo;

import java.util.Map;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.common.LotteryChildEnum;
import com.hhly.skeleton.base.excel.ExcelHeader;
import com.hhly.skeleton.base.excel.ReplaceAttribute;
import com.hhly.skeleton.base.model.DicDataEnum;
import com.hhly.skeleton.base.util.DateUtil;
import com.hhly.skeleton.base.util.ObjectUtil;
import com.hhly.skeleton.base.util.StringUtil;
import com.hhly.skeleton.cms.customermgr.bo.LottoCustomerBO;

/**
 * @desc 票信息导出
 * @author huangb
 * @date 2017年2月23日
 * @company 益彩网络
 * @version v1.0
 */
@SuppressWarnings("serial")
public class TicketInfoExcelCmsBO extends BaseBO {
	@ExcelHeader("序号")
	private String id;
	@ExcelHeader("彩种名称")
	private String lotteryName;
    @ExcelHeader("子玩法")
    private String lotteryChildName;
    @ExcelHeader("彩期编号")
	private String lotteryIssue;
	@ExcelHeader("手机号")
	private String mobile;
	@ExcelHeader("邮箱")
	private String email;
	@ExcelHeader("用户昵称")
	private String nickName;
	@ExcelHeader("本地票号")
	private String ticketId;
	@ExcelHeader("票金额")
	private String ticketMoney;
	@ExcelHeader("票状态")
	@ReplaceAttribute(DicDataEnum.TICKET_INFO_STATUS)
	private String ticketStatus;
    @ExcelHeader("出票时间")
    private String comeOutTime;
    @ExcelHeader("切票记录")
    private String ticketChange;
    @ExcelHeader("出票渠道名称")
	private String ticketChannelName;
    @ExcelHeader("第三方票号")
    private String thirdNum;
    @ExcelHeader("所属方案编号")
	private String orderCode;
	@ExcelHeader("中奖状态")
	@ReplaceAttribute(DicDataEnum.ORDER_ORDER_WIN_STATUS)
	private String winningStatus;
	@ExcelHeader("税前金额")
	private String preBonus;
	@ExcelHeader("税后金额")
	private String aftBonus;
    @ExcelHeader("加奖金额")
    private String addBonus;
    @ExcelHeader("票生成时间")
	private String createTime;
	@ExcelHeader("出票截止时间")
	private String endTicketTime;
	@ExcelHeader("奖项")
	private String winningDetail;
	// @ExcelHeader("修改时间")
	// private String modifyTime;

	public TicketInfoExcelCmsBO() {

	}

	/**
	 * @param id
	 *            序号
	 * @param ticketInfoBO
	 *            数据对象
	 * @param gradeMap
	 *            奖级map（奖级处理）
	 */
	public TicketInfoExcelCmsBO(int id, TicketInfoBO ticketInfoBO, Map<String, String> gradeMap) {
		this.id = String.valueOf(id);
		if (ticketInfoBO != null) {
			this.lotteryName = StringUtil.convertObjToStr(ticketInfoBO.getLotteryCode());
            this.lotteryChildName = StringUtil.convertObjToStr(LotteryChildEnum.LotteryChild.getByValue(ticketInfoBO.getLotteryChildCode()).getShortName());
            this.lotteryIssue = StringUtil.convertObjToStr(ticketInfoBO.getLotteryIssue());
			LottoCustomerBO lottoCustomerBO = ticketInfoBO.getUser();
			if (!ObjectUtil.isBlank(lottoCustomerBO)) {
				this.nickName = ObjectUtil.isBlank(lottoCustomerBO.getNickName()) ? "" : lottoCustomerBO.getNickName();
				this.mobile = ObjectUtil.isBlank(lottoCustomerBO.getCusMobile()) ? "" : String.valueOf(lottoCustomerBO.getCusMobile());
				this.email = ObjectUtil.isBlank(lottoCustomerBO.getCusMail()) ? "" : lottoCustomerBO.getCusMail();
			}
			this.ticketId = StringUtil.convertObjToStr(ticketInfoBO.getId());
			this.ticketMoney = StringUtil.convertObjToStr(ticketInfoBO.getTicketMoney());
			this.ticketStatus = StringUtil.convertObjToStr(ticketInfoBO.getTicketStatus());
			this.ticketChannelName = (null == ticketInfoBO.getTicketChannel()) ? "" : StringUtil.convertObjToStr(ticketInfoBO.getTicketChannel().getDrawerName());
            this.thirdNum = StringUtil.convertObjToStr(ticketInfoBO.getThirdNum());
            this.comeOutTime = DateUtil.convertDateToStr(ticketInfoBO.getComeOutTime());
            this.ticketChange = StringUtil.convertObjToStr(ticketInfoBO.getTicketChange());
            this.orderCode = StringUtil.convertObjToStr(ticketInfoBO.getOrderCode());
			this.winningStatus = StringUtil.convertObjToStr(ticketInfoBO.getWinningStatus());
			this.preBonus = StringUtil.convertObjToStr(ticketInfoBO.getPreBonus());
			this.aftBonus = StringUtil.convertObjToStr(ticketInfoBO.getAftBonus());
            this.addBonus = StringUtil.convertObjToStr(ticketInfoBO.getAddedBonus());
            this.createTime = DateUtil.convertDateToStr(ticketInfoBO.getCreateTime());
			this.endTicketTime = DateUtil.convertDateToStr(ticketInfoBO.getEndTicketTime());
			// 奖级特殊处理
			if (gradeMap == null || gradeMap.isEmpty()) {
				this.winningDetail = ticketInfoBO.getWinningDetail();
			} else {
				this.winningDetail = StringUtil.convertObjToStr(gradeMap.get(ticketInfoBO.getWinningDetail()));
			}
			// this.modifyTime = DateUtil.convertDateToStr(ticketInfoBO.getModifyTime());
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLotteryName() {
		return lotteryName;
	}

	public void setLotteryName(String lotteryName) {
		this.lotteryName = lotteryName;
	}

    public String getLotteryChildName() {
        return lotteryChildName;
    }

    public void setLotteryChildName(String lotteryChildName) {
        this.lotteryChildName = lotteryChildName;
    }

	public String getLotteryIssue() {
		return lotteryIssue;
	}

	public void setLotteryIssue(String lotteryIssue) {
		this.lotteryIssue = lotteryIssue;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

    public String getComeOutTime() {
        return comeOutTime;
    }

    public void setComeOutTime(String comeOutTime) {
        this.comeOutTime = comeOutTime;
    }

    public String getTicketChange() {
        return ticketChange;
    }

    public void setTicketChange(String ticketChange) {
        this.ticketChange = ticketChange;
    }

	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	public String getTicketMoney() {
		return ticketMoney;
	}

	public void setTicketMoney(String ticketMoney) {
		this.ticketMoney = ticketMoney;
	}

    public String getThirdNum() {
        return thirdNum;
    }

    public void setThirdNum(String thirdNum) {
        this.thirdNum = thirdNum;
    }

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public String getTicketChannelName() {
		return ticketChannelName;
	}

	public void setTicketChannelName(String ticketChannelName) {
		this.ticketChannelName = ticketChannelName;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getWinningStatus() {
		return winningStatus;
	}

	public void setWinningStatus(String winningStatus) {
		this.winningStatus = winningStatus;
	}

	public String getPreBonus() {
		return preBonus;
	}

	public void setPreBonus(String preBonus) {
		this.preBonus = preBonus;
	}

	public String getAftBonus() {
		return aftBonus;
	}

	public void setAftBonus(String aftBonus) {
		this.aftBonus = aftBonus;
	}


    public String getAddBonus() {
        return addBonus;
    }

    public void setAddBonus(String addBonus) {
        this.addBonus = addBonus;
    }

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getEndTicketTime() {
		return endTicketTime;
	}

	public void setEndTicketTime(String endTicketTime) {
		this.endTicketTime = endTicketTime;
	}

	public String getWinningDetail() {
		return winningDetail;
	}

	public void setWinningDetail(String winningDetail) {
		this.winningDetail = winningDetail;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/*public String getModifyTime() {
		return modifyTime;
	}
	
	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}*/

}
