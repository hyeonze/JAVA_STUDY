package contents03;

//�⺻ �����ڸ� ������ �ִ� Ŭ����
public class Waffle01 {
	//���� ����: �̸�, ����
	String name;
	int price;
	
	//�⺻ �����ڰ� �ڵ����� �����Ǿ� ���ԵǾ� �ִ�.
	//Waffle01(){}
	
	//�⺻ �������� ���๮�� ����ڰ� ���� ����
	Waffle01(){
		System.out.println("�⺻ ������ �۵�");
	}
	
	//��������� �ʱ�ȭ�� �޼ҵ�
	void setData(String n, int p) {
		name = n;
		price = p;
	}
	
	//������� ������ ������ִ� �޼ҵ�
	void showData() {
		System.out.println("�̸�: " + name 
				+ ", ����: " + price);
	}
}







