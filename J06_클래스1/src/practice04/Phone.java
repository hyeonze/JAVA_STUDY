package practice04;

public class Phone {
	//�ʵ�
	private String name;
	private String telecom;
	private int price;
	
	//������ �����ε�(�Ű����� 2��: name, telecom)
	public Phone(String name, String telecom) {
		this(name, telecom, 150);
//		this.name = name;
//		this.telecom = telecom;
//		this.price = 150;
	}
	
	//������ �����ε�(�Ű����� 2��: name, price)
	public Phone(String name, int price) {
		this(name, "SKT", price);
//		this.name = name;
//		this.telecom = "SKT";
//		this.price = price;
	}
	
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
