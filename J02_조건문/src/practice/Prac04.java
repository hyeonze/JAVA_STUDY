/*
Q)  물건의 가격을 입력 받아 할인율에 따른 할인받는금액을 구하시오.
    5000원 이상은 5%
    10000원 이상은 10%
    50000원 이상은 20%

    ↓ Console1 ↓
	가격 입력: 8000
	할인받는금액: 400
	
	↓ Console2 ↓
	가격 입력: 60000
	할인받는금액: 12000
	
	↓ Console3 ↓
	가격 입력: 3500
	할인받는금액: 0

*/
package practice;

import java.util.Scanner;

public class Prac04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가격 입력: ");
		int price = sc.nextInt();
		double rate;
		
//		if(price >= 5000 && price < 10000) {
//			rate = 0.05;
//		}else if(price >= 10000 && price < 50000) {
//			rate = 0.1;
//		}else if(price >= 50000) {
//			rate = 0.2;
//		}else {//price < 5000
//			rate = 0;
//		}
		
		if(price>=50000) {
			rate = 0.2;
		}else if(price>=10000) {
			rate = 0.1;
		}else if(price>=5000) {
			rate = 0.05;
		}else {//price < 5000
			rate = 0;
		}
		
		//곱셈 연산후 정수로 타입 변환
		int discount = (int)(price*rate);
		
		System.out.println("할인받는금액: " + discount);
		
	}
}














