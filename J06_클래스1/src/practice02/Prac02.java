/*
	Printer 클래스를 객체를 생성하고 print() 메소드를 호출해서 
	매개값을 콘솔 화면에 출력하고자 한다. 
	print()의 매개값으로는 int, boolean, double, String 값을 
	줄 수 있고 리턴값은 없다.
	Printer 클래스에서 print() 메소드를 선언하고 코드를 실행하시오.
 
 	Printer 클래스 
 	{
 		@메소드 오버로딩
 		print(매개변수)
 	}
 	
 	↓ Console ↓
 	100
	true
	3.14
	도넛
*/
package practice02;

public class Prac02 {
	public static void main(String[] args) {
		Printer p = new Printer();
		p.print(100);
		p.print(true);
		p.print(3.14);
		p.print("도넛");
		System.out.println("==============");
		
		//자바에서 사용하는 출력문 println메소드도 오버로딩하여 작성되어있다.
		System.out.println(100);
		System.out.println(true);
		System.out.println(3.14);
		System.out.println("도넛");
	}
}






