package contents01;

/*�ڽ�Ŭ����(Subclass)*/
public class IcecreamWaffle extends Waffle {
	//�ʵ�
//	name, price �����޾� ���Ե� ����
	String source;
	
	//�޼ҵ�
//	msgW(), setData(), get2Data() �����޾� ���Ե� ����
	void msgIW() {//�ڽ�Ŭ�������� �ִ� �޼ҵ�
		System.out.println("�ڽ�Ŭ���� �޼���");
	}
	
	//��� ���迡 �ִ� �ڽ�Ŭ�������� 
	//�޼ҵ� �����ε����� ����� Ȯ���� �� �ִ�.
	void setData(String name, int price, String source) {
//		this.name = name;
//		this.price = price; //�Ʒ� �ڵ�� ���� ���� ����
		setData(name, price);//�θ�Ŭ������ �޼ҵ带 �״�� ���
		
		this.source = source;
	}
	
	void get3Data() {
//		System.out.println("�̸�: " + this.name);
//		System.out.println("����: " + this.price);
		get2Data();//�θ�Ŭ������ �޼ҵ� ��Ȱ��
		
		System.out.println("�ҽ�: " + this.source);
	}
}





