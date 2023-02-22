package example;

public class Nature {
	void sound(Animal animal) {
		System.out.print(animal.species +" 울음소리: ");
		animal.cry();
	}
	
	void sound(Waterfall waterfall) {
		System.out.print("폭포 떨어지는 소리: ");
		waterfall.flow();
	}
}

class Waterfall{
	void flow() {
		System.out.println("쏴하하하하");
	}
}
