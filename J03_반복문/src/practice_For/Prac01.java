/* J01 - Prac07 동일 문제
Q)  4개의 정수를 입력받고, 평균값을 계산하여 
	아래 화면처럼 결과가 나오도록 출력해보자

    ↓ Console ↓
	정수를 입력하시오: 10
	정수를 입력하시오: 20
	정수를 입력하시오: 30
	정수를 입력하시오: 40
	평균은 25.0입니다.
	
	↓ Console2 ↓
	정수를 입력하시오: 10
	정수를 입력하시오: 14
	정수를 입력하시오: 18 
	정수를 입력하시오: 20
	평균은 15.5입니다.
*/
package practice_For;

import java.util.Scanner;

public class Prac01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			System.out.print("정수를 입력하시오: ");
//			int num = sc.nextInt();
//			sum += num;
			sum += sc.nextInt();
		}
		
		double avg = sum/4.0;
		System.out.println("평균은 "+avg+"입니다.");
	}
}









