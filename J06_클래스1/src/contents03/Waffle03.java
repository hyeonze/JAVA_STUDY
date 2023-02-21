package contents03;

//다양한 생성자를 가지는 클래스
public class Waffle03 {
	//와플 정보: 이름, 가격
	String name;
	int price;
	
	//기본 생성자
	Waffle03(){}
	
	//생성자 오버로딩(매개변수 1개)
	Waffle03(String name){
		this.name = name;
	}
	
	//생성자 오버로딩(매개변수 2개)
	Waffle03(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	//멤버변수 정보를 출력해주는 메소드
	void showData() {
		System.out.println("이름: " + name 
				+ ", 가격: " + price);
	}
}
