package com.yeg.json.test;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yeg.json.model.Cif3;

public class Test13Annotation3 {

	public static void main(String[] args) {
		try {
			// 使用客户
			Cif3 cif3 = TestUtils.createCif3();

			ObjectMapper objectMapper = new ObjectMapper();

			String json = objectMapper.writeValueAsString(cif3);

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
