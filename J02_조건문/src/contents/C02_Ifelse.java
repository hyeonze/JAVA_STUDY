/*
# if - else문
조건식의 결과에 따라서 실행내용을 선택하여 수행

	if(조건식){
		(if조건식이 참이면 실행)
		실행문1
		실행문2
		...
	}
	else{
		(if조건식이 거짓이면 실행)
		실행문3
		실행문4
		...
	}

# if - else if - else 
조건식이 여러개인 경우 사용. else if문은 여러개 작성 가능.
	
	if(조건식A){
		(조건식A가 참이면 실행)
		실행문..
	}
	else if(조건식B){
		(조건식A가 거짓이고 B가 참이면 실행)
		실행문..
	}
	else if(조건식C){
		(조건식 A,B가 거짓이고 C가 참이면 실행)
		실행문..
	}
	...
	else{
		(위의 모든 조건식들이 거짓이면 실행)
		실행문
	}
	
- else문은 마지막에 한번만 작성 가능
- else문이 있으면 여러 조건문 중 하나는 무조건 시행

*/
package contents;

import java.util.Scanner;

public class C02_Ifelse {
	public static void main(String[] args) {
		/* if-else문 */
		int num1 = -20;
		if (num1 >= 50) {
			//if조건식이 참일 경우 실행할 공간
			System.out.println("num1이 50보다 크거나 같습니다.");
		}
		else{// num1 < 50
			//if조건식이 거짓일 경우 실행할 공간
			System.out.println("num1이 50보다 작습니다.");
		}
		
		//예제: 어떤 수가 3의 배수인지 아닌지 출력하기
		int num = 29;
		if(num % 3 == 0) { //어떤 수를 3으로 나눈 나머지가 0이면 그 수는 3의 배수이다. 
			System.out.println("3의 배수입니다.");
		}else {
			System.out.println("3의 배수가 아닙니다.");
		}
		
		/* else if문 */
		int num2 = 30; 
		if(num2 > 50) {
			System.out.println("num2는 50보다 큽니다.");
		}else if(num2 == 50) {
			System.out.println("num2는 50입니다.");
		}else { //num2 < 50
			System.out.println("num2가 50보다 작습니다.");
		}
		
		//어떤 정수가 양수, 0 중 어디에 해당하는지 출력하기
		int numI = 30;
		if(numI > 0 ) {
			System.out.println(numI+"(은)는 양수입니다.");
		}else if(numI == 0) {
			System.out.println(numI+"(은)는 0입니다.");
		}else {//numI < 0 
			System.out.println(numI+"(은)는 음수입니다.");
		}
		
		//예제: 점수를 입력 받아서 성적 구하기
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int score = sc.nextInt();
		
		if (score >= 90) {
			System.out.println('A');
		} else if (score >= 80) {
			System.out.println('B');
		} else if (score >= 70) {
			System.out.println('C');
		} else if (score >= 60) {
			System.out.println('D');
		} else {// score<60
			System.out.println('F');
		}
		//코드 자동정렬: ctrl + shift + f
		
	}
}









