package contents;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class C02_Set {
	public static void main(String[] args) {
		/* Set : 순서가 없고 중복을 허용하지 않는 데이터의 집합 */ //순서X -> index X
		//Set 인터페이스로 사용가능한 클래스
		Set<Double> setH = new HashSet<>();
		Set<Double> setT = new TreeSet<>(); //정렬과 검색 기능 추가
		Set<Double> setL = new LinkedHashSet<>(); //저장순서 유지기능 추가
		
		/* String 데이터의 HashSet 객체 사용하기 */
		HashSet<String> menu = new HashSet<>(); 
		
		//데이터 추가
		menu.add("피자");
		menu.add("햄버거");
		menu.add("피자"); //중복 허용X
		menu.add("샐러드");
		menu.add("파스타");
		menu.add("와인");
		
		//데이터 확인
		System.out.println("menu: " + menu); //저장순서 유지X
		System.out.println("menu 셋 개수: " + menu.size());
		
		//데이터 검색
		System.out.println(menu.contains("샐러드"));//해당 데이터 있는지 확인
		System.out.println(menu.contains("리조또"));
		
		//데이터 꺼내오기 by Iterator
		//Iterator클래스: 컬렉션의 데이터를 하나씩 읽어올때 사용
		Iterator<String> iterator = menu.iterator();
//		System.out.println(iterator.next()); //next(): 다음 데이터 꺼내오기
		while(iterator.hasNext()) {//다음 데이터가 비어있을 때까지 반복
			//hasNext(): 다음 데이터가 들어있는지 확인(true/false)
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		//데이터 꺼내오기 by 향상된 for문
		for(String element : menu) {
			System.out.print(element + " ");
		}
		System.out.println();
		
		//데이터 삭제
		menu.remove("햄버거");
		System.out.println("menu: " + menu);
		
		System.out.println("Set이 비어있는가? " + menu.isEmpty());
		menu.clear();
		System.out.println("menu: " + menu);
		System.out.println("Set이 비어있는가? " + menu.isEmpty());
		
		/* Integer 데이터의 TreeSet 객체 사용하기 */
		//TreeSet은 HashSet에서 데이터 정렬과 검색 기능이 추가
		Integer[] arr = {20, 50, 30, 50, 10, 40};
		TreeSet<Integer> num = new TreeSet<>(List.of(arr));//셋 <- 리스트 <- 배열
		
		//1. 데이터 정렬
		//TreeSet은 데이터를 오름차순으로 출력
		System.out.println(num);
		
		//descendingSet(): 현재의 정렬을 역순으로 바꿈
		System.out.println(num.descendingSet());//내림차순 출력
		System.out.println(num.descendingSet().descendingSet());
		
		//2. 데이터 검색
		//first(), last(): 최소값, 최대값 리턴
		System.out.println("num.first(): " + num.first());
		System.out.println("num.last(): " + num.last());
		
		//lower(E), higher(E): 입력 원소보다 하나 낮거나 높은 수 
		System.out.println("num.lower(30): " + num.lower(30));
		System.out.println("num.higher(30): " + num.higher(30));
		
		//floor(E), ceiling(E): 입력 원소 이하 혹은 이상의 수
		System.out.println("num.floor(30): " + num.floor(30));
		System.out.println("num.ceiling(15): " + num.ceiling(15));
		
		//toArray(): 배열 <- Set 변환
		Integer[] setArr = num.toArray(new Integer[0]);
		System.out.println("setArr[0]: " + setArr[0]);
		System.out.println("setArr: " + Arrays.toString(setArr));
	}
}








