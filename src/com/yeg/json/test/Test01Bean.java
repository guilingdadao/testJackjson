package com.yeg.json.test;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yeg.json.model.AccountBean;

public class Test01Bean {

	// JavaBean(Entity/Model)转换成JSON

	public static void main(String[] args) {

		AccountBean ab = TestUtils.createAccountBean();

		ObjectMapper objectMapper = new ObjectMapper();

		try {
			String json = objectMapper.writeValueAsString(ab);
			System.out.println(json);

			System.out.println();
			// 使用我writeValue方法
			objectMapper.writeValue(System.out, ab);

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
