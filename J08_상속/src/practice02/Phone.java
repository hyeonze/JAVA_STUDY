package practice02;

public class Phone {
	//필드
	private String name;
	private String telecom;
	private int price;
	
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
