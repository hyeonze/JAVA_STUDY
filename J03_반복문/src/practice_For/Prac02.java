/*
Q)  �������� 4�⿡ �� �� ���ֵ˴ϴ�. for���� ����Ͽ�
    2002~2022����� �� �������� ���ֵǴ� ������ ����Ͻÿ�.

    �� Console ��
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
		System.out.println("���1");
		for (int k = 2002; k <= 2022; k += 4) {
			System.out.println(k);
		}
	
		System.out.println("���2");
		for (int k = 2002; k <= 2022; k++) {
			if ((k-2002) % 4 == 0) { //k % 4 == 2
				System.out.println(k);
			}
		}
	}
}











