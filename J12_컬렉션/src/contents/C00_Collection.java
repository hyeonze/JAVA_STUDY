/*
# 컬렉션 프레임워크(Collection Framework)
여러개의 데이터들을 효율적으로 추가, 삭제, 검색할 수 있도록 
구현해놓은 인터페이스와 클래스의 모음.
자료구조의 정렬, 탐색 등의 알고리즘도 포함되어 있다. 

# 컬렉션의 핵심 인터페이스
List: 순서가 있고 중복을 허용하는 데이터의 집합
Set : 순서가 없고 중복을 허용하지 않는 데이터의 집합
Map : 키(Key)와 값(Value)의 쌍으로 이루어진 데이터의 집합

# 배열과 컬렉션의 차이 
배열
- 기본타입과 클래스타입 데이터 모두 사용 가능
- 배열을 생성하면서 저장 공간의 크기를 정해야하며, 나중에 크기를 변경할 수 없다.

컬렉션
- 클래스타입 객체 데이터만 사용 가능
- 컬렉션은 데이터의 저장용량을 동적으로 관리하여 크기를 얼마든지 바꿀 수 없다. 

*/
package contents;

public class C00_Collection {
	public static void main(String[] args) {
		/* 향상된 for문 */
		//배열이나 컬렉션의 데이터에 직접 접근하여 사용 (index로 접근X)
		//	for(타입 변수명 : 컬렉션명){}
		//배열이나 컬렉션에 들어있는 데이터를 차례대로 변수에 저장하여 사용
		String[] java = {"클래스", "상속", "리스트", "배열", "메소드"};
		for(String str : java) {
			System.out.println(str);
		}
		
		
	}
}









