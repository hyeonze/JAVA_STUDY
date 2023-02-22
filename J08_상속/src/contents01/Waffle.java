package contents01;

/*부모클래스(Superclass)*/
public class Waffle {
	//필드
	String name;
	int price;
	
	//메소드
	void msgW() {
		System.out.println("부모클래스 메세지");
	}
	
	void setData(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void get2Data() {
		System.out.println("이름: " + this.name);
		System.out.println("가격: " + this.price);
	}
}
