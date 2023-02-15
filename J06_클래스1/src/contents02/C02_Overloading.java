/*
# �޼ҵ� �����ε�(Overloading)
�ϳ��� Ŭ������ ���� �̸��� �޼ҵ带 ������ �����ϴ� ��
���� �̸��� �޼ҵ�� �Է¸Ű����� ���� �ٸ� �޼ҵ带 ȣ���Ͽ� ����Ѵ�.

# �����ε��� ����
1. �޼ҵ� �̸��� ���ƾ��Ѵ�.
2. �Ű������� ���� Ȥ�� Ÿ���� �޶���Ѵ�.
*/
package contents02;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class C02_Overloading {
	public static void main(String[] args) {
		/* �簢�� ���¿� ���� ���� ���ϱ� */
		Rectangle sagak = new Rectangle();
		
		//���簢�� ���� ���ϱ�
		int res1 = sagak.area(15, 20);
		System.out.println(res1);
		
		//���簢�� ���� ���ϱ�
		int res2 = sagak.area(10);
		System.out.println(res2);
		System.out.println("==================");
		
		/* ������ ���ÿ� ���� �ֹ����� ��Ÿ���� */
		Waffle waf = new Waffle();
		
		//�ҽ� ���� ���� �ֹ�
		String wafName0 = waf.name(); //�Ű���X
		System.out.println(wafName0 + " �ֹ��Ͽ����ϴ�.");
		
		//�ҽ� 1���� ���� �ֹ�
		String wafName1 = waf.name("���ڶ�"); //�Ű��� 1��
		System.out.println(wafName1 + " �ֹ��Ͽ����ϴ�.");
		
		//�ҽ� 2���� ���� �ֹ�
		String wafName2 = waf.name("���ڶ�", "���̽�ũ��"); //�Ű��� 2��(���ڿ�, ���ڿ�)
		System.out.println(wafName2 + " �ֹ��Ͽ����ϴ�.");
		
		//�ҽ� 1���� ������ n�� �ֹ�
		String wafName3 = waf.name("���ڶ�", 3);//�Ű��� 2��(���ڿ�, ����)
		System.out.println(wafName3 + " �ֹ��Ͽ����ϴ�.");
	}
}








