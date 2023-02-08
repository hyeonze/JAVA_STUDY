/*
Q)  사용자가 입력한 자연수의 모든 약수를 출력하는 프로그램을 작성하시오.

	↓ Console ↓
    자연수 입력: 60
    1 2 3 4 5 6 10 12 15 20 30 60
    
*/
package practice_For;

import java.util.Scanner;

public class Prac04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 입력: ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}










