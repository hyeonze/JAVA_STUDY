/*
# 추상 클래스(abstract class)
추상 메소드를 가지는 클래스
메소드의 선언만 공통이고, 실행 내용은 실체 클래스마다 달라야하는 경우에 사용
추상클래스는 객체를 직접 생성할 수 없다.

# 추상 메소드(abstract method)
	abstract 메소드명(매개변수..);
선언만 해놓은 메소드, 미완성 메소드
추상클래스를 상속받은 일반클래스에서 추상메소드를 오버라이딩하여 구현한다.

# 구현하기(implements)
추상클래스에서 물려받은 미완성 추상메소드를 
자식클래스에서 (오버라이딩해서) 완성하는 것

부모클래스		상속		자식클래스
추상메소드		<-		완성메소드(구현)

*/
package contents;

public class C03_Abstract {
	public static void main(String[] args) {
//		RiverAnimal ani = new RiverAnimal();
		
		/* 추상 클래스 사용하기 */
		//1. 추상클래스를 일반클래스로 상속하여 객체 생성
		Frog fg = new Frog();
		fg.eat();
		fg.cry();
		
		Duck dk = new Duck();
		dk.eat();
		dk.cry();
		
		//2. 이너클래스로 추상메소드를 구현하여 객체 생성
		RiverAnimal ani = new RiverAnimal() {
			@Override
			public void cry() {
				// TODO Auto-generated method stub
				System.out.println("...");
			}
		};
		//=> ani객체는 RiverAnimal클래스를 상속받아 추상메소드를
		//	완성시킨 익명클래스의 생성자로 만든 객체이다.
		ani.eat();
		ani.cry();
		
	}
}

abstract class RiverAnimal{
	//일반 멤버변수
	public int age;
	
	//일반 메소드
	public void eat() {
		System.out.println("먹는다");
	}
	
	//추상 메소드
	public abstract void cry();//선언만 가능
}

//추상 클래스를 상속받은 일반 클래스
class Frog extends RiverAnimal{
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("개굴개굴");
	}
}

class Duck extends RiverAnimal{
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("꽥꽥");
	}
}







