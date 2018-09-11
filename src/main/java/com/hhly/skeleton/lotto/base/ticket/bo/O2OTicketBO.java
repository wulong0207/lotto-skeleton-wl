package com.hhly.skeleton.lotto.base.ticket.bo;

import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @author lgs on
 * @version 1.0
 * @desc 线下出票实体
 * @date 2018/6/25.
 * @company 益彩网络科技有限公司
 */
public class O2OTicketBO extends BaseBO{

    private Long id;

    private Integer multipleNum;
    
    private Integer equal;
    
    
    private String printContent;
    
    private String printUrl;
    /**
     * 竞彩票结果集
     */
    private List<SportTicketDetailInfoBO> sportList;
    
    private List<String>  ticketContent;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Integer getMultipleNum() {
        return multipleNum;
    }

    public void setMultipleNum(Integer multipleNum) {
        this.multipleNum = multipleNum;
    }

    public List<SportTicketDetailInfoBO> getSportList() {
        return sportList;
    }

    public void setSportList(List<SportTicketDetailInfoBO> sportList) {
        this.sportList = sportList;
    }

	/**
	 * @return the equal
	 */
	public Integer getEqual() {
		return equal;
	}

	/**
	 * @param equal the equal to set
	 */
	public void setEqual(Integer equal) {
		this.equal = equal;
	}

	/**
	 * @return the printContent
	 */
	public String getPrintContent() {
		return printContent;
	}

	/**
	 * @param printContent the printContent to set
	 */
	public void setPrintContent(String printContent) {
		this.printContent = printContent;
	}

	/**
	 * @return the printUrl
	 */
	public String getPrintUrl() {
		return printUrl;
	}

	/**
	 * @param printUrl the printUrl to set
	 */
	public void setPrintUrl(String printUrl) {
		this.printUrl = printUrl;
	}

	public List<String> getTicketContent() {
		return ticketContent;
	}

	public void setTicketContent(List<String> ticketContent) {
		this.ticketContent = ticketContent;
	}

	
}
