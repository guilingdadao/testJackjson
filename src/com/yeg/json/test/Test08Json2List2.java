package com.yeg.json.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.yeg.json.model.User;

public class Test08Json2List2 {

	public static void main(String[] args) {

		String json = "[{\"address\": \"上海市外滩东方明珠\",\"name\":\"原始天\",\"id\":2,\"email\":\"guitian@qq.com\"},"
				+ "{\"address\":\"北京市天安门层楼前\",\"name\":\"归元\",\"id\":1,\"email\":\"guiyuan@bjrcb.com\"}]";

		ObjectMapper objectMapper = new ObjectMapper();
		List<User> list = null;
		try {
			// 2.获得一个类型工厂，然后调用constructCollectionType方法，此时需要传入两个参数，第一个是List集合对象，另一个是实际的Java对象
			CollectionType listType = objectMapper.getTypeFactory()
					.constructCollectionType(ArrayList.class, User.class);

			// 3.调用readValue方法，将要转换的JSON对象和CollectionType作为参数输入进去。
			list = objectMapper.readValue(json, listType);

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
