package practice02;

public class UpdatePhone extends Phone{
	//�߰��� �ʵ�
	private String card;
	private int month;
	
	//������
	public UpdatePhone(String name, String telecom, int price, String card, int month) {
		super(name, telecom, price);
		this.card = card;
		this.month = month;
	}

	@Override
	void showData() {
		// TODO Auto-generated method stub
		super.showData();
		System.out.println("����ī��: " + this.card);
		System.out.println("����Ⱓ: " + this.month);
	}
}




