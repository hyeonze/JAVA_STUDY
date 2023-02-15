/*
Q)	다음과 같은 Student 클래스 파일을 생성하고 
	메인 클래스에서 객체를 생성하여 
 	멤버변수 값을 초기화고, 메소드도 실행시켜 확인해보자.  
 	
	Student 클래스 구성
	{
		@필드
		이름, 수업명, 생일(월)
	
		@메소드
		showSubject(): 수업명을 알려주는 메소드
		birth(): 필드의 이름과 생일(월) 변수를 사용해서 
				 학생의 생일이 몇 월인지 출력문으로 알려주는 메소드
					  
	}
	
	↓ Console ↓
	java 수업을 수강중입니다.
	최현님의 생일은 5월 입니다.
*/
package practice01;

public class Prac01 {
	public static void main(String[] args) {
		Student s = new Student();
		
		//객체 필드 초기화
		s.name = "최현";
		s.subject = "자바";
		s.month = 5;
		
		//객체 메소드 실행
		s.showSubject();
		s.birth();
	}
}







