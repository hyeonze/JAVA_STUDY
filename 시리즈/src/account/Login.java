/*
Q.  �̸� ������ ���� ���̵�� ��й�ȣ�� �̿��Ͽ� 
	�α��� ����� ����� ���ô�.
    �α��� ȭ�鿡�� ����ڷκ��� ���̵�� ��й�ȣ�� �Է¹ް�
    ���̵�� ��й�ȣ�� ��ġ�ϸ� �α��ο� ���� �޼�����,
    ���̵�� ��й�ȣ�� Ʋ���� �α��ο� ���� �޼����� 
    ����ϵ��� �ۼ��غ��ÿ�.
    
    //�־��� �ڵ�
    String user_id = "hyun";
	String user_pw = "1043";

    �� Console1 ��
    ***********�α��� ȭ��***********
    ȸ�� ���̵�� ��й�ȣ�� �Է����ּ���.
    ���̵�: hyun
    ��й�ȣ: 1043
    �α��ο� �����߽��ϴ�!
    hyun�� �������:)

    �� Console2 ��
    ***********�α��� ȭ��***********
    ȸ�� ���̵�� ��й�ȣ�� �Է����ּ���.
    ���̵�: hyun
    ��й�ȣ: 0000
    �α��ο� �����߽��ϴ�.
    ���̵�� ��й�ȣ�� �ٽ� Ȯ�����ּ���.
    
    Tip) ���ڿ� �� ���
	String str1 = "msg";
	String str2 = "msg";
	str1.equals(str2): ������ true, �ٸ��� false
	
	nextLine(): ���ڿ� ���� �Է¹ޱ�
*/


package account;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String user_id = "hyun";
		String user_pw = "1043";
		
		while(true) {
			System.out.println("***********�α��� ȭ��***********");
			System.out.println("ȸ�� ���̵�� ��й�ȣ�� �Է����ּ���.");
			System.out.print("���̵�: ");
			String get_id = sc.nextLine();
			System.out.print("��й�ȣ: ");
			String get_pw = sc.nextLine();
			
			if(get_id.equals(user_id) && get_pw.equals(user_pw)) {
				System.out.println("�α��ο� �����߽��ϴ�.");
				System.out.println(user_id+"�� �������:)");
				break;
			}else {
				System.out.println("�α��ο� �����߽��ϴ�.");
				System.out.println("���̵�� ��й�ȣ�� �ٽ� Ȯ�����ּ���.");
			}
		}
	}
}











