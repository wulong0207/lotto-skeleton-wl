package com.hhly.skeleton.base.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Util {
	private static final char[] DIGITS = { '0', '1', '2', '3', '4', '5', '6',
		'7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

	public static String md5_32(String text,String charsetName) {
		MessageDigest msgDigest = null;
	
		try {
			msgDigest = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			throw new IllegalStateException(
					"System doesn't support MD5 algorithm.");
		}
	
		try {
			msgDigest.update(text.getBytes(charsetName)); // 注意改接口是按照指定编码形式签名
	
		} catch (UnsupportedEncodingException e) {
	
			throw new IllegalStateException(
					"System doesn't support your  EncodingException.");
		}
	
		byte[] bytes = msgDigest.digest();
	
		String md5Str = new String(encodeHex(bytes));
	
		return md5Str;
	
	}
    //32位
	public static String md5_32(String text) {
		return md5_32(text, "utf-8");
	}
    
	// encodeHex
	public static char[] encodeHex(byte[] data) {
		int l = data.length;
	
		char[] out = new char[l << 1];
	
		for (int i = 0, j = 0; i < l; i++) {
			out[j++] = DIGITS[(0xF0 & data[i]) >>> 4];
			out[j++] = DIGITS[0x0F & data[i]];
		}
	
		return out;
	}
	
	// 16位
	public static String md5_16(String text){
		String str_32 = md5_32(text) ;
		return str_32.substring(8, 24);
	}
	
	//main
	public static void main(String[]args){
		System.out.println(md5_32("tadmin"));
		System.out.println(md5_16("zhanglei123"));
		System.out.println(md5_16("111111"));
		
		//0E17391B6473ADA40D05C3B7469B45E4
	}
	
	/* 大写的MD5*/
	public static String MD5lower(String s) {
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		try {
			byte[] btInput = s.getBytes();
			// 获得MD5摘要算法的 MessageDigest 对象
			MessageDigest mdInst = MessageDigest.getInstance("MD5");
			// 使用指定的字节更新摘要
			mdInst.update(btInput);
			// 获得密文
			byte[] md = mdInst.digest();
			// 把密文转换成十六进制的字符串形式
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = md[i];
				str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				str[k++] = hexDigits[byte0 & 0xf];
			}
			return new String(str);
		} catch (Exception e) {
			return null;
		}
	}
	
	public static String EncoderByMd5(String buf) throws NoSuchAlgorithmException, UnsupportedEncodingException {  
	     MessageDigest digist = MessageDigest.getInstance("MD5");  
	     byte[] rs = digist.digest(buf.getBytes("UTF-8"));  
	     StringBuffer digestHexStr = new StringBuffer();  
	     for (int i = 0; i < 16; i++) {  
	        digestHexStr.append(byteHEX(rs[i]));  
	     }  
	     return digestHexStr.toString();  
	}
	
	public static String byteHEX(byte ib) {  
	    char[] Digit = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };  
	    char[] ob = new char[2];  
	    ob[0] = Digit[(ib >>> 4) & 0X0F];  
	    ob[1] = Digit[ib & 0X0F];  
	    String s = new String(ob);  
	    return s;  
	}
	
}
