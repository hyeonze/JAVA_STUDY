package practice01;

public class Human {
	//�ʵ�(�������)
	String name;
	int birth;
	
	//�޼ҵ�(����Լ�)
	void hello() {
		System.out.println("�ݰ����ϴ�!");
	}
	
	void introduce() {
		System.out.println("�� �̸��� "+ name +"�Դϴ�.");
	}
	
	void age() {
		int age = 2023 - birth + 1;
		System.out.println("���ط� "+age+"�� �Դϴ�.");
	}
	
}




