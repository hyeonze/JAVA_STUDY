/*
# 매개변수의 다형성
1. 매개변수로 클래스 타입을 사용할 수 있다. 
2. 클래스 타입의 매개변수는 해당 클래스의 자식 객체도 매개값으로 사용 가능하다.
*/
package contents;

public class C02_ParameterPoly {
	public static void main(String[] args) {
		/* 1. 매개변수로 클래스 타입 사용하기 */
		Driver driver = new Driver();
		Car car = new Car();
		driver.drive(car);
		
		/* 2. 자식 객체를 매개변수로 사용하기 */
		Suv suv = new Suv();
		Taxi taxi = new Taxi();
		driver.drive(taxi);
		driver.drive(suv);
	}
}

class Driver{
	//Car클래스와 Car클래스의 자식클래스들을 매개변수로 선언
	void drive(Car c) {
		c.run();
	}
}

class Car{
	void run() {
		System.out.println("차로 달립니다. ");
	}
}

class Suv extends Car{
	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("SUV로 달립니다.");
	}
}

class Taxi extends Car{
	void run() {
		// TODO Auto-generated method stub
		System.out.println("Taxi로 달립니다.");
	}
}





