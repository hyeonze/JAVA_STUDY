package contents05;

public class Waffle {
	//필드
	String source;
	int price;
	
	//생성자
	public Waffle(String source, int price) {
		super();
		this.source = source;
		this.price = price;
	}
	
	//메소드
	void showOrder() {
		System.out.println(source+"와플 "+price+"원");
	}
}
