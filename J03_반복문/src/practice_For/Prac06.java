/*
Q1) �Ʒ��� ���� ������ ��(*)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

*
**
***
****
*****

Q2) �Ʒ��� ���� ������ ��(*)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

    *
   **
  ***
 ****
*****

i��°��:	1	2	3	4	5	i
blank:	4	3	2	1	0	(5-i)��
star :	1	2	3	4	5	i��

Q3) �Ʒ��� ���� ������ ��(*)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.


*****
****
***
**
*

i��°��:	1	2	3	4	5	i
star :	5	4	3	2	1	(6-i)��
blank:  0	1	2	3	4	(i-1)��

��������) �Ʒ��� ���� ������ ��(*)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
        
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
		
		//��������
		//n��° �ٿ��� ���� ������ (2n-1)��
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












