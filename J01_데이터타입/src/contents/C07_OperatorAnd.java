/*
# 논리연산자
&&, ||, !
조건식에 대한 결과를 참 또는 거짓으로 제공한다.

&&: 논리곱 연산자(AND)
	양쪽 조건식이 모두 참인 경우 => 결과도 참

||: 논리합 연산자(OR)
	하나의 조건식이라도 참인 경우 => 결과도 참
	
! : 부정 연산자(NOT)
	뒤 조건식의 결과를 뒤집음
	

조건식	연산자	조건식	AND(&&)		OR(||)
true	@@		true	true		true
false	@@		true	false		true
true	@@		false	false		true
false	@@		false	false		false

*/
package contents;

public class C07_OperatorAnd {
	public static void main(String[] args) {
		/* 논리연산자 확인하기 */
		int music = 90;
		int art = 70;
		
		boolean p1 = music > 80; //참
		boolean p2 = art > 80; //거짓
		
		System.out.println("p1&&p2: " + (p1&&p2)); //참&&거짓 연산
		System.out.println("p1||p2: " + (p1||p2)); //참||거짓 연산
		System.out.println("!p1: " + !p1); //!참 연산
		System.out.println("!p2: " + !p2); //!거짓 연산
		
		System.out.println(20 > 10 && 20 == 10); //참&&거짓 연산
		System.out.println(20 > 10 || 20 == 10); //참||거짓 연산
		System.out.println(!(20 > 10)); //!참 연산
	}
}












