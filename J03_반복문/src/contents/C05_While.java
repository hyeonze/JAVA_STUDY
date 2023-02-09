/*
# while 반복문
while문은 무한반복 혹은 반복할 횟수가 정해지지 않았을때 사용한다.

	while(조건식){
		반복할 실행문..
	}
	
- 조건식이 참이면 계속해서 반복을 실행
- 조건식이 거짓이 되면 반복 중지

# break 키워드
반복분을 빠져나옴. 탈출(exit)
if문과 함께 사용

# continue 키워드
반복문 처음으로 돌아감
continue 다음줄부터의 실행문은 스킵

*/
package contents;

import java.util.Scanner;

public class C05_While {
	public static void main(String[] args) {
		/* while 반복문 */
		//5번 반복하기
		int i = 1;
		while(i<=5) {
			System.out.println("반복"+i);
			i++;//없으면 무한반복 실행
		}
		
		//1~10까지 자연수 출력하기
		int w = 1;//시작값(for문 초기식)
		while (w <= 10) {// 조건식
			System.out.println(w);
			w++;// 증감식
		}
		
		//7~0까지 정수 출력하기
		int j = 7;
		while(j>=0) {
			System.out.println("j = "+j);
			j--;
		}
		
		//1~10까지 자연수 합 구하기
		int k = 1, sum = 0;
		while(k<=10) {
			sum += k;
			k++;
		}
		System.out.println("sum = " + sum);
		
		/* break 키워드 */
		//5번 반복하기
		int b = 1;//시작값
		while(true) {
			System.out.println("반복"+b);
			if(b>=5) {//조건식
				break;//반복문 탈출
			}
			b++;//증감식
		}
		
		//1~20사이의 홀수 출력하기
		int p = 1;
		while(true) {
			if(p%2==1) {
				System.out.print(p+" ");
			}
			if(p==20) {
				break;
			}
			p++;
		}System.out.println();
		
		//입력받아서 while문 탈출하기
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("반복을 멈추려면 -1을 입력하세요: ");
			int quit = sc.nextInt();
			if(quit == -1) {
				System.out.println("반복을 종료합니다.");
				break;
			}
		}
		
		/* continue 키워드 */
		//10~30사이 5의배수 제외하고 출력하기
		int c = 10;
		while(c<=29) {
			c++;
			if (c % 5 == 0) {
				//5의 배수일 경우 continue로 반복문 처음으로 돌아감
				continue;
			}
			System.out.print(c+" ");
		}
	}
}























