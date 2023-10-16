package com.kh.api.eaxm1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calendar Ŭ������ ����� ���� ��¥�� �ð� ��������
		Calendar calendar = Calendar.getInstance();

		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);

		System.out.println("calendar Ŭ������ ����� ���� ��¥�� �ð�");
		System.out.println(year +"��");
		System.out.println(month + "��");
		System.out.println(day + "��");
		System.out.println(hour + "��");
		System.out.println(minute + "��");
		System.out.println(second + "��");
		
		// GregorianCalendar Ŭ������ Ȱ���� ���� ��¥�� �ð� ��������
		GregorianCalendar gCalendar = new GregorianCalendar();
		
		year = gCalendar.get(Calendar.YEAR);
		month = gCalendar.get(Calendar.MONTH) + 1;
		day = gCalendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "�� " + month + "�� " + day);
	}

}
