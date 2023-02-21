/*
Q)	학생의 시험 정보를 담는 Exam 클래스를 작성해보고 테스트해보자.
	학생의 정보 필드로는 이름, 과목, 학생이 기입한 정답번호를 가지며
	정답번호는 1~5 사이의 수이다. 
	생성자와 매개변수로 필드를 초기화하는 생성자를 하나 가진다.
	
	학생이 입력한 정답으로 성적 등급을 산출하고,
	학생의 이름, 과목, 성적을 출력문로 나타내는 메소드를 하나 가진다.
	학생이 기입한 정답들을 실제 정답과 비교하여 성적을 매기는 기준은 다음과 같다.
	
	정답개수	성적
	5, 4	A
	3, 2	B
	1, 0	C
	
	Tip) 학생의 정보들은 콘솔창에서 입력 받도록 메인 메소드에서 코드를 작성한다.
	이와 같은 Exam 클래스로 객체를 만들어서 나타낼 실행 결과는 다음과 같다.
	
	↓ Console ↓
	학생의 이름을 입력하세요: 최현
	시험 과목을 입력하세요: 자바
	1번 정답을 입력하세요: 3
	2번 정답을 입력하세요: 2
	3번 정답을 입력하세요: 3
	4번 정답을 입력하세요: 4
	5번 정답을 입력하세요: 1
	채점중입니다..
	최현님의 자바 시험 성적은 B입니다.

*/
package practice03;

import java.util.Scanner;

public class Prac03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생의 이름을 입력하세요: ");
		String n = sc.next();
		System.out.print("시험 과목을 입력하세요: ");
		String s = sc.next();
		
		int[] m = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print((i+1)+"번 정답을 입력하세요: ");
			m[i] = sc.nextInt();
		}
		
		System.out.println("채점중입니다...");
		
		//이름, 과목, 정답번호를 생성자 매개값으로 전달해서 객체 생성
		Exam ch = new Exam(n, s, m);
		ch.showGrade();
	}
}






