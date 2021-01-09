package com.yeg.json.test;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yeg.json.model.Cif2;

public class Test13Annotation2 {

	public static void main(String[] args) {
		try {
			// 使用客户
			Cif2 cif2 = TestUtils.createCif2();
			// cif.setEmail(null);

			ObjectMapper objectMapper = new ObjectMapper();

			// 以下三个属性name , address,depository不在json字符串中显示
			String json = objectMapper.writeValueAsString(cif2);

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
