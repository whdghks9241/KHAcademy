package com.kh.ArrayExam;

import java.util.Scanner;

public class ArrayEaxm {
//
//	public void practice1() {
//		int value = 16;
//		int[][] arr = new int[4][4];
//		
//		for (int i = 0; i <arr.length; i++) {
//			for (int j = 0; j <arr[i].length; j++) {
//				arr[i][j] = value++;
//				System.out.println(arr[i][j]);
//			}
//		}
//	}
//	
//	public void practice2() {
//		int value = 16;
//		int[][] arr = new int[4][4];
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j <arr[i].length; j++) {
//				arr[i][j]= value++;
//			}
//		}
//	
//		for(int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				// printf ("��¼��� ", ����� ����);
//				// ��� �� �ٹٲ� ���� ����
////				�ٹٲ��� �Ϸ��� �����ڰ� %n�� �ä��´�
//				
//				System.out.printf("%2d ", arr[i][j]);
//			}
//			System.out.println();
//		}
//	}
//	
//	public void practice3() {
//		int row = 0;
//		int col = 0;
//		
//		char value = 'a';
//		char[][] arr = null;
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("���� ũ��");
//		
//		row = sc.nextInt();
//		arr = new char[row][];
//		
//		for(int i = 0; i <arr.length; i++) {
//			System.out.println(i + "���� ũ��");;
//			col = sc.nextInt();
//
//			arr[i] = new char[col];
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j= 0; j <arr[i].length; j++) {
//				arr[i][j] = value++;
//			}
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j <arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println("");
//		}
//		
//	}

	public void practice4() {
		String[] students = {"���ǰ�","������","�����","�����","���̹�", "�ں���", "�ۼ���","������", "������", "��õ��", "��ǳǥ", "ȫ����"};
	    String[][] set1 = new String[3][2];
	    String[][] set2 = new String[3][2];
	    
	    int count = 0;
	  	
	    for (int i = 0; i < set1.length; i++) {
	    	for (int j = 0; j < set1.length; j++) {

//		    	set1[i][j] =  students[count++];
		    		
	    	}
	    }
	    
	    for (int i = 0; i < set2.length; i++) {
	    	for (int j = 0; j < set2[i].length; j++) {

		    	set1[i][j] =  students[count++];
		    		
	    	}
	    }
	    
	    System.out.println("== 1�д� == ");
	    for (int i = 0; i <set1.length; i++) {
	    	for (int j = 0; j < set2[i].length; j++) {

		    	set1[i][j] =  students[count++];
		    		
	    	}
	    	System.out.println();
	    }
	    
	    System.out.println("== 2�д� == ");
	    for (int i = 0; i <set1.length; i++) {
	    	for (int j = 0; j < set2[i].length; j++) {

		    	set1[i][j] =  students[count++];
		    		
	    	}
	    	System.out.println();
	    }
	}
	    
}
