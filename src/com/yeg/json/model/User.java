package com.yeg.json.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class User {

	private int id;

	private String name;
	private String email;
	private String address;
	
	//转换最终的JSON字符串中，不会有depository键值对。
	@JsonIgnore
	private double depository;
	
	
//	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
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
		return this.name + "#" + this.id + "#" + this.address + "#"
				+ this.birthday + "#" + this.email + "#" + this.depository;
	}
}