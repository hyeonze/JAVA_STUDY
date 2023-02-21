/*
# 접근제어자(Access Modifier) 
public > protected > (default) > private
접근을 제한시키는 키워드
멤버변수 및 메소드에 적용

제어자		~ 접근(사용) 가능 범위 ~
public		모든 곳에서 접근 허용
protected	같은 패키지의 모든 클래스에서,
			또는 다른 패키지의 상속받은 클래스에서 접근 가능
(default)	같은 패키지 내에서만 접근 가능
private		같은 클래스 내에서만 접근 가능

-default(=package): 접근제어자를 입력하지 않으면 default 제어자가
					자동으로 적용된다.

# Getters and Setters
객체지향 프로그래밍에서는 일반적으로 멤버변수를 외부에서 직접 접근하는
것을 막아놓고 메소드로 멤버변수에 접근하는 방식을 선호한다.

setter: 멤버변수의 값을 설정하는 메소드
	void set멤버변수명(매개변수){
		this.멤버변수 = 매개변수;
	}
	
getter: 멤버변수의 값을 리턴하는 메소드
	리턴타입 get멤버변수명(){
		return 멤버변수;
	}

*/
package contents02;

import mission.MissionAgent;

public class C02_AccessModifier {
	public static void main(String[] args) {
		/* private 멤버변수, public 메소드 알아보기 */
		Agent bourne = new Agent();
//		bourne.name = "맷 데이먼";
//		에러: private 제어자는 다른 클래스에서 접근불가
		
		//public메소드로 private멤버변수 접근 가능
		bourne.setName("맷 데이먼");
		bourne.setAge(-50);
		System.out.println("이름: " + bourne.getName());
		System.out.println("나이: " + bourne.getAge());
		
		/* default 및 다양한 접근제어자로 설정된 멤버 알아보기 */
		MissionAgent tom = new MissionAgent();
//		tom.name = "톰 크루즈";
//		에러: default제어자는 다른 패키지에서 접근불가
		
		tom.setName("톰 크루즈");//public메소드로 default필드 접근
		tom.codeNum = 301;//public제어자는 어디서든 접근 가능
		
//		System.out.println(tom.getCodeNum());
//		에러: private제어자는 다른 클래스에서 접근불가
		
		tom.showData();
	}
}










