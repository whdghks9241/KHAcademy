package com.kh.classAM;

public class AM {
	public int pNum = 10;

	protected int pNum2 = 20;
	
	// ���� �����ڸ� ������� ������ �ڵ����� default ������ ����ȴ�
	int pNum3 = 20;
	
	private int pNum4 = 20;
	
	// ȣ�� �޼ҵ� �ۼ��ؼ� ���� ȣ��
	public void publicMethod() {
		
		System.out.println("public Method() ȣ���");
	}
	
	
	protected void protectedMethod() {
		System.out.println("protected Method() ȣ��");
	}
	
	// default �� �տ� ���������ڸ� �ۼ������� ������ �⺻���� ������ ��
	void defaultMethed() {
		System.out.println("default Method() ȣǮ");
	}
	
	private void privateMethod() {
		System.out.println("private Method() ���");
	}
}
