/*
Q)  사용자로부터 나이, 키를 입력받은 후,
    나이가 40세 이상이고 키가 175이상이면 "키가 큽니다" 를 출력
    175미만이면 "키가 보통입니다."를 출력,

    나이가 40세 미만이고 키가 180이상이면 "키가 큽니다"를 출력
    180미만이면 "키가 보통입니다."를 출력하시오
    
    ↓ Console ↓
	나이를 입력하세요: 42
	키를 입력하세요: 175
	키가 큽니다.

*/
package practice;

import java.util.Scanner;

public class Prac05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요:");
		int age = sc.nextInt();
		System.out.print("키를 입력하세요:");
		int height = sc.nextInt();
		
		//중첩조건문 사용
		if (age >= 40) {
			if (height >= 175) {
				System.out.println("키가 큽니다.");
			} else {
				System.out.println("키가 보통입니다.");
			}
		} else {
			if (height >= 180) {
				System.out.println("키가 큽니다.");
			} else {
				System.out.println("키가 보통입니다.");
			}
		}
		
		//논리연산자로 if-else문 한번 사용  
		if ((age >= 40 && height >= 175) || (age < 40 && height >= 180)) {
			System.out.println("키가 큽니다.");
		} else {
			System.out.println("키가 보통입니다.");
		}
	}
}






