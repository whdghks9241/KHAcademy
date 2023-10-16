package com.kh.practice;

import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student> {
	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Student otherStudent) {
	//���̸� �������� ��
		return this.age - otherStudent.age;
	}
	
	@Override
	public String toString() {
		return "Student name=" + name+", age= " + age ;
	}
	public static void mian(String[] args) {
		List<Student> s = new ArrayList<>();
		s.add(new Student("�л�1", 78));
		s.add(new Student("�л�2", 79));
		s.add(new Student("�л�3", 71));
	}
}
