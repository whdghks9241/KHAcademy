package com.kh.BFS;

/**
	BFSMain
	�׷�����  BFS Ž���� �����ϰ�, �־��� ���� ���κ��� ��� ����� ��带 
	�ʺ� �켱���� Ž��
 */
public class BFSMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BFSGraph g = new BFSGraph(7);
		// �����߰�
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 5);
		g.addEdge(2, 4);
		g.addEdge(1, 6);
		
		System.out.println("BFS Ž�� ��� : ");
		// BFS �� ���� ��� 0���� ȣ���ؼ� ����
		g.BFS(0);
		// ����� BFS�� Ž�� ����� ��� ������ ���
	}

}
