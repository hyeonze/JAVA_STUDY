/*
# for�ݺ���
for���� �ڵ� ������ ������ Ƚ����ŭ �ݺ��� �� ����Ѵ�.
	
	for(�ʱ��; ���ǽ�; ������){
		�ݺ��� ���๮..
	}

1) �ʱ�Ŀ��� ������ ���۰� ����(ó�� �ѹ��� ����)
2) ���ǽ��� ���̸� �ݺ��� ����
3) �������� �ݺ��� ������ ������ ȣ��
*/
package contents;
public class C01_For {
	public static void main(String[] args) {
		/* for �ݺ��� */
		//0~4���� 5�� �ݺ�
		for (int i = 0; i < 5; i++) {
			System.out.println("�ݺ�"+i);
		}
		
		//1~10���� �ڿ��� ����ϱ�
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		//"�ܿ�" 7�� ����ϱ�
		for (int j = 0; j < 7; j++) {
			System.out.println("�ܿ�");
		}
		
		//������ 3�� ����ϱ�
		for (int i = 1; i <= 9; i++) {
			System.out.println("3 X " + i + " = " + 3 * i);
		}
		
		//"ī��Ʈ�ٿ�" 5~1���� ����ϱ�
		for (int i = 5; i >= 1; i--) {
			System.out.println("ī��Ʈ�ٿ�"+i);
		}
		
		//����: 42~25������ �� ���ٷ� ����ϱ�
		for (int i = 42; i >= 25; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//1~20������ Ȧ�� ����ϱ�
		for (int k = 1; k <= 20; k++) {
			if (k % 2 == 1) {
				System.out.print(k + " ");
			}
		}System.out.println();
		
		//����: 1~50���� 3�� ����� ���ٷ� ��� 
		for (int k = 1; k <= 50; k++) {
			if (k % 3 == 0) {
				System.out.print(k + " ");
			}
		}System.out.println();
			
		//1~100���� 7�� ��� ������ ���ϱ�
		int count = 0; //������ ī��Ʈ�� ���� ����
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				count++;
			}
		}
		System.out.println("1~100���� 7�� ��� ����: " + count);
			
	}
}











