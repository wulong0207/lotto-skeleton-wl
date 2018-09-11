package com.hhly.skeleton.base.util;

import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/**
 * token工具类
 * 
 * @author zhanglei
 *
 */
public class TokenUtil {

	/**
	 * 创建token字串 (UUID.randomUUID())
	 * 
	 * @return
	 */
	public static String createTokenStr() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

	/**
	 * 创建token字串，用于存储登录用户信息，第一位为登录平台 (UUID.randomUUID())
	 * 
	 * @return
	 */
	public static String createTokenStr(short platform) {
		return platform + UUID.randomUUID().toString().replaceAll("-", "");
	}

	/**
	 * 生成随机帐户名 - 手机号生成规则 (随机内容+手机号后4位)
	 * 
	 * @param mobile
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static String getUserNameByMobile(String mobile) throws NoSuchAlgorithmException {
		return EncryptUtil.randomCode() + mobile.substring(mobile.length() - 4, mobile.length());
	}

	/**
	 * 生成随机帐户名 - 邮箱生成规则 (随机内容+邮箱前4位,去掉符号)
	 * 
	 * @param email
	 * @return
	 */
	public static String getUserNameByEmail(String email) throws NoSuchAlgorithmException {
		String[] emailArray = email.split("@");
		String sub = emailArray[0];
		if (emailArray[0].matches(RegularValidateUtil.REGULAR_ACCOUNT2)) {
			return EncryptUtil.randomCode() + sub.substring(0, 4);
		} else {
			return sub;
		}
	}
}
