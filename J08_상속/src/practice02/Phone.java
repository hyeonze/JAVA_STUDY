package practice02;

public class Phone {
	//�ʵ�
	private String name;
	private String telecom;
	private int price;
	
	//������(�Ű����� 3��)
	public Phone(String name, String telecom, int price) {
		this.name = name;
		this.telecom = telecom;
		this.price = price;
	}

	//�޼ҵ�
	void showData() {
		System.out.println(name+" | " +telecom+" | "+price+"����");
	}
	
}
