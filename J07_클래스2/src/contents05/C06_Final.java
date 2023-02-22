/*
# final
final 변수는 한 번 초기값이 저장되면 이후에 수정 불가능
	final 타입 변수명;

# 상수 선언
	static final 타입 상수명 = 초기값;
	
상수명은 모두 대문자로 작성하는 것이 원칙

*/
package contents05;

public class C06_Final {
	static final int TEN = 10; //상수 선언
	
	public static void main(String[] args) {
		/* final 키워드 */
		Last order = new Last(5);
		System.out.println(order.b);
		System.out.println(order.c);
		
//		order.c = 50; //에러: 초기화된 final변수는 수정 불가
		
		final int k;
		k = 10;
//		k = 20; 에러: final변수 값 변경 불가
		
		/* 상수 사용하기 */
		System.out.println(order.PI);
		System.out.println(Last.PI);
		
		int[] arr = new int[TEN];
		System.out.println(arr.length);
		
		//int타입으로 사용할 수 있는 정수의 최대값, 최소값이
		//Integer클래스에 상수로 선언되어 있다.
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		System.out.println("MAX_VALUE: " + max);
		System.out.println("MIN_VALUE: " + min);
//		int check = 2147483648;
	}
}






