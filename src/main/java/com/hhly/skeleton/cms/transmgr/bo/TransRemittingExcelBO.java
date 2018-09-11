package com.hhly.skeleton.cms.transmgr.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;
import com.hhly.skeleton.base.excel.ReplaceAttribute;
import com.hhly.skeleton.base.model.DicDataEnum;
import com.hhly.skeleton.base.vo.PageVO;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

public class TransRemittingExcelBO extends BaseBO{

    @ExcelHeader("序号")
    private Integer id;
    @ExcelHeader("会员昵称")
    private String nickName;
    @ExcelHeader("会员账号")
    private String accountName;
    @ExcelHeader("用户手机")
    private String cusMobile;
    @ExcelHeader("真实姓名")
    private String actualName;

    @ExcelHeader("汇款银行")
    @ReplaceAttribute(DicDataEnum.TRANS_REMITTING_BANK)
    private String remittingBank;

    @ExcelHeader("汇款金额(元)")
    private Double remittingAmount;

    @ExcelHeader("汇款提交时间")
    private Date commitTime;

    @ExcelHeader("手动充值状态")
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getCusMobile() {
        return cusMobile;
    }

    public void setCusMobile(String cusMobile) {
        this.cusMobile = cusMobile;
    }

    public String getActualName() {
        return actualName;
    }

    public void setActualName(String actualName) {
        this.actualName = actualName;
    }



    public Double getRemittingAmount() {
        return remittingAmount;
    }

    public void setRemittingAmount(Double remittingAmount) {
        this.remittingAmount = remittingAmount;
    }

    public Date getCommitTime() {
        return commitTime;
    }

    public void setCommitTime(Date commitTime) {
        this.commitTime = commitTime;
    }

    public String getRemittingBank() {
        return remittingBank;
    }

    public void setRemittingBank(String remittingBank) {
        this.remittingBank = remittingBank;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}