package contents;

import java.util.Scanner;

public class C02_String {
	public static void main(String[] args) {
		/* String 클래스 - 문자열을 표현하는 클래스 */
		//java.lang패키지 소속
		
		//String 객체를 생성하는 2가지 방법
		String w1 = "winter";
		String w2 = new String("winter");
		
		System.out.println(w1);
		System.out.println(w2);
		
		//2가지 방법의 차이(문자열의 메모리 위치 비교)
		System.out.println(w1==w2); //두 객체가 존재하는 스택 메모리 위치가 서로 다름
		String t1 = "winter";
		String t2 = new String("winter");
		System.out.println(w1==t1); //하나의 객체를 둘이서 공유한다(같은 객체 참조)
		System.out.println(w2==t2); //서로 다른 두개의 객체로 존재한다.
		
		//문자열 비교
//		Scanner sc = new Scanner(System.in);
//		System.out.print("문자열 입력: ");
//		String str1 = sc.next();
//		System.out.println("str1: " + str1);
//		System.out.println(str1 == t1);
//		System.out.println(str1.equals(t1));
		
		String str2 = "winte";
		char ch = 'r';
		str2 = str2 + ch;
		System.out.println(str2);
		System.out.println(t1 == str2);
		System.out.println(str2.equals(t1));
		System.out.println("===========");
		
		/* String 메소드 */
		//equals(): 문자열 비교하기
		System.out.println(w1.equals(w2));
		
		//length(): 문자열 길이 구하기
		System.out.println(w1.length());
		System.out.println("cold".length());
		
		//charAt(): 특정 인덱스 위치의 문자 확인하기
		String s = "New season";
		System.out.println(s.charAt(6));
		System.out.println("cold".charAt(2));
		
		//indexOf(): 문자열에서 주어진 문자(열)의 위치 확인하기
		System.out.println(s.indexOf('w'));
		System.out.println(s.indexOf('e'));
		System.out.println(s.indexOf('e', 2));
		System.out.println(s.indexOf("sea"));
		
		//substring(): 특정 위치부터 문자열 잘라내기
		System.out.println(s.substring(4));
		System.out.println(s.substring(4, 7));
		
		//replace(): 문자 교체하기
		String s2 = s.replace('s', 'S');
		System.out.println(s2);
		
		//replaceAll(): 문자열 교체하기
		String s3 = s.replaceAll("season", "Season");
		System.out.println(s3);
		
		//split(): 특정 문자를 기준으로 문자열을 잘라서 배열에 저장하기
		String year = "winter;spring;summer;fall";
		String[] season = year.split(";");
		for (int i = 0; i < season.length; i++) {
			System.out.println("계절: " + season[i]);
		}
		
		//toCharArray(): 문자열을 char배열로 변환하기
		String msg = "Time waits for no one";
		char[] time = msg.toCharArray();
		for (int i = 0; i < time.length; i++) {
			System.out.print(time[i]);
		}
		System.out.println();
		
		//toUpperCase(), toLowerCase(): 문자열 전부를 대문자 또는 소문자로 변경
		System.out.println(msg.toUpperCase());
		System.out.println(msg.toLowerCase());
	}
}
	













