/*
# Ŭ������ ����
class Ŭ�����̸�{
	�ʵ�
	������
	�޼ҵ�
}
*/
package contents03;

//�Ű������� �ִ� �����ڸ� �����ϴ� Ŭ����
public class Waffle02 {
	//���� ����: �̸�, ����
	String name;
	int price;
	
	//�Ű������� �ִ� �����ڸ� ���������Ƿ� �⺻ �����ڴ� ���������X
	Waffle02(String name, int price){
		//�������� �Ű������� ��������� �ʱ�ȭ
		this.name = name;//this�� ��ü�� ��������� ����
		this.price = price;
		
//		String name;
//		double price;
//		name = n;
//		price = p;
	}
	
	
	//������� ������ ������ִ� �޼ҵ�
	void showData() {
		System.out.println("�̸�: " + name 
				+ ", ����: " + price);
	}
}









