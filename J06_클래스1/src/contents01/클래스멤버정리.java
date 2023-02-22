package contents01;

/*
<클래스 멤버 용어 정리>
# 클래스의 구조
	class{
		필드;
		생성자;
		메소드;
	}

# 클래스의 구성요소
=> 속성 + 기능 + 보안(정보은닉, 캡슐화)
=> 필드 + 메소드 + 제어자

# 클래스 멤버
멤버 = 클래스의 구성원인 필드, 생성자, 메소드
필드 = 멤버 변수
메소드 = 멤버 함수
정적 = static

# 필드의 종류
1. 인스턴스 필드 = 인스턴스 멤버 변수
2. static 필드 = static 멤버 변수 = 클래스 변수
+. static final 상수

# 변수의 종류
1. 인스턴스 (멤버) 변수
2. 클래스 (멤버) 변수
3. 지역 변수: 메소드 {}내에서만 사용하는 변수
			필드(멤버변수)가 아님.

*/
public class 클래스멤버정리 {
	int abc; //1. 인스턴스 변수
	static int kgb; //2.클래스 변수(정적 멤버 변수)
	
	void exampleArea() {
		int num; //3. 지역 변수
		num = 50;
		System.out.println(num);
	}
	
	void anotherArea() {//인스턴스 메소드
//		System.out.println(num);
//		에러: 위에서의 num지역변수는 해당 메소드에서만 생장
		System.out.println(abc);
		System.out.println(kgb);
	}
	
	static void sttArea() {//정적 메소드
//		System.out.println(this.abc);
//		exampleArea();
		System.out.println(kgb);
	}
}








