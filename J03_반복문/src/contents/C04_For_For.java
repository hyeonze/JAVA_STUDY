/*
# ��ø �ݺ���
	
	for(�ʱ��; ���ǽ�; ������){
		���๮A..
		for(�ʱ��; ���ǽ�; ������){
			���๮B..
		}
		���๮C..
	}
	
�ܺ� for���� �����ϸ� ���๮A�� ���� ����ǰ�,
���� for���� �����ؼ� ���๮B�� �ݺ��ؼ� ������ ������,
���๮C�� �����ϰ� �ٽ� �ܺ�for�� ó������ ���ư��� �ݺ��� ����
*/
package contents;
public class C04_For_For {
	public static void main(String[] args) {
		/* ��ø �ݺ���: �ݺ��� �ȿ� �ݺ��� */
		for (int i = 1; i <= 5; i++) {//���� for�� �ݺ��� ��ġ�� ����
			for (int j = 1; j <= 3; j++) {//�ݺ��� ���� ����
				System.out.println("i = " + i + " | j = " + j);
			}
		}
		System.out.println("##############");
		
		//������ ����ϱ�1
		for (int i = 2; i <= 9; i++) {
			System.out.println("====="+i+"��=====");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println(i+"�� ����");
		}
		
		//����: ������ ����ϱ�2
		/*
		2��: 2 4 6 8 10 12 14 16 18 
		3��: 3 6 9 12 15 18 21 24 27 
		4��: 4 8 12 16 20 24 28 32 36 
		5��: 5 10 15 20 25 30 35 40 45 
		6��: 6 12 18 24 30 36 42 48 54 
		7��: 7 14 21 28 35 42 49 56 63 
		8��: 8 16 24 32 40 48 56 64 72 
		9��: 9 18 27 36 45 54 63 72 81 
		*/
		for (int i = 2; i <= 9; i++) {
			System.out.print(i+"��: ");
			for (int j = 1; j <= 9; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();
		}
		
		/* ����for�� �ݺ� Ƚ�� Ȯ���ϱ� */
		int count = 0; //�ݺ� Ƚ���� ī��Ʈ�� ����
		for (int i = 1; i < 30; i++) {
			count++;
		}
		System.out.println("�ݺ� Ƚ��: " + count);
		System.out.println();
		
		System.out.println("�ܺ�for: 0<=i<4, 4�� �ݺ�");
		System.out.println("����for: 0<=j<3, 3�� �ݺ�");
		int count1 = 0; //�ܺ�for�� �ݺ� Ƚ�� üũ
		int count2 = 0; //����for�� �ݺ� Ƚ�� üũ
		for (int i = 0; i < 4; i++) { //4�� �ݺ� ����
			count1++;
			for (int j = 0; j < 3; j++) {//3�� �ݺ� ����
				count2++; //�� �ݺ� Ƚ��: 4 X 3 = 12
			}
		}
		System.out.println("�ܺ�for�� �ݺ� Ƚ��: " + count1);
		System.out.println("����for�� �ݺ� Ƚ��: " + count2);
		System.out.println();
		
		System.out.println("�ܺ�for: 0<=i<4, 4�� �ݺ�");
		System.out.println("����for: 0<=j<i, i�� �ݺ�");
		count1 = 0; //count���� �ʱ�ȭ
		count2 = 0; 
		for (int i = 0; i < 4; i++) { //4�� �ݺ� ����
			count1++;
			for (int j = 0; j < i; j++) {//i�� �ݺ� ����
				count2++; //�� �ݺ� Ƚ��: 0 + 1 + 2 + 3 = 6
			}
		}
		System.out.println("�ܺ�for�� �ݺ� Ƚ��: " + count1);
		System.out.println("����for�� �ݺ� Ƚ��: " + count2);
	}
}













