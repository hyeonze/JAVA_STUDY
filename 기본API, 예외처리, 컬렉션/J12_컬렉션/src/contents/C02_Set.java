package contents;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class C02_Set {
	public static void main(String[] args) {
		/* Set : 순서가 없고 중복을 허용하지 않는 데이터의 집합 */ //순서X -> index X
		//Set 인터페이스로 사용가능한 클래스
		Set<Double> setH = new HashSet<>();
		Set<Double> setT = new TreeSet<>(); //정렬과 검색 기능 추가
		Set<Double> setL = new LinkedHashSet<>(); //저장순서 유지기능 추가
		
	}
}
