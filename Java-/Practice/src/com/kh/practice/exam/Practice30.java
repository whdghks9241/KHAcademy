package com.kh.practice.exam;

public class Practice30 {
	
	private int grade, classroom;
	
	private String name;
	
	private double height;
	
	private char gender;

	public int getGrade() {
		return grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public String getName() {
		return name;
	}
	
	public double getHeight() {
		return height;
	}

	public char getGender() {
		return gender;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void information() {

		System.out.println(grade + "�г�");
		System.out.println(classroom +"��");
		System.out.println("�̸� : " + name);
		System.out.println(" Ű : " + height);
		System.out.println("���� : " + gender);
	}

}
