/*
# �������̽�(interface)
�߻�Ŭ������ �������� �̿ϼ�(�߻�ȭ) ������ �ſ� ����. 
�߻�޼ҵ�� ����� ����� ���� �� �ִ�. 
���� ����� �����ϴ�.

# �������̽� ����
	interface �������̽��̸�{
		���; //public static final
		�߻�޼ҵ�(); //public abstract
	}

�������̽��� �����ϴ� ��� ����� public�̴�.

# �������̽� ����
	class Ŭ������ implements �������̽���{
		�߻�޼ҵ� �������̵�;
	}

# �������� �������̽��� ������ Ŭ����(���߻��)
	class Ŭ������ implements �������̽�A, �������̽�B..{
		�������̽�A�� �߻�޼ҵ� �������̵�;
		�������̽�B�� �߻�޼ҵ� �������̵�;
		...(��� �������̽��� �߻�޼ҵ带 ����)
	}

# Ŭ������ �������̽� �Բ� ���(���߻��)
	class Ŭ������ extends Ŭ������ implements ����A, ����B..{}

*/
package contents;

public class C04_Interface {
	public static void main(String[] args) {
		System.out.println("=======����Ʈ��ġ=======");
		SmartWatch appleWatch = new SmartWatch();
		appleWatch.setSound(-20);
		appleWatch.connectYoutubeMusic();
		
		System.out.println("=======����Ʈ��=======");
		Phone mini = new Phone();
		mini.setSound(20);
		mini.picture();
		mini.talkAlarm();
		
		System.out.println("=======�º�=======");
		Tablet ipad = new Tablet();
		ipad.talkAlarm();
		ipad.write();
	}
}

class Tablet extends Phone implements TouchPencil{
	//Music, Kakao, Camera �������̽��� �����س��� PhoneŬ������ ���
	//+ TouchPencil �������̽��� �����ͼ� ��
	@Override
	public void write() {
		System.out.println("��ġ�潽 ���� ��忡 �����մϴ�.");
	}
}


class Phone implements Music, Kakao, Camera{
	private int sound;//����

	@Override
	public void picture() {
		System.out.println("�����Կ� ���� �����մϴ�.");
	}

	@Override
	public void talkAlarm() {
		System.out.println("���ο� ī���� �Խ��ϴ�.");
	}

	@Override//�߻�޼ҵ� ����
	public void connectYoutubeMusic() {
		System.out.println("��Ʃ�� ������ �����մϴ�.");
	}

	@Override//�߻�޼ҵ� ����
	public void setSound(int sound) {
		if(sound>MAX_SOUND) {
			this.sound = MAX_SOUND;
		}else if(sound<MIN_SOUND) {
			this.sound = MIN_SOUND;
		}else {
			this.sound = sound;
		}
		System.out.println("���� ����: " + this.sound);
	}
}


class SmartWatch implements Music{
	private int sound;//����
	
	@Override//�߻�޼ҵ� ����
	public void connectYoutubeMusic() {
		System.out.println("��Ʃ�� ������ �����մϴ�.");
	}

	@Override//�߻�޼ҵ� ����
	public void setSound(int sound) {
		if(sound>MAX_SOUND) {
			this.sound = MAX_SOUND;
		}else if(sound<MIN_SOUND) {
			this.sound = MIN_SOUND;
		}else {
			this.sound = sound;
		}
		System.out.println("���� ����: " + this.sound);
	}
}


interface Music{
//	int var; ���� ���� �Ұ���
//	void mth() {	System.out.println();} �Ϲݸ޼ҵ� ���� �Ұ���
	
	//��� �ʵ� ����
	public static final int MAX_SOUND = 10;
	int MIN_SOUND = 0; //������ �����ص� public static final �ڵ� �߰�
	
	//�߻� �޼ҵ� ����
	public abstract void connectYoutubeMusic();
	void setSound(int sound); //������ �����ص� public abstract �ڵ� �߰�
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




