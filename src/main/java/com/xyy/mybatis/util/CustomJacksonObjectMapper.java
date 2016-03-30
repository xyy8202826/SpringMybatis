package com.xyy.mybatis.util;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CustomJacksonObjectMapper extends ObjectMapper {

	private static final long serialVersionUID = 1L;

	public CustomJacksonObjectMapper(){
        super();  
        //设置null转换隐藏该字段
        setSerializationInclusion(Include.NON_NULL);  
	}
}
