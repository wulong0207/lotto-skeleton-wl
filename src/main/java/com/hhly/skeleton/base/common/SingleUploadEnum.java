package com.hhly.skeleton.base.common;

import java.io.UnsupportedEncodingException;

/**
 * 单式上传枚举
 * @author longguoyou
 * @date 2017年6月13日
 * @compay 益彩网络科技有限公司
 */
public class SingleUploadEnum {
	
	public enum EncodingType{
		
		UFT8("UTF-8"),
		GBK("GBK"),
		GB18030("GB18030"),
		ISO88591("ISO-8859-1"),
		GB2312("GB2312");

		/**
		 * 简称
		 */
		private String shortName;

		EncodingType(String shortName) {
			this.shortName = shortName;
		}

		public String getShortName() {
			return shortName;
		}

		public void setShortName(String shortName) {
			this.shortName = shortName;
		}
		
		public static String getUTF8StringFromGBKString(String gbkStr) {  
	        try {  
	            return new String(getUTF8BytesFromGBKString(gbkStr), "UTF-8");  
	        } catch (UnsupportedEncodingException e) {  
	            throw new InternalError();  
	        }  
	    }  
		      
	    public static byte[] getUTF8BytesFromGBKString(String gbkStr) {  
	        int n = gbkStr.length();  
	        byte[] utfBytes = new byte[3 * n];  
	        int k = 0;  
	        for (int i = 0; i < n; i++) {  
	            int m = gbkStr.charAt(i);  
	            if (m < 128 && m >= 0) {  
	                utfBytes[k++] = (byte) m;  
	                continue;  
	            }  
	            utfBytes[k++] = (byte) (0xe0 | (m >> 12));  
	            utfBytes[k++] = (byte) (0x80 | ((m >> 6) & 0x3f));  
	            utfBytes[k++] = (byte) (0x80 | (m & 0x3f));  
	        }  
	        if (k < utfBytes.length) {  
	            byte[] tmp = new byte[k];  
	            System.arraycopy(utfBytes, 0, tmp, 0, k);  
	            return tmp;  
	        }  
	        return utfBytes;  
	    }  
	}
	
	public enum FileType{
	
		TXT("txt", (short) 1),
		ZIP("zip", (short) 2),
		RAR("rar", (short) 3);

		/**
		 * 简称
		 */
		private String shortName;
		/**
		 * 状态值
		 */
		private short value;

		FileType(String shortName, short value) {
			this.shortName = shortName;
			this.value = value;
		}

		public short getValue() {
			return value;
		}

		public void setValue(short value) {
			this.value = value;
		}

		public String getShortName() {
			return shortName;
		}

		public void setShortName(String shortName) {
			this.shortName = shortName;
		}
	}

	public enum UploadType {
		/**选择场次*/
		SELECTED("选择场次", (short) 1,  "xzcc"),
		/**包含场次*/
		INCLUDE("包含场次", (short) 2, "bhcc");

		/**
		 * 状态描述
		 */
		private String desc;
		/**
		 * 状态值
		 */
		private short value;
		/**
		 * 中文简称
		 */
		private String shortName;

		UploadType(String desc, short value, String shortName) {
			this.desc = desc;
			this.value = value;
			this.shortName = shortName;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public short getValue() {
			return value;
		}

		public void setValue(short value) {
			this.value = value;
		}
		
		public String getShortName() {
			return shortName;
		}

		public void setShortName(String shortName) {
			this.shortName = shortName;
		}

		public static UploadType getUploadType(Short uploadType) {
			for(UploadType type : UploadType.values()){
				if(type.getValue() == uploadType){
					return type;
				}
			}
			return null;
		}
	}
}
