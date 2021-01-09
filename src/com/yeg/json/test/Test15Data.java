package com.yeg.json.test;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test15Data {

	public static void main(String[] args) {

		try {
			String carJson = "{ \"brand\" : \"Mercedes\", \"doors\" : 5 }";

			ObjectMapper objectMapper = new ObjectMapper();
			JsonFactory jsonFactory = objectMapper.getFactory();
			JsonParser parser = jsonFactory.createParser(carJson);

			while (!parser.isClosed()) {
				JsonToken jsonToken = parser.nextToken();
				
				System.out.println("jsonToken:"+jsonToken);

				String fieldName = parser.getCurrentName();

				if ("brand".equals(fieldName)) {

					System.out.println(parser.getValueAsString());

				} else if ("doors".equals(fieldName)) {
					System.out.println(parser.getValueAsInt());

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
	}
}
