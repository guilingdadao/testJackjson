package com.yeg.json.test;

import java.text.SimpleDateFormat;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yeg.json.model.Person;

public class Test02User2 {

	public static void main(String[] args) {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));

		
		
		
		Person u = TestUtils.createPerson();

		try {
			String jsonStr = objectMapper.writeValueAsString(u);

			System.out.println(jsonStr);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

	}
}
