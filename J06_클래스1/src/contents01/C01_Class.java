/*
# Ŭ������ ��ü
Ŭ����(class)
- ��ü�� ����� ���� ���赵(Ʋ)
- ex) ���ñ��

��ü(Object)
- Ŭ������ ���赵�� ���� ��ü
- ex) ����

# ��ü �����ϱ�
Ŭ���� ���� �� ��ü�� ����
1. Ŭ���� ����
	class Ŭ�����̸�{
		�ʵ�(�������)
		�޼ҵ�
	}

2. ��ü ����
	Ŭ�����̸� ��ü�̸� = new Ŭ�����̸�();

# Ŭ������ ��ü�� ����
Ŭ���� -> ��ü1, ��ü2, ��ü3..
���ñ�� -> ����1, ����2, ����3..

*/
package contents01;

public class C01_Class {
	public static void main(String[] args) {
		//PersonŬ�����κ��� ��ü �����ϱ�
		System.out.println("====��ü1====");
//		int a = (int)10;
		Person hyun = new Person();
		hyun.name = "����";//��������� �� ����
		hyun.age = 20;
		hyun.sight = 1.2;
		hyun.hobby = "��Ʃ��";
		hyun.showProfile();//showProfile()�޼ҵ� ȣ��
		
		//�� �� �������� Ŭ������ �������� ��ü ���� ����
		System.out.println("====��ü2====");
		Person IU = new Person();
		IU.name = "������";
		IU.age = 31;
		IU.sight = 1.0;
		IU.hobby = "�뷡";
		IU.showProfile();
		
		System.out.println("====��ü3====");
		Person song = new Person();
		song.name = "���߱�";
		song.hobby = "��ȥ";
		song.showProfile();
	}
}


















