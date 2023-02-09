/*
# do-while문
우선 한번 실행하고 조건식에 따라 반복을 수행한다.

	do{
		반복할 실행문..
	}while(조건식);

*/
package contents;

public class C06_DoWhile {
	public static void main(String[] args) {
		/* do-while문 */
		//1~10까지 자연수 출력하기
		int i = 1;
		do {
			System.out.println(i);
			i++;
		}while(i<=10);
		
		//while문과의 차이
		int k = 0;
		while (k > 0) {//조건식 거짓 -> while문 실행X
			System.out.println("while문 실행");
		}
		
		do {//조건식이 거짓이어도 처음 한번은 실행
			System.out.println("do-while문 실행");
		} while (k > 0);
		
	}
}







