/*
Q)	두 개의 정수를 입력받고,	첫 번째 정수를 두 번째 정수로 나누었을떄
	몫과 나머지를 구해보자. 

    ↓ Console ↓
	첫 번째 정수를 입력하시오: 10
	두 번째 정수를 입력하시오: 3
	두 수를 나눈 몫은 3이고 나머지는 1입니다.
*/
package practice;

import java.util.Scanner;

public class Prac05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하시오: ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력하시오: ");
		int num2 = sc.nextInt();
		
		System.out.println("두 수를 나눈 몫은 " +num1/num2 + "이고 나머지는 " + num1%num2 +"입니다.");
	}
}







