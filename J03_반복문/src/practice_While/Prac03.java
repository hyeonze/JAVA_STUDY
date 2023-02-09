/*
Q)  반복적으로 사용자에게 문자를 입력받아서 ‘a’가 나오면 카운터를 하나씩 증가한다.
    사용자가 ‘.’을 입력하면 반복을 종료하고 입력된 ‘a’의 총개수를 출력한다. 

    ↓ Console ↓
	문자를 입력하시오(종료는 . 입력): a
	문자를 입력하시오(종료는 . 입력): b
	문자를 입력하시오(종료는 . 입력): a
	문자를 입력하시오(종료는 . 입력): e
	문자를 입력하시오(종료는 . 입력): a
	문자를 입력하시오(종료는 . 입력): t
	문자를 입력하시오(종료는 . 입력): .
	문자 a를 3개 입력 받았습니다.

	Tip) 단일 문자 입력받기: char ch = sc.next().charAt(0);
*/

package practice_While;

import java.util.Scanner;

public class Prac03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while(true) {
			System.out.print("문자를 입력하시오(종료는 . 입력): ");
			char ch = sc.next().charAt(0);
			if(ch=='a') {
				count++;
			}else if(ch=='.') {
				break;
			}
		}
		
		System.out.println("문자 a를 "+count+"개 입력 받았습니다.");
	}
}












