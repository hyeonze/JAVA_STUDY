/*
Q1)	Phone 클래스를 구현하고 객체 배열을 생성하여 아래의 내용을 구현하고 확인해보자

	Phone클래스
	@필드: name, telecom, price
	@생성자: Phone(name, telecom, price)
	@메소드: showData()

	<객체 초기화값>
		name		telecom		price
	[0]	아이폰		SKT			100
	[1] 갤럭시		LG			80
	[2]	모토로라		KT			50

	↓ Console ↓
	폰1: 아이폰 | SKT | 100만원
	폰2: 갤럭시 | LG | 80만원
	폰3: 모토로라 | KT | 50만원
	
Q2) 위에서 구현한 Phone 클래스에서 생성자를 오버로딩하여 
	필드의 디폴트 값을 설정해보자.
	
	가격 디폴트값: 150
	통신사 디폴트값: SKT 

	<객체 초기화값>
		name		telecom		price
	[0]	아이폰프로		KT			
	[1] 갤럭시폴더					120

	↓ Console ↓
	폰1: 아이폰프로 | KT | 150만원
	폰2: 갤럭시폴더 | SKT | 120만원
	
	Tip)
	예시: this(매개변수, 매개변수, 디폴트값);
*/
package practice04;

public class Prac01 {
	public static void main(String[] args) {
		//Q1
		Phone[] p = new Phone[3];
		p[0] = new Phone("아이폰", "SKT", 100);
		p[1] = new Phone("갤럭시", "LG", 80);
		p[2] = new Phone("모토로라", "KT", 50);
		
		for (int i = 0; i < p.length; i++) {
			System.out.print("폰"+(i+1)+": ");
			p[i].showData();
		}
		System.out.println();
		
		//Q2
		Phone[] sp = new Phone[2];
		sp[0] = new Phone("아이폰프로", "KT");
		sp[1] = new Phone("갤럭시폴더", 120);
		
		for (int i = 0; i < sp.length; i++) {
			System.out.print("폰"+(i+1)+": ");
			sp[i].showData();
		}
	}
}







