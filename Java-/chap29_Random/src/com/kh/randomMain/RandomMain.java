package com.kh.randomMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/*
 Random : ������ �����ϱ� ���� ���Ǵ� Ŭ����
 	���� : �������� ������� ��
 * */
public class RandomMain {

	public static void main(String[] args) {
		// �ζ� ��ȣ ������
		RandomMain rm = new RandomMain();
		//rm.AA();
		rm.Lotto();
		//rm.RandomExam();
	}
	public void AA() {
		Random rd = new Random();
		int ranNumber = rd.nextInt(45);
		System.out.println(ranNumber);
		int addnum = ranNumber + 1;
		System.out.println(addnum);
	}
	public void Lotto() {
		
		// ���� ��ü ����
		Random rd = new Random();
		
		List<Integer> lottoNum = new ArrayList<>();//�ߺ��� ���ϱ� ���� set�� ����� �� ����

		int six = 6; //�ζ� ��ȣ �� �� ���� �� ���� ����
		while(lottoNum.size() < six) { //0,1,2,3,4,5
			int ranNumber = rd.nextInt(45)+1; //0~44 �ڸ��� �������� ��ȣ �Ƴ�
			System.out.println(ranNumber);
			
			//lottoNum.add(ranNumber);
			// �ߺ��� ���� list�� ����� �� ����
			if(!lottoNum.contains(ranNumber)) {
			//!�� ������� ���� ������ ���� list�� ����Ǵ� ���̱� ������ ���ѷ���
				lottoNum.add(ranNumber);
			}
				
		}
		System.out.println(lottoNum);
		System.out.println("============");
		
	}
	
	
	public void RandomExam() {
		Random rd = new Random();// ���� ��ü ����
		
		//1. ���� ���� ������ ������ ������ ������ �ڴ�.
		int ranInt = rd.nextInt(100); //0~99 ���̿��� 1��
		System.out.println(ranInt);
		
		//2. �Ǽ� ���� ������ ������ ������ ������ �ڴ�.
		double ranD = rd.nextDouble(); //0.0 ~1.0
		System.out.println(ranD);
		
		//3. �Ҹ��� �� �������� ����
		boolean ranB = rd.nextBoolean();
		System.out.println(ranB);
	}

}