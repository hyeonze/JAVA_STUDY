package contents;

public class C02_PutData {
	public static void main(String[] args) {
//		= : 대입연산자
//		오른쪽의 데이터를 왼쪽 대상에 저장한다.
//		cf) 같음은 '=='
		
		int a;
		a = 10;//정수 대입
		System.out.println(a);
		
		int b;
		b = 20;
		System.out.println(b);
		
		b = a;//a값을 b에 대입
		System.out.println(b);
		b = a + 100;//(a+100)의 결과를 b에 대입 
		System.out.println(b);
		a = b = 50; //50을 b에 대입한 후 b값을 a에 대입
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
		
		String c;
		c = "문자열대입"; //c에 문자열 내용을 대입
		System.out.println(c);
	}
}
