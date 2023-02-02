/*
Q)	정보를 입력받아서 자기소개 출력하기
	변수(타입): 이름(문자열), 나이(정수), 시력(실수), 취미(문자열)
	사용자로부터 위의 데이터들을 입력받아 변수 각각에 저장하고, 
	출력문을 이용해 자기소개를 나타내보자. 

	↓ Console ↓
	이름을 입력하시오: 최현
	나이를 입력하시오: 21
	시력을 입력하시오: 1.5
	취미를 입력하시오: 유튜브
	========자기소개========
	이름: 최현
	나이: 21
	시력: 1.5
	취미: 유튜브

*/


package practice;

import java.util.Scanner;

public class Prac02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하시오: ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하시오: ");
		int age = sc.nextInt();
		
		System.out.print("시력을 입력하시오: ");
		double sight = sc.nextDouble();
		
		//nextDoube()에서 받은 enter가 입력버퍼에 남아있는 것을 처리
		sc.nextLine();
		
		System.out.print("취미를 입력하시오: ");
		String hobby = sc.nextLine();
		
		System.out.println("========자기소개========");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("시력: " + sight);
		System.out.println("취미: " + hobby);
	}
}

















