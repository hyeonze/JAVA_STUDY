/*
# ������(polymorphism)
��ü�� ������ ǥ��
ex) �������̵�, Ÿ�� ��ȯ

# ��ü�� Ÿ�� ��ȯ
���� ��� ���迡 �ִ� Ŭ���� ���� Ÿ�� ��ȯ�� �����ϴ�.

1. ��ĳ����(�ڵ� Ÿ�� ��ȯ)
	����Ŭ���� <= ����Ŭ����
	�θ�Ŭ���� <= �ڽ�Ŭ����
	�θ�Ÿ�� ��ü�� = �ڽ�Ÿ��;
�ڽ�Ÿ���� ������ �θ�Ÿ������ ��ȯ�Ͽ� ��ü�� �����Ѵ�.
��ĳ������ ��ü�� �θ�Ŭ���� Ÿ���̴�.

* ��ĳ������ ��ü�� ��� ��� ����
1) �θ� Ŭ�������� �ִ� �޼ҵ� ��� ����
2) �ڽ� Ŭ�������� �ִ� �޼ҵ� ��� �Ұ���
��) �������̵��� �ڽ� Ŭ������ �޼ҵ� ��� ����

2. �ٿ�ĳ����(���� Ÿ�� ��ȯ): ��ĳ���õ� ��ü�� Ÿ���� ������� �ǵ����� ��
	����Ŭ���� <= ����Ŭ����
	�ڽ�Ŭ���� <= �θ�Ŭ����
	�ڽ�Ÿ�� ��ü�� = (Ÿ�Ժ�ȯ)�θ�Ÿ��;
�θ�Ÿ���� ������ �ڽ�Ÿ�� ��ü�� �������� (Ÿ�Ժ�ȯ)�� �ۼ��ؾ��Ѵ�. 
Ÿ�� ��ȯ�� ���ϰ� �����Ѵٸ� ����.
�ٿ�ĳ������ ��ü�� �ڽ�Ŭ���� Ÿ���̴�.

# �ٿ�ĳ���ÿ��� (Ÿ�Ժ�ȯ)�� �ؾ��ϴ� ����
��ĳ����: ��� <= �л�. �л��̸� ����̴�(O)
�ٿ�ĳ����: �л� <= ���. ����̸� �л��̴�(X)

# instanceof ������
	��ü instanceof Ÿ��
��ü�� �ش� Ÿ������ ��ȯ(ĳ����)�� �� ������ true, ������ false

*/
package contents;

public class C01_Polymorphism {
	public static void main(String[] args) {
		//�⺻Ÿ�� ��ĳ����
		double num = 10; //ū ���� Ÿ�� <- ���� ���� Ÿ��
		System.out.println(num);//�ڵ����� Ÿ�� ��ȯ
		
		//�⺻Ÿ�� �ٿ�ĳ����
		double numD = 3.5;
		int numI = (int)numD; //���� ���� Ÿ�� <- (Ÿ�Ժ�ȯ)ū ���� Ÿ�� 
		
		/* 1. ��ü�� ��ĳ���� */
		Dog d = new Dog();
		Animal ani = d; //�θ�Ŭ���� <= �ڽ�Ŭ����
		Animal ani2 = new Dog(); ////�θ�Ŭ���� <= �ڽ�Ŭ����
		
		//��ĳ������ ��ü�� ��� ���� ����
		ani.eat();//1)�θ𿡸� �ִ� �޼ҵ� ���O
//		ani.bark(); ����: 2)�ڽ�Ŭ�������� �ִ� �޼ҵ� ���X
		ani.walk(); //3)�������̵��� �ڽĸ޼ҵ�� ȣ��
		
		/* 2. ��ü�� �ٿ�ĳ���� */
		//�ٿ�ĳ������ �Ϲ������� �Ұ���
		Animal a0 = new Animal();
//		Dog d0 = (Dog)a0;
//		����: �θ�Ŭ���� ��ü Ÿ���� �ڽ�Ŭ���� Ÿ������ ��ȯ �Ұ���
		
		//�ٿ�ĳ����: ��ĳ���õ� ��ü�� Ÿ���� �������(�ڽ�Ÿ��) �ǵ����� ��
		//ó������ �ڽ�Ŭ���� �����ڷ� ���� ��Ÿ�� ��ü�� �ٿ�ĳ���� ����
		Animal a1 = new Dog();//��ĳ������ ��ü a1
		Dog d1 = (Dog)a1;
		
		/* ��Ӱ��谡 �ƴ� ž�� ���� ����ȯ */
		Dog g = new Dog();
//		Cat c = (Dog)g; //��Ӱ��� �ƴ� Ÿ�Գ����� ����ȯ�� �ȵȴ�.
		
		/* ��ü�� Ÿ�Ժ�ȯ ���� Ȯ���ϱ� */
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		boolean dA = dog instanceof Animal;
		System.out.println("��ĳ���� ����? " + dA);
		
		boolean aD = animal instanceof Dog;
		System.out.println("�Ϲ������� �ٿ�ĳ���� ����? " + aD);
		
		Animal aniDog = new Dog(); //��ĳ���õ� aniDog ��ü
		boolean aD_D = aniDog instanceof Dog;
		System.out.println("��ĳ���õ� ��ü�� �ٿ�ĳ���� ����? " + aD_D);
		
//		boolean cD = cat instanceof Dog; ����: ��Ӱ���X
		boolean cA = cat instanceof Animal;
		System.out.println("Animal <- Cat ��ĳ���� ����? " + cA);
	}
}

//�θ�Ŭ����
class Animal{
	public void walk() {
		System.out.println("��å�Ѵ�.");
	}
	public void eat() {//�θ𿡸� �ִ� �޼ҵ�
		System.out.println("�Դ´�.");
	}
}

//�ڽ�Ŭ����
class Dog extends Animal{
	@Override//�������̵��� �޼ҵ�
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("�ų���~");
	}
	public void bark() {//�ڽĿ��� �ִ� �޼ҵ�
		System.out.println("�п�!!");
	}
}

//�ڽ�Ŭ����
class Cat extends Animal{
	//Animal�� �ڽ�Ŭ���������� Dog���� ���谡 ����
}






