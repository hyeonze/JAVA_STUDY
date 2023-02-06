/*
# if조건문
조건식의 결과가 참이면 내부 실행문들을 수행

	if(조건식){
		실행문1
		실행문2
		...
	}
*/
package contents;

import java.util.Scanner;

public class C01_If {
	public static void main(String[] args) {
		/* if문 실행조건 */
		int a = 10;
		if(a > 5) {
			//조건식이 참일 경우 실행할 공간, 거짓이면 실행X
			System.out.println("조건문이 참입니다.");
		}
		System.out.println("조건문 끝나고 실행하는 문장");
		
		/* 비교연산자와 if문 */
		int num1 = 10;
		if (num1 >= 50) {
			System.out.println("num1이 50보다 크거나 같습니다.");
		}
		if (num1 < 50) {
			System.out.println("num1이 50보다 작습니다.");
		}
		
		int num2 = 200;
		if(num2==100) {//'==' : 서로 같음?
			System.out.println("num2의 값은 100입니다.");
		}
		if(num2!=100) {//'!=' : 서로 다름?
			System.out.println("num2의 값은 100이 아닙니다.");
		}
		
		/* 논리연산자와 if문 */
		int num3 = 20;
		if(num3>=50 && num3<=100) { //'&&': AND, 그리고
			System.out.println("num3는 50이상이면서 100이하의 수입니다.");
		}
		if(num3<50 || num3>100) {//'||': OR, 또는
			System.out.println("num3는 50보다 작거나 100보다 큰 수입니다.");
		}
		
		/* 조건문에 boolean값을 직접 넣을 경우 */
		if(true) {
			System.out.println("무조건 실행");
		}
		
		if(false) {
			System.out.println("실행하지 않는 공간");
			System.out.println("노란색 경고 메세지");
		}
		
		/* 실행문이 한 줄일때 {}생략가능 */
		if(num3>0) System.out.println("한줄짜리 실행문");
		
		//예제: 점수를 입력받아서 if문으로 합격여부 출력하기 (기준:50점)
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력: ");
		int score = sc.nextInt();
		if(score>=50) {
			System.out.println("합격입니다.");
		}
		if(score<50) {
			System.out.println("불합격입니다.");
		}
		
		
		
	}
}











