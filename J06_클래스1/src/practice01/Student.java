package practice01;

public class Student {
	//�ʵ�
	String name;
	String subject;
	int month;
	
	//�޼ҵ�
	void showSubject() {
		System.out.println(subject+" ������ �������Դϴ�.");
	}
	
	void birth() {
		System.out.println(name+"���� ������ "
				+month+"�� �Դϴ�.");
	}
}
