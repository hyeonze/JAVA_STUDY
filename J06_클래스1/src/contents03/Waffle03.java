package contents03;

//�پ��� �����ڸ� ������ Ŭ����
public class Waffle03 {
	//���� ����: �̸�, ����
	String name;
	int price;
	
	//�⺻ ������
	Waffle03(){}
	
	//������ �����ε�(�Ű����� 1��)
	Waffle03(String name){
		this.name = name;
	}
	
	//������ �����ε�(�Ű����� 2��)
	Waffle03(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	//������� ������ ������ִ� �޼ҵ�
	void showData() {
		System.out.println("�̸�: " + name 
				+ ", ����: " + price);
	}
}
