package chap37_TodoList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class TodoList {

	private ArrayList<String> tasks;
	
	private HashMap<Integer, String> hashMap;
	
	int nextId;
	
	// ArrayList�� HashMap ����
	// HashMap �� key value �� �ۼ�.
	
	public TodoList() {
		hashMap = new HashMap<Integer, String>();
		nextId = 1;
	}
	
	public void addTask(String value) {
		hashMap.put(nextId, value);
		nextId++;
	}
	
	public void removeTask(int index) {
	
		
		if (hashMap.get(index) == null) {
			System.out.println("�߸��� �Է��Դϴ�.");
		} else {
			hashMap.remove(index);
		}
	}
	
	public void displayTasks() {
 		System.out.println("");
		System.out.println("my TodoList");
		for (Entry <Integer, String> entry : hashMap.entrySet()) {
			int day = entry.getKey();
			String work = entry.getValue();
			System.out.println("[" +day+". " + work +"]");
		}
	}
	
	public static void main(String[] args) {
		
		boolean exit = false;
		TodoList todoList = new TodoList();
		Scanner scn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		while(!exit) {
	 		System.out.println("");
			System.out.println("1. ���� �߰� , 2. ���� , 3. ���Ϻ��� , 4. ����");
			
			int choice = scn.nextInt();
			
			switch(choice) {
			 
			 	case 1 :
			 		System.out.println("");
					System.out.println("�������� �ϴ��� �Է��ϼ���");
					String work = sc.nextLine();
					todoList.addTask(work);
					break;
			 	case 2 :
			 		System.out.println("������ �� ��ȣ �Է�");
					try {
						int index = scn.nextInt();
						todoList.removeTask(index);
					} catch(Exception e) {
						System.out.println("��ȿ���� ���� �Է��Դϴ�.");
				 		System.out.println("");
					}
					break;
			 	case 3 :
			 		todoList.displayTasks();
			 		break;
			 	case 4 :
			 		exit = true;
			 		break;
			 		
			 	default :
			 		System.out.println("�߸��� �Է� �Դϴ�.");
			}

		}
		System.out.println("========================");
		System.out.println("�����մϴ�!");
		sc.close();
	}
	/*
	public TodoList() {
		
		tasks = new ArrayList<>();
		
	}
	public void addTask(String task) {
		tasks.add(task);
	}
	
	
	public void removeTask(int index) {
		if (index >= 0 && index <tasks.size()) {
			tasks.remove(index);
		} else {
			System.out.println("�߸��� �ε��� �Դϴ�.");
		}
	}
	public void displayTasks() {
		System.out.println("my TodoList");
		for(int i = 0; i < tasks.size(); i++ ) {
			System.out.println((i + 1) + "." + tasks.get(i));
		}
	}
	
	public static void main(String[] args) {
		TodoList todoList = new TodoList();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���� �߰� : add , ���� : remove, ���Ϻ��� : list, ���� : exit");
			
			String choice = sc.nextLine();
			
			if (choice.equals("add")) {
				System.out.println("�� ���� �Է��ϼ�����");
				String task = sc.nextLine();
				todoList.addTask(task);
			} else if (choice.equals("remove")) {
				System.out.println("������ �� ��ȣ �Է��ϱ�");
				try {
					int index = Integer.parseInt(sc.nextLine()) -1;
					todoList.removeTask(index);
				} catch(Exception e) {
					System.out.println("��ȿ���� ���� �Է��Դϴ�.");
				}
			} else if (choice.equals("list")) {
				todoList.displayTasks();
			} else if (choice.equals("exit")) {
				break;
			} else {
				System.out.println("�߸��� �Է� �Դϴ�.");
			}
		}
	}
	*/
}
