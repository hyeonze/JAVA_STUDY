package contents;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C01_Scanner {
	public static void main(String[] args) throws FileNotFoundException {
		/*Scanner Ŭ����*/
		//�������α׷��� Ű �Է��� �ޱ� ���� Ŭ����
		Scanner sc = new Scanner(System.in);
		
		//nextLine(): ���� Ű �Է� �������� ���ڿ��� �޴´�.
		//next(): ���� �������� ���ڿ��� �Է� �޴´�.
//		System.out.print("�����̸� �Է�: ");
//		String name = sc.next();
//		System.out.println("name: " + name);
		
		//next().charAt(0): �Է¹��� ���ڿ����� ù��° �ܾ �����´�.
		//					=> ���Ϲ��� �Է� �޴� �뵵..
//		System.out.print("���� �Է�: ");
//		char ch = sc.next().charAt(0);
//		System.out.println("ch: " + ch);
//		char ch2 = 65;
//		System.out.println("ch2: " + ch2);
		
		//nextInt(): ���� �Է� �ޱ�
		//nextDouble(): �Ǽ� �Է� �ޱ�
		//nextBoolea(): ���� �Է� �ޱ�
		
		//���ڿ� �о����
		String str = "spring is coming";
		Scanner sc2 = new Scanner(str);
		System.out.println(sc2.next());
		
		//�ؽ�Ʈ���� �о����
		File file = new File("sample.txt");
		Scanner sc3 = new Scanner(file);
		System.out.println(sc3.nextLine());
		
		sc.close();
		sc2.close();
		sc3.close();
	}
}










