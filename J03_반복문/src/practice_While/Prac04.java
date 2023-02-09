/*
Q)	업다운 게임을 만들어 봅시다.
	랜덤으로 1~100 사이의 정답 숫자를 미리 만들어 놓고,
	사용자가 숫자를 입력하여 정답을 맞추도록 코드를 작성하시오.
	
	<게임의 상태>
	[업] 사용자가 정답보다 낮은 값을 입력한 경우
	[다운] 사용자가 정답보다 높은 값을 입력한 경우
	[정답] 사용자가 정답과 같은 값을 입력한 경우 => 게임 종료 
	
	사용자가 정답을 입력하기 전까지 무한반복을 한다.
	게임 종료시 총 입력한 횟수를 화면에 출력한다.
	
	↓ Console ↓
	숫자 입력: 50
	[다운]
	숫자 입력: 25
	[업]
	숫자 입력: 37
	[업]
	숫자 입력: 43
	[다운]
	숫자 입력: 40
	[다운]
	숫자 입력: 38
	[정답]
	시도한 총 횟수 = 6
*/
package practice_While;

import java.util.Random;
import java.util.Scanner;

public class Prac04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int answer = rd.nextInt(100) + 1;
		int count = 0;
		
		while(true) {
			System.out.print("숫자 입력: ");
			int num = sc.nextInt();
			count++;
			
			if (answer > num) {
				System.out.println("[업]");
			} else if (answer < num) {
				System.out.println("[다운]");
			} else {
				System.out.println("[정답]");
				break;
			}
		}
		System.out.println("시도한 총 횟수 = " + count);
	}
}












