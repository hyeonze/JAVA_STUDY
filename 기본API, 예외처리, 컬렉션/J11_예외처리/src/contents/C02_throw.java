package contents;

import java.util.Scanner;

public class C02_throw {
	public static void main(String[] args) {
		/* throw */
		//throw키워드로 프로그래머가 고의로(직접) 예외를 발생시킬 수 있다. 
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("정수1 입력: ");
				int num1 = sc.nextInt();
				System.out.print("정수2 입력: ");
				int num2 = sc.nextInt();
				
				if(num2==1) {
					//메세지를 담아서 예외를 발생시킨다.
					throw new Exception("1로 나누는건 재미없습니다.");
				}
				
				if(num2==-1) {
					//메세지를 담아서 예외를 발생시킨다.
//					throw new Exception("-1로 나누는건 재미없습니다.");
					
					//위의 한줄과 같은 실행문
					//Exception 예외클래스의 객체를 생성
					Exception e = new Exception("-1로 나누는건 재미없습니다.");
					throw e; //예외를 발생시킨다
				}
				
				System.out.println("num1/num2 = " + num1/num2);
				break;
			}catch(Exception e) {
				System.err.println("오류: " + e.getMessage());
			}
		}
	}
}



