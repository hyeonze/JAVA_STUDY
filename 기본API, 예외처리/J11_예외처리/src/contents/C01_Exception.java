/*
# 예외
사용자의 잘못된 코드 작성으로 인해 프로그램 실행중에 예기치 못하게 발생하는 오류
사용자가 해결할 수 있는 오류이다.
cf) 에러(error): 자바 가상 머신에서 발생하는 오류. 사용자가 해결X
				문법을 잘못 작성한 코드는 컴파일러에 의해 컴파일 에러로 걸러진다.

# 예외처리
예외가 발생하더라도 프로그램이 갑작스럽게 종료되지 않고,
계속 실행시킬수 있도록 예외를 처리해줄 수 있다. 

# try ~ catch 예외처리 방법
	try{
		예외 발생 가능성 있는 코드
	} catch(예외클래스명 e){
		예외 처리 코드
	} finally{
		무조건 실행
	}

# 대표적인 예외
ArithmeticException: 정수를 0으로 나눌 때 발생
InputMismatchException: Scanner로 입력받을 때 주어진 형식과 맞지 않게 입력하면 발생
ArrayIndexOutOfBoundsException: 배열의 범위를 벗어나서 접근한 경우 발생
Exception: 모든 예외를 잡아주는 클래스
*/
package contents;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_Exception {
	public static void main(String[] args) {
		/* 예외 처리하기 */
		System.out.println("실행 시작");
		int num1 = 10;
		int num2 = 0;
		
//		System.out.println(num1/num2);
//		실행 중 예외 발생. 예외의 종류를 보여주고 자바 강제 종료
		
		Scanner sc = new Scanner(System.in);
		
		//대표적인 예외들 처리해보기
		try {
//			int[] num = new int[2];
//			System.out.print("정수1 입력: ");
//			num[0] = sc.nextInt();
//			System.out.print("정수2 입력: ");
//			num[1] = sc.nextInt();
////			System.out.print("정수3 입력: ");
////			num[2] = sc.nextInt();
//			
//			System.out.println("num[0]/num[1] = " + num[0]/num[1]);
//			System.out.println("@@@@@@@@@@@@");
		}catch(ArithmeticException e) {
			System.err.println("정수를 0으로 나눌 수 없습니다.");
			e.printStackTrace(); //에러의 발생위치를 출력
		}catch(InputMismatchException e) {
			System.err.println("정수가 아닌 타입을 입력받을 수 없습니다.");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("배열의 범위를 벗어난 접근입니다.");
			e.printStackTrace();
		}finally {
			System.out.println("예외와 상관없이 무조건 실행");
		}
		
		//Exception 클래스
		try {
			int[] num = new int[2];
			System.out.print("정수1 입력: ");
			num[0] = sc.nextInt();
			System.out.print("정수2 입력: ");
			num[1] = sc.nextInt();
			System.out.println("num[0]/num[1] = " + num[0]/num[1]);
		}catch(Exception e) {
			System.err.println("오류 발생");
			e.printStackTrace();
		}
	}
}










