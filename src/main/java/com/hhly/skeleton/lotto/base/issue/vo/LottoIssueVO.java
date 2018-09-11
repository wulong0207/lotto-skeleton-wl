package com.hhly.skeleton.lotto.base.issue.vo;

import com.hhly.skeleton.base.vo.PageVO;

/**
 * @author lgs on
 * @version 1.0
 * @desc 查询彩期信息VO
 * @date 2017/4/10.
 * @company 益彩网络科技有限公司
 */
public class LottoIssueVO extends PageVO {
    private static final long serialVersionUID = 5657727656464573117L;
    /**
     * 彩种id
     */
    private Integer lotteryCode;
    
    private String issueCode;

    public Integer getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(Integer lotteryCode) {
        this.lotteryCode = lotteryCode;
    }
}
