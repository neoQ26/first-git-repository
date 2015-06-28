package com.neo.domain;

import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;

public class User {

	private String id;
	private int age;
	private Date birthDay;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	
}
