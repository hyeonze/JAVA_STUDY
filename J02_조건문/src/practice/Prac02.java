/*
Q)  3개의 점수를 입력받고 점수들의 평균값이 70점 이상이면 ‘합격’
    아니면 ‘불합격’을 출력하시오.

    ↓ Console ↓
	점수1 입력: 60
	점수2 입력: 70
	점수3 입력: 75
	결과: 불합격

*/
package practice;

import java.util.Scanner;

public class Prac02 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.print("점수1 입력: ");
		int score1 = sn.nextInt();
		System.out.print("점수2 입력: ");
		int score2 = sn.nextInt();
		System.out.print("점수3 입력: ");
		int score3 = sn.nextInt();
		
		double avg = (score1+score2+score3)/3.0;
		
		System.out.print("결과: ");
		if(avg>=70) {
			System.out.println("합격");
		}else {//avg<70
			System.out.println("불합격");
		}
	}
}











