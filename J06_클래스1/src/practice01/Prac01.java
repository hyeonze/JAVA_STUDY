/*
Q)	������ ���� Student Ŭ���� ������ �����ϰ� 
	���� Ŭ�������� ��ü�� �����Ͽ� 
 	������� ���� �ʱ�ȭ��, �޼ҵ嵵 ������� Ȯ���غ���.  
 	
	Student Ŭ���� ����
	{
		@�ʵ�
		�̸�, ������, ����(��)
	
		@�޼ҵ�
		showSubject(): �������� �˷��ִ� �޼ҵ�
		birth(): �ʵ��� �̸��� ����(��) ������ ����ؼ� 
				 �л��� ������ �� ������ ��¹����� �˷��ִ� �޼ҵ�
					  
	}
	
	�� Console ��
	java ������ �������Դϴ�.
	�������� ������ 5�� �Դϴ�.
*/
package practice01;

public class Prac01 {
	public static void main(String[] args) {
		Student s = new Student();
		
		//��ü �ʵ� �ʱ�ȭ
		s.name = "����";
		s.subject = "�ڹ�";
		s.month = 5;
		
		//��ü �޼ҵ� ����
		s.showSubject();
		s.birth();
	}
}







