package contents;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class C01_List {
	public static void main(String[] args) {
		/* List: 순서가 있고 중복을 허용하는 데이터의 집합 */ //순서O -> index O
		//List 인터페이스로 사용 가능한 클래스
		List<String> listA = new ArrayList<>(); //배열기반의 리스트
		List<String> listL = new LinkedList<>(); //연결기반의 리스트. 데이터의 추가와 삭제에 유리.
		List<String> listV = new Vector<>(); //Vector가 개선되어 ArrayList 출현.
		List<String> listS = new Stack<>(); //LIFO 구조
		
		/* String 데이터의 ArrayList 객체 사용하기 */
		ArrayList<String> cafe = new ArrayList<>();
		ArrayList<String> cafe2 = new ArrayList<String>();//뒷부분 <>는 내용을 생략해도 앞의 타입이 들어있음
		System.out.println("cafe 타입: " + cafe.getClass().getName());
		
		//데이터 추가
		cafe.add("와플");
		cafe.add("아메리카노");
		cafe.add("와플");
		cafe.add("아이스크림");
		cafe.add("허브티");
		
		//데이터 확인
		System.out.println("cafe: " + cafe.toString());
		System.out.println("cafe: " + cafe);
		System.out.println("cafe 리스트 개수: " + cafe.size());
		
		//index에 데이터 추가
		cafe.add(1, "케이크");
		System.out.println("cafe: " + cafe);
		System.out.println("cafe 리스트 개수: " + cafe.size());
		
		//데이터 수정
		cafe.set(4, "젤라또"); //index의 데이터 수정
		System.out.println("cafe: " + cafe);
		
		//데이터 검색
		//	contains(): 해당 데이터가 자료에 포함되어 있는지 유무 확인
		System.out.println(cafe.contains("카페라떼"));
		System.out.println(cafe.contains("아메리카노"));
		//	get(i): index의 데이터 리턴
		System.out.println(cafe.get(4));
		
		for (int i = 0; i < cafe.size(); i++) {
			if(cafe.get(i).equals("아메리카노")) {
				System.out.println("아메리카노의 index: " + i);
			}
		}
		
		//데이터 삭제
		//	remove(int index): index의 데이터 삭제 
		cafe.remove(3); 
		System.out.println("cafe: " + cafe);
		//	remove(Object o): 해당 객체 데이터 삭제
		cafe.remove("허브티");
		System.out.println("cafe: " + cafe);
		
		System.out.println("List가 비어있는가? " + cafe.isEmpty());
		cafe.clear(); //모든 데이터 삭제
		System.out.println("cafe: " + cafe);
		System.out.println("List가 비어있는가? " + cafe.isEmpty());
		
		/* Integer 데이터의 ArrayList 객체 사용하기 */
		//List.of로 정수 배열을 먼저 생성하고 Integer클래스로 박싱 
		ArrayList<Integer> num = new ArrayList<>(List.of(30, 5, 2023, 20, 15, 10));
		
		//Wrapper클래스 Integer타입의 배열을 리스트로 변환
		Integer[] arr = {30, 5, 2023, 20, 15, 10};
		ArrayList<Integer> num2 = new ArrayList<>(List.of(arr)); //num리스트와 동일
		
		//데이터 가공 가능
		System.out.println("num: " + num);
		num.remove(2);
		System.out.println("num: " + num);
		num.add(25);
		System.out.println("num: " + num);
		
		//오름차순 정렬
		Collections.sort(num);
		System.out.println("오름차순 정렬: " + num);
		
		//내림차순 정렬
		Collections.sort(num, Collections.reverseOrder());
		System.out.println("내림차순 정렬: " + num);
		
		//toArray(): 배열 <- 리스트 변환
		Integer[] arrInteg = num.toArray(new Integer[0]);
		System.out.println("arrInteg[0]: " + arrInteg[0]);
		System.out.println("arrInteg: " + Arrays.toString(arrInteg));
		
		/* 사용자가 만든 클래스 타입의 ArrayList객체 사용하기 */
		//Waffle타입 리스트의 데이터로 사용가능한 ArrayList 객체 생성
		ArrayList<Waffle> waf = new ArrayList<>();
//		waf.add(10); 에러: Waffle타입이 아닌 데이터는 저장 불가능
		waf.add(new Waffle("초코와플", 3000));
		waf.add(new Waffle("아이스크림와플", 5000));
		waf.add(new Waffle("초코딸기와플", 7000));
		System.out.println(waf);
		
		for (int i = 0; i < waf.size(); i++) {
			waf.get(i).show(); //i번째 객체의 show메소드 실행
		}
		
		//참고)
		//경고메세지: ArrayList is a raw type. 
		//References to generic type ArrayList<E> should be parameterized
		ArrayList list = new ArrayList(); //타입 상관없이 데이터 저장 가능 but 권장X
		list.add(10);
		list.add(22.5);
		list.add('K');
		list.add(true);
		System.out.println(list);
		
		list.add(new Waffle("누텔라와플", 5000));
		System.out.println(list);
		
		int a = num.get(0); //오토 언박싱: int <- Integer 자동으로 타입변환
		System.out.println(a);
		
//		int b = list.get(0); //언박싱을 자동으로 안해준다
		int b = (int)list.get(0); //강제 언박싱
	}
}

class Waffle{
	String name; 
	int price;
	
	public Waffle(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void show() {
		System.out.println(this.name+" "+this.price+"원");
	}
}








