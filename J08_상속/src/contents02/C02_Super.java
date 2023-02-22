/*
# super
자식클래스를 만들면 자동으로 부모클래스의 생성자도 호출이 된다.

# 자식클래스에서 부모 생성자 호출하기
	자식생성자(매개변수..){
		super(매개값..);
		..
	}

super는 매개값의 개수와 타입에 일치하는 부모 생성자를 호출한다.

*/
package contents02;

public class C02_Super {
	public static void main(String[] args) {
		/* 부모클래스의 기본생성자 호출하기 */
		Actor john = new Actor();//기본생성자로 객체 생성
		//자식 객체를 만들면 부모 객체도 자동적으로 생성이 된다.
		//모든 객체는 클래스의 생성자를 호출해야하기 때문에 
		//자동으로 만들어진 부모 객체의 생성자도 자동으로 호출이 된다.
		System.out.println("===================");
		
		/* 상속받은 클래스에서 부모클래스의 멤버변수 확인 */
		Actor tom = new Actor("아바타");//자식클래스의 멤버변수만 초기화하여 객체 생성
		tom.showData();
		System.out.println("===================");
		
		/* 매개변수와 일치하는 부모의 생성자 호출하기 */
		Actor matt = new Actor("맷 데이먼", 50, "본시리즈");
		matt.showData();
	}
}







