package com.yeg.json.demo.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Json2Map {
	public static void main(String[] args) {

		try {
			// converting json to Map
			byte[] mapData = Files.readAllBytes(Paths.get(
					Constant.JSON_TEST_DIR, "data.txt"));

			Map<String, String> myMap = new HashMap<String, String>();

			ObjectMapper objectMapper = new ObjectMapper();

			myMap = objectMapper.readValue(mapData, HashMap.class);
			System.out.println("Map is: " + myMap);

			// 使用类型引用TypeReference
			// another way
			myMap = objectMapper.readValue(mapData,
					new TypeReference<HashMap<String, String>>() {
					});
			System.out.println("Map using TypeReference: " + myMap);

		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
