package contents;

import java.util.Scanner;

public class C02_throw {
	public static void main(String[] args) {
		/* throw */
		//throwŰ����� ���α׷��Ӱ� ���Ƿ�(����) ���ܸ� �߻���ų �� �ִ�. 
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("����1 �Է�: ");
				int num1 = sc.nextInt();
				System.out.print("����2 �Է�: ");
				int num2 = sc.nextInt();
				
				if(num2==1) {
					//�޼����� ��Ƽ� ���ܸ� �߻���Ų��.
					throw new Exception("1�� �����°� ��̾����ϴ�.");
				}
				
				if(num2==-1) {
					//�޼����� ��Ƽ� ���ܸ� �߻���Ų��.
//					throw new Exception("-1�� �����°� ��̾����ϴ�.");
					
					//���� ���ٰ� ���� ���๮
					//Exception ����Ŭ������ ��ü�� ����
					Exception e = new Exception("-1�� �����°� ��̾����ϴ�.");
					throw e; //���ܸ� �߻���Ų��
				}
				
				System.out.println("num1/num2 = " + num1/num2);
				break;
			}catch(Exception e) {
				System.err.println("����: " + e.getMessage());
			}
		}
	}
}



