/*
	Printer Ŭ������ ��ü�� �����ϰ� print() �޼ҵ带 ȣ���ؼ� 
	�Ű����� �ܼ� ȭ�鿡 ����ϰ��� �Ѵ�. 
	print()�� �Ű������δ� int, boolean, double, String ���� 
	�� �� �ְ� ���ϰ��� ����.
	Printer Ŭ�������� print() �޼ҵ带 �����ϰ� �ڵ带 �����Ͻÿ�.
 
 	Printer Ŭ���� 
 	{
 		@�޼ҵ� �����ε�
 		print(�Ű�����)
 	}
 	
 	�� Console ��
 	100
	true
	3.14
	����
*/
package practice02;

public class Prac02 {
	public static void main(String[] args) {
		Printer p = new Printer();
		p.print(100);
		p.print(true);
		p.print(3.14);
		p.print("����");
		System.out.println("==============");
		
		//�ڹٿ��� ����ϴ� ��¹� println�޼ҵ嵵 �����ε��Ͽ� �ۼ��Ǿ��ִ�.
		System.out.println(100);
		System.out.println(true);
		System.out.println(3.14);
		System.out.println("����");
	}
}






