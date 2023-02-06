/*
Q)	세자리로 이루어진 숫자를 입력받고, 각각의 자리수를 분리해서 출력해보자

    ↓ Console ↓
	정수를 입력하시오: 382
	백의 자리수는 3
	십의 자리수는 8
	일의 자리수는 2

*/
package practice;

import java.util.Scanner;

public class Prac06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		int num = sc.nextInt();
		System.out.println("백의 자리수는 " + num/100);
		System.out.println("십의 자리수는 " + (num/10)%10);
//		System.out.println("십의 자리수는 " + (num%100)/10);
		System.out.println("일의 자리수는 " + num%10);
	}
}


















