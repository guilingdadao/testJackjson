package com.yeg.json.test;

import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Test07Json2Map {

	public static void main(String[] args) {

		try {
			
			String jsonStr ="{\"id\":1,\"name\":\"青山一点红\",\"email\":\"yuaneg@qq.com\",\"address\":\"北京市昌平区\",\"birthday\":{\"birthday\":\"1982-09-09\"}}";
			ObjectMapper objectMapper = new ObjectMapper();
			
			//字符串转化成Map
			Map map=  objectMapper.readValue(jsonStr, Map.class);
			
			System.out.println(map);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
