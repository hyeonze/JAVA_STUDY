/*
# 인터페이스(interface)
추상클래스의 일종으로 미완성(추상화) 정도가 매우 높다. 
추상메소드와 상수만 멤버로 가질 수 있다. 
다중 상속이 가능하다.

# 인터페이스 선언
	interface 인터페이스이름{
		상수; //public static final
		추상메소드(); //public abstract
	}

인터페이스에 선언하는 모든 멤버는 public이다.

# 인터페이스 구현
	class 클래스명 implements 인터페이스명{
		추상메소드 오버라이딩;
	}

# 여러개의 인터페이스를 구현한 클래스(다중상속)
	class 클래스명 implements 인터페이스A, 인터페이스B..{
		인터페이스A의 추상메소드 오버라이딩;
		인터페이스B의 추상메소드 오버라이딩;
		...(모든 인터페이스의 추상메소드를 구현)
	}

# 클래스와 인터페이스 함께 상속(다중상속)
	class 클래스명 extends 클래스명 implements 인터A, 인터B..{}

*/
package contents;

public class C04_Interface {
	public static void main(String[] args) {
		System.out.println("=======스마트워치=======");
		SmartWatch appleWatch = new SmartWatch();
		appleWatch.setSound(-20);
		appleWatch.connectYoutubeMusic();
		
		System.out.println("=======스마트폰=======");
		Phone mini = new Phone();
		mini.setSound(20);
		mini.picture();
		mini.talkAlarm();
		
		System.out.println("=======태블릿=======");
		Tablet ipad = new Tablet();
		ipad.talkAlarm();
		ipad.write();
	}
}

class Tablet extends Phone implements TouchPencil{
	//Music, Kakao, Camera 인터페이스를 구현해놓은 Phone클래스를 상속
	//+ TouchPencil 인터페이스를 가져와서 구
	@Override
	public void write() {
		System.out.println("터치펜슬 쓰기 모드에 진입합니다.");
	}
}


class Phone implements Music, Kakao, Camera{
	private int sound;//음량

	@Override
	public void picture() {
		System.out.println("사진촬영 모드로 진입합니다.");
	}

	@Override
	public void talkAlarm() {
		System.out.println("새로운 카톡이 왔습니다.");
	}

	@Override//추상메소드 구현
	public void connectYoutubeMusic() {
		System.out.println("유튜브 뮤직에 연결합니다.");
	}

	@Override//추상메소드 구현
	public void setSound(int sound) {
		if(sound>MAX_SOUND) {
			this.sound = MAX_SOUND;
		}else if(sound<MIN_SOUND) {
			this.sound = MIN_SOUND;
		}else {
			this.sound = sound;
		}
		System.out.println("설정 음량: " + this.sound);
	}
}


class SmartWatch implements Music{
	private int sound;//음량
	
	@Override//추상메소드 구현
	public void connectYoutubeMusic() {
		System.out.println("유튜브 뮤직에 연결합니다.");
	}

	@Override//추상메소드 구현
	public void setSound(int sound) {
		if(sound>MAX_SOUND) {
			this.sound = MAX_SOUND;
		}else if(sound<MIN_SOUND) {
			this.sound = MIN_SOUND;
		}else {
			this.sound = sound;
		}
		System.out.println("설정 음량: " + this.sound);
	}
}


interface Music{
//	int var; 변수 선언 불가능
//	void mth() {	System.out.println();} 일반메소드 선언 불가능
	
	//상수 필드 선언
	public static final int MAX_SOUND = 10;
	int MIN_SOUND = 0; //제어자 생략해도 public static final 자동 추가
	
	//추상 메소드 선언
	public abstract void connectYoutubeMusic();
	void setSound(int sound); //제어자 생략해도 public abstract 자동 추가
}

interface Kakao{
	public abstract void talkAlarm();
}

interface Camera{
	public abstract void picture(); 
}

interface TouchPencil{
	public abstract void write();
}




