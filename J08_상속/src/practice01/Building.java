package practice01;

public class Building {
	//�ʵ�
	String name;
	int price;
	
	//�޼ҵ�
	void setData(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void showData() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + price);
	}
}
