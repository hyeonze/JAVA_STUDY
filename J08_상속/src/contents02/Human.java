package contents02;

public class Human {
	//필드
	String name;
	int age;
	
	//부모클래스 기본생성자
	public Human() {
		System.out.println("나는 사람입니다.");
	}

	//부모 필드 2개 초기화하는 생성자
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("나는 이름과 나이가 있습니다.");
	}
}



