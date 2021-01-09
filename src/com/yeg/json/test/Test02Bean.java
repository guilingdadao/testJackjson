package com.yeg.json.test;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yeg.json.model.AccountBean;

public class Test02Bean {

	// JavaBean(Entity/Model)转换成JSON

	public static void main(String[] args) {

		AccountBean ab = TestUtils.createAccountBean();

		ObjectMapper objectMapper = new ObjectMapper();

		try {
			JsonGenerator jsonGenerator = null;
//			 jsonGenerator = objectMapper.getJsonFactory().createJsonGenerator(System.out, JsonEncoding.UTF8);
			jsonGenerator = objectMapper.getFactory().createJsonGenerator(System.out, JsonEncoding.UTF8);
			
			jsonGenerator.writeObject(ab);    
			
			try {
	            if (jsonGenerator != null) {
	                jsonGenerator.flush();
	            }
	            if (!jsonGenerator.isClosed()) {
	                jsonGenerator.close();
	            }
	            jsonGenerator = null;
	            objectMapper = null;
	            System.gc();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
