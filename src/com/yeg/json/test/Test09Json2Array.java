package com.yeg.json.test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yeg.json.model.AccountBean;

public class Test09Json2Array {

	public static void main(String[] args) {
		String json = "[{\"address\": \"address2\",\"name\":\"haha2\",\"id\":2,\"email\":\"email2\"},"
				+ "{\"address\":\"address\",\"name\":\"haha\",\"id\":1,\"email\":\"email\"}]";

		ObjectMapper objectMapper = new ObjectMapper();

		try {
			AccountBean[] arr = objectMapper.readValue(json,
					AccountBean[].class);

			for (AccountBean ab : arr) {

				System.out.println(ab);
			}

			System.out.println("*************************************");

			List<AccountBean> abList = Arrays.asList(arr);

			for (AccountBean ab : abList) {

				System.out.println(ab);
			}

		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
