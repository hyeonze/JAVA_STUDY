/* 	평균값오버로딩
	Tester 클래스로 객체를 생성하고 getAverage() 메소드를 호출해서 
	매개값을 콘솔 화면에 출력하고자 한다. 
	getAverage()의 매개값은 2개, 3개, 4개씩 값을 줄 수 있고 리턴타입은 실수이다.
	Tester 클래스에서 getAverage() 메소드를 선언하고 코드를 실행하시오.

 	Tester 클래스 
 	{
 		@메소드 오버로딩
 		getAverage(매개변수)
 	}

	↓ Console ↓
	2과목 평균: 87.5
	3과목 평균: 70.0
	4과목 평균: 76.25
*/
package practice02;

public class Prac01 {
	public static void main(String[] args) {
		int kor = 80;
		int eng = 95;
		int math = 35;
		int comp = 95;
		Tester t = new Tester();
		
		System.out.println("2과목 평균: " + t.getAverage(kor, eng));
		System.out.println("3과목 평균: " + t.getAverage(kor, eng, math));
		System.out.println("4과목 평균: " + t.getAverage(kor, eng, math, comp));
		
	}
}





