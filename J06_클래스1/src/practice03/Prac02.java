/*
Q1)	사각형 정보를 나타내는 Rectangle 클래스를 작성해보고 테스트해보자.
	직사각형의 밑변과 높이를 필드로 가지고, 
	생성자와 매개변수로 필드를 초기화하는 생성자를 하나 가진다.
	직사각형의 넓이와 둘레 값을 리턴하는 메소드도 하나씩 가진다.
	
	@필드 (private int)
	width: 밑변
	height: 높이
	
	@생성자
	Rectangle(?): 밑변과 높이를 초기화하고, 
				  사각형 정보를 출력하는 코드도 포함한다.
	@메소드
	getArea(): 넓이를 리턴
	getRound(): 둘레를 리턴
	
	이와 같은 Rectangle 클래스로 객체를 만들어서 나타낼 실행 결과는 다음과 같다.
	
	↓ Console ↓
	크기가 10x20인 직사각형 생성
	넓이: 200
	둘레: 60

Q2) Q1에서의 Rectangle 클래스에서 정사각형 정보를 담고 싶은 경우의
 	생성자를 추가해보고 테스트해보자.
 	
 	@생성자 오버로딩
 	Rectangle(?): 밑변과 높이를 같은값을 받아서 초기화하고, 
 				  정사각형 정보를 출력하는 코드도 포함한다.
 	
 	↓ Console ↓
 	한 변의 길이가 30인 정사각형 생성
	넓이: 900
	둘레: 120

*/
package practice03;

public class Prac02 {
	public static void main(String[] args) {
		//Q1
		Rectangle rec1 = new Rectangle(10,20); 
		System.out.println("넓이: " + rec1.getArea());
		System.out.println("둘레: " + rec1.getRound());
		System.out.println("========================");
		
		//Q2
		Rectangle rec2 = new Rectangle(30);
		System.out.println("넓이: " + rec2.getArea());
		System.out.println("둘레: " + rec2.getRound());
	}
}










