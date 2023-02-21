package contents02;

public class Agent {
	/* private 멤버변수, public 메소드 */
	//private: 클래스 내에서만 접근 가능
	private String name;
	private int age;
	
	//setter메소드로 private멤버변수에 접근하여 데이터 저장
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		/* getter/setter메소드의 사용 목적 */
		//나이는 음수일 수 없기때문에 사용자의 기입 실수로 가정하고
		//값을 양수로 변환해서 저장하도록 설정
		if(age<0) {
			this.age = - age;
		}else {
			this.age = age;
		}
	}

	//getter메소드로 private멤버변수 데이터를 반환 가능
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	
}
