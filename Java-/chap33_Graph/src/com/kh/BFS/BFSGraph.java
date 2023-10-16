package com.kh.BFS;

import java.util.LinkedList;
import java.util.Queue;
/**
	Graph Ŭ����
 */
public class BFSGraph {
	
	// �׷����� ���� ��
	private int V;
	
	// ���� ����Ʈ
	private LinkedList<Integer>[] adj;
	
	// �׷��� �ʱ�ȭ
	public BFSGraph(int v) {
		// Graph Ŭ������ �����ڿ��� �׷����� ���� �� (V)�� �޾Ƽ� �ʱ�ȭ
		V = v;
		adj = new LinkedList[v];
		// adj ���� ����Ʈ�� ��Ÿ����, �� �������� ������ �������� ����� ����
		for (int i = 0; i < v; i++) {
			adj[i] = new LinkedList();
		}
	}
	
	// �׷��� ���� �߰�
	// addEdge �׷����� ������ �߰�
	// v�� w�� ������ �� �� ������ ��Ÿ��
	public void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	public void BFS(int start) {
		
		// �湮 ���θ� ǥ���ϱ� ���� �迭
		// visited �迭�� �� ������ �湮 ���θ� ����
		boolean[] visited = new boolean[V];
		// BFS�� ���� ������ ������ ���
		Queue<Integer> queue = new LinkedList<>();
		
		// Ž���� ���� ��� (Start)���� �����ϰ� ���� ��带 �湮�ϰ� ť�� �߰�
		visited[start] = true;
		queue.add(start);
		// ť�� ����� ������ �ݺ������� ���� �ܰ迡 ������ ��带 �湮
		while(!queue.isEmpty()) {
			start= queue.poll();
			System.out.print(start + " ");
			
			for(Integer neighbor : adj[start]) {
				if (!visited[neighbor]) {
					visited[neighbor] = true;
					queue.add(neighbor);
				}
			}
		}
	}
}
