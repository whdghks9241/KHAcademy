package PracticeArrayList;

public class practice02 {
/**
	3-2)	���� for���� �̿��ؼ� ���� ����ϱ� 
			int[] numbers = 1.2.3.4.5
 */
	public static void main(String[] args) {

		int[] numbers = {1,2,3,4,5};
				
//		ArrayList<Object> numArray = new ArrayList<>();
	
		// �Ϲ� for��
		for (int i = 0; i < numbers.length; i++) {
			
			System.out.print(" " + numbers[i]);
			
		}

		System.out.println("");
		
		// ���� for��
		for (int num : numbers) {
			System.out.print(" " + num);
		}
	}
}
