package contents02;

public class Actor extends Human{
	String movie;

	//자식클래스를 만들면 기본 생성자와 super() 코드를 
	//작성하지 않아도 자동으로 생성되어 있다.
	public Actor() {
		super();
		//super()는 부모의 기본생성자를 호출하는 코드
		//super()는 생략되어도 자동적으로 포함하고 있다. 
		System.out.println("나는 영화배우입니다.");
	}

	public Actor(String movie) {
//		super();
		this.movie = movie;
	}
	
	public Actor(String name, int age, String movie) {
		/* 부모 필드 초기화하기1 */
//		super(name, age); //부모 생성자(매개변수O) 호출, super()호출X
		
		/* 부모 필드 초기화하기2 */
//		super(); //부모 기본생성자(매개변수X) 호출
		this.name = name;
		this.age = age;
		
		this.movie = movie;
		System.out.println("나는 이름과 나이, 출역작품이 있습니다.");
	}

	//부모 필드 2개, 자식 필드 1개 모두 출력
	void showData() {
		System.out.println("저는 "+name+"이고 나이는 "+age+
				"세이며 영화 "+movie+"의 주연입니다. ");
	}
}













