package practice01;

public class Student {
	//필드
	String name;
	String subject;
	int month;
	
	//메소드
	void showSubject() {
		System.out.println(subject+" 수업을 수강중입니다.");
	}
	
	void birth() {
		System.out.println(name+"님의 생일은 "
				+month+"월 입니다.");
	}
}
