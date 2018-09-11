package com.hhly.skeleton.base.valid;
/**
 * 
 * @author jiangwei
 * @Version 1.0
 * @CreatDate 2016-11-25 上午11:23:06
 * @Desc 用户参数验证的正则表达式
 */
public class MatchPattern {
	//验证密码(以字母开头，长度在6~18之间，只能包含字符、数字和下划线)
    public static final String PWD = "^[a-zA-Z]\\w{5,17}$";
    //只能数字
    public static final String NUM="^[0-9]*$";
    //手机号码
    public static final String PHONE = "^[0-9]{11}$";
    //邮箱
    public static final String MAIL = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
    //比分
    public static final String SCORE = "^[0-9]*:[0-9]*";
    //只能是数字可以有负数
    public static final String POSITIVE_NEGATIVE_NUM = "^(-|\\+)?\\d+$";
    //最多2位小数
    public static final String FLOAT_TWO_DECIMAL="^[0-9]+(.[0-9]{1,2})?$";
}
