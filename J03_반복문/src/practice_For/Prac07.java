/*
Q1)	����for���� �̿��Ͽ� �Ʒ��� ����ó�� ����� ����غ��ÿ�.
	��, ���� ���� ���� ���� ���� �Ÿ��� tab��ŭ�̴�.
	
	�� Console ��
	1	2	3	4	5
	6	7	8	9	10
	11	12	13	14	15
	16	17	18	19	20
	21	22	23	24	25

	Tip) �Ǹ�ŭ�� ������ �ִ� �ڵ�� "\t"
	
Q2)	����for���� �̿��Ͽ� �Ʒ��� ����ó�� ����� ����غ��ÿ�.
	��, ���� ���� ���� ���� ���� �Ÿ��� tab��ŭ�̴�.
	
	�� Console ��
	5	4	3	2	1	
	10	9	8	7	6	
	15	14	13	12	11	
	20	19	18	17	16	
	25	24	23	22	21	

*/
package practice_For;

public class Prac07 {
	public static void main(String[] args) {
		//Q1)
		int num = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(num+"\t");
				num++;
			}
			System.out.println();
		}
		System.out.println();
		
		//�ܺ�for�� ����for�� �ݺ������� ���� �Ϲݽ� �̿� 
		for (int i = 0; i < 5; i++) {
			int startNum = 1 + 5*i;
			for (int j = 0; j < 5; j++) {
				System.out.print((startNum+j)+"\t");
			}
			System.out.println();
		}
		
		//Q2
//		System.out.println();
//		
//		for (int i = 0; i < 5; i++) {
//			int startNum = 5 + 5*i;
//			for (int j = 0; j < 5; j++) {
//				System.out.print( (startNum - j) + "\t");
//			}
//			System.out.println();
//		}
	}
}







