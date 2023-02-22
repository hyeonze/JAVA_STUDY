package practice02;

public class UpdatePhone extends Phone{
	//추가된 필드
	private String card;
	private int month;
	
	//생성자
	public UpdatePhone(String name, String telecom, int price, String card, int month) {
		super(name, telecom, price);
		this.card = card;
		this.month = month;
	}

	@Override
	void showData() {
		// TODO Auto-generated method stub
		super.showData();
		System.out.println("할인카드: " + this.card);
		System.out.println("보험기간: " + this.month);
	}
}




