package com.yeg.json.test;

import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test03Map {

	// JavaBean(Entity/Model)转换成JSON

	public static void main(String[] args) {

		Map<String, Object> map = TestUtils.createMap();

		ObjectMapper objectMapper = new ObjectMapper();

		try {

			String json = objectMapper.writeValueAsString(map);

			System.out.println(json);

			// 使用我writeValue方法
			objectMapper.writeValue(System.out, map);

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
