package com.yeg.json.test;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yeg.json.model.AccountBean;

public class Test04List {

	public static void main(String[] args) {

		List<AccountBean> list = TestUtils.createList();

		ObjectMapper objectMapper = new ObjectMapper();
		String json;
		try {
			json = objectMapper.writeValueAsString(list);
			System.out.println(json);

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

	}
}
