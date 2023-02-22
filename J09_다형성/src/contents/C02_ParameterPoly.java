/*
# �Ű������� ������
1. �Ű������� Ŭ���� Ÿ���� ����� �� �ִ�. 
2. Ŭ���� Ÿ���� �Ű������� �ش� Ŭ������ �ڽ� ��ü�� �Ű������� ��� �����ϴ�.
*/
package contents;

public class C02_ParameterPoly {
	public static void main(String[] args) {
		/* 1. �Ű������� Ŭ���� Ÿ�� ����ϱ� */
		Driver driver = new Driver();
		Car car = new Car();
		driver.drive(car);
		
		/* 2. �ڽ� ��ü�� �Ű������� ����ϱ� */
		Suv suv = new Suv();
		Taxi taxi = new Taxi();
		driver.drive(taxi);
		driver.drive(suv);
	}
}

class Driver{
	//CarŬ������ CarŬ������ �ڽ�Ŭ�������� �Ű������� ����
	void drive(Car c) {
		c.run();
	}
}

class Car{
	void run() {
		System.out.println("���� �޸��ϴ�. ");
	}
}

class Suv extends Car{
	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("SUV�� �޸��ϴ�.");
	}
}

class Taxi extends Car{
	void run() {
		// TODO Auto-generated method stub
		System.out.println("Taxi�� �޸��ϴ�.");
	}
}





