package contents02;

public class Human {
	//�ʵ�
	String name;
	int age;
	
	//�θ�Ŭ���� �⺻������
	public Human() {
		System.out.println("���� ����Դϴ�.");
	}

	//�θ� �ʵ� 2�� �ʱ�ȭ�ϴ� ������
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("���� �̸��� ���̰� �ֽ��ϴ�.");
	}
}



