package contents04;

import java.util.Arrays;

public class ArgsEx {
	public static void main(String[] abcd) {
		System.out.println("ArgsEx 메인메소드 실행");
		System.out.println(Arrays.toString(abcd));
		System.out.println("ArgsEx 메인메소드 매개변수 길이: " +abcd.length);
	}
}
