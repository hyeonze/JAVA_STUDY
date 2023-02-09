/*
Q)  다음처럼 막대그래프를 그려보자. (무한루프 사용)
    단, -1을 입력하면 프로그램을 종료한다.

    ↓ Console ↓
    숫자를 입력하시오: 5
    *****
    숫자를 입력하시오: 10
    **********
    숫자를 입력하시오: -1
    프로그램을 종료합니다.

*/
package practice_While;

import java.util.Scanner;

public class Prac01 {
	public static void main(String[] args) {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자를 입력하시오: ");
			int length = sc.nextInt();
			for (int i = 0; i < length; i++) {
				System.out.print("*");
			}
			if(length==-1) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.println();
		}
		
		
	}
}












