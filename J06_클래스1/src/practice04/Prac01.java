/*
Q1)	Phone Ŭ������ �����ϰ� ��ü �迭�� �����Ͽ� �Ʒ��� ������ �����ϰ� Ȯ���غ���

	PhoneŬ����
	@�ʵ�: name, telecom, price
	@������: Phone(name, telecom, price)
	@�޼ҵ�: showData()

	<��ü �ʱ�ȭ��>
		name		telecom		price
	[0]	������		SKT			100
	[1] ������		LG			80
	[2]	����ζ�		KT			50

	�� Console ��
	��1: ������ | SKT | 100����
	��2: ������ | LG | 80����
	��3: ����ζ� | KT | 50����
	
Q2) ������ ������ Phone Ŭ�������� �����ڸ� �����ε��Ͽ� 
	�ʵ��� ����Ʈ ���� �����غ���.
	
	���� ����Ʈ��: 150
	��Ż� ����Ʈ��: SKT 

	<��ü �ʱ�ȭ��>
		name		telecom		price
	[0]	����������		KT			
	[1] ����������					120

	�� Console ��
	��1: ���������� | KT | 150����
	��2: ���������� | SKT | 120����
	
	Tip)
	����: this(�Ű�����, �Ű�����, ����Ʈ��);
*/
package practice04;

public class Prac01 {
	public static void main(String[] args) {
		//Q1
		Phone[] p = new Phone[3];
		p[0] = new Phone("������", "SKT", 100);
		p[1] = new Phone("������", "LG", 80);
		p[2] = new Phone("����ζ�", "KT", 50);
		
		for (int i = 0; i < p.length; i++) {
			System.out.print("��"+(i+1)+": ");
			p[i].showData();
		}
		System.out.println();
		
		//Q2
		Phone[] sp = new Phone[2];
		sp[0] = new Phone("����������", "KT");
		sp[1] = new Phone("����������", 120);
		
		for (int i = 0; i < sp.length; i++) {
			System.out.print("��"+(i+1)+": ");
			sp[i].showData();
		}
	}
}







