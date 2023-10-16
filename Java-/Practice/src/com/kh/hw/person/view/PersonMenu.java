package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {

	// ���� �޴��� ����ϴ� �޼ҵ�
	// �л� �޴��� ����ϴ� �޼ҵ�
	// ��� �޴��� ����ϴ� �޼ҵ�
	// ����ڿ��� ��ü�迭�� ������ �л� �����͸� �޴� �޼ҵ�
	// ��ü�迭�� ����� �л� �����͸� ����ϴ� �޼ҵ�
	// ����ڿ��� ��ü�迭�� ������ ��������͸� �޴� �޼ҵ�
	// ��ü �迭�� ����� ��������͸� ����ϴ� �޼ҵ�
	Scanner sc = new Scanner(System.in);
	Scanner intsc = new Scanner(System.in);
	PersonController pc = new PersonController();
	
	boolean isTrue = true;
	
	public void mainMenu() {
		
		while(isTrue) {
			
			System.out.println("�л��� �ִ� 3����� ������ �� �ֽ��ϴ�");
			System.out.println("���� ����� �л��� " + pc.studentCount() + " �� �Դϴ�");
			System.out.println("����� �ִ� 10����� ������ �� �ֽ��ϴ�");
			System.out.println("���� ����� ����� " + pc.employeeCount() + " �� �Դϴ�");
		

			System.out.println("");
			System.out.println("1. �л� �޴�");
			System.out.println("2. ��� �޴�");
			System.out.println("9. ������");
			int numChoice = intsc.nextInt();
			
			// 1�� Ŭ���� 
			if (numChoice == 1) {
				// �л� �޴� ����
				studentMenu();
			// 2�� Ŭ����
			} else if (numChoice == 2) {
				// ��� �޴� ����
				employeeMenu();
			// 9�� Ŭ����
			} else if (numChoice == 9) {
				// ����
				System.out.println("�����մϴ�");
				isTrue = false;
			// 1.2.9�� �ٸ� ���� �Է½� �߸��Է� ���� ���
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
			}
		}
	}
	
	// �л� �޴�
	public void studentMenu() {
		
		boolean stChoice = true;
		
		while(stChoice) {
			int stCount = pc.studentCount();
			System.out.println("");
			System.out.println("1. �л� �߰�");
			System.out.println("2. �л� ����");
			System.out.println("9. ��������");
			
			// �л��߰��� �л����� �迭�� ���̸� üũ���� 3�� �ʰ��� ��Ȱ��ȭ ���� ���
			if (stCount >= 3) {
				System.out.println("�л��� ���� �� �ִ� ������ �� á�� ������ �л� �߰� �޴��� �� �̻� Ȱ��ȭ ���� �ʽ��ϴ�.");
			}
			int studentChoice = intsc.nextInt();
			
			// 1�� Ŭ���� 
			if (studentChoice == 1) {
				// �л����� �迭�� ���̰� 3�� �ʰ��� �߸��Է��ߴٴ� ���� ���
				if (stCount >= 3) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				// 3�� ���Ͻ� �л������� �߰��Ѵ�.
				} else {
					insertStudent();
				}
			
			// 2��Ŭ���� 
			} else if (studentChoice == 2) {
				 
				if (stCount <= 0) {
					System.out.println("��ϵ� �л��� �����ϴ�. �л��� �߰����ּ���");
				} else {
					printStudent();
				}
			// 9��Ŭ����
			} else if (studentChoice == 9) {
				// �������� ���ư���.
				System.out.println("�������� ���ư��ϴ�");
				stChoice = false;
			// 1.2.9 �� �ٸ� ���ڸ� �Է½� ���Է� ��û ���
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
			}
		}
	}
	
	// ����޴�
	public void employeeMenu() {
		
		boolean empChoice = true;
		
		while (empChoice) {
			int empCount = pc.employeeCount();
			
			System.out.println("");
			System.out.println("1. ��� �߰�");
			System.out.println("2. ��� ����");
			System.out.println("9. ��������");
			
			// ��� �߰��� ������� �迭�� ���̸� üũ���� 10�� �ʰ��� ��Ȱ��ȭ ���� ���
			if (empCount >= 10) {
				System.out.println("����� ���� �� �ִ� ������ �� á�� ������ �л� �߰� �޴��� �� �̻� Ȱ��ȭ ���� �ʽ��ϴ�.");
			}
			int employeeChoice = intsc.nextInt();
			
			// 1�� Ŭ���� 
			if (employeeChoice == 1) {
				// �л����� �迭�� ���̰� 3�� �ʰ��� �߸��Է��ߴٴ� ���� ���
				if (empCount >= 3) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				// 10�� ���Ͻ� ��������� �߰��Ѵ�.
				} else {
					insertEmployee();
				}
			
			// 2��Ŭ���� 
			} else if (employeeChoice == 2) {
				if (empCount <= 0) {
					System.out.println("��ϵ� ����� �����ϴ�. �л��� �߰����ּ���");
				} else {
					printEmployee();
				}
			// 9��Ŭ����
			} else if (employeeChoice == 9) {
				// �������� ���ư���.
				System.out.println("�������� ���ư��ϴ�");
				empChoice = false;
			// 1.2.9 �� �ٸ� ���ڸ� �Է½� ���Է� ��û ���
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
			}
		}
	}

	// �л� �߰� 
	public void insertStudent() {
		
		System.out.println();
		// �л��߰� ���� ����
		// �ִ� 3����� �߰� �����ϹǷ� 4�� ���ĺ��ʹ� false �� �����Ѵ�.
		boolean stinsert = true;
		
		while(stinsert) {
			System.out.print("�л� �̸� : ");
			String stName = sc.nextLine();
			System.out.print("�л� ���� : ");
			int stage = intsc.nextInt();
			System.out.print("�л� Ű : ");
			double height = intsc.nextDouble();
			System.out.print("�л� ������ : ");
			double weight = intsc.nextDouble();
			System.out.print("�л� �г� : ");
			int grade = intsc.nextInt();
			System.out.print("�л� ���� : ");
			String major = sc.nextLine();
			
			pc.insertStudent(stName, stage, height, weight, grade, major);
			
			if (pc.studentCount() >= 3) {
				System.out.print("�л��� ���� �� �ִ� ������ �� á�� ������ �л� �߰��� �����ϰ� �л��޴��� ���ư��ϴ�.");
				stinsert = false;
			} else {
				System.out.print("�׸��Ͻ÷��� N(�Ǵ� n), �̾��Ͻ÷��� �ƹ�Ű�� ��������");
				System.out.println("");
				String restartMenu = sc.nextLine();
				
				if (restartMenu.equals("n")|| restartMenu.equals("N")) {
					stinsert = false;
					break;
				} else {
					stinsert = true;
				}
			}
		}
	}
	
	public void insertEmployee() {

		System.out.println();
		// ����߰� ���� ����
		// �ִ� 10����� �߰� �����ϹǷ� 11�� ���ĺ��ʹ� false �� �����Ѵ�.
		boolean empinsert = true;
		
		while(empinsert) {
			System.out.print("��� �̸� : ");
			String empName = sc.nextLine();
			System.out.print("��� ���� : ");
			int stage = intsc.nextInt();
			System.out.print("��� Ű : ");
			double height = intsc.nextDouble();
			System.out.print("��� ������ : ");
			double weight = intsc.nextDouble();
			System.out.print("��� �޿� : ");
			int salary = intsc.nextInt();
			System.out.print("��� �μ� : ");
			String dept = sc.nextLine();
			
			pc.insertEmployee(empName, stage, height, weight, salary, dept);
			
			if (pc.employeeCount() >= 3) {
				System.out.print("����� ���� �� �ִ� ������ �� á�� ������ �л� �߰��� �����ϰ� �л��޴��� ���ư��ϴ�.");
				empinsert = false;
			} else {
				System.out.print("�׸��Ͻ÷��� N(�Ǵ� n), �̾��Ͻ÷��� �ƹ�Ű�� ��������");
				System.out.println("");
				String restartMenu = sc.nextLine();
				
				if (restartMenu.equals("n")|| restartMenu.equals("N")) {
					empinsert = false;
					break;
				} else {
					empinsert = true;
				}
			}
		}
	}
	
	public void printStudent() {
		 
		pc.printStudent();
		
	}
	
	public void printEmployee() {
		 
		pc.printEmployee();
		
	}
}
