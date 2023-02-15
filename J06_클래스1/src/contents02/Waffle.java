package contents02;

public class Waffle {
	//매개변수 0개
	String name() {
		return "와플";
	}
	
	//매개변수 1개
	String name(String source) {
		return source+"와플";
	}
	
	//매개변수 2개 (문자열, 문자열)
	String name(String source, String source2) {
		return source+source2+"와플";
	}
	
	//매개변수 2개 (문자열, 정수)
	String name(String source, int count) {
		return source+"와플 "+count+"개";
	}
}







