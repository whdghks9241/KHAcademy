package com.kh.hw.person.model.vo;

public class Person {

	private String name;
	
	private int age;
	
	private double height;
	
	private double weight;
	
	public Person() {
		
	}
	
	public Person(String name, int age, double height, double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}	

