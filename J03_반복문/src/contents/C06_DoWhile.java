/*
# do-while��
�켱 �ѹ� �����ϰ� ���ǽĿ� ���� �ݺ��� �����Ѵ�.

	do{
		�ݺ��� ���๮..
	}while(���ǽ�);

*/
package contents;

public class C06_DoWhile {
	public static void main(String[] args) {
		/* do-while�� */
		//1~10���� �ڿ��� ����ϱ�
		int i = 1;
		do {
			System.out.println(i);
			i++;
		}while(i<=10);
		
		//while������ ����
		int k = 0;
		while (k > 0) {//���ǽ� ���� -> while�� ����X
			System.out.println("while�� ����");
		}
		
		do {//���ǽ��� �����̾ ó�� �ѹ��� ����
			System.out.println("do-while�� ����");
		} while (k > 0);
		
	}
}







