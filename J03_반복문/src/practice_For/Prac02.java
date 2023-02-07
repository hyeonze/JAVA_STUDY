/*
Q)  월드컵은 4년에 한 번 개최됩니다. for문을 사용하여
    2002~2022년까지 중 월드컵이 개최되는 연도를 출력하시오.

    ↓ Console ↓
	2002
	2006
	2010
	2014
	2018
	2022

*/
package practice_For;

public class Prac02 {
	public static void main(String[] args) {
		System.out.println("방법1");
		for (int k = 2002; k <= 2022; k += 4) {
			System.out.println(k);
		}
	
		System.out.println("방법2");
		for (int k = 2002; k <= 2022; k++) {
			if ((k-2002) % 4 == 0) { //k % 4 == 2
				System.out.println(k);
			}
		}
	}
}











