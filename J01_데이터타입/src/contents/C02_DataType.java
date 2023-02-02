/*
# 자료형(Data Type)
("자료형" = "데이터 타입" = "타입")
변수를 생성할 때 사용되는 키워드
자료형으로 데이터의 타입과 크기를 정한다. 
기본 타입: byte, short, int, long, float, double, char, boolean

1. 정수 자료형
음의 정수, 0, 양의 정수를 저장하는 자료형
소수점 포함X
	int age = 25;
	
정수타입	크기
byte		1byte
short	2byte
int		4byte	일반형★
long		8byte	확장형

2. 실수 자료형
소수점을 포함한 실수를 저장하는 자료형
	double weight = 68.5;

실수타입	크기
float	4byte	약식형
double	8byte	일반형★

3. 문자 자료형
하나의 문자를 저장하는 자료형. character
외따옴표('') 안에 표기!
	char grade = 'A';

char		2byte

4. 문자열 자료형
문자열을 저장하는 클래스 참조 타입(기본 타입X)
쌍따옴표("") 안에 표기
	String name = "hyun";

5. 논리 자료형
참/거짓 데이터를 저장하는 자료형
	boolean cold = true;
	boolean hot = false;

boolean	1byte

# bit(binary digit)
컴퓨터의 데이터를 나타내는 최소 단위
1bit는 0이나 1 둘 중 하나의 값
1byte = 1bit X 8 

*/
package contents;

public class C02_DataType {
	public static void main(String[] args) {
		/* 1. 정수 자료형 */
		byte by = 10;
		short sh = 20;
		int numI = 30;
		long numL = 40;
		System.out.println(by);
		System.out.println(sh);
		System.out.println(numI);
		System.out.println(numL);
		
//		numI = 12345678901; //에러: 오버플로우 
		numL = 12345678901L; //숫자L: long타입으로 변환 
		System.out.println(numL);
		
		/* 2. 실수 자료형 */
		double numD = 3.14;
		float numF = 3.14f; //숫자f: float타입으로 변환
		System.out.println(numD);
		System.out.println(numF);
		
		/* 3. 문자 자료형 */
		char ch1 = 'k';
		System.out.println(ch1);
		char ch2 = '가';
		System.out.println(ch2);
		char ch3 = 65; //컴퓨터는 문자도 실제로는 숫자로 저장되어 있다.
		System.out.println(ch3); //'A'는 아스키코드 10진수로 65
		
		/* 4. 문자열 자료형 */
		String str1 = "happy wedding";
		String str2 = "happy new year!";
		System.out.println(str1);
		System.out.println(str2);
		
		/* 5. 논리 자료형 */
		boolean cold = true;
		boolean hot = false;
		System.out.println(cold);
		System.out.println(hot);
	}
}











