/*
# 중첩 반복문
	
	for(초기식; 조건식; 증감식){
		실행문A..
		for(초기식; 조건식; 증감식){
			실행문B..
		}
		실행문C..
	}
	
외부 for문에 진입하면 실행문A가 먼저 수행되고,
내부 for문에 진입해서 실행문B를 반복해서 수행을 끝내면,
실행문C를 수행하고 다시 외부for문 처음으로 돌아가서 반복을 진행
*/
package contents;
public class C04_For_For {
	public static void main(String[] args) {
		/* 중첩 반복문: 반복문 안에 반복문 */
		for (int i = 1; i <= 5; i++) {//내부 for문 반복을 마치면 수행
			for (int j = 1; j <= 3; j++) {//반복문 먼저 수행
				System.out.println("i = " + i + " | j = " + j);
			}
		}
		System.out.println("##############");
		
		//구구단 출력하기1
		for (int i = 2; i <= 9; i++) {
			System.out.println("====="+i+"단=====");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println(i+"단 종료");
		}
		
		//예제: 구구단 출력하기2
		/*
		2단: 2 4 6 8 10 12 14 16 18 
		3단: 3 6 9 12 15 18 21 24 27 
		4단: 4 8 12 16 20 24 28 32 36 
		5단: 5 10 15 20 25 30 35 40 45 
		6단: 6 12 18 24 30 36 42 48 54 
		7단: 7 14 21 28 35 42 49 56 63 
		8단: 8 16 24 32 40 48 56 64 72 
		9단: 9 18 27 36 45 54 63 72 81 
		*/
		for (int i = 2; i <= 9; i++) {
			System.out.print(i+"단: ");
			for (int j = 1; j <= 9; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();
		}
		
		/* 이중for문 반복 횟수 확인하기 */
		int count = 0; //반복 횟수를 카운트할 변수
		for (int i = 1; i < 30; i++) {
			count++;
		}
		System.out.println("반복 횟수: " + count);
		System.out.println();
		
		System.out.println("외부for: 0<=i<4, 4번 반복");
		System.out.println("내부for: 0<=j<3, 3번 반복");
		int count1 = 0; //외부for문 반복 횟수 체크
		int count2 = 0; //내부for문 반복 횟수 체크
		for (int i = 0; i < 4; i++) { //4번 반복 조건
			count1++;
			for (int j = 0; j < 3; j++) {//3번 반복 조건
				count2++; //총 반복 횟수: 4 X 3 = 12
			}
		}
		System.out.println("외부for문 반복 횟수: " + count1);
		System.out.println("내부for문 반복 횟수: " + count2);
		System.out.println();
		
		System.out.println("외부for: 0<=i<4, 4번 반복");
		System.out.println("내부for: 0<=j<i, i번 반복");
		count1 = 0; //count변수 초기화
		count2 = 0; 
		for (int i = 0; i < 4; i++) { //4번 반복 조건
			count1++;
			for (int j = 0; j < i; j++) {//i번 반복 조건
				count2++; //총 반복 횟수: 0 + 1 + 2 + 3 = 6
			}
		}
		System.out.println("외부for문 반복 횟수: " + count1);
		System.out.println("내부for문 반복 횟수: " + count2);
	}
}













