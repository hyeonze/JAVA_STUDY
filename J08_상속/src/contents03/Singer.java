package contents03;

public class Singer extends Musician {

	@Override//오버라이딩 메소드
	public void showJob() {
		// TODO Auto-generated method stub
		super.showJob();//상위클래스 메소드 그대로 실행
	}
	
	//오버로딩 메소드
	public void showJob(String song) {
		System.out.println("저는 <"+song+">을 노래합니다.");
	}

	@Override
	void work() {
		// TODO Auto-generated method stub
		super.work();//상위클래스 메소드 실행하고,
		System.out.println("여러분 반가워요~!!");//다음 코드 실행
	}
	
	
}




