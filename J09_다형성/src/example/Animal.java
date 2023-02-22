package example;

public class Animal {
	String species;
	void cry() {
		System.out.println("..");
	}
}

class Bird extends Animal{
	Bird(){
		species = "»õ";
	}
	
	@Override
	void cry() {
		// TODO Auto-generated method stub
		System.out.println("Â±Â±");
	}
}

class Duck extends Animal{
	Duck(){
		species = "¿À¸®";
	}
	@Override
	void cry() {
		// TODO Auto-generated method stub
		System.out.println("²Ð²Ð");
	}
}

class Tiger extends Animal{
	Tiger(){
		species = "È£¶ûÀÌ";
	}
	@Override
	void cry() {
		// TODO Auto-generated method stub
		System.out.println("¾îÈï");
	}
}



