package example;

public class Animal {
	String species;
	void cry() {
		System.out.println("..");
	}
}

class Bird extends Animal{
	Bird(){
		species = "��";
	}
	
	@Override
	void cry() {
		// TODO Auto-generated method stub
		System.out.println("±±");
	}
}

class Duck extends Animal{
	Duck(){
		species = "����";
	}
	@Override
	void cry() {
		// TODO Auto-generated method stub
		System.out.println("�в�");
	}
}

class Tiger extends Animal{
	Tiger(){
		species = "ȣ����";
	}
	@Override
	void cry() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}
}



