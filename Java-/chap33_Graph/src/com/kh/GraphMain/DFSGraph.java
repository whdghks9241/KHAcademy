package com.kh.GraphMain;

import java.util.LinkedList;

/*
 * Graph class : ��������Ʈ�� ����ؼ� ���� ������ ����
 */
public class DFSGraph {
 
	// �׷����� ����
	private int V; 
	// �����迭����Ʈ
	private LinkedList<Integer>[] adjList;
	
	/**
	 adjList : �迭�� ���� ����Ʈ�� �����ϴ� �迭
	  		   �� ��帶�� ����� ������ �����ϱ����� LinkedList ��ü �迭�� �ʱ�ȭ
	 */
	
	/* 
	 �׷��� ������
	 	�׷��� ũ��(��� ��)�� �޾ƿͼ� �׷����� �ʱ�ȭ�Ѵ�
	 	adjList �迭�� �� ���Ҹ� �� LinkedList�� �ʱ�ȭ
	 */
	public DFSGraph(int ver) {
		V = ver;
		adjList = new LinkedList[ver];
		
		for (int i = 0; i < ver; i++) {
			adjList[i] = new LinkedList<>();
		}
	}
	
	// ��带 �׷����� �߰�
	// addEdge : �׷����� ���ο� ������ �߰�
	public void addEdge(int source, int des) {
		// source���� des ���� ������ �߰��ϸ� adjList�迭���� souce�� �ش��ϴ� LinkedList�� des �߰�
		adjList[source].add(des);
	}
	
	// �׷��� Ž��(���� �켱 Ž��)
	// ���� �켱 Ž���� �����ϰ�, ���� ��带 �Ű������� ����
	public void DFS(int startNode) {
		// �湮���θ� �����ϱ� ���� visited �迭�ʱ�ȭ
		boolean[] visited = new boolean[V];
		DFSUtil(startNode, visited);
		
	}

	// ���� �켱Ž���� ����
	private void DFSUtil(int currentNode, boolean[] visited) {
		// ���� ��带 �湮�� ������ ǥ��
		visited[currentNode] = true;
		// ����ȣ ���
		System.out.print(currentNode + " ");
		// ���� ���� ����� ���� ��带 Ȯ���ϰ�, �湮���� ���� ���� ��带 �����(������ �ڸ��� ���ƿ��ų� �ǵ��ƿ���)���� �湮
		for (int neighbor : adjList[currentNode]) {
			if (!visited[neighbor]) {
				DFSUtil(neighbor, visited);
			}
		}
	}
}
