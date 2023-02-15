package practice02;

public class Tester {
	//메소드 오버로딩(매개변수 2개)
	double getAverage(int a, int b) {
		return (a+b)/2.0;
	}
	
	//메소드 오버로딩(매개변수 3개)
	double getAverage(int a, int b, int c) {
		return (a+b+c)/3.0;
	}
	
	//메소드 오버로딩(매개변수 4개)
	double getAverage(int a, int b, int c, int d) {
		return (a+b+c+d)/4.0;
	}
}
