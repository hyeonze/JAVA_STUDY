package contents;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C01_Scanner {
	public static void main(String[] args) throws FileNotFoundException {
		/*Scanner 클래스*/
		//응용프로그램이 키 입력을 받기 위한 클래스
		Scanner sc = new Scanner(System.in);
		
		//nextLine(): 엔터 키 입력 전까지의 문자열을 받는다.
		//next(): 공백 전까지의 문자열만 입력 받는다.
//		System.out.print("영어이름 입력: ");
//		String name = sc.next();
//		System.out.println("name: " + name);
		
		//next().charAt(0): 입력받은 문자열에서 첫번째 단어만 가져온다.
		//					=> 단일문자 입력 받는 용도..
//		System.out.print("문자 입력: ");
//		char ch = sc.next().charAt(0);
//		System.out.println("ch: " + ch);
//		char ch2 = 65;
//		System.out.println("ch2: " + ch2);
		
		//nextInt(): 정수 입력 받기
		//nextDouble(): 실수 입력 받기
		//nextBoolea(): 논리값 입력 받기
		
		//문자열 읽어오기
		String str = "spring is coming";
		Scanner sc2 = new Scanner(str);
		System.out.println(sc2.next());
		
		//텍스트파일 읽어오기
		File file = new File("sample.txt");
		Scanner sc3 = new Scanner(file);
		System.out.println(sc3.nextLine());
		
		sc.close();
		sc2.close();
		sc3.close();
	}
}










