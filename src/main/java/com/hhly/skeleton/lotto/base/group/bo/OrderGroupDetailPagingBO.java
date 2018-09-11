package com.hhly.skeleton.lotto.base.group.bo;

import com.hhly.skeleton.base.bo.BaseBO;

import java.util.List;

/**
 * @Description 含分页信息 合买大厅详情
 * @Author longguoyou
 * @Date  2018/5/8 11:25
 * @Since 1.8
 */
public class OrderGroupDetailPagingBO extends BaseBO{
    /**
     * 总页数
     */
    private Integer total;

    /**
     * 合买列表详情
     */
    private List<OrderGroupDetailBO> listOrderGroupDetailBO;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<OrderGroupDetailBO> getListOrderGroupDetailBO() {
        return listOrderGroupDetailBO;
    }

    public void setListOrderGroupDetailBO(List<OrderGroupDetailBO> listOrderGroupDetailBO) {
        this.listOrderGroupDetailBO = listOrderGroupDetailBO;
    }
}
