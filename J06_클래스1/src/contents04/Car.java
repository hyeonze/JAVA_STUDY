package contents04;

public class Car {
	//�ʵ�
	String name;
	int price;
	
	void setExample(String n, int p) {
		String name;//���� ���� �������� ���������� ���� ���
		name = n; //��������name <= �Ű�����n
		this.name = n;
		this.price = p;
	}
	
	//this.�ʵ�� �ʱ�ȭ�ϱ�
	void setInfo(String name, int price) {
		this.name = name; //this.�ʵ�name <= �Ű�����name
		this.price = price;//this.�ʵ�price <= �Ű�����price
	}
			
	//this.�޼ҵ�() ȣ���ϱ�
	void discount(String name, int price) {
		//this.�޼ҵ�setInfo(�Ű�����name, �Ű�����price - 500)
		this.setInfo(name, price-500);//���� 500 �����Ͽ� ���� ����
		
//		this.name = name;
//		this.price = price - 500;//���� 500 �����Ͽ� ���� ����
	}
	
	
	
	void showInfo() {
		System.out.println("����: "+this.name+", ����: "+this.price);
	}
}












