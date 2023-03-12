package contents;

import java.io.File;
import java.util.Arrays;

public class C05_Object {
	public static void main(String[] args) {
		/* Object 클래스 */
//		자바에서 사용되는 모든 클래스들의 최상위 부모클래스(조상클래스)
//		모든 클래스는 Object클래스를 자동으로 상속 받는다. 
		
		//Object클래스에서 제공하는 기본 메소드들
		Object obj = new Object();
//		obj.
		
		//Object의 모든 메소드를 다른 클래스들에서 기본적으로 사용 가능
		Example ex = new Example();
//		ex.
		
		/* Object 메소드 */
		//getClass(): 객체의 클래스 확인
		System.out.println(ex.getClass());
		System.out.println(obj.getClass().getName());
		System.out.println("winter".getClass().getName());
		char[] arr = new char[10];
		System.out.println(arr.getClass().getName());
		
		//equals(): 서로 같은 객체인지 비교
		String str = "spring";
		System.out.println(str.equals("winter"));
		
		Example ample = new Example();
		System.out.println(ex.equals(ample));
		ample = ex; //얕은 복사(공유, 주소복사)
		System.out.println(ex.equals(ample));
		
		//toString(): 객체의 문자열 확인
		System.out.println(ample.toString());
		System.out.println(arr.toString());
		
		//toString() 메소드 오버라이딩하여 사용하기
		ExOver ov = new ExOver();
		ov.msg = "toString 오버라이딩";
		System.out.println(ov.toString());//오버라이딩된 toString메소드로 호출
		
		File f = new File("D:\\최현\\workspace\\J10_기본API\\src\\contents");
		System.out.println(f.toString());//오버라이딩: 객체의 파일 위치 경로를 출력
		
		//cf)
		int[] abc = {10,20,30,40};
		System.out.println(Arrays.toString(abc)); //오버로딩된 메소드
	}
}

class Example{
	
}

class ExOver{
	String msg;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "예제 메세지 출력: " + msg;
	}
	
}







