package contents02;

public class Rectangle {
	//직사각형의 넓이 
	int area(int width, int height) {//매개변수 2개
		return width*height;
	}
	
	//정사각형의 넓이
	int area(int width) {//매개변수 1개
		return width*width;
	}
}
