package com.kh.example.practice3.model.vo;


public class Circle {

	// �ɹ� ����
	// private static final double PI = 3.14;
	private double PI = 3.14; // ����
	
	private int radius = 1; // ���
	
	public double getPI() {
		return PI;
	}

	public int getRadius() {
		return radius;
	}
	
	public void setPI(double pI) {
		PI = pI;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void incrementRadius() {
		
		System.out.println(radius++);
	}
	
	public void getAreaOfCircle() {
		double aree = PI * radius * radius;
		System.out.println("���� ���� : " + aree);
	}

	public void getSizeOfCircle() {
		System.out.println("���� ũ�� (������) : " + radius);
	}

}

