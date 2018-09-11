package com.hhly.skeleton.base.common.cache.issue;
import java.util.ArrayList;
import java.util.List;

import com.hhly.skeleton.base.common.cache.CacheEnumService;
import com.hhly.skeleton.base.constants.CacheConstants;


public class IssueCacheEnum {
	/**
	 * 彩期信息缓存
	 * @desc
	 * @author lidecheng
	 * @date 2017年5月12日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum LotteryIssueCacheEnum implements CacheEnumService {
		LOTTERY_ISSUE_CURRENT_AND_LAST(CacheConstants.C_COMM_LOTTERY_ISSUE_CURRENT_AND_LAST,"查询单个的彩期信息"),
		LOTTO_OMIT(CacheConstants.N_CORE_LOTTO_OMIT,"遗漏前缀"),
		LOTTO_TREND(CacheConstants.N_CORE_LOTTO_TREND,"彩种走势前缀"),
		LOTTERY_ISSUE_ALL_CURRENT_AND_LAST(CacheConstants.C_COMM_LOTTERY_ISSUE_ALL_CURRENT_AND_LAST,"查询所有的彩期信息"),
		LOTTERY_ISSUE_FIND_ISSUE_BY_CODE(CacheConstants.C_COMM_LOTTERY_ISSUE_FIND_ISSUE_BY_CODE,"查询当前期和之后的预售期组成列表"),
		LOTTO_ISSUE_TYPE_TOP(CacheConstants.N_CORE_LOTTO_ISSUE_TYPE_TOP,"查询某个彩种头部的彩期信息前缀"),
		;
	    private final String _code;
	    private final String _message;
	    private final static List<String> ENUM_MAP ;
	    static{
	    	ENUM_MAP = new ArrayList<String>();
			for(LotteryIssueCacheEnum cacheEnum : LotteryIssueCacheEnum.values()){	        	
				ENUM_MAP.add(cacheEnum.getValue());
			}
		}	   
	    LotteryIssueCacheEnum(String code,String message){
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
	    //根据彩种类型清空缓存
	    public static List<String>  getCacheKey(Integer lotteryCode){
	    	 List<String> retList = new ArrayList<String>();
			for(LotteryIssueCacheEnum cacheEnum : LotteryIssueCacheEnum.values()){
				switch (cacheEnum.getValue()) {
					case CacheConstants.N_CORE_LOTTO_ISSUE_TYPE_TOP:
					case CacheConstants.C_COMM_LOTTERY_ISSUE_CURRENT_AND_LAST:
					case CacheConstants.C_COMM_LOTTERY_ISSUE_FIND_ISSUE_BY_CODE:
					case CacheConstants.N_CORE_LOTTO_OMIT:
						retList.add(cacheEnum.getValue()+lotteryCode);
						break;
					default:
						retList.add(cacheEnum.getValue());
						break;
				}				
			}
	    	return retList;
	    }

		// 根据彩种类型清空彩种首页遗漏冷热概率缓存
		public static String getOmitCacheKey(Integer lotteryCode) {
			return CacheConstants.N_CORE_LOTTO_OMIT + lotteryCode;
		}
	}
}
