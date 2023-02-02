package contents;

public class C01_Syso {
	public static void main(String[] args) {//클래스-메인공간-코드작성
		//System.out.println(출력할 내용);
		
//		1. 문자열 출력
//		쌍따옴표("") 안에 내용은 문자열 데이터로 인식
//		문자열 간에는 '+'기호로 이어 붙일 수 있다.
		System.out.println("겨울입니다.");
		System.out.println("날씨가 춥습니다.");
		System.out.println("2월이 " + "시작되었습니다.");
		
//		2. 숫자 데이터 출력
		System.out.println(30);//정수 출력
		System.out.println(12.5);//실수 출력
		System.out.println(10 + 20);//숫자 데이터 연산
		System.out.println(1.2 + 3.4);
		
//		3. 문자열과 숫자 데이터
		System.out.println("10");//문자열10 출력
		System.out.println(10);//숫자10 출력
		
//		형태가 다른 대상들 '+'기호로 결합 가능
		System.out.println("Maroon" + 5);
		System.out.println("오늘은 " + 1 + "월 입니다.");
		System.out.println("20 + 30 = " + (20 + 30)); //연산 우선순위 고려
		System.out.println("20 * 30 = " + 20 * 30);
		
//		4. println vs print
		System.out.println("자동으로 줄바꿈해주는");
		System.out.println("println");
		
		System.out.print("줄바꿈 없이 출력해주는");
		System.out.println("print");
		
//		\n: new line. 줄바꿈 실행.
		System.out.println("넣은 자리\n에서 줄바꿈");
		System.out.print("문자열 안에\n");
		System.out.println("줄바꿈 넣기");
		
//		C언어처럼 출력
		System.out.printf("정수값: %d", 30);
	}
}


