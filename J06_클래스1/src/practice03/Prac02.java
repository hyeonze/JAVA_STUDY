/*
Q1)	�簢�� ������ ��Ÿ���� Rectangle Ŭ������ �ۼ��غ��� �׽�Ʈ�غ���.
	���簢���� �غ��� ���̸� �ʵ�� ������, 
	�����ڿ� �Ű������� �ʵ带 �ʱ�ȭ�ϴ� �����ڸ� �ϳ� ������.
	���簢���� ���̿� �ѷ� ���� �����ϴ� �޼ҵ嵵 �ϳ��� ������.
	
	@�ʵ� (private int)
	width: �غ�
	height: ����
	
	@������
	Rectangle(?): �غ��� ���̸� �ʱ�ȭ�ϰ�, 
				  �簢�� ������ ����ϴ� �ڵ嵵 �����Ѵ�.
	@�޼ҵ�
	getArea(): ���̸� ����
	getRound(): �ѷ��� ����
	
	�̿� ���� Rectangle Ŭ������ ��ü�� ���� ��Ÿ�� ���� ����� ������ ����.
	
	�� Console ��
	ũ�Ⱑ 10x20�� ���簢�� ����
	����: 200
	�ѷ�: 60

Q2) Q1������ Rectangle Ŭ�������� ���簢�� ������ ��� ���� �����
 	�����ڸ� �߰��غ��� �׽�Ʈ�غ���.
 	
 	@������ �����ε�
 	Rectangle(?): �غ��� ���̸� �������� �޾Ƽ� �ʱ�ȭ�ϰ�, 
 				  ���簢�� ������ ����ϴ� �ڵ嵵 �����Ѵ�.
 	
 	�� Console ��
 	�� ���� ���̰� 30�� ���簢�� ����
	����: 900
	�ѷ�: 120

*/
package practice03;

public class Prac02 {
	public static void main(String[] args) {
		//Q1
		Rectangle rec1 = new Rectangle(10,20); 
		System.out.println("����: " + rec1.getArea());
		System.out.println("�ѷ�: " + rec1.getRound());
		System.out.println("========================");
		
		//Q2
		Rectangle rec2 = new Rectangle(30);
		System.out.println("����: " + rec2.getArea());
		System.out.println("�ѷ�: " + rec2.getRound());
	}
}










