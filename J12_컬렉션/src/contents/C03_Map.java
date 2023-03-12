package contents;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class C03_Map {
	public static void main(String[] args) {
		/* Map : 키(Key)와 값(Value)의 쌍으로 이루어진 데이터의 집합 */
		//Map 인터페이스로 사용가능한 클래스
		Map<String, Integer> mapH = new HashMap<>();
		Map<Integer, Boolean> mapT = new TreeMap<>(); //정렬과 검색 기능 추가
		Map<Character, Integer> mapL = new LinkedHashMap<>(); //저장순서 유지기능 추가
		
		/* HashMap 객체 사용하기 */
		HashMap<String, Integer> road = new HashMap<>();
		
		//데이터 추가
		road.put("떡볶이", 3000);
		road.put("순대", 4000);
		road.put("어묵", 1000);
		road.put("김밥", 3000);
		road.put("핫도그", 1000);
		road.put("김밥", 5000); //key는 중복 불가
		
		//데이터 확인
		System.out.println("road: " + road);
		System.out.println("road 맵 몇 쌍: " + road.size());
		
		//데이터 검색
		System.out.println(road.containsKey("순대"));//해당 Key가 있는지 확인
		System.out.println(road.get("순대"));//해당 Key의 Value 가져오기
		System.out.println(road.containsValue(1000)); //해당 Value가 있는지 확인
		
		System.out.println("road.keySet(): " + road.keySet()); //모든 Key를 Set에 담아 리턴★
		
		//데이터 가져오기 by Iterator
		Set<String> keySet = road.keySet(); 
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next(); //반복해서 Key를 받아옴
			System.out.println(key + " : " + road.get(key));
		}
		System.out.println();
		
		//데이터 가져오기 by 향상된 for문
		for(String key : road.keySet()) {
			System.out.println(key + " : " + road.get(key));
		}
		
		//데이터 삭제
		road.remove("핫도그");
		System.out.println("road: " + road);
		
		System.out.println("Map이 비어있는가? " + road.isEmpty());
		road.clear();
		System.out.println("road: " + road);
		System.out.println("Map이 비어있는가? " + road.isEmpty());
	}
}












