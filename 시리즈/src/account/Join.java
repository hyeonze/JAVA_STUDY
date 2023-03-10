/*
Q.  회원 정보를 만드는 프로그램을 만들어 봅시다.
    회원가입 화면에서 아이디와 비밀번호를 사용자로부터 입력 받습니다.

    만약 아이디나 비밀번호를 4글자 미만으로 입력받았다면
    아이디나 비밀번호를 4글자 이상으로 생성해 달라는 메세지를 언급하고
    아이디와 비밀번호를 입력하는 처음화면으로 되돌아갑니다.

    회원 가입이 정상적으로 되었다면 성공했다는 메세지와 함께 
    프로그램을 종료합니다.

	Tip)
    문자열.length(): 문자열 길이 구하기 
    nextLine(): 문자열 한줄 입력 받기  
	user_id.equals(문자열): 같으면 true, 다르면 false
	
    ↓ Console ↓
    *************회원가입 화면*************
    회원으로 사용할 아이디와 비밀번호를 생성해주세요
    사용할 아이디: 
    비밀번호 생성: 1234
    !!아이디를 4글자 이상으로 생성해야 합니다.
    다시 입력해 주세요.
    *************회원가입 화면*************
    회원으로 사용할 아이디와 비밀번호를 생성해주세요
    사용할 아이디: hyun
    비밀번호 생성: 
    !!비밀번호를 4글자 이상으로 생성해야 합니다.
    다시 입력해 주세요.
    *************회원가입 화면*************
    회원으로 사용할 아이디와 비밀번호를 생성해주세요
    사용할 아이디: hyun
    비밀번호 생성: 1234
    회원 가입이 성공적으로 이루어졌습니다!
    
    
*/
package account;

import java.util.Scanner;

public class Join {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		while(true) {
			System.out.println("*************회원가입 화면*************\r\n"
					+ "회원으로 사용할 아이디와 비밀번호를 생성해주세요");
			System.out.print("사용할 아이디: ");
			String user_id = sc.nextLine();
			System.out.print("비밀번호 생성: ");
			String user_pw = sc.nextLine();
			
			if(user_id.length()<4) {
				System.out.println("!!아이디를 4글자 이상으로 생성해야 합니다.");
				System.out.println("다시 입력해 주세요.");
			}else if(user_pw.length()<4) {
				System.out.println("!!비밀번호를 4글자 이상으로 생성해야 합니다.");
				System.out.println("다시 입력해 주세요.");
			}else {
				System.out.println("회원 가입이 성공적으로 이루어졌습니다!");
				break;
			}
		}
		
	}
}









