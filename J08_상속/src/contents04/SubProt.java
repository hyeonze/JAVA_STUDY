package contents04;

import prot.SuperProt;

public class SubProt extends SuperProt{
	void getSuperMsg() {
//		System.out.println(ment);
//		에러: 다른 패키지의 클래스를 상속받은 자식클래스에서는
//		private와 default 상태의 멤버는 접근할 수 없다.
		msg(); //protected 범위는 접근 가능
	}
}
