package contents05;

public class Waffle {
	//�ʵ�
	String source;
	int price;
	
	//������
	public Waffle(String source, int price) {
		super();
		this.source = source;
		this.price = price;
	}
	
	//�޼ҵ�
	void showOrder() {
		System.out.println(source+"���� "+price+"��");
	}
}
