/*
# 관계연산자(비교연산자)
>, >=, <, <=, ==, !=
두 값을 비교한 결과를 참 또는 거짓으로 제공한다.

== : 서로 같다. 
!= : 서로 다르다. 

a == b : a와 b가 같으면 true, 다르면 false
a != b : a와 b가 다르면 true, 같으면 false

*/
package contents;

public class C06_OperatorCompare {
	public static void main(String[] args) {
		//논리타입 boolean은 true, false 나타낸다.
		
		/* 관계연산자 확인하기 */
		int n = 10;
		
		boolean b1 = n > 5;
		System.out.println("b1 = " + b1);
		
		boolean b2 = n <= 18;
		System.out.println("b2 = " + b2);
		
		boolean b3 = n == 9;
		System.out.println("b3 = " + b3);
		
		boolean b4 = n != 9;
		System.out.println("b4 = " + b4);
		
		System.out.println(100>50);
		System.out.println(100!=50);
	}
}






