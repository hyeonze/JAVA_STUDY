/*
# �ܼ�â���� ����ڷκ��� �Է¹ޱ�
	"Scanner" + ctrl + space
	-> import java.util.Scanner;
	
	Scanner ��ü�̸� = new Scanner(System.in);
	Ÿ�� ������ = ��ü�̸�.�Է¹���Ÿ��();
*/
package contents;

import java.util.Scanner;

public class C03_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//���ڿ� �Է¹ޱ�(����): enter������ �Է¹��� 
//		System.out.print("���ڿ� �Է�: ");
//		String str = sc.nextLine();
//		System.out.println("str: " + str);
		
		//���ڿ� �Է¹ޱ�(�Ѵܾ�): ���� ������ �Է¹���
//		System.out.print("�ܾ� �Է�: ");
//		String word = sc.next();
//		System.out.println("word: " + word);
		
		//���� �Է� �ޱ�
//		System.out.print("���� �Է�: ");
//		int numI = sc.nextInt();
//		System.out.println("numI: " + numI);
		
		//�Ǽ� �Է� �ޱ�
//		System.out.print("�Ǽ� �Է�: ");
//		double numD = sc.nextDouble();
//		System.out.println("numD: " + numD);
		
		//���� ���� �Է� �ޱ�
		System.out.print("���� �Է�: ");
		char ch = sc.next().charAt(0);
		System.out.println("ch: " + ch);
	}
}









