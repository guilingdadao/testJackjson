package com.yeg.json.test;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yeg.json.model.Cif;

public class Test13Annotation {

	public static void main(String[] args) {
		try {
			// 使用客户
			Cif cif = TestUtils.createCif();
			// cif.setEmail(null);

			ObjectMapper objectMapper = new ObjectMapper();

			String json = objectMapper.writeValueAsString(cif);

			System.out.println(json);

		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
