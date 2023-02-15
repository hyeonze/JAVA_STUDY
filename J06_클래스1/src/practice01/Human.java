package practice01;

public class Human {
	//필드(멤버변수)
	String name;
	int birth;
	
	//메소드(멤버함수)
	void hello() {
		System.out.println("반갑습니다!");
	}
	
	void introduce() {
		System.out.println("제 이름은 "+ name +"입니다.");
	}
	
	void age() {
		int age = 2023 - birth + 1;
		System.out.println("올해로 "+age+"세 입니다.");
	}
	
}




