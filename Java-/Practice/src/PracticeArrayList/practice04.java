package PracticeArrayList;

public class practice04 {
/**

	3-4)	���ڿ� �迭�� ����ؼ� ���� for������ ���ڿ� �迭�� ��� �߿� ����� ���ڿ��� ã�� ��� -> if ���Ἥ length���� ũ�� ����ϱ�
			String[] ss = {"apple", "banan", "cherry", "elderberry"}
			for (String str : ss) {
				if () {

				}
			}
 */
	
	public static void main(String[] args) {
		// String �迭
		String[] strList = {"apple", "banan", "cherry", "elderberry"};
	
				
		for (String str : strList) {
			
			if (str.length() >= 10) {
				System.out.println("��� : " + str);
			}
		}
	}
}
