package com.yeg.json.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test14Data {

	public static void main(String[] args) {

		String fileName = "E:/projects/testMybatis/data/word.json";
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(
					fileName)));

			ObjectMapper objectMapper = new ObjectMapper();
			JsonFactory jsonFactory = objectMapper.getFactory();
			JsonParser parser = jsonFactory.createParser(br);

			int num = 0;

			while (!parser.isClosed()) {
				JsonToken token  = parser.nextToken();
				String currentName =  parser.getCurrentName();
				System.out.println("currentName: "+currentName +" jsonToken = " + token);
				
				if( JsonToken.START_ARRAY ==  token){
					
				}else if(  JsonToken.END_ARRAY == token){
					
				}else if(JsonToken.START_OBJECT == token){
					
				}else if(JsonToken.END_OBJECT == token){
					
				}else if(JsonToken.FIELD_NAME == token){
					
				}else if(JsonToken.VALUE_STRING == token){
					
				}
					
				
				
				num++;
				if (num > 100) {
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != br) {
				try {
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
