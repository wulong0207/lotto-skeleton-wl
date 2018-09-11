package com.hhly.skeleton.base.util;

/**
 * @Description 获取操作系统相关参数
 * @Author longguoyou
 * @Date  2018/5/22 14:16
 * @Since 1.8
 */
public class SysUtil {

    /**
     * 获取系统字符编码
     * @return
     */
    public static String getSystemEncoding(){
         String os = getOS();
         if(os.toLowerCase().startsWith("win")){
             return "GBK";
         }else if(os.toLowerCase().startsWith("linux")){
             return "UTF-8";
         }
         return "UTF-8";
     }

    /**
     * 获取系统类型
     * @return
     */
    public static String getOS(){
         return System.getProperty("os.name");
     }
}
