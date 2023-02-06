/*
# 타입 변환(Casting)
("타입변환" = "캐스팅" = "자료형 변환" = "형변환")
변수의 타입을 변환시킨다.
	(자료형)데이터
	
자료형 범위: byte < short/char < int < long < float < double

1. 자동 타입 변환(업캐스팅)
	큰 범위 타입 <= 작은 범위 타입
작은 타입을 큰 타입에 저장할 때 자동으로 타입이 변환된다. 

2. 수동 타입 변환(다운캐스팅, 강제 타입 변환)
	작은 범위 타입 <= (타입변환)큰 범위 타입
큰 타입을 작은 타입에 저장할 때 사용자가 수동으로 (타입변환)을 작성해야 한다.
타입 변환을 안하고 저장하다면 에러.
=> 타입변환시 데이터값도 함께 변경됨을 주의!

3. 문자열 형태의 숫자를 정수 또는 실수로 변환
	int numI = Integer.parseInt(str1);
String 타입은 수치 데이터가 아니기 때문에 cast연산자를 사용X
Wrapper클래스의 기능을 이용

*/
package contents;

public class C05_Casting {
	public static void main(String[] args) {
		/* 1. 자동 타입 변환 */
		double a = 1; //정수 1을 double타입에 대입
		System.out.println(a); //실수(1.0)으로 자동 타입 변환
		
		int num1 = 20;
		double num2 = num1; //자동으로 타입이 변환되어 저장된다.
		System.out.println(num2);
		
		int b = 'A'; //단일문자를 숫자로 자동 타입 변환하여 저장
		System.out.println(b); //문자A는 아스키코드 값으로 65
		System.out.println("======");
		
		/* 2. 수동 타입 변환 */
		int c;
//		c = 1.5; 에러: int타입은 정수만 저장할 수 있기 때문
		c = (int)1.5; //강제로 타입 변환을 해서 대입해야 한다. 
		System.out.println(c); //소수점 이하 버림, 데이터 손실 발생
		
		/* cast연산자 이용 */
		int numA = 10;
		int numB = 4;
		double numC = numA / (double)numB;
		System.out.println(numC);
		System.out.println("=======");
		
		/* 3. 문자열 숫자를 정수 또는 실수로 변환 */
		String str1 = "100";
//		int numI = str1; 에러: 타입 불일치
		
		int numI = Integer.parseInt(str1);
		System.out.println(numI+50);
		
		String str2 = "12.34";
		double numD = Double.parseDouble(str2);
		System.out.println(numD+0.5);
		
		System.out.println(str1 + str2); //문자열 이어붙임
		System.out.println(numI + numD); //숫자 덧셈
	}
}







