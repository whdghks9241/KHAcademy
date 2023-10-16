package com.exam.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("KH", 30);
		
		try {
			FileOutputStream fileOut = new FileOutputStream("person.txt");
			ObjectOutputStream out  = new ObjectOutputStream(fileOut);
			out.writeObject(p);
			out.close();
			fileOut.close();
			System.out.println("Person ��ü�� ����ȭ�Ǿ� person.txt ���Ͽ� �����");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// ���Ͽ��� ��ü�� ������ȭ�Ͽ� �о��
		try {
			FileInputStream fileIn = new FileInputStream("person.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			Person deSerialPerson = (Person) in.readObject();
			
			in.close();
			fileIn.close();
			System.out.println("person.txt. ���Ͽ��� ��ü�� ������ȭ�Ͽ����ϴ�.");
			System.out.println("������ȭ�� ��ü ���� : " + deSerialPerson);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
