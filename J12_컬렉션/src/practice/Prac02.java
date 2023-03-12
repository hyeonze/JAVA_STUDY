/*	로또 당첨번호 뽑기
Q1) 1~45 자연수에서 서로 중복되지 않는 6개의 로또 번호를 뽑아서
 	배열에 저장하고 낮은 번호부터 순서대로 출력하시오.
 	Tip) 이중for문을 이용하여 중복 없이 번호를 저장해보자. 
 	
 	↓ Console ↓	
 	- 로또 당첨번호 - 		
	8 15 21 31 36 43 

Q2) 1~45 자연수에서 서로 중복되지 않는 6개의 로또 번호를 뽑아서
 	Set에 저장하고 낮은 번호부터 순서대로 출력하세요.
 
 	↓ Console ↓	
	- 로또 당첨번호2 -
	11 24 38 41 43 44 
*/
package practice;

import java.util.Random;
import java.util.TreeSet;

public class Prac02 {
	public static void main(String[] args) {
		Random rd = new Random();
		
		//Q1)
		System.out.println("- 로또 당첨번호 -");
		//배열에 로또 번호 저장
		int[] num = new int[6];
		for (int i = 0; i < num.length; i++) {
			num[i] = rd.nextInt(45) + 1;
			for(int j = 0; j < i; j++) {
				if(num[i] == num[j]) {
					i--;//i값을 -1 되돌려서 랜덤번호를 새로 뽑아 저장한다.
					break;
				}
			}
		}
		
		//배열값 오름차순으로 정렬하여 저장하기
		for (int i = 0; i < num.length; i++) {
			for(int j = i + 1; j < num.length; j++) {
				if(num[i] > num[j]) {//오름차순 정렬 조건
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		for(int number : num) {
			System.out.print(number + " ");
		}
		System.out.println();
		
		//Q2
		//Set에 로또번호 저장
		System.out.println("- 로또 당첨번호2 -");
		TreeSet<Integer> lotto = new TreeSet<>();
		
		while(true) {
			int randNum = rd.nextInt(45) + 1;
			lotto.add(randNum);
			
			//Set은 데이터 중복이 안되기 때문에
			//6개 수는 자동적으로 서로 겹치지 않는 번호로 저장
			if(lotto.size()==6) {
				break;
			}
		}
		
		for(int k : lotto) {
			System.out.print(k + " ");
		}
	}
}





