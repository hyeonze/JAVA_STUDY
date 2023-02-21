/*
# 패키지(package)
클래스들을 한곳에 모아놓은 폴더

# 패키지 생성하기
패키지명은 전부 소문자로 작성 원칙
점(.)으로 상위패키지.중간패키지.하위패키지.. 생성 가능
ex) com.megait.java301

# 다른 패키지에 있는 클래스 사용하기
★) import 패키지명.클래스명
2) 클래스의 풀네임인 패키지명.클래스명 객체 생성

*/
package contents01;//현재 속해 있는 패키지명

//import java.util.Scanner;//java.util패키지에 Scanner클래스가 속해 있다.
import java.util.*;//패키지명.* : 패키지 내의 모든 클래스를 import해온다.

import pck.OutPckCla;//import 명령문으로 원하는 외부 패키지의 클래스를 가져옴

public class C01_Package {
	public static void main(String[] args) {
		//import하지 않고 다른 패키지의 클래스를 사용하기
		pck.OutPckCla pckDot = new pck.OutPckCla();
		com.megait.java301.Friday f = new com.megait.java301.Friday();
		
		//패키지를 import한 후 다른 패키지의 클래스를 사용하기
		OutPckCla pckImp = new OutPckCla();
		Scanner sc = new Scanner(System.in);
		
//		pckImp.num = 10;
		
	}
}










