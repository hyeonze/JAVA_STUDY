/*
Q)	주사위를 2개 던지는 코드를 랜덤클래스를 이용하여 구현하고,
	두 개의 주사위 합계에 따라 아래와 같은 결과를 나타내도록 코드를 작성하시오.

	<경우의 수>			<결과>
	합계가 짝수일 경우		짝! 
	합계가 홀수일 경우		홀! 
	두 눈이 같을 경우 		더블! 

	↓ Console1 ↓
	주사위1: 4
	주사위2: 6
	짝!
	
	↓ Console2 ↓
	주사위1: 5
	주사위2: 5
	더블!
*/
package practice;
import java.util.Random;
public class Prac07 {
	public static void main(String[] args) {
		Random rd = new Random();
		int dice1 = rd.nextInt(6) + 1;
		int dice2 = rd.nextInt(6) + 1;
		
		int total = dice1 + dice2;
		
		System.out.println("주사위1: " + dice1);
		System.out.println("주사위2: " + dice2);
		
		if (dice1 == dice2) {
			System.out.println("더블!");
		} else if (total % 2 == 0) {
			System.out.println("짝!");
		} else {
			System.out.println("홀!");
		}
	}
}











