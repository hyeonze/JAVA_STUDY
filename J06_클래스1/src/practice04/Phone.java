package practice04;

public class Phone {
	//필드
	private String name;
	private String telecom;
	private int price;
	
	//생성자 오버로딩(매개변수 2개: name, telecom)
	public Phone(String name, String telecom) {
		this(name, telecom, 150);
//		this.name = name;
//		this.telecom = telecom;
//		this.price = 150;
	}
	
	//생성자 오버로딩(매개변수 2개: name, price)
	public Phone(String name, int price) {
		this(name, "SKT", price);
//		this.name = name;
//		this.telecom = "SKT";
//		this.price = price;
	}
	
	//생성자(매개변수 3개)
	public Phone(String name, String telecom, int price) {
		this.name = name;
		this.telecom = telecom;
		this.price = price;
	}

	//메소드
	void showData() {
		System.out.println(name+" | " +telecom+" | "+price+"만원");
	}
	
}
