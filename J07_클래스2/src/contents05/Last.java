package contents05;

public class Last {
//	final int a; //초기화하지 않으면 컴파일 에러
	final int b; //생성자로 final변수 초기화해야 에러X
	final int c = 10;
	static final double PI = 3.14; //상수 선언

	//final변수는 생성자로 초기값을 지정해야 한다.
	public Last(int b) {
		this.b = b;
	}
}
