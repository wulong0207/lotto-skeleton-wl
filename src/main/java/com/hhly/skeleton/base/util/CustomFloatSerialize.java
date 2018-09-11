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
public class CustomFloatSerialize extends JsonSerializer<Float> {

    private static DecimalFormat df = new DecimalFormat("##.00");

    @Override
    public void serialize(Float value, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(df.format(value));
    }
}
