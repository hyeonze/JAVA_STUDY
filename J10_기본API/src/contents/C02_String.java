package contents;

import java.util.Scanner;

public class C02_String {
	public static void main(String[] args) {
		/* String Ŭ���� - ���ڿ��� ǥ���ϴ� Ŭ���� */
		//java.lang��Ű�� �Ҽ�
		
		//String ��ü�� �����ϴ� 2���� ���
		String w1 = "winter";
		String w2 = new String("winter");
		
		System.out.println(w1);
		System.out.println(w2);
		
		//2���� ����� ����(���ڿ��� �޸� ��ġ ��)
		System.out.println(w1==w2); //�� ��ü�� �����ϴ� ���� �޸� ��ġ�� ���� �ٸ�
		String t1 = "winter";
		String t2 = new String("winter");
		System.out.println(w1==t1); //�ϳ��� ��ü�� ���̼� �����Ѵ�(���� ��ü ����)
		System.out.println(w2==t2); //���� �ٸ� �ΰ��� ��ü�� �����Ѵ�.
		
		//���ڿ� ��
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���ڿ� �Է�: ");
//		String str1 = sc.next();
//		System.out.println("str1: " + str1);
//		System.out.println(str1 == t1);
//		System.out.println(str1.equals(t1));
		
		String str2 = "winte";
		char ch = 'r';
		str2 = str2 + ch;
		System.out.println(str2);
		System.out.println(t1 == str2);
		System.out.println(str2.equals(t1));
		System.out.println("===========");
		
		/* String �޼ҵ� */
		//equals(): ���ڿ� ���ϱ�
		System.out.println(w1.equals(w2));
		
		//length(): ���ڿ� ���� ���ϱ�
		System.out.println(w1.length());
		System.out.println("cold".length());
		
		//charAt(): Ư�� �ε��� ��ġ�� ���� Ȯ���ϱ�
		String s = "New season";
		System.out.println(s.charAt(6));
		System.out.println("cold".charAt(2));
		
		//indexOf(): ���ڿ����� �־��� ����(��)�� ��ġ Ȯ���ϱ�
		System.out.println(s.indexOf('w'));
		System.out.println(s.indexOf('e'));
		System.out.println(s.indexOf('e', 2));
		System.out.println(s.indexOf("sea"));
		
		//substring(): Ư�� ��ġ���� ���ڿ� �߶󳻱�
		System.out.println(s.substring(4));
		System.out.println(s.substring(4, 7));
		
		//replace(): ���� ��ü�ϱ�
		String s2 = s.replace('s', 'S');
		System.out.println(s2);
		
		//replaceAll(): ���ڿ� ��ü�ϱ�
		String s3 = s.replaceAll("season", "Season");
		System.out.println(s3);
		
		//split(): Ư�� ���ڸ� �������� ���ڿ��� �߶� �迭�� �����ϱ�
		String year = "winter;spring;summer;fall";
		String[] season = year.split(";");
		for (int i = 0; i < season.length; i++) {
			System.out.println("����: " + season[i]);
		}
		
		//toCharArray(): ���ڿ��� char�迭�� ��ȯ�ϱ�
		String msg = "Time waits for no one";
		char[] time = msg.toCharArray();
		for (int i = 0; i < time.length; i++) {
			System.out.print(time[i]);
		}
		System.out.println();
		
		//toUpperCase(), toLowerCase(): ���ڿ� ���θ� �빮�� �Ǵ� �ҹ��ڷ� ����
		System.out.println(msg.toUpperCase());
		System.out.println(msg.toLowerCase());
	}
}
	













