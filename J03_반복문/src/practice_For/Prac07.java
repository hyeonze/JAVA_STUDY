/*
Q1)	이중for문을 이용하여 아래의 형태처럼 결과를 출력해보시오.
	단, 같은 줄의 숫자 간의 공백 거리는 tab만큼이다.
	
	↓ Console ↓
	1	2	3	4	5
	6	7	8	9	10
	11	12	13	14	15
	16	17	18	19	20
	21	22	23	24	25

	Tip) 탭만큼의 공백을 주는 코드는 "\t"
	
Q2)	이중for문을 이용하여 아래의 형태처럼 결과를 출력해보시오.
	단, 같은 줄의 숫자 간의 공백 거리는 tab만큼이다.
	
	↓ Console ↓
	5	4	3	2	1	
	10	9	8	7	6	
	15	14	13	12	11	
	20	19	18	17	16	
	25	24	23	22	21	

*/
package practice_For;

public class Prac07 {
	public static void main(String[] args) {
		//Q1)
		int num = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(num+"\t");
				num++;
			}
			System.out.println();
		}
		System.out.println();
		
		//외부for과 내부for의 반복변수로 만든 일반식 이용 
		for (int i = 0; i < 5; i++) {
			int startNum = 1 + 5*i;
			for (int j = 0; j < 5; j++) {
				System.out.print((startNum+j)+"\t");
			}
			System.out.println();
		}
		
		//Q2
//		System.out.println();
//		
//		for (int i = 0; i < 5; i++) {
//			int startNum = 5 + 5*i;
//			for (int j = 0; j < 5; j++) {
//				System.out.print( (startNum - j) + "\t");
//			}
//			System.out.println();
//		}
	}
}







