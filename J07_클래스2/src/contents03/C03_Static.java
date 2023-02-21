/* static 제어자
# 정적 멤버(static member)
정적 멤버는 클래스에 고정된 멤버로서 객체 생성여부와 상관없이 존재한다. 
정적 멤버는 프로그램을 실행하면 가장 먼저 만들어진다.  

# 정적 멤버 선언
class 클래스명{
	static 타입 멤버변수;
	static 리턴타입 메소드();
}

# 정적 멤버 사용
	클래스명.정적변수;
	클래스명.정적메소드();
	
★정적 멤버는 객체의 생성없이 '클래스명.멤버명'으로 바로 사용 가능
static 멤버는 객체 간 공유하는 성질을 가진다(공유 멤버).

# static 메소드는 오버라이딩 불가능

# static main() 메소드
프로그램을 시작하면 가장 먼저 실행되는 메인 메소드
자바 가상 머신은 클래스명.main() 메소드를 가장 먼저 실행시킨다.

*/
package contents03;

public class C03_Static {
	public static void main(String[] args) {
		/* static 멤버는 객체 생성 없이 사용 가능 */
		//클래스명.정적변수명 코드로 바로 사용가능
		Member.staticVar = "클래스변수";
		System.out.println("Member.staticVar: "+Member.staticVar);
		Member.sttMsg();
		System.out.println("=======================");
		
		/* cf) 일반 멤버는 객체를 생성해야만 사용 가능 */
//		Member.instVar = "";
//		Member.instMsg();
		Member mem = new Member();
		mem.instVar = "인스턴스변수";
		mem.instMsg();
		System.out.println("=======================");
		
		/* static 멤버의 공유적 특성 */
		Member m1 = new Member();
		m1.staticVar = "공유 멤버변수";//객체명.정적멤버명 코드로도 접근 가능
		System.out.println("m1.staticVar: " + m1.staticVar);
		
		//다른 객체에서도 static멤버의 데이터값이 같다(공유한다).
		Member m2 = new Member();
		System.out.println("클래스변수 값: " + m2.staticVar);
		m2.staticVar = "m2객체로 접근하여 값 변경";
		System.out.println(m1.staticVar);
		System.out.println(Member.staticVar == m1.staticVar);
		System.out.println("=======================");
		
		Member.staticMth();
	}
}











