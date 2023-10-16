package com.kh.treeMain;

/**
 노드를 삽입하고 돌아가며 출력하는 이진트리
 전위 순회 : root(뿌리)를 먼저 방문
 중위 순회 : 왼쪽 하위 트리를 방문 후 root(뿌리) 방문
 후위 순외 : 하위트리 모드 방문 후 root(뿌리) 방문
 층별 순회 : 위 쪽 node들 부터 아래방향으로 차례대로 방문
 */
public class BinaryTree {
	
	TreeNode root;
	
	public BinaryTree() {
		this.root = null;
	}
	
	/**
	 * insert 메서드와 insertRac메서드는 이진 트리에 새로운 노드를 삽입하는데 사용
	 */
	
	// insert : 외부에 노출되는 메서드
	public void insert(int data) {
		root = insertRec(root, data);
	}

	// insertRec : 실제 삽입 작업 메서드
	// 재귀적으로 노드를 삽입하고 적절한 위치를 찾아 새로운 노드를 생성
	// *재귀적 : 자기 자신을 포함하고 다시 자기 자신을 사용해서 정의내림.
	private TreeNode insertRec(TreeNode root, int data) {

		if (root == null) {
			root = new TreeNode(data);
			return root;
		} 
		
		
		if (data < root.data) {
			root.left = insertRec(root.left, data);
			System.out.println("왼쪽값 : " + root.left.data);
		} else if (data > root.data) {
			root.right = insertRec(root.right, data);
			System.out.println("오른쪽값 : " + root.right.data);
		}
		return root;
	}

	/**
	 inOder Traversal 중위순회 / 외부에 노출되는 메서드
	 inOrderTR : 중위 순회를 수행하여 트리의 노드를 출력하는데 사용
	 왼쪽 서브트리 현재노드 오른쪽 서브트리 순서로 노드 출력
	 */
	public void inOrderT() {
		inOrderTR(root);
	}
	
	private void inOrderTR(TreeNode root) {
	
		if (root != null) {
			inOrderTR(root.left);
			inOrderTR(root.right);
		} else if (root == null){
			 root = null;
		}
	}
	
	
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();

		tree.insert(10);
		
		
		tree.insert(40);
		tree.insert(80);
		tree.insert(60);
		tree.insert(70);
		tree.insert(90);
		tree.insert(50);
		
		
		tree.insert(36);
		
		
		tree.insert(30);
		tree.insert(20);
		
		System.out.println("이진 트리의 중위순회 결과 : ");
		tree.inOrderT();
		
	
	}
}
