package com.kh.instance.tv;

public class TvMain {

	public static void main(String[] args) {
		// Tv �ν��Ͻ��� �����ϱ� ���ؼ� ���� Tv ����
		Tv tv;
		// Tv�ν��Ͻ� ���� ��ü�� �ּҸ� ���������� �����Ѵ�.
		tv = new Tv();
		
		tv.channel = 7; 
		tv.channelDown();
		tv.power();
		
		System.out.println("Channel : " + tv.channel);
	}

}
