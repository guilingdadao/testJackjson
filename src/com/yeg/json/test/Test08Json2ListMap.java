package com.yeg.json.test;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Test08Json2ListMap {

	public static void main(String[] args) {

		String json = "[{\"address\": \"address2\",\"name\":\"haha2\",\"id\":2,\"email\":\"email2\"},"
				+ "{\"address\":\"address\",\"name\":\"haha\",\"id\":1,\"email\":\"email\"}]";
		try {
			ObjectMapper objectMapper = new ObjectMapper();

			// 字符串转化成Map
			List<LinkedHashMap<String, Object>> list = objectMapper.readValue(
					json, List.class);
			for (int i = 0; i < list.size(); i++) {
				Map<String, Object> map = list.get(i);
				
				Set<String> set = map.keySet();
				
				for (Iterator<String> it = set.iterator(); it.hasNext();) {
					
					String key = it.next();
					System.out.println(key + ":" + map.get(key));
				}
				
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
