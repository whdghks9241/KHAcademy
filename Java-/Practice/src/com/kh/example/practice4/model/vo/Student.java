package com.kh.example.practice4.model.vo;

public class Student {

	int grade, classroom;
	
	String name;
	
	char gender;
	
	double height;
	
	public Student(int grade, int classroom, String name, double height, char gender) {
		
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.height = height;
		this.gender = gender;
	}
	
	public void information() {
		System.out.println("grade : " + grade);
		System.out.println("classroom : " + classroom);
		System.out.println("name : " + name);
		System.out.println("height : " + height);
		System.out.println("gender : " + gender);
	}
}
