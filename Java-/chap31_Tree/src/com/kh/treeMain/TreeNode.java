package com.kh.treeMain;
/**
 ��� �� ��Ÿ���� �� ������ Ŭ����
 */
public class TreeNode {
	// ������ ����
	int data; 	
	// ���� �ڽ� ��带 �����ϴ� ��ũ
	TreeNode left;
	// ������ �ڽ� ��带 �����ϴ� ��ũ
	TreeNode right;
	
	// ��带 ������ �� �����͸� �ʱ�ȭ �ϰ� ���ʰ� ������ ��ũ�� null�� �ʱ�ȭ 
	public TreeNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
