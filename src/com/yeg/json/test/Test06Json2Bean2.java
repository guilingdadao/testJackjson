package com.yeg.json.test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yeg.json.model.AccountBean;

public class Test06Json2Bean2 {

	public static void main(String[] args) {

		try {

			String jsonStr = "{\"id\":1,\"name\":\"青山一点红\",\"email\":\"yuaneg@qq.com\",\"address\":\"北京市昌平区\",\"birthday\":{\"birthday\":\"1982-09-09\"}}";
			ObjectMapper objectMapper = new ObjectMapper();

			//jackjson自定义的类型
			TypeReference<AccountBean> typeReference = new TypeReference<AccountBean>() {
			};
			// 字符串转化成javaBean
			AccountBean ab = objectMapper.readValue(jsonStr, typeReference);

			System.out.println(ab);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
