/*
# 오버라이딩(overriding), 메소드 재정의
부모클래스에서 상속받은 같은 이름의 메소드를 재정의(변경)하는 것
메소드 덮어쓰기.

- 부모클래스의 메소드와 이름, 매개변수, 리턴타입이 같아야한다.
- 부모클래스의 메소드보다 접근 제어자의 범위가 좁아질 수 없다. 

# 오버로딩 vs 오버라이딩
오버로딩(overloading): 이름은 같고 매개변수가 다른 새로운 메소드를 정의한다.
오버라이딩(overriding): "상속 받은" 같은 이름의 메소드를 재정의(덮어쓰기)한다.

*/
package contents03;

public class C03_Overriding {
	public static void main(String[] args) {
		//부모클래스 Musician의 객체
		Musician mus = new Musician();
		mus.showJob();//부모클래스 메소드 호출
		mus.work();
		System.out.println("==================");
		
		//자식클래스 Pianist의 객체
		Pianist monk = new Pianist();
		monk.showJob();//오버라이딩한 메소드 호출
		monk.showJob("재즈");//오버로딩한 메소드 호출
		
		monk.showJob_super();//부모의 덮어쓰기된 메소드 호출
		monk.work();
		System.out.println("==================");
		
		//자식클래스 Singer의 객체
		Singer younha = new Singer();
		younha.showJob();
		younha.showJob("사건의 지평선");
		younha.work();
	}
}










