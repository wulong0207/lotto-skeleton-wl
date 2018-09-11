package com.hhly.skeleton.pay.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.common.OperateCouponEnum;

/**
 * @author lgs on
 * @version 1.0
 * @desc 我的礼品下拉选择BO
 * @date 2017/4/14.
 * @company 益彩网络科技有限公司
 */
public class DicOperateCouponOptionBO extends BaseBO {

    private static final long serialVersionUID = 1022105167486405664L;
    /**
     * 数量
     */
    private Integer total;
    /**
     * 类别
     */
    private Integer type;
    /**
     * 显示的文本
     */
    private String text;


    public DicOperateCouponOptionBO() {
    }

    /**
     * 红包类型
     */
    public DicOperateCouponOptionBO(OperateCouponEnum.RedTypeEnum redTypeEnum) {
        this.total = redTypeEnum.getTotal();
        this.type = redTypeEnum.getType();
        this.text = redTypeEnum.getText();
    }

    /**
     * 红包状态
     */
    public DicOperateCouponOptionBO(OperateCouponEnum.RedStatusEnum redStatusEnum) {
        this.total = redStatusEnum.getTotal();
        this.type = redStatusEnum.getValue();
        this.text = redStatusEnum.getText();
    }

    /**
     * 红包状态
     */
    public DicOperateCouponOptionBO(OperateCouponEnum.RedClassEnum redClassEnum) {
        this.total = redClassEnum.getTotal();
        this.type = redClassEnum.getValue();
        this.text = redClassEnum.getText();
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
