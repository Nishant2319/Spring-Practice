package com.AnnotationComponentBean3;




public class Person {
	
	
	String name;
	
	
	int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age) {
		super();
		System.out.println("person created");
		this.name = name;
		this.age = age;
	}
	
	
	
}
