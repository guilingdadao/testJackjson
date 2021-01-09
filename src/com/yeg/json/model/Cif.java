package com.yeg.json.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

//忽略字段 name, address
@JsonIgnoreProperties( { "name", "address" })
// 忽略 null字段
@JsonInclude(Include.NON_NULL)
public class Cif {

	@JsonProperty("cif_id")
	private int id;

	@JsonProperty("cif_name")
	private String name;
	
	@JsonProperty(value = "cif_email")//：指定序列化时的字段名，默认使用属性名。
	private String email;

	private String address;
	// 转换最终的JSON字符串中，不会有depository键值对。
	@JsonIgnore
	private double depository;

	// 需要配置时区,否则时间不对
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date birthday;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getDepository() {
		return depository;
	}

	public void setDepository(double depository) {
		this.depository = depository;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return this.id + "#" + this.name + "#" + this.address + "#"
				+ this.birthday + "#" + this.email + "#" + this.depository;
	}
}