package com.hhly.skeleton.base.util;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hhly.skeleton.base.common.cache.CacheEnumService;

public class CacheEnumUtil {

	 /**
     * 枚举类对应的包路径
     */
    public final static String PACKAGE_NAME = "com.hhly.skeleton.base.common.cache";
    /**
     * 枚举接口类全路径
     */
    public final static String ENUM_MESSAGE_PATH=PACKAGE_NAME+".CacheEnumService";

    /**
     * 枚举类对应的全路径集合
     */
    public static final List<String> ENUM_OBJECT_PATH = PackageUtil.getPackageClasses(PACKAGE_NAME, true);

    /**
     * 存放单个枚举对象 map常量定义
     */
    private static Map<String, CacheEnumService> SINGLE_ENUM_MAP = null;
    /**
     * 所有枚举对象的 map
     */
    public static final Map<Class<?>, Map<String, CacheEnumService>> ENUM_MAP = initialEnumMap(true);


    /**
     * 获取value返回枚举对象
     * @param value
     * @param clazz
     * */
    @SuppressWarnings("unchecked")
	public static <T extends  CacheEnumService>  T getEnumObject(String value,Class<T> clazz){
        return (T)ENUM_MAP.get(clazz).get(value);
    }
    
    
    
    
    /**
     * 加载所有枚举对象数据
     * @param  isFouceCheck 是否强制校验枚举是否实现了CacheEnumService接口
     *
     * */
    private static Map<Class<?>, Map<String, CacheEnumService>> initialEnumMap(boolean isFouceCheck){
        Map<Class<?>, Map<String, CacheEnumService>> ENUM_MAP = new HashMap<Class<?>, Map<String, CacheEnumService>>();
        try {
            for (String classname : ENUM_OBJECT_PATH) {
                Class<?> cls = null;
                cls = Class.forName(classname);
                Class <?>[]iter=cls.getInterfaces();
                boolean flag=false;
                if(isFouceCheck){
                    for(Class<?> cz:iter){
                        if(cz.getName().equals(ENUM_MESSAGE_PATH)){
                            flag=true;
                            break;
                        }
                    }
                }
                if(flag==isFouceCheck){
                     SINGLE_ENUM_MAP = new HashMap<String, CacheEnumService>();
                    initialSingleEnumMap(cls);
                    ENUM_MAP.put(cls, SINGLE_ENUM_MAP);
                }

            }
        } catch (Exception e) {
           
        }
        return ENUM_MAP;
    }

    /**
     * 加载每个枚举对象数据
     * */
    private static void  initialSingleEnumMap(Class<?> cls )throws Exception{
        Method method = cls.getMethod("values");
        CacheEnumService inter[] = (CacheEnumService[]) method.invoke(null, null);
        for (CacheEnumService CacheEnumService : inter) {
            SINGLE_ENUM_MAP.put(CacheEnumService.getValue(), CacheEnumService);
        }
    }

    /**
     * 加载所有枚举对象数据
     * @param  isFouceCheck 是否强制校验枚举是否实现了CacheEnumService接口
     *
     * */
    private static Map<Class<?>, Map<String, CacheEnumService>> getEnumMap(){
        Map<Class<?>, Map<String, CacheEnumService>> ENUM_MAP = new HashMap<Class<?>, Map<String, CacheEnumService>>();
        try {
            for (String classname : ENUM_OBJECT_PATH) {
                Class<?> cls = null;
                cls = Class.forName(classname);
                Method method = cls.getMethod("values");
                CacheEnumService inter[] = (CacheEnumService[]) method.invoke(null, null);
                for (CacheEnumService CacheEnumService : inter) {
                    SINGLE_ENUM_MAP.put(CacheEnumService.getValue(), CacheEnumService);
                }

            }
        } catch (Exception e) {
           
        }
        return ENUM_MAP;
    }
}
