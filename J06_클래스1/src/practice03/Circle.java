package practice03;

public class Circle {
	//�ʵ�
	private int radius;//���� ������
	
	//������
	Circle(int radius){
		this.radius = radius;
	}
	
	//�޼ҵ�
	void showInfo() {
		System.out.println("���� ������: " + radius);
		System.out.println("���� ����: " + radius*radius*3.14);
	}
}
