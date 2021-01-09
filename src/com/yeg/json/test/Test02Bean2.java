package com.yeg.json.test;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.yeg.json.model.AccountBean;

public class Test02Bean2 {

	/****
	 * FilterProvider 没有看明白这个是做什么呢?
	 * @param args
	 */
	public static void main(String[] args) {

		AccountBean ab = TestUtils.createAccountBean();

		ObjectMapper objectMapper = new ObjectMapper();
		// 过滤器的名称
		String filterName = "birthday";
		// 要过滤的字段名称
		Set<String> properties = new HashSet();
		properties.add("birthday");

		// 过滤器
		FilterProvider filters = new SimpleFilterProvider().addFilter(
				filterName, SimpleBeanPropertyFilter
						.serializeAllExcept(properties));

		try {

			String json = objectMapper.writer(filters).writeValueAsString(ab);
//			objectMapper.acceptJsonFormatVisitor(type, visitor)

			System.out.println(json);

			System.out.println();

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
