package contents05;

public class C05_ObjectArray {
	public static void main(String[] args) {
		//단일 객체 생성
		Waffle w = new Waffle("일반", 3000);
		w.showOrder();
		System.out.println();
		
		/* 객체 배열 선언 및 호출하기 */
//		int[] arr = new int[5];
		Waffle[] waf = new Waffle[3];
		
		waf[0] = new Waffle("아이스크림", 5000);
		waf[1] = new Waffle("누텔라", 4000);
		waf[2] = new Waffle("딸기바나나", 6000);
		
		for (int i = 0; i < waf.length; i++) {
			waf[i].showOrder();
		}
	}
}







