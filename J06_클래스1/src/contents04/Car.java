package contents04;

public class Car {
	//필드
	String name;
	int price;
	
	void setExample(String n, int p) {
		String name;//만약 같은 변수명의 지역변수가 있을 경우
		name = n; //지역변수name <= 매개변수n
		this.name = n;
		this.price = p;
	}
	
	//this.필드로 초기화하기
	void setInfo(String name, int price) {
		this.name = name; //this.필드name <= 매개변수name
		this.price = price;//this.필드price <= 매개변수price
	}
			
	//this.메소드() 호출하기
	void discount(String name, int price) {
		//this.메소드setInfo(매개변수name, 매개변수price - 500)
		this.setInfo(name, price-500);//가격 500 할인하여 정보 저장
		
//		this.name = name;
//		this.price = price - 500;//가격 500 할인하여 정보 저장
	}
	
	
	
	void showInfo() {
		System.out.println("차종: "+this.name+", 가격: "+this.price);
	}
}












