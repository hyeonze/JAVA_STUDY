package account;

public class Bank {
	//�ʵ�
	private int total;

	//������
	public Bank() {
		this.total = 0;
	}
	
	//�޼ҵ� 
	public void save(int amount) {
		this.total += amount;
		System.out.println(amount+"�� �ԱݵǾ����ϴ�.");
	}
	
	public void withdraw(int amount) {
		if(this.total<amount) {
			System.out.println("!!��� �ݾ��� �ܰ��� Ů�ϴ�.");
			System.out.println("�ٽ� �õ��� �ּ���.");
		}else {
			this.total -= amount;
			System.out.println(amount+"�� ��ݵǾ����ϴ�.");
		}
	}
	
	public void inqury() {
		System.out.println("���� �ܰ�� "+this.total+"�Դϴ�.");
	}
	
}






