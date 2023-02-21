package practice03;

public class Rectangle {
	//필드
	private int width;//밑변
	private int height;//높이
	
	//생성자(직사각형)
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
		System.out.println("크기가 "+width+"x"+height+"인 직사각형 생성");
	}
	
	//생성자(정사각형)
	Rectangle(int width){
		this.width = width;
		this.height = width;
		System.out.println("한 변의 길이가 "+width+"인 정사각형 생성");
	}
	
	
	//메소드
	int getArea() {
		return width*height;
	}
	
	int getRound() {
		return 2*(width+height);
	}
}
