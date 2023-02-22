package contents01;

/*자식클래스(Subclass)*/
public class IcecreamWaffle extends Waffle {
	//필드
//	name, price 물려받아 포함된 상태
	String source;
	
	//메소드
//	msgW(), setData(), get2Data() 물려받아 포함된 상태
	void msgIW() {//자식클래스에만 있는 메소드
		System.out.println("자식클래스 메세지");
	}
	
	//상속 관계에 있는 자식클래스에서 
	//메소드 오버로딩으로 기능을 확장할 수 있다.
	void setData(String name, int price, String source) {
//		this.name = name;
//		this.price = price; //아래 코드로 같은 역할 수행
		setData(name, price);//부모클래스의 메소드를 그대로 사용
		
		this.source = source;
	}
	
	void get3Data() {
//		System.out.println("이름: " + this.name);
//		System.out.println("가격: " + this.price);
		get2Data();//부모클래스의 메소드 재활용
		
		System.out.println("소스: " + this.source);
	}
}





