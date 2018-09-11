package com.hhly.skeleton.lotto.base.group.bo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc 订单详情页 合买相关信息
 * @date 2018/4/28 17:50
 * @company 益彩网络科技公司
 */
public class OrderDetailGroupInfoBO extends BaseBO {


    //公共 start
    //pc专有start 自己本单相关信息
    /**
     * 认购比例
     */
    private Double myBuyRatio;

    /**
     * 认购金额
     */
    private Double myBuyAmount;

    /**
     * 本单税后奖金(减去了佣金)
     */
    private Double myAfterBonus;


    //pc专有end
    /**
     * 发起人昵称
     */
    private String groupNick;

    /**
     * 方案标题
     */
    private String title;

    /**
     * 描述
     */
    private String remark;

    /**
     * 方案进度
     */
    private Double progress;

    /**
     * 进度金额
     */
    private Double progressAmount;

    /**
     * 合买状态;1：招募中；2：已满员；3：合买流产
     */
    private Integer grpbuyStatus;

    /**
     * 保底比例
     */
    private Double guaranteeRatio;

    /**
     * 保底金额
     */
    private Double guaranteeAmount;

    /**
     * 发起人认购比例
     */
    private Double groupRatio;

    /**
     * 发起人认购金额
     */
    private Double groupAmount;

    /**
     * 剩余认购比例
     */
    private Double residualRatio;

    /**
     * 剩余认购金额
     */
    private Double residualAmount;

    /**
     * 提成比例
     */
    private Double commissionRatio;

    /**
     * 提成佣金
     */
    private Double commissionAmount;

    //公共 end

    //订单详情页面专有
    //我的认购 不需要分页 ；参与用户单独一个接口
    private List<OrderMyGroupBO> orderMyGroupList;

    /***
     * 发单人中奖次数
     */
    private Integer groupWinCount;

    /**
     * 发单人累计奖金
     */
    private Double groupTotalBonus;

    /**
     * 合买总数
     */
    private Integer buyCount;

    /**
     * 公开类型;1：完全公开；2：跟单后公开；3：开奖后公开；
     */
    private Integer visibleType;

    /**
     * 提成后总奖金 订单税后奖金-佣金提成
     */
    private Double totalBonus;

    /**
     * 合买人userId
     */
    @JsonIgnore
    private Integer userId;

    /**
     * 是有有查看内容权限。主要是处理单场致胜
     * 0：没有 1：有
     */
    private Integer havaGrContPermiss=0;

    /**
     * 合买方式;1：所有人可认购；2：凭密码认购；
     */
    private Integer applyWay;

    /**
     * 合买认购密码，只有发起人才返回
     */
    private String applyCode;

    /**
     * 加奖标识;1：返合买发起人 2：返所有合买人
     */
    @JsonIgnore
    private Integer bonusFlag;

    public String getGroupNick() {
        return groupNick;
    }

    public void setGroupNick(String groupNick) {
        this.groupNick = groupNick;
    }

    public Integer getGrpbuyStatus() {
        return grpbuyStatus;
    }

    public void setGrpbuyStatus(Integer grpbuyStatus) {
        this.grpbuyStatus = grpbuyStatus;
    }

    public Double getGuaranteeRatio() {
        return guaranteeRatio;
    }

    public void setGuaranteeRatio(Double guaranteeRatio) {
        this.guaranteeRatio = guaranteeRatio;
    }

    public Double getGuaranteeAmount() {
        return guaranteeAmount;
    }

    public void setGuaranteeAmount(Double guaranteeAmount) {
        this.guaranteeAmount = guaranteeAmount;
    }

    public Double getGroupRatio() {
        return groupRatio;
    }

    public void setGroupRatio(Double groupRatio) {
        this.groupRatio = groupRatio;
    }

    public Double getGroupAmount() {
        return groupAmount;
    }

    public void setGroupAmount(Double groupAmount) {
        this.groupAmount = groupAmount;
    }

    public Double getResidualRatio() {
        return residualRatio;
    }

    public void setResidualRatio(Double residualRatio) {
        this.residualRatio = residualRatio;
    }

    public Double getResidualAmount() {
        return residualAmount;
    }

    public void setResidualAmount(Double residualAmount) {
        this.residualAmount = residualAmount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<OrderMyGroupBO> getOrderMyGroupList() {
        return orderMyGroupList;
    }

    public void setOrderMyGroupList(List<OrderMyGroupBO> orderMyGroupList) {
        this.orderMyGroupList = orderMyGroupList;
    }

    public Double getProgress() {
        return progress;
    }

    public void setProgress(Double progress) {
        this.progress = progress;
    }

    public Integer getVisibleType() {
        return visibleType;
    }

    public void setVisibleType(Integer visibleType) {
        this.visibleType = visibleType;
    }

    public Double getMyBuyRatio() {
        return myBuyRatio;
    }

    public void setMyBuyRatio(Double myBuyRatio) {
        this.myBuyRatio = myBuyRatio;
    }

    public Double getMyBuyAmount() {
        return myBuyAmount;
    }

    public void setMyBuyAmount(Double myBuyAmount) {
        this.myBuyAmount = myBuyAmount;
    }

    public Double getMyAfterBonus() {
        return myAfterBonus;
    }

    public void setMyAfterBonus(Double myAfterBonus) {
        this.myAfterBonus = myAfterBonus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Double getProgressAmount() {
        return progressAmount;
    }

    public void setProgressAmount(Double progressAmount) {
        this.progressAmount = progressAmount;
    }

    public Double getCommissionRatio() {
        return commissionRatio;
    }

    public void setCommissionRatio(Double commissionRatio) {
        this.commissionRatio = commissionRatio;
    }

    public Double getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(Double commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    public Integer getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(Integer buyCount) {
        this.buyCount = buyCount;
    }

    public Integer getGroupWinCount() {
        return groupWinCount;
    }

    public void setGroupWinCount(Integer groupWinCount) {
        this.groupWinCount = groupWinCount;
    }

    public Double getGroupTotalBonus() {
        return groupTotalBonus;
    }

    public void setGroupTotalBonus(Double groupTotalBonus) {
        this.groupTotalBonus = groupTotalBonus;
    }

    public Double getTotalBonus() {
        return totalBonus;
    }

    public void setTotalBonus(Double totalBonus) {
        this.totalBonus = totalBonus;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getHavaGrContPermiss() {
        return havaGrContPermiss;
    }

    public void setHavaGrContPermiss(Integer havaGrContPermiss) {
        this.havaGrContPermiss = havaGrContPermiss;
    }

    public String getApplyCode() {
        return applyCode;
    }

    public void setApplyCode(String applyCode) {
        this.applyCode = applyCode;
    }

    public Integer getBonusFlag() {
        return bonusFlag;
    }

    public void setBonusFlag(Integer bonusFlag) {
        this.bonusFlag = bonusFlag;
    }

    public Integer getApplyWay() {
        return applyWay;
    }

    public void setApplyWay(Integer applyWay) {
        this.applyWay = applyWay;
    }
}
