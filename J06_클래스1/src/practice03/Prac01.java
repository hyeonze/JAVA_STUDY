/*
Q)	원의 정보를 나타내는 Circle 클래스를 작성해보고 테스트해보자.
	원의 반지름을 필드로 가지고 
	생성자와 매개변수로 원의 반지름을 초기화하는 생성자를 가진다.
	원의 정보를 출력하는 메소드를 가진다. 
	
	@필드 private int
	radius: 원의 반지름
	
	@생성자
	Circle(?): 원의 반지름을 초기화한다. 
	
	@메소드
	showInfo(): 원의 반지름과 넓이 정보를 출력한다.
	
	이와 같은 Circle 클래스로 객체를 만들어서 나타낼 실행 결과는 다음과 같다.
	
	↓ Console ↓
	원의 반지름: 5
	원의 넓이: 78.5

*/

package practice03;

public class Prac01 {
	public static void main(String[] args) {
		Circle c = new Circle(5);
		c.showInfo();
	}
}











