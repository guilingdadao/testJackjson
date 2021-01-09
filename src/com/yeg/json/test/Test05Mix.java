package com.yeg.json.test;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yeg.json.model.AccountBean;

public class Test05Mix {

	public static void main(String[] args) {

		try {

			ObjectMapper objectMapper = new ObjectMapper();

			JsonGenerator jg = objectMapper.getJsonFactory()
					.createJsonGenerator(System.out, JsonEncoding.UTF8);

			String[] arr = { "a", "b", "c" };
			System.out.println("jsonGenerator");
			String str = "hello world jackson!";
			// byte
			jg.writeBinary(str.getBytes());
			// boolean
			jg.writeBoolean(true);
			// null
			jg.writeNull();
			// float
			jg.writeNumber(2.2f);
			// char
			jg.writeRaw("c");
			// String
			jg.writeRaw(str, 5, 10);
			// String
			jg.writeRawValue(str, 5, 5);
			// String
			jg.writeString(str);
			// jg.writeTree(JsonNodeFactory.instance.POJONode(str));
			System.out.println();

			// Object
			jg.writeStartObject();// {
			jg.writeObjectFieldStart("user");// user:{
			jg.writeStringField("name", "jackson");// name:jackson
			jg.writeBooleanField("sex", true);// sex:true
			jg.writeNumberField("age", 22);// age:22
			jg.writeEndObject();// }

			jg.writeArrayFieldStart("infos");// infos:[
			jg.writeNumber(22);// 22
			jg.writeString("this is array");// this is array
			jg.writeEndArray();// ]

			jg.writeEndObject();// }

			AccountBean bean = new AccountBean();
			bean.setAddress("address");
			bean.setEmail("email");
			bean.setId(1);
			bean.setName("haha");
			
			// complex Object
			jg.writeStartObject();// {
			jg.writeObjectField("user", bean);// user:{bean}
			jg.writeObjectField("infos", arr);// infos:[array]
			jg.writeEndObject();// }
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
