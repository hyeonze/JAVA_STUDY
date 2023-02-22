/*
Q)	기존까지는 Phone이라는 클래스로 휴대전화 정보를 관리했으나,
	업데이트가 진행되어 새로운 정보들이 추가되었다고 한다.
	Phone 클래스는 그대로 사용하고 상속을 하여 추가된 정보들을 저장해보자.	
	
	UpdatePhone 클래스
	@추가된 필드 
	card: 할인카드
	month: 보험기간	
	
	@생성자
	자식클래스 객체의 모든 필드를 초기화
	
	@메소드 오버라이딩
	showData(): 이름, 통신사, 가격의 정보를 Phone과 똑같이 나타내고
			  	할인카드와 보험기간 정보도 추가하여 출력
			  
	<객체 초기화값>
		name		telecom		price	할인카드		보험기간
	[0]	아이폰		SKT			100		신한카드		24
	[1] 갤럭시		LG			80		네이버카드		12
	[2]	모토로라		KT			50		하나카드		36
	
	↓ Console ↓
	아이폰 | SKT | 100만원
	할인카드: 신한카드
	보험기간: 24
	
	갤럭시 | LG | 80만원
	할인카드: 네이버카드
	보험기간: 12
	
	모토로라 | KT | 50만원
	할인카드: 하나카드
	보험기간: 36
*/
package practice02;

public class Prac02 {
	public static void main(String[] args) {
		UpdatePhone[] p = new UpdatePhone[3];
		p[0] = new UpdatePhone("아이폰", "SKT", 100, "신한카드", 24);
		p[1] = new UpdatePhone("갤럭시", "LG", 80, "네이버카드", 12);
		p[2] = new UpdatePhone("모토로라","KT", 50, "하나카드", 36);
		
		for (int i = 0; i < p.length; i++) {
			p[i].showData();
			System.out.println();
		}
	}
}










