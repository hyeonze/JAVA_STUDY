/*
# this
�ڽ��� ���� Ŭ������ ��ü�� ����Ű�� ��������
Ŭ������ ����� ȣ���� �� ���
	this.�ʵ�
	this.�޼ҵ�()

- ��ü��.��� �����ϴ°Ͱ� ����

# this()
�ڽ��� ���� Ŭ���� ������ �ٸ� �����ڸ� ȣ���ϴ� �޼ҵ�
������ ������ ù �ٿ����� ���
	�����ڸ�(){
		this(�Ű�����..);
	}

*/
package contents04;

public class C04_This {
	public static void main(String[] args) {
		/* this Ű���� ���� */
		Car c1 = new Car();
		c1.setInfo("�׷���", 4000);
		c1.showInfo();
		
		Car c2 = new Car();
		c2.discount("�׷���", 4000);
		c2.showInfo();
		
		/* this() Ű���� ���� */
		Bike b1 = new Bike("�ε�������");
		b1.showInfo();
		
		Bike b2 = new Bike("MTB������", "Green");
		b2.showInfo();
		
	}
}










