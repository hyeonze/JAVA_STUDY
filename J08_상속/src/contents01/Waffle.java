package contents01;

/*�θ�Ŭ����(Superclass)*/
public class Waffle {
	//�ʵ�
	String name;
	int price;
	
	//�޼ҵ�
	void msgW() {
		System.out.println("�θ�Ŭ���� �޼���");
	}
	
	void setData(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void get2Data() {
		System.out.println("�̸�: " + this.name);
		System.out.println("����: " + this.price);
	}
}
