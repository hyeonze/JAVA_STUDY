/*
Q)	�־��� Building Ŭ������ ����Ͽ� 
	���� Ŭ�������� �����ϰ� ��ü�� �׽�Ʈ����.
	�ʵ� ���� �޼ҵ�� �ʱ�ȭ�ϰ�, �ڽ� Ŭ������ setData() 
	�޼ҵ�� �θ� Ŭ������ �޼ҵ带 �����ε��Ͽ� �����غ���.
		
	Hotel Ŭ����
	@�ʵ�: �̸�, ����, vip�� ��
	@�޼ҵ�: setData, showHotel
				
	Apart Ŭ����
	@�ʵ�: �̸�, ����, ����
	@�޼ҵ�: setData, showApart
		
	�� Console ��	
	�̸�: �Ŷ�ȣ��
	����: 100
	vip�� ��: 20

	�̸�: ��ũ�θ���
	����: 20
	����: 25	
*/
package practice01;

public class Prac01 {
	public static void main(String[] args) {
		Hotel ho = new Hotel();
		ho.setData("�Ŷ�ȣ��", 100, 20);
		ho.showHotel();
		System.out.println();
		
		Apart apt = new Apart();
		apt.setData("��ũ�θ���", 20, 25);
		apt.showApart();
	}
}





