package contents;

public class C04_Wrapper {
	public static void main(String[] args) {
		/* Wrapper 클래스 */
		//Byte, Short, Integer, Long
		//Character, Double, Float, Boolean
		//8개의 기본 자료형을 객체로 다루기 위한 클래스
		
		//Wrapper클래스의 객체 생성
		Integer i1 = new Integer(90);
		System.out.println(i1 + ", " + i1.getClass().getName());
		
		Integer i2 = Integer.valueOf(90);
		System.out.println(i2 + ", " + i2.getClass().getName());
		
		Double d = Double.valueOf(3.141592);
		System.out.println(d + ", " + d.getClass().getName());
		
		Character c = Character.valueOf('B');
		System.out.println(c + ", " + c.getClass().getName());
		
		Boolean b = Boolean.valueOf(true);
		System.out.println(b + ", " + b.getClass().getName());
		
		String s = String.valueOf("주말");
		System.out.println(s + ", " + s.getClass().getName());
		
		//문자열을 숫자 또는 논리형으로 타입 변환
		int numI = Integer.parseInt("100");
		double numD = Double.parseDouble("1.234");
		boolean bool = Boolean.parseBoolean("false");
		
		System.out.println(numI+50);
		System.out.println(numD+0.5);
		System.out.println(!bool);
		System.out.println();
		
		//기본 자료형을 문자열로 타입 변환
		String str1 = Integer.toString(200);
		String str2 = Double.toString(52.15);
		String str3 = Character.toString('H');
		String str4 = Boolean.toString(true);
		
		System.out.println(str1+50);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		//Integer클래스 더 알아보기
		String strA = Integer.toHexString(17);
		String strB = Integer.toBinaryString(5);
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		System.out.println(strA);
		System.out.println(strB);
		System.out.println(max);
		System.out.println(min);
		
		/* 박싱과 언박싱 */
		//박싱: 기본 자료형의 값을 Wrapper 객체로 변환하는 것
		//	Wrapper클래스타입 <- 기본타입
		//	Wrapper타입 객체명 = 값;
		Integer ten = 10; //자동 박싱 Integer.valueOf(10);
		String str = "자동 박싱"; //String.valueOf("자동 박싱"); 으로 자동처리
		
		int num = 5;
		Integer five = num; //자동 박싱
		System.out.println("five타입: " + five.getClass().getName());
		
		//언박싱: 기본타입 <- Wrapper타입
		int reNum = five;
//		System.out.println(reNum.getClass().getName());
//		에러: 클래스 타입만 확인 가능
	}
}










