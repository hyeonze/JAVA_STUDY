package practice03;

public class Rectangle {
	//�ʵ�
	private int width;//�غ�
	private int height;//����
	
	//������(���簢��)
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
		System.out.println("ũ�Ⱑ "+width+"x"+height+"�� ���簢�� ����");
	}
	
	//������(���簢��)
	Rectangle(int width){
		this.width = width;
		this.height = width;
		System.out.println("�� ���� ���̰� "+width+"�� ���簢�� ����");
	}
	
	
	//�޼ҵ�
	int getArea() {
		return width*height;
	}
	
	int getRound() {
		return 2*(width+height);
	}
}
