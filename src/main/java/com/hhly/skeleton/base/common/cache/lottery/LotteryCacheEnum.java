package com.hhly.skeleton.base.common.cache.lottery;
import java.util.ArrayList;
import java.util.List;

import com.hhly.skeleton.base.common.cache.CacheEnumService;
import com.hhly.skeleton.base.constants.CacheConstants;


public class LotteryCacheEnum {

	/**
	 * 彩种信息枚举类
	 * @desc
	 * @author lidecheng
	 * @date 2017年5月12日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum LotteryTypeCacheEnum implements CacheEnumService {
		C_COMM_LOTTERY_FIND_ALL_TYPE(CacheConstants.C_COMM_LOTTERY_FIND_ALL_TYPE,"查询所有彩种信息"),
		C_COMM_FAST_FIND_FAST_INFO(CacheConstants.C_COMM_FAST_FIND_FAST_INFO,"快投模块关联彩种信息"),
		C_COMM_LOTTERY_FIND_HOME_OPER(CacheConstants.C_COMM_LOTTERY_FIND_HOME_OPER,"彩种运营模块信息"),
		LOTTO_ISSUE_TYPE_TOP(CacheConstants.N_CORE_LOTTO_ISSUE_TYPE_TOP,"查询某个彩种头部的彩期信息前缀"),
		C_COMM_LOTTERY_FIND_HIGH_MAX_ENDDRAWTIME(CacheConstants.C_COMM_LOTTERY_FIND_HIGH_MAX_ENDDRAWTIME,"查询高频彩最大截止销售时间"),
		C_CORE_DRAW_LOTTERY(CacheConstants.C_CORE_DRAW_LOTTERY, "开奖公告彩种信息")
	    ;
	    private final String _code;
	    private final String _message;
	    private final static List<String> ENUM_MAP ;
	    static{
	    	ENUM_MAP = new ArrayList<String>();
			for(LotteryTypeCacheEnum cacheEnum : LotteryTypeCacheEnum.values()){	        	
				ENUM_MAP.add(cacheEnum.getValue());
			}
		}	   
	    LotteryTypeCacheEnum(String code,String message){
	        _code=code;
	        _message=message;
	    }
	    @Override
	    public String getValue() { return _code;}
	    @Override
	    public String getMessage() { return _message; }
	    public static  List<String>  getCacheKey(){
	    	return ENUM_MAP;
	    }	   
	}
	
	/**
	 * 限号枚举类
	 * @desc
	 * @author lidecheng
	 * @date 2017年5月12日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum LotteryLimitCacheEnum implements CacheEnumService {
		LOTTO_ISSUE_TYPE_TOP(CacheConstants.N_CORE_LOTTO_ISSUE_TYPE_TOP,"查询某个彩种头部的彩期信息前缀"),
	    ;
	    private final String _code;
	    private final String _message;
	    private final static List<String> ENUM_MAP ;
	    static{
	    	ENUM_MAP = new ArrayList<String>();
			for(LotteryLimitCacheEnum cacheEnum : LotteryLimitCacheEnum.values()){	        	
				ENUM_MAP.add(cacheEnum.getValue());
			}
		}	   
	    LotteryLimitCacheEnum(String code,String message){
	        _code=code;
	        _message=message;
	    }
	    @Override
	    public String getValue() { return _code;}
	    @Override
	    public String getMessage() { return _message; }
	    public static  List<String>  getCacheKey(){
	    	return ENUM_MAP;
	    }	   
	}
}
