/*
Q)  사용자로부터 정수를 입력받아서 계속 더하는 프로그램을 작성하자. 
	사용자가 0을 입력하면 지금까지 입력된 모든 정수의 합계를 출력한다.

    ↓ Console ↓
	정수 입력: 10
	정수 입력: 20
	정수 입력: 30
	정수 입력: 0
	합계: 60

*/
package practice_While;

import java.util.Scanner;

public class Prac02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
			System.out.print("정수 입력: ");
			int num = sc.nextInt();
			sum += num; 
			if(num == 0) {
				break;
			}
		}
		
		System.out.println("합계: " + sum);
	}
}














