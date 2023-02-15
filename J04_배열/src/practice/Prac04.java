/* 	메뉴 추첨하기
Q)	먼저 사용자로부터 메뉴 개수를 입력받고,
	요리이름 한 단어를 메뉴로 입력받아 배열에 저장합니다.
	배열의 초기화를 마치고 나면 무작위로 1가지 메뉴를 추첨하여 화면에 출력합니다.
	
	↓ Console ↓
	메뉴 개수 입력: 5
	메뉴: 김밥
	메뉴: 라면
	메뉴: 떡볶이
	메뉴: 짜장면
	메뉴: 순대국
	추첨중입니다...
	추첨된 메뉴은 떡볶이 입니다.
	
	Tip) Random rd = new Random(); 
	ex) 0~9 중에서 랜덤한 정수 출력: rd.nextInt(10)
*/
package practice;

import java.util.Random;
import java.util.Scanner;

public class Prac04 {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 개수 입력: ");
		int size = sc.nextInt();
		String[] menu = new String[size];
		
		for (int i = 0; i < size; i++) {
			System.out.print("메뉴: ");
			menu[i] = sc.next();
		}
		
		System.out.println("추첨중입니다...");
		Thread.sleep(3000); //3초대기
		
		Random rd = new Random();
		int random = rd.nextInt(menu.length);
		System.out.println("추첨된 메뉴는 " +menu[random]+"입니다.");
		
	}
}











