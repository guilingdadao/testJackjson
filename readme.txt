有关jackjson使用说明
	1 需要引入三个包
		jackson-annotations-2.9.8.jar
		jackson-core-2.9.8.jar
		jackson-databind-2.9.8.jar
	
	2  如果实现json和XML互转,还是导入stax2-api.jar
		Jackson也可以完成java对象到xml的转换，转换后的结果要比json-lib更直观，不过它依赖于stax2-api.jar这个jar包。
	
		
	3 
	
	Jackson提供了三种可选的JSON处理方法
1、流式API 
    com.fasterxml.jackson.core.JsonParser读
    com.fasterxml.jackson.core.JsonGenerator写
2、树模型：提供一个 JSON 文档可变内存树的表示形式 
    com.fasterxml.jackson.databind.ObjectMapper生成树 ；树组成 JsonNode 节点集
    树模型类似于 XML DOM
3、数据绑定：JSON和POJO相互转换，基于属性访问器规约或注解
    有两种变体：简单和完整的数据绑定
        简单数据绑定：是指从Java Map、List、String、Numbers、Boolean和空值进行转换
        完整数据绑定：是指从任何Java bean 类型(及上文所述的"简单"类型)进行转换
        com.fasterxml.jackson.databind.ObjectMapper对两个变种进行编排(marshalling)处理(写入JSON）和反编排(unmarshalling读JSON)


Streaming API：最佳性能。
从使用的角度来看，总结这些3 种方法的用法如下    
    流 API： 性能最佳的方式 （最低开销、 速度最快的读/写； 其它二者基于它实现）。
    数据绑定 ：使用最方便的方式。
    树模型： 最灵活的方式。
对于性能要求高的程序,推荐使用流API,否则使用其他方法
不管是创建JsonGenerator还是JsonParser,都是使用JsonFactory。






@JsonInclude(Include.NON_EMPTY)：仅在属性不为空时序列化此字段，对于字符串，即null或空字符串。
@JsonIgnore：序列化时忽略此字段。
@JsonProperty(value = "user_name")：指定序列化时的字段名，默认使用属性名。
@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")：指定Date类字段序列化时的格式。
@JsonUnwrapped(prefix = "user_")：
	private User user，把成员对象中的属性提升到其容器类，并添加给定的前缀。"user_name": "xxx", "user_age": 22, ...

@JsonIgnoreType：类注解，序列化时忽略此类。

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id") ：
	作用于类或属性上，被用来在序列化/反序列化时为该对象或字段添加一个对象识别码，通常是用来解决循环嵌套的问题。
	
	

 

	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	




























