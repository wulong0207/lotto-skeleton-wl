package com.hhly.skeleton.lotto.base.agent.vo;

import com.hhly.skeleton.base.util.DateUtil;
import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc
 * @date 2018/3/5 10:58
 * @company 益彩网络科技公司
 */
public class AgentSaleQueryVO extends PageVO{


    /**
     * 业务销售报表：1:按日查询；2：按月查询
     * 用户/代理数据报表：3：查询用户统计信息
     */
    private Integer queryType;


    /**
     * 按日查询类型 1.近七天；2近15天；3：近30天
     */
    private Integer dateValue;

    /**
     * 按月查询str 格式 yyyy-MM-dd
     */
    private String monthValueStr;

    /**
     * 按月查询,后端自己转换使用 格式 yyyy-MM-dd
     */
    private Date monthValue;

    /**
     * 代理人ID
     */
    private Integer agentId;


    public Integer getQueryType() {
        return queryType;
    }

    public void setQueryType(Integer queryType) {
        this.queryType = queryType;
    }

    public Integer getDateValue() {
        return dateValue;
    }

    public void setDateValue(Integer dateValue) {
        this.dateValue = dateValue;
    }

    public String getMonthValueStr() {
        return monthValueStr;
    }

    public void setMonthValueStr(String monthValueStr) {
        this.monthValueStr = monthValueStr;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public Date getMonthValue() {
        return monthValue;
    }

    public void setMonthValue(Date monthValue) {
        this.monthValue = monthValue;
    }
}
