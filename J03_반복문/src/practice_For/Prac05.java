/*
Q1) 자연수를 입력해서 팩토리얼 값을 구하시오.

  	↓ Console ↓
    팩토리얼 입력: 5
    5! = 120
 
Q2) Q1의 코드를 수정하고 새로운 코드를 추가하여 다음을 구현하시오. 
	자연수를 입력해서 팩토리얼 계산과정과 결과값을 출력하시오.

    예) 
    5를 입력하면
    5 x 4 x 3 x 2 x 1 계산과정을 한줄로 출력하고,
    결과값도 다음줄에 출력한다.

    ↓ Console ↓
	팩토리얼 입력: 5
	5 x 4 x 3 x 2 x 1
	5! = 120
    
    ↓ Console2 ↓
	팩토리얼 입력: 7	
	7 x 6 x 5 x 4 x 3 x 2 x 1
	7! = 5040
    
*/
package practice_For;

import java.util.Scanner;

public class Prac05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("팩토리얼 입력: ");
		int num = sc.nextInt();
		
		//Q1
//		int fac = 1;
//		for (int i = 1; i <= num; i++) {
//			fac *= i ;
//		}
//		System.out.println(num + "! = " + fac);
		
		//Q2
		int fac = 1;
		for (int i = num; i >= 1; i--) {
			System.out.print(i);
			if(i!=1) {
				System.out.print(" x ");
			}
			fac *= i ;
		}
		System.out.println();
		System.out.println(num + "! = " + fac);
	}
}











