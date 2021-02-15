package com.yeg.json.test;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Test02Menu {
	public static void main(String[] args) {
		ObjectMapper objectMapper = new ObjectMapper();

		List<com.yeg.json.model.Menu> menuList = TestUtils.initMenu();

		try {
//			格式化输出
			objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
			
			String jsonStr = objectMapper.writeValueAsString(menuList);

			System.out.println(jsonStr);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

	}

}
