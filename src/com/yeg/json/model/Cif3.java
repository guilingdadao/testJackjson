package com.yeg.json.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

@JsonIgnoreProperties( { "id", "name", "email", "address" })
public class Cif3 {

	private int id;

	private String name;

	private String email;

	private String address;

	private double depository;

	// 需要配置时区,否则时间不对
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date birthday;

	@JsonUnwrapped(prefix = "star_")
	private CifStar cifStar;

	public CifStar getCifStar() {
		return cifStar;
	}

	public void setCifStar(CifStar cifStar) {
		this.cifStar = cifStar;
	}

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
				+ this.birthday + "#" + this.email + "#" + this.depository
				+ "*******cifStar:" + this.cifStar;
	}
}