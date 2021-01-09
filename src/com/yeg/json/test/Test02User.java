package com.yeg.json.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yeg.json.model.User;

public class Test02User {

	public static void main(String[] args) {
		ObjectMapper objectMapper = new ObjectMapper();

		User u = TestUtils.createUser();

		try {
			String jsonStr = objectMapper.writeValueAsString(u);

			System.out.println(jsonStr);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

	}
}
