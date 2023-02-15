/*
# 클래스와 객체
클래스(class)
- 객체를 만들기 위한 설계도(틀)
- ex) 와플기계

객체(Object)
- 클래스의 설계도로 만들어낸 실체
- ex) 와플

# 객체 생성하기
클래스 선언 후 객체를 생성
1. 클래스 선언
	class 클래스이름{
		필드(멤버변수)
		메소드
	}

2. 객체 생성
	클래스이름 객체이름 = new 클래스이름();

# 클래스와 객체의 관계
클래스 -> 객체1, 객체2, 객체3..
와플기계 -> 와플1, 와플2, 와플3..

*/
package contents01;

public class C01_Class {
	public static void main(String[] args) {
		//Person클래스로부터 객체 생성하기
		System.out.println("====객체1====");
//		int a = (int)10;
		Person hyun = new Person();
		hyun.name = "최현";//멤버변수에 값 대입
		hyun.age = 20;
		hyun.sight = 1.2;
		hyun.hobby = "유튜브";
		hyun.showProfile();//showProfile()메소드 호출
		
		//한 번 만들어놓은 클래스로 여러개의 객체 생성 가능
		System.out.println("====객체2====");
		Person IU = new Person();
		IU.name = "이지은";
		IU.age = 31;
		IU.sight = 1.0;
		IU.hobby = "노래";
		IU.showProfile();
		
		System.out.println("====객체3====");
		Person song = new Person();
		song.name = "송중기";
		song.hobby = "재혼";
		song.showProfile();
	}
}


















