/*
# 변수(variable)
데이터를 저장하는 메모리 공간에 이름을 붙임
변수를 생성할 때 2가지 필요
- 자료형(DataType): int, double, String..
- 변수명

# 변수 선언과 초기화
1. 변수 선언
변수의 자료형과 이름을 만드는 작업
	자료형 변수명;
	
2. 초기화
할당받은 변수공간에 최초로 데이터값을 넣는 작업
	변수명 = 데이터;
	
0. 변수 선언과 동시에 초기화
 	자료형 변수명 = 데이터;
 	
# 변수명 작성규칙
1) 알파벳, 숫자, 한글, '_', '$'로 구성
2) 대소문자 구분함
3) 숫자로 시작할 수 없음 ex) 24hour
4) 공백이나 특수기호 사용불가 ex) @, #
5) 자바 예약어 사용불가 ex) public, class
+) 변수 이름: 첫문자를 소문자 시작 원칙.
   상수 이름: 전부 대문자 원칙
   
# 상수(constant)
항상 같은 값을 저장하는 공간. 데이터값 변경X

*/
package contents;

public class C01_Variable {
	public static void main(String[] args) {
		/* 변수 선언과 초기화 */
		int num1; //변수 선언
		num1 = 10; //변수 초기화
		System.out.println(num1); //num1의 데이터값 출력
		
		int num2 = 20; //변수 선언과 동시에 값을 초기화
		System.out.println(num2);
		
		num2 = 30; //변수값 변경
		System.out.println(num2);
		
		num2 = num1; //변수에 다른 변수값 대입
		System.out.println(num2);
		
		int num3 = num1; //변수 초기화값을 다른 변수값으로 저장
		System.out.println(num3);
		System.out.println("=======");
		
//		num4 = 50; 에러: 자료형이 선언되어 있지 않음
		int num4 = 50;
		
		int a, b, c;//같은 자료형의 변수 여러개를 동시에 선언
		a = 100;
		b = 200;
		c = a + b;
		System.out.println(c);
		System.out.println(a+b);
		System.out.println(a-b);
		
		/* 변수 작명 규칙 */
		int show_me_the_$;
		int 한글도가능하지만;
//		int 2someplace; 숫자시작X
//		int ko rea; 공백X
//		int mail@naver; 특수기호X
//		int public; 자바 예악어X
		
		/* 여러개 단어로 변수명 만들때 */
		int icecream_waffle; //단어 사이에 언더바(_)
		int chocoWaffle; //두번째 단어 대문자 시작
	}
}













