/*
# 상속(inheritance)
기존의 클래스를 재사용해서 새로운 클래스를 작성하는것
부모클래스를 상속(extends) 받아 자식클래스를 작성한다.
자식클래스는 부모클래스의 멤버(필드, 메소드)를 상속받는다. 생성자는 제외

부모클래스 <- 자식클래스
# 부모클래스(Superclass, 상위클래스) 형태
	class 부모클래스명{
		...
	}

# 자식클래스(Subclass, 하위클래스) 형태
	class 자식클래스명 extends 부모클래스명{
		...
	}
	
# 상속의 특징
자식클래스는 부모클래스의 필드와 메소드를 물려받기 때문에 중복되는 코드를 작성할 필요가 없다.
클래스의 재활용으로 프로그램의 유연성과 다형성을 추구한다. 

*/
package contents01;

public class C01_Extends {
	public static void main(String[] args) {
		/* 상속 예제 - 멤버와 메소드의 상속 확인하기 */
		IcecreamWaffle w = new IcecreamWaffle();
		
		w.msgW();//부모클래스로부터 상속받은 메소드 호출
		
		//부모클래스로부터 상속받은 메소드로 정보를 입력하고 출력
		w.setData("일반와플", 3000);
		w.get2Data();
		System.out.println("==================");
		
		w.msgIW();//자식클래스에만 있는 메소드 호출
		
		//자식클래스의 메소드를 이용하여 정보 입력
		w.setData("아이스크림와플", 5000, "바닐라");
		w.get3Data();
	}
}












