package com.tony.sandbox.rest.gs.commons;

public class User {

	private String name;
	private int age;

	public User(final String name, final int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(final String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(final int age) {
		this.age = age;
	}
}
