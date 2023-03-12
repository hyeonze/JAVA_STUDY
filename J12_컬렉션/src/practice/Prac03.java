/* list, set, map
Q)	사다리타기를 구현해보자.
	먼저 인원수를 입력받아서 해당 인원이 조별과제를 진행하는데
	각자의 역할 분담 선택을 사다리타기로 정하기로 하였다.
	다음처럼 인원수만큼 이름과 역할을 사용자로부터 입력 받고,
	사다라타기 추첨 결과를 화면에 나타나도록 구현해보자.
	
	↓ Console ↓	
	인원수 입력: 5
	이름1: A
	이름2: B
	이름3: C
	이름4: D
	이름5: E
	역할1: PPT제작
	역할2: 자료조사
	역할3: 발표
	역할4: 보고서작성
	역할5: 무임승차
	추첨중입니다..
	
	- 추첨 결과 -
	A -> 보고서작성
	B -> 발표
	C -> 무임승차
	D -> 자료조사
	E -> PPT제작

*/

package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Prac03 {
	public static void main(String[] args) {
		String[] nameArr = {"A", "B", "C", "D", "E"};
		String[] pickArr = {"PPT제작", "자료조사", "발표", "보고서작성", "무임승차"};
		int num = nameArr.length; //인원수 변수
		
		Random rd = new Random();
		
		/* 방법1. List의 동적인 특성을 이용 */
		System.out.println("====방법1====");
		//이름과 항목 값들을 각각 List로 저장
		ArrayList<String> name = new ArrayList<>();
		for(String put : nameArr) {//이름 리스트 구현
			name.add(put);
		}
		
		ArrayList<String> pick = new ArrayList<>();
		for(String put : pickArr) {//역할 리스트 구현
			pick.add(put);
		}
		
		//이름을 Key로, 역할을 Value로 Map을 구현
		HashMap<String, String> result = new HashMap<>();
		
		int index = num;
		for(int i = 0; i < num; i++) {
			int rdKey = rd.nextInt(index);
			int rdValue = rd.nextInt(index);
			
			//Map에 데이터 추가
			result.put(name.get(rdKey), pick.get(rdValue));
			
			//Map으로 추가된 Key와 Value 데이터 리스트에서 삭제
			name.remove(rdKey);
			pick.remove(rdValue);
			index--;//사용할 리스트 index도 감소
		}
		
		//사다라타기 결과 출력
		for (String key : result.keySet()) {
			System.out.println(key + " -> " + result.get(key));
		}
		
		/* 방법2. HashSet은 저장 순서가 없음(=랜덤)을 이용 */
		//단, 중복되는 이름이나 항목이 없을 경우만 사용 가능
		System.out.println("====방법2====");
		HashSet<String> name2 = new HashSet<>();
		for(String put : nameArr) {
			name2.add(put);
		}
		
		HashSet<String> pick2 = new HashSet<>();
		for(String put : pickArr) {
			pick2.add(put);
		}
		
		HashMap<String, String> result2 = new HashMap<>();
		Iterator<String> namekey = name2.iterator();
		Iterator<String> pickValue = pick2.iterator();
		for (int i = 0; i < nameArr.length; i++) {
			//name2와 pick2의 Set에서 하나씩 꺼내서 key, value 쌍으로 Map에 추가
			result2.put(namekey.next(), pickValue.next());
		}
		
		for(String key : result.keySet()) {
			System.out.println(key+" -> "+result2.get(key));
		} 
		
		/* 방법3. shuffle() 메소드 */
		System.out.println("====방법3====");
		ArrayList<String> nameS = new ArrayList<>();
		for(String put : nameArr) {
			nameS.add(put);
		}
		
		ArrayList<String> pickS = new ArrayList<>();
		for(String put : pickArr) {
			pickS.add(put);
		}
		
		//Collections클래스의 shuffle()메소드로 리스트 데이터 랜덤 정렬
		Collections.shuffle(pickS); //key와 value 중 하나만 셔플하면 된다.
		
		//이름과 역할 리스트 데이터를 key, value쌍으로 Map에 추가
		HashMap<String, String> result3 = new HashMap<>();
		for(int i=0;i<num;i++) {
			result3.put(nameS.get(i), pickS.get(i));
		}
		
		for(String key : result.keySet()) {
			System.out.println(key+" -> "+result3.get(key));
		}
		
	}
}







