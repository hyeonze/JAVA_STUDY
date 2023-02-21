package account;

public class Bank {
	//필드
	private int total;

	//생성자
	public Bank() {
		this.total = 0;
	}
	
	//메소드 
	public void save(int amount) {
		this.total += amount;
		System.out.println(amount+"이 입금되었습니다.");
	}
	
	public void withdraw(int amount) {
		if(this.total<amount) {
			System.out.println("!!출금 금액이 잔고보다 큽니다.");
			System.out.println("다시 시도해 주세요.");
		}else {
			this.total -= amount;
			System.out.println(amount+"이 출금되었습니다.");
		}
	}
	
	public void inqury() {
		System.out.println("현재 잔고는 "+this.total+"입니다.");
	}
	
}






