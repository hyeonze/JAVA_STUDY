/*	list
Q)	먼저 주사위를 10번 던진 시행결과를 리스트에 저장하여 출력합니다. 
	그리고 시행한 결과인 1~6의 눈 중에서 제거할 수를 입력 받아 
	리스트에서 해당하는 수를 전부 삭제한 후 최종결과를 출력하시오.  

	↓ Console ↓	
	시행결과: [6, 6, 3, 2, 1, 6, 5, 2, 6, 2]
	제거할 수를 입력하세요: 6
	최종결과: [3, 2, 1, 5, 2, 2]
	
	Tip) 제거하려는 수가 연속해서 나올 경우도 전부 삭제되도록 주의!

*/
package practice;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Prac01 {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		/* 방법1 */
		System.out.println("=====================방법1=====================");
		ArrayList<Integer> dice = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			int dot = rd.nextInt(6) + 1; //1~6사이 랜덤한 수 생성
			dice.add(dot);
		}
		System.out.println("시행결과: " + dice);
		
		//방법2를 사용하기 위한 객체의 값 복사(깊은 복사)
		ArrayList<Integer> dice2 = (ArrayList<Integer>) dice.clone(); 
		
		System.out.print("제거할 수 를 입력하세요: ");
		int del = sc.nextInt();
		
		int checkSize = 10;
		for (int i = 0; i < checkSize; i++) {
			if(dice.get(i) == del) {
				dice.remove(i);
				checkSize--;
				i--;
			}
		}
		System.out.println("최종결과: " + dice);
		
		/* 방법2 */
		System.out.println("=====================방법2=====================");
		System.out.println("시행결과2: " + dice2);
		System.out.println("제거할 수(1과 동일): " + del);
		
		//while문과 contains()메소드 이용
		while(dice2.contains(del)) { //List에 삭제할 수를 포함하고 있으면 계속 반복
			Integer delObj = del; //삭제할 수를 Integer객체로 변환(Integer <- int)
			dice2.remove(delObj); //객체 데이터 삭제
		}
		System.out.println("최종결과2: " + dice2);
		
	}
}





