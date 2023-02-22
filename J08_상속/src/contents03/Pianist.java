package contents03;

public class Pianist extends Musician {
	//오버라이딩한 메소드: 부모클래스의 showJob()메소드를 오버라이딩
	public void showJob() {
		System.out.println("제 직업은 피아니스트입니다.");
	}
	
	//오버로딩 메소드: 위에 있는 showJob과 다른 매개변수를 가지는 새로운 메소드를 추가
	public void showJob(String genre) {
		System.out.println("저는 "+genre+"를 연주하는 피아니스트입니다.");
	}
	
	void showJob_super() {
		//덮어쓰기된 부모 메소드 호출
		super.showJob();
	}
	
//	private void work() {}
//	에러: 오버라이딩할 메소드의 접근 범위는 좁아질 수 없다.
	
	//접근범위를 넓혀서 오버라이딩한 메소드
	protected void work() {
		System.out.println("무대에 올라가 피아노를 합니다.");
	}
}






