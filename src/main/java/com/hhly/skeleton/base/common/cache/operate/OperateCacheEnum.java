package com.hhly.skeleton.base.common.cache.operate;
import java.util.ArrayList;
import java.util.List;

import com.hhly.skeleton.base.common.cache.CacheEnumService;
import com.hhly.skeleton.base.constants.CacheConstants;


public class OperateCacheEnum {	
	
	/**
	 * 资讯枚举类
	 * @desc
	 * @author lidecheng
	 * @date 2017年5月12日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum ArticleCacheEnum implements CacheEnumService {
		C_PC_ARTICLE_FIND_HOME(CacheConstants.C_PC_ARTICLE_FIND_HOME,"查询pc首页新闻资讯信息接口缓存"),
		C_COMM_ARTICLE_FIND_HOME(CacheConstants.C_COMM_ARTICLE_FIND_HOME,"查询移动端首页新闻资讯信息"),
		C_PC_ARTICLE_FIND_BY_TYPE_LIST(CacheConstants.C_PC_ARTICLE_FIND_BY_TYPE_LIST,"查询pc首页新闻资讯信息接口缓存"),
		C_COMM_ARTICLE_FIND_BY_TOP(CacheConstants.C_COMM_ARTICLE_FIND_BY_TOP,"查询栏目头部资讯信息"),
		C_COMM_ARTICLE_FIND_BY_CENTENT(CacheConstants.C_COMM_ARTICLE_FIND_BY_CENTENT,"查询栏目中间资讯详细信息"),
		C_PC_ARTICLE_FIND_BY_CODE(CacheConstants.C_PC_ARTICLE_FIND_BY_CODE,"查询专栏信息"),
		C_COMM_ARTICLE_FIND_BY_LABLE(CacheConstants.C_COMM_ARTICLE_FIND_BY_LABLE,"查询移动端专栏信息"),
		C_PC_ARTICLE_FIND_BY_FATYPE(CacheConstants.C_PC_ARTICLE_FIND_BY_FATYPE,"根据父节点查询子节点信息"),
		C_COMM_ARTICLE_FIND_RELA_LIST(CacheConstants.C_COMM_ARTICLE_FIND_RELA_LIST,"查询资讯栏目关系"),
		C_PC_ARTICLE_FIND_SIDEBAR_NEWS(CacheConstants.C_PC_ARTICLE_FIND_SIDEBAR_NEWS,"查询侧边栏资讯头条信息 ，查询规则查当前节点和子节点下创建的信息"),
		C_COMM_ARTICLE_FIND_LIST(CacheConstants.C_COMM_ARTICLE_FIND_LIST,"查询所有栏目")
	    ;
	    private final String _code;
	    private final String _message;
	    private final static List<String> ENUM_MAP ;
	    static{
	    	ENUM_MAP = new ArrayList<String>();
			for(ArticleCacheEnum cacheEnum : ArticleCacheEnum.values()){	        	
				ENUM_MAP.add(cacheEnum.getValue());
			}
		}	   
	    ArticleCacheEnum(String code,String message){
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
	 * 广告图枚举类
	 * @desc
	 * @author lidecheng
	 * @date 2017年5月12日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum AdCacheEnum implements CacheEnumService {
		C_COMM_AD_FIND_HOME_OPER_AD(CacheConstants.C_COMM_AD_FIND_HOME_OPER_AD,"查询广告信息"),
	    ;
	    private final String _code;
	    private final String _message;
	    private final static List<String> ENUM_MAP ;
	    static{
	    	ENUM_MAP = new ArrayList<String>();
			for(AdCacheEnum cacheEnum : AdCacheEnum.values()){	        	
				ENUM_MAP.add(cacheEnum.getValue());
			}
		}	   
	    AdCacheEnum(String code,String message){
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
	 * 版本信息枚举类
	 * @desc
	 * @author lidecheng
	 * @date 2017年5月12日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum VerSionCacheEnum implements CacheEnumService {
		C_COMM_VERSION_FIND_NEW_VERSION(CacheConstants.C_COMM_VERSION_FIND_NEW_VERSION,"查询广告信息"),
	    ;
	    private final String _code;
	    private final String _message;
	    private final static List<String> ENUM_MAP ;
	    static{
	    	ENUM_MAP = new ArrayList<String>();
			for(VerSionCacheEnum cacheEnum : VerSionCacheEnum.values()){	        	
				ENUM_MAP.add(cacheEnum.getValue());
			}
		}	   
	    VerSionCacheEnum(String code,String message){
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
	 * 快投推荐信息枚举类
	 * @desc
	 * @author lidecheng
	 * @date 2017年5月12日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum FastCacheEnum implements CacheEnumService {
		C_COMM_FAST_FIND_FAST_INFO(CacheConstants.C_COMM_FAST_FIND_FAST_INFO,"快投模块信息"),
	    ;
	    private final String _code;
	    private final String _message;
	    private final static List<String> ENUM_MAP ;
	    static{
	    	ENUM_MAP = new ArrayList<String>();
			for(FastCacheEnum cacheEnum : FastCacheEnum.values()){	        	
				ENUM_MAP.add(cacheEnum.getValue());
			}
		}	   
	    FastCacheEnum(String code,String message){
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
	 * 彩种运营推荐信息枚举类
	 * @desc
	 * @author lidecheng
	 * @date 2017年5月12日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum OperLottCacheEnum implements CacheEnumService {
		C_COMM_LOTTERY_FIND_HOME_OPER(CacheConstants.C_COMM_LOTTERY_FIND_HOME_OPER,"彩种运营模块信息"),
	    ;
	    private final String _code;
	    private final String _message;
	    private final static List<String> ENUM_MAP ;
	    static{
	    	ENUM_MAP = new ArrayList<String>();
			for(OperLottCacheEnum cacheEnum : OperLottCacheEnum.values()){	        	
				ENUM_MAP.add(cacheEnum.getValue());
			}
		}	   
	    OperLottCacheEnum(String code,String message){
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
	 * 活动缓存枚举类
	 *
	 * @author huangchengfang1219
	 * @date 2018年1月11日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum ActivityCacheEnum implements CacheEnumService {
		C_CORE_ACTIVITY_MAIN(CacheConstants.C_CORE_ACTIVITY_MAIN, "活动详细信息"),
		C_ACTIVITY_RULE_INFO(CacheConstants.C_ACTIVITY_RULE_INFO,"加奖活动信息"),
		C_ACTIVITY_SPOR_RULE_INFO(CacheConstants.C_ACTIVITY_RULE_INFO,"特定赛事加奖活动信息");
		private final String _code;
		private final String _message;
		private final static List<String> ENUM_MAP;
		static {
			ENUM_MAP = new ArrayList<String>();
			for (ActivityCacheEnum cacheEnum : ActivityCacheEnum.values()) {
				ENUM_MAP.add(cacheEnum.getValue());
			}
		}

		ActivityCacheEnum(String code, String message) {
			_code = code;
			_message = message;
		}

		@Override
		public String getValue() {
			return _code;
		}

		@Override
		public String getMessage() {
			return _message;
		}

		public static List<String> getCacheKey() {
			return ENUM_MAP;
		}
	}
	
}
