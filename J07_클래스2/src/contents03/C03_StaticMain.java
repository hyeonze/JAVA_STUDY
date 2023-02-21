package contents03;

public class C03_StaticMain {
	//메인 메소드
	public static void main(String[] args) {
		System.out.println("Do");
		System.out.println(sttStr);
		sttMsg();
		
//		System.out.println(instStr);
//		instMsg();
		
		//static메소드에서는 객체 생성해서 일반멤버 사용
		C03_StaticMain obj = new C03_StaticMain();
		System.out.println(obj.instStr);
		obj.instMsg();
		
//		static int k; 
//		에러: static메소드 내에서 static멤버 생성 불가
	}
	
	//필드
	String instStr = "일반 멤버변수";
	static String sttStr = "정적 멤버변수";
	
	//메소드
	void instMsg() {
		System.out.println("일반 메소드");
	}
	static void sttMsg() {
		System.out.println("정적 메소드");
	}
}
