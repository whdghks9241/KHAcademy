package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class StudentRun {
	
	public static void main(String[] args) {
		
		Student student = new Student(5, 3, "����ȯ", 177.0, '��');
	
		student.information();		
	}
}
