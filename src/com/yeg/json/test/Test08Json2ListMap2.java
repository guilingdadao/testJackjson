package com.yeg.json.test;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yeg.json.model.User;

public class Test08Json2ListMap2 {

	public static void main(String[] args) {

		String json = "[{\"address\": \"address2\",\"name\":\"haha2\",\"id\":2,\"email\":\"email2\"},"
				+ "{\"address\":\"address\",\"name\":\"haha\",\"id\":1,\"email\":\"email\"}]";

		ObjectMapper mapper = new ObjectMapper();
		List<User> list = null;
		try {
			list = mapper.readValue(json, new TypeReference<List<User>>() {
			});

			for (User u : list) {
				System.out.println(u);
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
