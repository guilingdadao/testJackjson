package com.yeg.json.demo.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * 有时我们拥有json数据，而我们只对几个键值感兴趣，因此在这种情况下，将整个JSON转换为对象不是一个好主意。 <br/>
 * Jackson JSON API提供了像DOM Parser这样的树形式读取JSON数据的选项，我们可以通过此方法读取JSON对象的特定元素。 <br/>
 * 以下代码提供了从json文件读取特定条目的代码段。 <br/>
 */

public class JsonTreeDemo {
	public static void main(String[] args) {
		readJson();

		updateAndAddJson();
	}

	public static void readJson() {
		try {
			// read json file data to String
			byte[] jsonData = Files.readAllBytes(Paths.get(
					Constant.JSON_TEST_DIR, "employee.txt"));

			// create ObjectMapper instance
			ObjectMapper objectMapper = new ObjectMapper();

			// read JSON like DOM Parser
			JsonNode rootNode = objectMapper.readTree(jsonData);

			// 查找ID,转换成整型
			JsonNode idNode = rootNode.path("id");
			System.out.println("id = " + idNode.asInt());

			// 读取手机号
			JsonNode phoneNosNode = rootNode.path("phoneNumbers");
			Iterator<JsonNode> elements = phoneNosNode.elements();

			while (elements.hasNext()) {

				JsonNode phone = elements.next();

				System.out.println("Phone No = " + phone.asLong());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void updateAndAddJson() {
		// Jackson JSON Java
		// API提供了有用的方法来添加，编辑和删除JSON数据中的密钥，然后我们可以将其另存为新的json文件或将其写入任何流。
		// 下面的代码向我们展示了如何轻松地做到这一点。
		try {
			byte[] jsonData = Files.readAllBytes(Paths.get(
					Constant.JSON_TEST_DIR, "employee.txt"));

			ObjectMapper objectMapper = new ObjectMapper();

			// create JsonNode
			JsonNode rootNode = objectMapper.readTree(jsonData);

			// update JSON data
			((ObjectNode) rootNode).put("id", 500);

			// add new key value
			((ObjectNode) rootNode).put("test", "test value");

			// remove existing key
			((ObjectNode) rootNode).remove("role");
			((ObjectNode) rootNode).remove("properties");

			// 配置输出格式
			objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

			objectMapper.writeValue(new File("updated_emp.txt"), rootNode);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
