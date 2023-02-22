/*
Q)	주어진 Building 클래스를 상속하여 
	다음 클래스들을 구현하고 객체를 테스트보자.
	필드 값은 메소드로 초기화하고, 자식 클래스의 setData() 
	메소드는 부모 클래스의 메소드를 오버로딩하여 구현해보자.
		
	Hotel 클래스
	@필드: 이름, 가격, vip룸 수
	@메소드: setData, showHotel
				
	Apart 클래스
	@필드: 이름, 가격, 층수
	@메소드: setData, showApart
		
	↓ Console ↓	
	이름: 신라호텔
	가격: 100
	vip룸 수: 20

	이름: 아크로리버
	가격: 20
	층수: 25	
*/
package practice01;

public class Prac01 {
	public static void main(String[] args) {
		Hotel ho = new Hotel();
		ho.setData("신라호텔", 100, 20);
		ho.showHotel();
		System.out.println();
		
		Apart apt = new Apart();
		apt.setData("아크로리버", 20, 25);
		apt.showApart();
	}
}





