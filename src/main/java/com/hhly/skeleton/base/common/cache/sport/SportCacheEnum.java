package com.hhly.skeleton.base.common.cache.sport;
import java.util.ArrayList;
import java.util.List;

import com.hhly.skeleton.base.common.cache.CacheEnumService;
import com.hhly.skeleton.base.constants.CacheConstants;


public class SportCacheEnum {
	
	/**
	 * 竞彩足球推荐信息枚举类
	 * @desc
	 * @author lidecheng
	 * @date 2017年5月12日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum SportCmsFBCacheEnum implements CacheEnumService {
        SPORT_FB_MATCH_LIST(CacheConstants.S_COMM_SPORT_FB_MATCH_LIST, "竞彩足球受注赛事信息"),
        S_COMM_SPORT_BB_MATCH_LIST(CacheConstants.S_COMM_SPORT_BB_MATCH_LIST,"竞彩篮球球受注赛事信息"),
        C_COMM_FAST_FIND_FAST_INFO(CacheConstants.C_COMM_FAST_FIND_FAST_INFO, "快投模块信息"),
		C_ACTIVITY_SPORT_RULE_INFO(CacheConstants.C_ACTIVITY_SPORT_RULE_INFO, "活動信息表，特定赛事加奖，单关加奖");
	    private final String _code;
	    private final String _message;
	    private final static List<String> ENUM_MAP ;
	    static{
	    	ENUM_MAP = new ArrayList<String>();
			for(SportCmsFBCacheEnum cacheEnum : SportCmsFBCacheEnum.values()){	        	
				ENUM_MAP.add(cacheEnum.getValue());
			}
		}	   
	    SportCmsFBCacheEnum(String code,String message){
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
	 * 竞彩蓝球推荐信息枚举类
	 * @desc
	 * @author lidecheng
	 * @date 2017年5月12日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum SportCmsBBCacheEnum implements CacheEnumService {
		SPORT_MATCH_BB_SP_INFO(CacheConstants.S_COMM_MATCH_BB_SP_INFO,"竞彩蓝球推荐赛事信息")
	    ;
	    private final String _code;
	    private final String _message;
	    private final static List<String> ENUM_MAP ;
	    static{
	    	ENUM_MAP = new ArrayList<String>();
			for(SportCmsBBCacheEnum cacheEnum : SportCmsBBCacheEnum.values()){	        	
				ENUM_MAP.add(cacheEnum.getValue());
			}
		}	   
	    SportCmsBBCacheEnum(String code,String message){
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
