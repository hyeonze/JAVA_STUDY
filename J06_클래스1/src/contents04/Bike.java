package contents04;

public class Bike {
	//�ʵ�
	String model;
	String color;
	double discountRate;
	
	//������ �����ε�
	public Bike(String model) {
		this(model, "Blue", 0.5);
//		this.model = model;
//		this.color = "Blue"; //����Ʈ�� ����
//		this.discountRate = 0.5; //����Ʈ�� ����
	}

	//������ �����ε�
	public Bike(String model, String color) {
		this(model, color, 0.5);
//		this.model = model;
//		this.color = color;
//		this.discountRate = 0.5; //����Ʈ�� ����
	}

	//������ �����ε�
	public Bike(String model, String color, double discountRate) {
		this.model = model;
		this.color = color;
		this.discountRate = discountRate;
	}
	
	//�޼ҵ�
	void showInfo() {
		System.out.println("��: "+this.model+", ����: "+
						this.color+", ������: "+ this.discountRate);
	}
}





