package contents03;

//기본 생성자만 가지고 있는 클래스
public class Waffle01 {
	//와플 정보: 이름, 가격
	String name;
	int price;
	
	//기본 생성자가 자동으로 생성되어 포함되어 있다.
	//Waffle01(){}
	
	//기본 생성자의 실행문을 사용자가 직접 정의
	Waffle01(){
		System.out.println("기본 생성자 작동");
	}
	
	//멤버변수를 초기화할 메소드
	void setData(String n, int p) {
		name = n;
		price = p;
	}
	
	//멤버변수 정보를 출력해주는 메소드
	void showData() {
		System.out.println("이름: " + name 
				+ ", 가격: " + price);
	}
}







