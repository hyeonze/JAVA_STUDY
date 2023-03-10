/* 메소드 선언하기(method declaration)
# 메소드 입출력 흐름
(입력) -> 메소드 -> (출력)
(매개변수) -> 메소드 -> (리턴값)

# 메소드 구성 경우의수
리턴값	매개변수		메소드 선언
X		X			void func(){}
O		X			int func(){return 10;}
X		O			void func(int num){}
O		O			int func(int num){return 10;}

# 메소드 만들고 사용하기
1. 만들려는 메소드의 기능을 결정한다.
2. 기능에 맞는 메소드이름을 정한다.
3. 리턴타입(출력)과 매개변수(입력) 구성을 고려하여 메소드를 만든다.
4. 메소드이름과 매개변수를 입력하여 메소드를 사용한다.

매개변수(parameter): 메소드 선언시 ()안에 필요한 변수. variable
인자(argument): 메소드 호출시 전달되는 데이터(값). value
("인자" = "인수" = "매개값")

*/
package contents;

public class C02_Declaration {
	//Case1) 리턴X, 매개변수X 메소드
	//	예제: "안녕하세요" 문자열을 5번 출력하는 메소드를 만들고 실행하시오.
	static void printHello() {
		for (int i = 0; i < 5; i++) {
			System.out.println("안녕하세요");
		}
	}
	
	//Case2) 리턴O, 매개변수X 메소드
	//	예제: "감사합니다" 문자열을 반환하는 메소드를 만들고 출력문으로 호출하여 확인하시오.
	static String thank() {
		return "감사합니다";
	}
	
	//Case3) 리턴X, 매개변수O 메소드
	//	예제: 매개값으로 문자열과 숫자를 입력받고,
	//		 받은 숫자의 횟수만큼 받은 문자열 내용을 출력하는 메소드를 작성하고 실행하시오.
	static void repeatMsg(String str, int times) {
		for (int i = 0; i < times; i++) {
			System.out.println(str);
		}
	}
	
	//Case4) 리턴O, 매개변수O 메소드
	//	예제: 매개변수로 세 정수를 입력받고 평균값을 리턴하는 메소드를 작성하고 실행하시오.
	static double average(int a, int b, int c) { //a,b,c는 매개변수(parameter)
		return (a+b+c)/3.0;
	}
	
	//예제: 정수 배열을 매개값으로 받아 평균을 리턴하는 메소드를 선언
	static double arrAverage(int[] arr) {//arr은 매개변수
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return (double)sum/arr.length;
	}
	
	public static void main(String[] args) {
		System.out.println("=====Case1=====");
		printHello();
		
		System.out.println("=====Case2=====");
		System.out.println(thank());
		String msg = thank();
		System.out.println(msg);
		
		System.out.println("=====Case3=====");
		repeatMsg("2월의 절반", 4);
		
		System.out.println("=====Case4=====");
		double avg = average(5, 10, 20); //5, 10, 20은 인자(argument)
		System.out.println("세 수의 평균: " + avg);
		
		int[] num1 = {5, 10, 20};
		System.out.println("num1배열의 평균: " + arrAverage(num1));//num1은 인자
		
		int[] num2 = { 10, 20, 30, 40, 50, 60 };
		System.out.println("num2배열의 평균: " + arrAverage(num2));//num2는 인자
	}
}






