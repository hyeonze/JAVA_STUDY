/*	Scanner, String, Calendar, Wrapper Ŭ���� ����
Q)	������ ��������� �̿��Ͽ� ���� ��¥�� �������� �ѱ��� ���̿� �� ���̸� Ȯ���غ���.
	���� ������ϰ� ���ó�¥�� �Ʒ�ȭ��ó�� ����ϴµ�, 
	��������� ����ڷκ��� �Է��� �ް�
	���ó�¥�� �ڹ��� APIŬ������ �̿��Ͽ� �޾ƿ´�.
	
	�������� �ѱ��� ���̿� �� ���̸� ����Ͽ� ����غ���,
	2023�� 6�� 28�Ϻ��� �ѱ����� ���� ����� �� ���̷θ� ���ϵ� �����̹Ƿ�
	��å�� ����Ǵ� 6�� 28�� ������ ���� ���̵� ����غ���. //���̹� ���� ����
 	
	�� Console ��	
	��������� �Է��Ͻÿ�(@@@@-@@-@@): 1993-05-16
	�������: 1993�� 5�� 16�� 
	���ó�¥: 2023�� 2�� 27�� 
	=======���� ���=======
	�ѱ��� ����: 31��
	���ó�¥ �� ����: 29��
	6�� 28�� ���� ����: 30��

*/
package contents;

import java.util.Calendar;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��������� �Է��Ͻÿ�(@@@@-@@-@@): ");
		String birth = sc.nextLine();
		
		//���ڿ� ���� �ڸ���1 - substring()
		String birthYear = birth.substring(0, 4);
		String birthMonth = birth.substring(5, 7);
		String birthDay = birth.substring(8);
		
		//���ڿ� ���� �ڸ���2 - split()
		String[] str = birth.split("-");
		
		//���ڿ��� ������ Ÿ�� ��ȯ
		int birthY = Integer.parseInt(str[0]);
		int birthM = Integer.parseInt(str[1]);
		int birthD = Integer.parseInt(str[2]);
		
		System.out.println("������� : " 
						+ birthY + "�� "
						+ birthM+ "�� "
						+ birthD+ "��");
		
		//CalendarŬ������ ���ó�¥ ��������
		Calendar now = Calendar.getInstance();
		int nowY = now.get(Calendar.YEAR);
		int nowM = now.get(Calendar.MONTH) + 1;
		int nowD = now.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("���ó�¥ : " 
				+ nowY + "�� "
				+ nowM+ "�� "
				+ nowD+ "��");
		
		System.out.println("=======���� ���=======");
		//�ѱ��� ����
		int ageKor = nowY - birthY + 1;
		System.out.println("�ѱ��� ����: " + ageKor + "��");
		
		//���ñ��� �� ���� ����ϱ�
		int ageGlobal = nowY - birthY - 1; 
		if(birthM < nowM ) { //���� ���� ������ �Ѿ��� ���
			ageGlobal++;
		}else if(birthM == nowM) {//���� ���� ������ ���� ���
			if(birthD <= nowD) { //���ó�¥�� ���ϰ� ���ų� �Ѿ��� ���
				ageGlobal++;
			}
		}
		System.out.println("���ó�¥ �� ����: " + ageGlobal + "��");
		
		//6�� 28�� ���� �� ���� ����ϱ�
		int ageJune = nowY - birthY - 1;
		if(birthM < 6 ) { //���� ���� ������ �Ѿ��� ���
			ageJune++;
		}else if(birthM == 6) {//���� ���� ������ ���� ���
			if(birthD <= 28) { //���ó�¥�� ���ϰ� ���ų� �Ѿ��� ���
				ageJune++;
			}
		}
		System.out.println("6�� 28�� ���� ����: " + ageJune + "��");
		
	}
}












