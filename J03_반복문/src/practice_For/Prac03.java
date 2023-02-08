/*
Q1) 사용자로부터 정수 x, y를 입력받아서
    x에서 y까지의 합을 구하는 프로그램을 작성하시오.

    ↓ Console ↓
	시작정수 입력: 1
	종료정수 입력: 10
	1부터 10까지의 합은 55

Q2) Q1의 코드를 그대로 이용하여 다음을 구현하시오.
	x에서 y까지 4의 배수들만 합한 값을 출력하시오.
	
	↓ Console ↓
	시작정수 입력: 10
	종료정수 입력: 40
	10부터 40까지의 합은 775
	10부터 40까지의 4의 배수들의 합은 208
*/
package practice_For;

import java.util.Scanner;

public class Prac03 {
	public static void main(String[] args) {
		//Q1
		Scanner sc = new Scanner(System.in);
		System.out.print("시작정수 입력: ");
		int x = sc.nextInt();
		System.out.print("종료정수 입력: ");
		int y = sc.nextInt();
		
		int sum = 0;
		for (int i = x; i <= y; i++) {
			sum += i;
		}
		System.out.println(x + "부터 " + y + "까지의 합은 " + sum);
		
		//Q2
		int total = 0;
		for (int i = x; i <= y; i++) {
			if (i % 4 == 0) {
				total += i;
			}
		}
		System.out.println(x + "부터 " + y + "까지 4의 배수들의 합은 " + total);
	}
}












