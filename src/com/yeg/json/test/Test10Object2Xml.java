//package com.yeg.json.test;
//
//import java.io.IOException;
//import java.io.StringWriter;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import com.fasterxml.jackson.core.JsonGenerationException;
//import com.fasterxml.jackson.databind.JsonMappingException;
//import com.yeg.json.model.AccountBean;
//
//public class Test10Object2Xml {
//
//	public static void main(String[] args) {
//		// stax2-api-3.0.2.jar
//		System.out.println("XmlMapper");
//		XmlMapper xml = new XmlMapper();
//
//		try {
//			// javaBean转换成xml
//			// xml.writeValue(System.out, bean);
//			StringWriter sw = new StringWriter();
//			xml.writeValue(sw, bean);
//			System.out.println(sw.toString());
//			// List转换成xml
//			List<AccountBean> list = new ArrayList<AccountBean>();
//			list.add(bean);
//			list.add(bean);
//			System.out.println(xml.writeValueAsString(list));
//
//			// Map转换xml文档
//			Map<String, AccountBean> map = new HashMap<String, AccountBean>();
//			map.put("A", bean);
//			map.put("B", bean);
//			System.out.println(xml.writeValueAsString(map));
//		} catch (JsonGenerationException e) {
//			e.printStackTrace();
//		} catch (JsonMappingException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//}
