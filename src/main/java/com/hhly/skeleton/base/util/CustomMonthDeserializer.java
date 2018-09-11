package com.hhly.skeleton.base.util;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

/**
 * 转换月份
 *
 * @author huangchengfang1219
 * @date 2018年3月29日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class CustomMonthDeserializer extends JsonDeserializer<Date> {

	private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");

	@Override
	public Date deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		String dateStr = p.getText();
		if (!ObjectUtil.isBlank(dateStr)) {
			try {
				return format.parse(dateStr.trim());
			} catch (ParseException e) {
				throw new RuntimeException(e);
			}
		}
		return null;
	}

}
