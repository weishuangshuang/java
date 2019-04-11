package com.thzm.eye025.bean;

import java.sql.Date;

public class Subscribe {
	
	private String name;
	private String connect;
	private String email;
	private String gender;
	private String age;
	private String item;
	private String date;
	private String  description;
	private String  project;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getConnect() {
		return connect;
	}
	public void setConnect(String connect) {
		this.connect = connect;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	
	public Subscribe(String name, String connect, String email, String gender, String age, String item, String date,
			String description,String project) {
		super();
		this.name = name;
		this.connect = connect;
		this.email = email;
		this.gender = gender;
		this.age = age;
		this.item = item;
		this.date = date;
		this.description = description;
		this.project = project;
	}
	public Subscribe() {
		super();
	}
	@Override
	public String toString() {
		return "Subscribe [name=" + name + ", connect=" + connect + ", email=" + email + ", gender=" + gender + ", age="
				+ age + ", item=" + item + ", date=" + date + ", description=" + description + ", project=" + project+ "]";
	}
	
	
	

}
