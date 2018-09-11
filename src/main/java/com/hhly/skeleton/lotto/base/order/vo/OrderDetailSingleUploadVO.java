package com.hhly.skeleton.lotto.base.order.vo;

import com.hhly.skeleton.base.vo.BaseVO;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.List;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc
 * @date 2017/6/12 14:43
 * @company 益彩网络科技公司
 */
public class OrderDetailSingleUploadVO extends BaseVO {

  
	private static final long serialVersionUID = 1L;

	/**
     * 单个方案投注金额
     */
    private Double a;

    /**
     * 单个方案投注注数
     */
    private Integer b_n;

    /**
     * 玩法 1：单式；2：复式；3：胆拖；
     */
    private Integer c_t;

    /**
     * 子玩法ID
     */
    private Integer l_c_c;

    /**
     * 单个方案投注倍数
     */
    private Integer m;

    /**
     * 串关如 2_1，竞技彩专有
     */
    private String b_s;

    /**
     * 投注内容，原始投注内容。如果页面有修改需要根据上传文件的带上串关和倍数，页面没有修改此字段不需要传
     */
    private String p_c;

    /**
     * 入库投注内容
     */
    private String s_p_c;

    /**
     * 投注内容转换后的对象集合。文件上传后端直接给前端，前端把这个返回即可。
     */
    private List<SingleUploadJCBetDetailVO> supjcdl;


    public Integer getB_n() {
        return b_n;
    }

    public void setB_n(Integer b_n) {
        this.b_n = b_n;
    }

    public Integer getC_t() {
        return c_t;
    }

    public void setC_t(Integer c_t) {
        this.c_t = c_t;
    }

    public Integer getL_c_c() {
        return l_c_c;
    }

    public void setL_c_c(Integer l_c_c) {
        this.l_c_c = l_c_c;
    }

    public String getB_s() {
        return b_s;
    }

    public void setB_s(String b_s) {
        this.b_s = b_s;
    }

    public String getP_c() {
        return p_c;
    }

    public void setP_c(String p_c) {
        this.p_c = p_c;
    }

    public String getS_p_c() {
        return s_p_c;
    }

    public void setS_p_c(String s_p_c) {
        this.s_p_c = s_p_c;
    }

    public List<SingleUploadJCBetDetailVO> getSupjcdl() {
        return supjcdl;
    }

    public void setSupjcdl(List<SingleUploadJCBetDetailVO> supjcdl) {
        this.supjcdl = supjcdl;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Integer getM() {
        return m;
    }

    public void setM(Integer m) {
        this.m = m;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("a", a)
                .append("b_n", b_n)
                .append("c_t", c_t)
                .append("l_c_c", l_c_c)
                .append("m", m)
                .append("b_s", b_s)
                .append("p_c", p_c)
                .append("s_p_c", s_p_c)
                .append("supjcdl", supjcdl)
                .toString();
    }
}
