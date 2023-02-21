/*
Q)  Bank 클래스를 만들어서 계좌관리 프로그램을 구현해보자.
	총 저축액을 담고 있는 멤버변수 total,
	저축을 하는 메소드 save,
    예금을 인출하는 메소드 withdraw,
    잔고를 조회하는 메소드 inqury 등을 멤버로 가지는 
    Bank 클래스로 객체를 생성하여 다음을 구현해보자. 
    (단, 총 저축액은 0으로 초기화하고 시작한다.)

	↓ Console ↓
	---------------
	    계좌관리
	---------------
	 1. 입금
	 2. 출금
	 3. 잔고조회
	 0. 종료
	---------------
	 메뉴를 선택하시오: 1
	 입금 금액을 입력하시오: 500
	 500이 입금되었습니다.
	---------------
	    계좌관리
	---------------
	 1. 입금
	 2. 출금
	 3. 잔고조회
	 0. 종료
	---------------
	 메뉴를 선택하시오: 2
	 출금 금액을 입력하시오: 200
	 200이 출금되었습니다.
	---------------
	    계좌관리
	---------------
	 1. 입금
	 2. 출금
	 3. 잔고조회
	 0. 종료
	---------------
	 메뉴를 선택하시오: 2
	 출금 금액을 입력하시오: 400
	 !!출금 금액이 잔고보다 큽니다.
	 다시 시도해 주세요.
	---------------
		계좌관리
	---------------
	 1. 입금
	 2. 출금
	 3. 잔고조회
	 0. 종료
	---------------
	 메뉴를 선택하시오: 3
	 현재 잔고는 300입니다.
    ---------------
		계좌관리
	---------------
	 1. 입금
	 2. 출금
	 3. 잔고조회
	 0. 종료
	---------------
	 메뉴를 선택하시오: 0
	 프로그램을 종료합니다.
*/
package account;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Bank bank = new Bank();//총 저축액 0으로 초기화
		Scanner sc = new Scanner(System.in);
		
		boolean exit = false; //무한루프를 탈출할지 체크할 변수
		while(true) {
			System.out.print("---------------\r\n"
					+ "    계좌관리\r\n"
					+ "---------------\r\n"
					+ "1. 입금\r\n"
					+ "2. 출금\r\n"
					+ "3. 잔고조회\r\n"
					+ "0. 종료\r\n"
					+ "---------------\r\n"
					+ "메뉴를 선택하시오: ");
			int menu = sc.nextInt();
			int money;
			switch(menu){
			case 1:
				System.out.print("입금 금액을 입력하시오: ");
				money = sc.nextInt();
				bank.save(money);
				break;
			case 2:
				System.out.print("출금 금액을 입력하시오: ");
				money = sc.nextInt();
				bank.withdraw(money);
				break;
			case 3:
				bank.inqury();
				break;
			case 0:
				exit = true;//무한루프를 탈출하도록 조건 변경
				break;
			}
			
			//무한루프를 탈출할 조건식
			if(exit) {
				System.out.println("프로그램을 종료합니다.");
				break;//exit==true이면 종료
			}
		}
	}
}















