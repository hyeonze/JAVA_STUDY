/*
# for반복문
for문은 코드 실행을 정해진 횟수만큼 반복할 때 사용한다.
	
	for(초기식; 조건식; 증감식){
		반복할 실행문..
	}

1) 초기식에서 변수의 시작값 설정(처음 한번만 실행)
2) 조건식이 참이면 반복을 수행
3) 증감식은 반복을 수행할 때마다 호출
*/
package contents;
public class C01_For {
	public static void main(String[] args) {
		/* for 반복문 */
		//0~4까지 5번 반복
		for (int i = 0; i < 5; i++) {
			System.out.println("반복"+i);
		}
		
		//1~10까지 자연수 출력하기
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		//"겨울" 7번 출력하기
		for (int j = 0; j < 7; j++) {
			System.out.println("겨울");
		}
		
		//구구단 3단 출력하기
		for (int i = 1; i <= 9; i++) {
			System.out.println("3 X " + i + " = " + 3 * i);
		}
		
		//"카운트다운" 5~1까지 출력하기
		for (int i = 5; i >= 1; i--) {
			System.out.println("카운트다운"+i);
		}
		
		//예제: 42~25까지의 수 한줄로 출력하기
		for (int i = 42; i >= 25; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//1~20까지의 홀수 출력하기
		for (int k = 1; k <= 20; k++) {
			if (k % 2 == 1) {
				System.out.print(k + " ");
			}
		}System.out.println();
		
		//예제: 1~50사이 3의 배수를 한줄로 출력 
		for (int k = 1; k <= 50; k++) {
			if (k % 3 == 0) {
				System.out.print(k + " ");
			}
		}System.out.println();
			
		//1~100사이 7의 배수 개수를 구하기
		int count = 0; //개수를 카운트할 변수 도입
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				count++;
			}
		}
		System.out.println("1~100사이 7의 배수 개수: " + count);
			
	}
}











