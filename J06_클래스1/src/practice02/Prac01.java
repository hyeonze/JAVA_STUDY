/* 	��հ������ε�
	Tester Ŭ������ ��ü�� �����ϰ� getAverage() �޼ҵ带 ȣ���ؼ� 
	�Ű����� �ܼ� ȭ�鿡 ����ϰ��� �Ѵ�. 
	getAverage()�� �Ű����� 2��, 3��, 4���� ���� �� �� �ְ� ����Ÿ���� �Ǽ��̴�.
	Tester Ŭ�������� getAverage() �޼ҵ带 �����ϰ� �ڵ带 �����Ͻÿ�.

 	Tester Ŭ���� 
 	{
 		@�޼ҵ� �����ε�
 		getAverage(�Ű�����)
 	}

	�� Console ��
	2���� ���: 87.5
	3���� ���: 70.0
	4���� ���: 76.25
*/
package practice02;

public class Prac01 {
	public static void main(String[] args) {
		int kor = 80;
		int eng = 95;
		int math = 35;
		int comp = 95;
		Tester t = new Tester();
		
		System.out.println("2���� ���: " + t.getAverage(kor, eng));
		System.out.println("3���� ���: " + t.getAverage(kor, eng, math));
		System.out.println("4���� ���: " + t.getAverage(kor, eng, math, comp));
		
	}
}





