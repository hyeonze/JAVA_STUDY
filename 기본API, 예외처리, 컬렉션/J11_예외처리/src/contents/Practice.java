/*
Q1)	예외 처리를 이용해서 아래의 내용을 구현해보자.
	
	사용자에게 롤 닉네임을 입력 받는데,
	아래의 2가지 조건을 어길 경우 예외와 오류 메세지를 출력합니다.
	닉네임 등록을 성공할 때까지 반복을 진행합니다.

	1) 닉네임이 3~8글자를 벗어나는 경우
	   => 3~8글자 이내로 작성해야 합니다.
	2) "페이커" 단어가 포함된 경우		
	   => 페이커라는 단어를 포함시킬 수 없습니다.
	   
	↓ 성공화면 ↓
	닉네임 생성: 너구리
	닉네임 등록 성공!

	↓ 예외발생상황 ↓
	닉네임 생성: 너굴
	오류: 닉네임은 3~8글자 이내로 작성해야 합니다.
	닉네임 생성: 부쉬인페이커
	오류: 페이커라는 단어를 포함할 수 없습니다.
	
Q2)	다음 조건도 추가하여 예외와 오류 메시지를 출력해도록 구현해보자.

	3) 게임에서 존재하는 캐릭터명을 닉네임에 포함할 경우
	   => "판테온"은 포함할 수 없는 단어입니다.

	//포함할 수 없는 닉네임
	String[] champName = {"판테온", "럼블", "레넥톤", "카밀"};

	↓ 예외발생상황 ↓
	닉네임 생성: 레넥톤지갑수집가
	오류: 레넥톤은(는) 포함할 수 없는 단어입니다.
	닉네임 생성: 스크럼블
	오류: 럼블은(는) 포함할 수 없는 단어입니다.
*/
package contents;
import java.util.Scanner;
public class Practice {
	public static void main(String[] args) {
		//포함할 수 없는 닉네임
		//ex) => 판테온(은)는 사용할 수 없는 단어입니다.
		String[] champName = {"판테온", "럼블", "레넥톤", "카밀"};
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("닉네임 생성: ");
				String nick = sc.nextLine();
				
				//1)
				if (nick.length() < 3 || nick.length() > 8) {
					throw new Exception("3~8글자 이내로 작성해야 합니다.");
				}
				
				//2)
				if(nick.indexOf("페이커") >= 0 ) {
					throw new Exception("페이커라는 단어를 포함시킬 수 없습니다.");
				}
				
				//3) 닉네임에 캐릭터명이 포함되어있는지 체크
				for (int i = 0; i < champName.length; i++) {
					if(nick.indexOf(champName[i]) >= 0) {
						throw new Exception(champName[i] + "은(는) 포함할 수 없는 단어입니다.");
					}
				}
				
				System.out.println("닉네임 등록 성공!");
				break;
					
			}catch(Exception e) {
				System.err.println("오류: " + e.getMessage());
			}
		}
		
		
	}
}















