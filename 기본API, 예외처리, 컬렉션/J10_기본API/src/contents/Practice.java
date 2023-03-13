/*	Scanner, String, Calendar, Wrapper 클래스 종합
Q)	본인의 생년월일을 이용하여 오늘 날짜를 기준으로 한국식 나이와 만 나이를 확인해보자.
	먼저 생년월일과 오늘날짜를 아래화면처럼 출력하는데, 
	생년월일은 사용자로부터 입력을 받고
	오늘날짜는 자바의 API클래스를 이용하여 받아온다.
	
	다음으로 한국식 나이와 만 나이를 계산하여 출력해보고,
	2023년 6월 28일부터 한국에서 나이 계산이 만 나이로만 통일될 예정이므로
	정책이 적용되는 6월 28일 당일의 본인 나이도 출력해보자. //네이버 계산기 있음
 	
	↓ Console ↓	
	생년월일을 입력하시오(@@@@-@@-@@): 1993-05-16
	생년월일: 1993년 5월 16일 
	오늘날짜: 2023년 2월 27일 
	=======나이 계산=======
	한국식 나이: 31세
	오늘날짜 만 나이: 29세
	6월 28일 통일 나이: 30세

*/
package contents;

import java.util.Calendar;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("생년월일을 입력하시오(@@@@-@@-@@): ");
		String birth = sc.nextLine();
		
		//문자열 구간 자르기1 - substring()
		String birthYear = birth.substring(0, 4);
		String birthMonth = birth.substring(5, 7);
		String birthDay = birth.substring(8);
		
		//문자열 구간 자르기2 - split()
		String[] str = birth.split("-");
		
		//문자열을 정수로 타입 변환
		int birthY = Integer.parseInt(str[0]);
		int birthM = Integer.parseInt(str[1]);
		int birthD = Integer.parseInt(str[2]);
		
		System.out.println("생년월일 : " 
						+ birthY + "년 "
						+ birthM+ "월 "
						+ birthD+ "일");
		
		//Calendar클래스로 오늘날짜 가져오기
		Calendar now = Calendar.getInstance();
		int nowY = now.get(Calendar.YEAR);
		int nowM = now.get(Calendar.MONTH) + 1;
		int nowD = now.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("오늘날짜 : " 
				+ nowY + "년 "
				+ nowM+ "월 "
				+ nowD+ "일");
		
		System.out.println("=======나이 계산=======");
		//한국식 나이
		int ageKor = nowY - birthY + 1;
		System.out.println("한국식 나이: " + ageKor + "세");
		
		//오늘기준 만 나이 계산하기
		int ageGlobal = nowY - birthY - 1; 
		if(birthM < nowM ) { //오늘 월일 생월을 넘었을 경우
			ageGlobal++;
		}else if(birthM == nowM) {//오늘 월이 생월과 같을 경우
			if(birthD <= nowD) { //오늘날짜가 생일과 같거나 넘었을 경우
				ageGlobal++;
			}
		}
		System.out.println("오늘날짜 만 나이: " + ageGlobal + "세");
		
		//6월 28일 기준 만 나이 계산하기
		int ageJune = nowY - birthY - 1;
		if(birthM < 6 ) { //오늘 월일 생월을 넘었을 경우
			ageJune++;
		}else if(birthM == 6) {//오늘 월이 생월과 같을 경우
			if(birthD <= 28) { //오늘날짜가 생일과 같거나 넘었을 경우
				ageJune++;
			}
		}
		System.out.println("6월 28일 통일 나이: " + ageJune + "세");
		
	}
}












