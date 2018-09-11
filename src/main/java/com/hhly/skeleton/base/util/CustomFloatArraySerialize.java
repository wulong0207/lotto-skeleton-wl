package com.hhly.skeleton.base.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.text.DecimalFormat;

/**
 * Created by lgs on 2017/1/16.
 * 序列化json 数字保存两位小数
 */
public class CustomFloatArraySerialize extends JsonSerializer<Float[]> {

    private static final char QUOTE = '"';
    private DecimalFormat df = new DecimalFormat("##.00");

    @Override
    public void serialize(Float[] floats, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        StringBuffer sb = new StringBuffer("[");
        for (Float value : floats) {
            if (sb.length() == 1 && sb.indexOf(",") == -1) {
                sb.append(QUOTE).append(df.format(value)).append(QUOTE);
            } else {
                sb.append(",").append(QUOTE).append(df.format(value)).append(QUOTE);
            }

        }
        sb.append("]");
        jsonGenerator.writeString(sb.toString());
    }
}
