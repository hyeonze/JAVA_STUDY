package contents02;

public class Waffle {
	//�Ű����� 0��
	String name() {
		return "����";
	}
	
	//�Ű����� 1��
	String name(String source) {
		return source+"����";
	}
	
	//�Ű����� 2�� (���ڿ�, ���ڿ�)
	String name(String source, String source2) {
		return source+source2+"����";
	}
	
	//�Ű����� 2�� (���ڿ�, ����)
	String name(String source, int count) {
		return source+"���� "+count+"��";
	}
}







