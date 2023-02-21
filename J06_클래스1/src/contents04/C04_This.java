/*
# this
자신이 속한 클래스의 객체를 가리키는 참조변수
클래스의 멤버를 호출할 때 사용
	this.필드
	this.메소드()

- 객체명.멤버 접근하는것과 같음

# this()
자신이 속한 클래스 내부의 다른 생성자를 호출하는 메소드
생성자 내부의 첫 줄에서만 사용
	생성자명(){
		this(매개변수..);
	}

*/
package contents04;

public class C04_This {
	public static void main(String[] args) {
		/* this 키워드 예제 */
		Car c1 = new Car();
		c1.setInfo("그랜저", 4000);
		c1.showInfo();
		
		Car c2 = new Car();
		c2.discount("그랜저", 4000);
		c2.showInfo();
		
		/* this() 키워드 예제 */
		Bike b1 = new Bike("로드자전거");
		b1.showInfo();
		
		Bike b2 = new Bike("MTB자전거", "Green");
		b2.showInfo();
		
	}
}










