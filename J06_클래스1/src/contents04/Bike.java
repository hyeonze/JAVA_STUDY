package contents04;

public class Bike {
	//필드
	String model;
	String color;
	double discountRate;
	
	//생성자 오버로딩
	public Bike(String model) {
		this(model, "Blue", 0.5);
//		this.model = model;
//		this.color = "Blue"; //디폴트값 지정
//		this.discountRate = 0.5; //디폴트값 지정
	}

	//생성자 오버로딩
	public Bike(String model, String color) {
		this(model, color, 0.5);
//		this.model = model;
//		this.color = color;
//		this.discountRate = 0.5; //디폴트값 지정
	}

	//생성자 오버로딩
	public Bike(String model, String color, double discountRate) {
		this.model = model;
		this.color = color;
		this.discountRate = discountRate;
	}
	
	//메소드
	void showInfo() {
		System.out.println("모델: "+this.model+", 색상: "+
						this.color+", 할인율: "+ this.discountRate);
	}
}





