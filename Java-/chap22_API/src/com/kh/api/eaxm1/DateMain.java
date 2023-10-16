package com.kh.api.eaxm1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
/**
 Date : ��¥�� �ð� ������ ��Ÿ���µ� ���
 	java1.1 ���� ������� ����
 		java.time ��Ű�� LocalDate LocalTime LocalDateTime
 */
	public static void main(String[] args) {
		//import java.time.LocalDate;
		LocalDate currentDate = LocalDate.now();
		System.out.println("���� ��¥ : " + currentDate);
		LocalTime currentTime = LocalTime.now();
		System.out.println("���� �ð� : " + currentTime);
		LocalDateTime currentLDt = LocalDateTime.now();
		System.out.println("���� ��¥ �ð� : " + currentLDt);
		
		//��¥ ���
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(7);
		System.out.println("7�� �� ��¥ : " + futureDate);
		//minus plus �̿��ؼ� �� 2���� ������ �� 4��
		futureDate = today.minusMonths(8);
		System.out.println(" ��¥ : " + futureDate);
		futureDate = today.minusWeeks(1);
		System.out.println(" ��¥ : " + futureDate);
		
		LocalTime nowTime = LocalTime.now();
		LocalTime laterTime = nowTime.plusHours(3);
		System.out.println("3�ð� �� �ð� : " + laterTime);
		
		// Ư�� ��¥�� �ð� �����ϱ�
		LocalDate date1 = LocalDate.of(2023, 9, 13);
		 LocalDate date2 = LocalDate.of(2023, 9, 20);
		/*
		 * LocalDate date2 = LocalDate.of(2023, 9, 13);
			date1.isBefore(date2)
			date1.isAfter(date2)
		 */
		if(date1.isBefore(date2)) {
			System.out.println(date1 + " �� " + date2 + "�����Դϴ�.");
		}else if (date1.isAfter(date2)) {
			System.out.println(date1 + " �� " + date2 + "�����Դϴ�.");
		} else {
			System.out.println(date1 + " �� " + date2 + "�� ���� ��¥ �Դϴ�.");
		}

	}
}
