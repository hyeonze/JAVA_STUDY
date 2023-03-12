/*
# �߻� Ŭ����(abstract class)
�߻� �޼ҵ带 ������ Ŭ����
�޼ҵ��� ���� �����̰�, ���� ������ ��ü Ŭ�������� �޶���ϴ� ��쿡 ���
�߻�Ŭ������ ��ü�� ���� ������ �� ����.

# �߻� �޼ҵ�(abstract method)
	abstract �޼ҵ��(�Ű�����..);
���� �س��� �޼ҵ�, �̿ϼ� �޼ҵ�
�߻�Ŭ������ ��ӹ��� �Ϲ�Ŭ�������� �߻�޼ҵ带 �������̵��Ͽ� �����Ѵ�.

# �����ϱ�(implements)
�߻�Ŭ�������� �������� �̿ϼ� �߻�޼ҵ带 
�ڽ�Ŭ�������� (�������̵��ؼ�) �ϼ��ϴ� ��

�θ�Ŭ����		���		�ڽ�Ŭ����
�߻�޼ҵ�		<-		�ϼ��޼ҵ�(����)

*/
package contents;

public class C03_Abstract {
	public static void main(String[] args) {
//		RiverAnimal ani = new RiverAnimal();
		
		/* �߻� Ŭ���� ����ϱ� */
		//1. �߻�Ŭ������ �Ϲ�Ŭ������ ����Ͽ� ��ü ����
		Frog fg = new Frog();
		fg.eat();
		fg.cry();
		
		Duck dk = new Duck();
		dk.eat();
		dk.cry();
		
		//2. �̳�Ŭ������ �߻�޼ҵ带 �����Ͽ� ��ü ����
		RiverAnimal ani = new RiverAnimal() {
			@Override
			public void cry() {
				// TODO Auto-generated method stub
				System.out.println("...");
			}
		};
		//=> ani��ü�� RiverAnimalŬ������ ��ӹ޾� �߻�޼ҵ带
		//	�ϼ���Ų �͸�Ŭ������ �����ڷ� ���� ��ü�̴�.
		ani.eat();
		ani.cry();
		
	}
}

abstract class RiverAnimal{
	//�Ϲ� �������
	public int age;
	
	//�Ϲ� �޼ҵ�
	public void eat() {
		System.out.println("�Դ´�");
	}
	
	//�߻� �޼ҵ�
	public abstract void cry();//���� ����
}

//�߻� Ŭ������ ��ӹ��� �Ϲ� Ŭ����
class Frog extends RiverAnimal{
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("��������");
	}
}

class Duck extends RiverAnimal{
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("�в�");
	}
}







