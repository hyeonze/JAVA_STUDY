package example;

public class Nature {
	void sound(Animal animal) {
		System.out.print(animal.species +" �����Ҹ�: ");
		animal.cry();
	}
	
	void sound(Waterfall waterfall) {
		System.out.print("���� �������� �Ҹ�: ");
		waterfall.flow();
	}
}

class Waterfall{
	void flow() {
		System.out.println("����������");
	}
}
