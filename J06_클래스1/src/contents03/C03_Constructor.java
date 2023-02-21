/*
# 생성자(constructor)
new키워드로 객체를 생성할 때 호출되어 객체 필드를 초기화한다.

# 기본 생성자(디폴트 생성자)
	클래스명(){}

- 매개변수가 없는 생성자
- 클래스에 선언된 생성자가 하나도 없으면 기본 생성자가 자동으로 만들어진다.
- (매개변수가 있는) 생성자를 하나라도 선언하면 기본 생성자는 만들어지지 않는다.

# 생성자 선언
	클래스명(매개변수..){
		객체의 초기화 코드
	}
	
# 생성자의 특징
1. 클래스명과 동일해야한다.
2. 리턴 타입은 없다.

# 생성자 오버로딩
매개변수를 달리하는 생성자를 여러개 선언할 수 있다.
	클래스명(){}
	클래스명(매개변수1){}
	클래스명(매개변수1, 매개변수2){}
	...

*/
package contents03;

public class C03_Constructor {
	public static void main(String[] args) {
		//(자동으로 만들어진)기본 생성자를 호출하여 객체 생성
		Waffle00 w0 = new Waffle00(); //Waffle() <- 기본 생성자
		
		//new키워드로 객체를 만들때 생성자가 작동된다.
		Waffle01 w1 = new Waffle01(); //생성자 내부 코드 작동
		w1.setData("일반와플", 3000);
		w1.showData();
		
//		Waffle02 w2 = new Waffle02(); 
//		에러: 기본생성자 만들어지지X
		
		//매개값을 일치시켜야 생성자를 호출 가능
		Waffle02 w2 = new Waffle02("초코와플", 5000);//생성자의 매개값으로 필드를 초기화
		w2.showData();
		
		Waffle03 w3 = new Waffle03();//기본 생성자를 호출하여 객체 생성
		w3.showData();
		Waffle03 w3n = new Waffle03("누텔라와플");//생성자(매개값1개)로 객체 생성
		w3n.showData();
		Waffle03 w3np = new Waffle03("시나몬크림와플", 7000);//생성자(매개값2개)로 객체 생성
		w3np.showData();
	}
}








