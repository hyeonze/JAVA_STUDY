package contents03;

public class Member {
	String instVar; //인스턴스(일반) 멤버 변수
	static String staticVar; //static멤버 변수 (클래스 변수)
	
	void instMsg() {//인스턴스(일반) 메소드
		System.out.println("일반 메소드");
	}
	
	static void sttMsg() {//정적 메소드
		System.out.println("정적 메소드");
	}
	
	static void staticMth() {//정적 메소드
		/* static메소드에서는 static멤버만 이용 가능 */
//		System.out.println(instVar);
//		instMsg();
//		this.instVar = "this도 사용못함";
//		=> 에러: static메소드는 객체 생성 전에 만들어져 있으므로
//		아직 생성되지 않은 인스턴스 멤버를 이용할 수 없다.
		System.out.println("staticVar: " + staticVar);
		sttMsg();
		
		/* static메소드에서 인스턴스 멤버 사용하기 */
		//객체를 생성해서 참조 변수로 접근
		System.out.println("정적 메소드에서 객체 생성!");
		Member m = new Member();
		m.instVar = "인스턴스 접근";
		System.out.println("m.instVar: " + m.instVar);
		m.instMsg();
	}
}






