package com.kh.junit.practice;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArrayPracticeTest {

	private ArrayPractice ap = new ArrayPractice();
	
	@Before
	public void testBefor() {
		System.out.println("�׽�Ʈ ����!");
	}
	
	@After
	public void tearDown() {
		System.out.println("�׽�Ʈ ����!");
	}
	
	@Test
	public void arrayTestChap1() {
		int[] expected = {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10};

		assertEquals(expected, ap.getArray());
	}
	
	@Test
	public void arrayTestChap2() {
		String[] expected = {"���", "��", "����", "������", "����"};
		
		assertArrayEquals(expected, ap.getArray2());
	}
	
	@Test
	public void StringTestChap1() {
		String str = "��";
		assertEquals (str , ap.getArray3());
		
	}
	
	@Test
	public void getIntTestChap1() {
		int i = 55;
		assertEquals (i , ap.getIntTest());
	}
}
