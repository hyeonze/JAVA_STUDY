package contents04;

import java.util.Arrays;

public class C05_MainStringArgs {
	public static void main(String[] args) {
		/* (String[] args) 매개변수 알아보기 */
		//현재 페이지 클래스의 메인 메소드 매개변수 활용하기
		System.out.println(args);
		System.out.println("메인메소드 매개변수 길이(개수): " + args.length);
		
		//Run > Run Configurations > 클래스명 > Arguments > Program arguments: 내용 입력 > Run
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(Arrays.toString(args));
		args[0] = "Funny";
		System.out.println(Arrays.toString(args));
		
		//다른 클래스의 메인 메소드를 실행해보기
		//문자열 배열의 인자(Arguments) 값을 넣어서 메인 메소드 실행
		String[] msg = {"Time", "waits", "for", "no", "one"};
		ArgsEx.main(msg);//ArgsEx클래스의 메인메소드를 실행하는데 필요한 자료를 전달
	}
}





