package prot;

public class SuperProt {
	//default 필드
	String ment = "디폴트 멤버변수";
	
	//protected 메소드
	protected void msg() {
		System.out.println("다른 패키지에 속한 클래스 접근");
	}
}
