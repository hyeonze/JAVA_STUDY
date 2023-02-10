package contents;

public class C02_Array2 {
	public static void main(String[] args) {
		/* 실수 타입 배열 생성하기 */
		double[] grade = { 4.3, 3.7, 2.5, 3.3, 4.2, 4.0, 3.2 };
		
		//학점이 3.5이상인 학생 수 찾기
		int count = 0;
		for (int i = 0; i < grade.length; i++) {
			if(grade[i]>=3.5) {
				count++;
			}
		}
		System.out.println("학점이 3.5이상인 학생은 "+count+"명입니다.");
		
		/* 문자 타입 배열 생성하기 */
		char[] ch = new char[5];
		ch[0] = 'H';
		ch[1] = 'a';
		ch[2] = 'p';
		ch[3] = 'p';
		ch[4] = 'y';
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		
		/* 문자열 배열 생성하기 */
		String[] names = {"아이유", "송중기", "송혜교", "존박", "쯔위",
				"딘", "하입보이", "개코", "윤하", "침착맨", "주호민"};
		
		System.out.println(names[3]);
		
		//이름이 두글자인 인원 확인하기
		int cnt = 0; //두글자 인원 카운트할 변수
		for (int i = 0; i < names.length; i++) {
			//문자열 길이 구하기: 문자열.length()
			if(names[i].length() == 2) {
				cnt++;
			}
		}
		System.out.println("이름이 두글자인 사람은 "+cnt+"명입니다.");
		
		/* 문자와 문자열의 관계 */
		String str = "winter";
		
		//문자열에서 index값으로 문자를 읽어올 수 있다.
		System.out.println(str.charAt(5)); 
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		//문자열 -> 문자 배열 변환하여 저장하는 방법
		char[] abc = str.toCharArray();
		for (int i = 0; i < abc.length; i++) {
			System.out.println(abc[i]);
		}
		
		//문자 배열 -> 문자열 변환하여 저장하는 방법
		String msg = new String(ch);
		System.out.println(msg);
		System.out.println("타입확인: " + msg.getClass().getName());
	}
}












