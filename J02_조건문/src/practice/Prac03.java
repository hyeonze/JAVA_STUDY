/*
Q1) 자연수를 입력받아서 홀수인지 짝수인지 판별하여 출력하시오.

    ↓ Console ↓
	자연수를 입력하세요: 30
	짝수입니다.

Q2) Q1의 코드를 그대로 이용하여 다음을 구현하시오.
    사용자로부터 두번째 자연수를 입력 받아서 
    두 자연수의 합과 차를 구하여 출력하시오.
    단, 두 수의 차는 결과값이 양수가 나오도록 출력하시오.

    ↓ Console ↓
    자연수를 입력하세요: 30
	짝수입니다.
	두번째 자연수를 입력하세요: 50
	두 자연수의 합은 80
	두 자연수의 차는 20

*/
package practice;

import java.util.Scanner;

public class Prac03 {
	public static void main(String[] args) {
		//Q1
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수를 입력하세오: ");
		int num1 = sc.nextInt();
		if(num1 % 2 == 0) {
			//어떤 수를 2로 나눈 나머지가 0이면 짝수
			System.out.println("짝수입니다.");
		}else {//num1 % 2 == 1
			//어떤 수를 2로 나눈 나머지가 1이면 홀수
			System.out.println("홀수입니다.");
		}
		
		//Q2
		System.out.print("두번째 자연수를 입력하세요: ");
		int num2 = sc.nextInt();
		
		System.out.println("두 자연수의 합은 " + (num1+num2));
		if(num1 - num2 >= 0) {
			System.out.println("두 자연수의 차는 " + (num1-num2));
		}else { //num1 - num2 < 0
			System.out.println("두 자연수의 차는 " + (num2-num1));
		}
		
		//if문 하나만 사용
		int sub = num1 - num2;
		if (sub < 0) {
//			sub = num2 - num1;
			sub = -sub;
		}
		
		System.out.println("두 자연수의 차는 " + sub);
	}
}

















