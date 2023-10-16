package com.kh.gettersetter;

public class PlayerCharacter {

	// ĳ���� �̸�
	private String name;
	// ü��
	private int health;
	// ���ݷ�
	private int attackpower;
	
	/**
	 *	Getter 
	 * 		������ ���纻�� �����ֱ� ������ ���� ��ü�� �����ʹ� �ջ��Ű�� ����
	 * 		���������ʹ� ������
	 */
	public String getName() {
		return name;
	}
	
	public int getHealth() {
		return health;
	}
	
	public int getAttackpower() {
		return attackpower;
	}
	
	/**
	 * Setter
	 *		�ܺο��� �޼ҵ带 ���� �����Ϳ� ������ �ϰ� �ȴٸ�
	 *		�޼ҵ�� �Ű����� �����ؼ� ������ ���� �����ͷ� �����Ҽ� �ִ�. 
	 */
	
	public void setName(String name) {
		this.name = name;
	}

	public void setHealth(int health) {
		isValidHealth();
	}

	public void setAttackpower(int attackpower) {
		// ���� ���ݷ��� 0���� Ŭ���
		if (attackpower >= 1) {
			this.attackpower = attackpower;
		} else {
			this.attackpower = 0;
		}
		
	}
	
	public void isValidHealth() {
		if (health <= 0) {
			health = 0;
		}
	}
	
	// ĳ���� ���� ���
	public void displayInfo() {
		System.out.println("ĳ���� ���� : " + name);
		System.out.println("ä�� ���� : " + health);
		System.out.println("���ݷ� ���� : " + attackpower);
		
	}
	
	// ĳ���� �����ϴ� ��� �޼���
	public void attack(PlayerCharacter target) {
		System.out.println("[" + getName() + "] �� ���� �߽��ϴ�  [" + target.getName() + "] ���� " + attackpower+ " �������� ����ϴ�!!");
	}
	
	// �ٸ� ĳ���ͷ� ���� ���� �޾��� �� �޼���
	public void takeDamage(int damage) {
		System.out.println("���� �޾ҽ��ϴ�");
	}

}
