/*
Q)	다음과 같은 Human 클래스를 생성하고 객체를 만들어서
 	멤버 메소드를 실행시켜보자. 
	  
 	
	Human 클래스 구성
	{
		@멤버변수
		이름, 생일(연도)
	
		@메소드
		인사하기: 인사말을 출력
		자기소개 하기: "제 이름은 OOO입니다." 라고 출력
		나이 알려주기: 생일(연도)을 이용해서 나이를 계산하여 
					"올해로 OO세 입니다."라고 출력
	}
	
	↓ Console ↓
	반갑습니다!
	제 이름은 최현입니다.
	올해로 24세 입니다.

*/
package practice01;

public class Prac02 {
	public static void main(String[] args) {
		Human h = new Human();
		h.name = "김향기";
		h.birth = 2000;
		
		h.hello();
		h.introduce();
		h.age();
	}
}












