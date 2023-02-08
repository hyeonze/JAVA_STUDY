/*
Q1) 아래와 같은 패턴의 별(*)을 출력하는 프로그램을 작성하시오.

*
**
***
****
*****

Q2) 아래와 같은 패턴의 별(*)을 출력하는 프로그램을 작성하시오.

    *
   **
  ***
 ****
*****

i번째줄:	1	2	3	4	5	i
blank:	4	3	2	1	0	(5-i)개
star :	1	2	3	4	5	i개

Q3) 아래와 같은 패턴의 별(*)을 출력하는 프로그램을 작성하시오.


*****
****
***
**
*

i번째줄:	1	2	3	4	5	i
star :	5	4	3	2	1	(6-i)개
blank:  0	1	2	3	4	(i-1)개

도전과제) 아래와 같은 패턴의 별(*)을 출력하는 프로그램을 작성하시오.
        
    *
   ***
  *****
 *******
*********


*/
package practice_For;

public class Prac06 {
	public static void main(String[] args) {
		//Q1
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}System.out.println();
		
		//Q2
		for (int i = 1; i <= 5; i++) {
			//blank + star = 5
			int blank = 5 - i;
			int star = i;
			for (int j = 1; j <= blank; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print("*");
			}
			System.out.println();
		}System.out.println();
		
		//Q3
		for (int i = 1; i <= 5; i++){
			int star = 6-i;
			int blank = i-1;
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
//			for (int k = 1; k <= blank; k++) {
//				System.out.print(" ");
//			}
			System.out.println();
		}
		
		//도전문제
		//n번째 줄에서 별의 개수는 (2n-1)개
		for (int n=1;n<=5;n++) {
			int star = 2*n-1;
			int blank = 5 - n;
			
			for (int k = 1; k <= blank ; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}












