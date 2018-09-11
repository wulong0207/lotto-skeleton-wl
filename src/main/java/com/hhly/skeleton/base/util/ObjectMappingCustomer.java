package com.hhly.skeleton.base.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.util.Collection;

/**
 * @author lgs on
 * @version 1.0
 * @desc jackson 序列化辅助类
 * @date 2017/3/17.
 * @company 益彩网络科技有限公司
 */
public class ObjectMappingCustomer extends ObjectMapper {

    public ObjectMappingCustomer()
    {
        super();
        // 允许单引号
        this.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        // 字段和值都加引号
        this.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        // 数字也加引号
        this.configure(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS, false);
        this.configure(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS, true);
        //设置json id字符找不到对象属性时,忽略这个字符
        this.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        // 空值处理为空串
        this.getSerializerProvider().setNullValueSerializer(new JsonSerializer<Object>()
        {
            @Override
            public void serialize(Object o, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
                //如果为Collection 类型 则序列化为[]
                if(o instanceof Collection){
                    jsonGenerator.writeStartArray();
                    jsonGenerator.writeEndArray();
                }else{
                    jsonGenerator.writeString("");
                }
            }

        });

    }
}

