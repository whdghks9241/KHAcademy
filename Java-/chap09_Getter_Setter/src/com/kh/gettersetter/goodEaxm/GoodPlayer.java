package com.kh.gettersetter.goodEaxm;

public class GoodPlayer {

	// ĳ���� �̸�
	// 
	private String name;

	public String getName() {
		return name;
	}

	public void ValidName(String name) {
		if (this.name == " ") {
			this.name = name;
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	// ü��
	private int health;
	
	public int getHealth() {
		return health;
	}

	public void ValidHealth() {
		if (this.health < 0) {
			health = 0;
		}
	}
	
	public void setHealth(int health) {
		this.health = health;
	}


	// ���ݷ�
	private int attackPower;
	
	public int getAttackPower() {
		return attackPower;
	}
	
	public void ValidattackPower() {
		if (this.attackPower <- 0) {
			attackPower = 0;
		}
	}
	
	public void setAttackpower(int attackpower) {
		this.attackPower = attackpower;
	}
	

	// ĳ���� ���� ���
	public void displayInfo() {
		System.out.println("ĳ���� ���� : " + this.name);
		System.out.println("ä�� ���� : " + this.health);
		System.out.println("���ݷ� ���� : " + this.attackPower);
		
	}
}
