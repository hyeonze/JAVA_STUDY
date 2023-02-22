package practice01;

public class Building {
	//필드
	String name;
	int price;
	
	//메소드
	void setData(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void showData() {
		System.out.println("이름: " + name);
		System.out.println("가격: " + price);
	}
}
