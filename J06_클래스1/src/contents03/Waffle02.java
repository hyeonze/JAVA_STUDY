/*
# 클래스의 구성
class 클래스이름{
	필드
	생성자
	메소드
}
*/
package contents03;

//매개변수가 있는 생성자를 포함하는 클래스
public class Waffle02 {
	//와플 정보: 이름, 가격
	String name;
	int price;
	
	//매개변수가 있는 생성자를 선언했으므로 기본 생성자는 만들어지지X
	Waffle02(String name, int price){
		//생성자의 매개값으로 멤버변수를 초기화
		this.name = name;//this로 객체의 멤버변수에 접근
		this.price = price;
		
//		String name;
//		double price;
//		name = n;
//		price = p;
	}
	
	
	//멤버변수 정보를 출력해주는 메소드
	void showData() {
		System.out.println("이름: " + name 
				+ ", 가격: " + price);
	}
}









