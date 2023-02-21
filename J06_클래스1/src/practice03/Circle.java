package practice03;

public class Circle {
	//필드
	private int radius;//원의 반지름
	
	//생성자
	Circle(int radius){
		this.radius = radius;
	}
	
	//메소드
	void showInfo() {
		System.out.println("원의 반지름: " + radius);
		System.out.println("원의 넓이: " + radius*radius*3.14);
	}
}
