/* 
Q)  ����ڰ� ��ȣ���� ������ �Է��ϸ� R, G, Y ������ ���Ͽ�
    ������!��,������~��,�����ǡ��� ���� ��Ʈ�� ����ϴ� ���α׷��� ����ÿ�. 
    ��, ��ҹ��� ��� �ν��ϵ��� �ۼ��Ͻÿ�.
	
	�� Console ��
	��ȣ���� ���� �Է�(R, G, Y): r
	����!
	
	Tip)
	Scanner sc = new Scanner(System.in);
	System.out.print("��ȣ���� ���� �Է�(R, G, Y): ");
	char sign = sc.next().charAt(0);

*/

package practice;

import java.util.Scanner;

public class Prac01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȣ���� ���� �Է�(R, G, Y): ");
		char sign = sc.next().charAt(0);
		
		if(sign == 'R' || sign == 'r') {
			System.out.println("����!");
		}
		
		if(sign == 'G' || sign == 'g') {
			System.out.println("����~");
		}
		
		if(sign == 'Y' || sign == 'y') {
			System.out.println("����");
		}
	}
}









