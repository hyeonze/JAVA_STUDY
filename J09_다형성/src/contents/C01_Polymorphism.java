/*
# 다형성(polymorphism)
객체의 다형적 표현
ex) 오버라이딩, 타입 변환

# 객체의 타입 변환
서로 상속 관계에 있는 클래스 간에 타입 변환이 가능하다.

1. 업캐스팅(자동 타입 변환)
	상위클래스 <= 하위클래스
	부모클래스 <= 자식클래스
	부모타입 객체명 = 자식타입;
자식타입의 정보를 부모타입으로 변환하여 객체에 저장한다.
업캐스팅한 객체는 부모클래스 타입이다.

* 업캐스팅한 객체의 멤버 허용 범위
1) 부모 클래스에만 있는 메소드 사용 가능
2) 자식 클래스에만 있는 메소드 사용 불가능
★) 오버라이딩한 자식 클래스의 메소드 사용 가능

2. 다운캐스팅(수동 타입 변환): 업캐스팅된 객체의 타입을 원래대로 되돌리는 것
	하위클래스 <= 상위클래스
	자식클래스 <= 부모클래스
	자식타입 객체명 = (타입변환)부모타입;
부모타입의 정보를 자식타입 객체에 넣을때는 (타입변환)을 작성해야한다. 
타입 변환을 안하고 참조한다면 에러.
다운캐스팅한 객체는 자식클래스 타입이다.

# 다운캐스팅에서 (타입변환)을 해야하는 이유
업캐스팅: 사람 <= 학생. 학생이면 사람이다(O)
다운캐스팅: 학생 <= 사람. 사람이면 학생이다(X)

# instanceof 연산자
	객체 instanceof 타입
객체가 해당 타입으로 변환(캐스팅)할 수 있으면 true, 없으면 false

*/
package contents;

public class C01_Polymorphism {
	public static void main(String[] args) {
		//기본타입 업캐스팅
		double num = 10; //큰 범위 타입 <- 작은 범위 타입
		System.out.println(num);//자동으로 타입 변환
		
		//기본타입 다운캐스팅
		double numD = 3.5;
		int numI = (int)numD; //작은 범위 타입 <- (타입변환)큰 범위 타입 
		
		/* 1. 객체의 업캐스팅 */
		Dog d = new Dog();
		Animal ani = d; //부모클래스 <= 자식클래스
		Animal ani2 = new Dog(); ////부모클래스 <= 자식클래스
		
		//업캐스팅한 객체의 멤버 접근 범위
		ani.eat();//1)부모에만 있는 메소드 사용O
//		ani.bark(); 에러: 2)자식클래스에먼 있는 메소드 사용X
		ani.walk(); //3)오버라이딩된 자식메소드로 호출
		
		/* 2. 객체의 다운캐스팅 */
		//다운캐스팅은 일반적으로 불가능
		Animal a0 = new Animal();
//		Dog d0 = (Dog)a0;
//		에러: 부모클래스 객체 타입을 자식클래스 타입으로 변환 불가능
		
		//다운캐스팅: 업캐스팅된 객체의 타입을 원래대로(자식타입) 되돌리는 것
		//처음부터 자식클래스 생성자로 만든 부타입 객체는 다운캐스팅 가능
		Animal a1 = new Dog();//업캐스팅한 객체 a1
		Dog d1 = (Dog)a1;
		
		/* 상속관계가 아닌 탑인 간의 형변환 */
		Dog g = new Dog();
//		Cat c = (Dog)g; //상속관계 아닌 타입끼리는 형변환이 안된다.
		
		/* 객체의 타입변환 여부 확인하기 */
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		boolean dA = dog instanceof Animal;
		System.out.println("업캐스팅 가능? " + dA);
		
		boolean aD = animal instanceof Dog;
		System.out.println("일반적으로 다운캐스팅 가능? " + aD);
		
		Animal aniDog = new Dog(); //업캐스팅된 aniDog 객체
		boolean aD_D = aniDog instanceof Dog;
		System.out.println("업캐스팅된 객체를 다운캐스팅 가능? " + aD_D);
		
//		boolean cD = cat instanceof Dog; 에러: 상속관계X
		boolean cA = cat instanceof Animal;
		System.out.println("Animal <- Cat 업캐스팅 가능? " + cA);
	}
}

//부모클래스
class Animal{
	public void walk() {
		System.out.println("산책한다.");
	}
	public void eat() {//부모에만 있는 메소드
		System.out.println("먹는다.");
	}
}

//자식클래스
class Dog extends Animal{
	@Override//오버라이딩한 메소드
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("신난당~");
	}
	public void bark() {//자식에만 있는 메소드
		System.out.println("왈왈!!");
	}
}

//자식클래스
class Cat extends Animal{
	//Animal의 자식클래스이지만 Dog과는 관계가 없음
}






