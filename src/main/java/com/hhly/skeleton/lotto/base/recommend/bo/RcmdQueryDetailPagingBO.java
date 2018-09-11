package com.hhly.skeleton.lotto.base.recommend.bo;

import com.hhly.skeleton.base.bo.BaseBO;

import java.util.List;

/**
 * @Description  新版推单列表BO 含分页信息
 * @Author longguoyou
 * @Date  2018/8/10 10:14
 * @Since 1.8
 */

public class RcmdQueryDetailPagingBO extends BaseBO{

    /**
     * 总页数
     */
    private Integer total;

    /**
     * 推单列表
     */
    private List<RcmdQueryDetailBO> listRcmdQueryDetailBO;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<RcmdQueryDetailBO> getListRcmdQueryDetailBO() {
        return listRcmdQueryDetailBO;
    }

    public void setListRcmdQueryDetailBO(List<RcmdQueryDetailBO> listRcmdQueryDetailBO) {
        this.listRcmdQueryDetailBO = listRcmdQueryDetailBO;
    }
}
