package mission;

public class MissionAgent {
	/* default 멤버변수 */
	String name;//default제어자 자동 적용
	public int codeNum;

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	private int getCodeNum() {
		return codeNum+2000;
	}
	
	public void showData() {
		System.out.println("이름: "+getName());
		
		//private멤버를 같은 클래스에서 호출
		System.out.println("코드번호: "+getCodeNum());
	}
}







