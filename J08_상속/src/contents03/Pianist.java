package contents03;

public class Pianist extends Musician {
	//�������̵��� �޼ҵ�: �θ�Ŭ������ showJob()�޼ҵ带 �������̵�
	public void showJob() {
		System.out.println("�� ������ �ǾƴϽ�Ʈ�Դϴ�.");
	}
	
	//�����ε� �޼ҵ�: ���� �ִ� showJob�� �ٸ� �Ű������� ������ ���ο� �޼ҵ带 �߰�
	public void showJob(String genre) {
		System.out.println("���� "+genre+"�� �����ϴ� �ǾƴϽ�Ʈ�Դϴ�.");
	}
	
	void showJob_super() {
		//������ �θ� �޼ҵ� ȣ��
		super.showJob();
	}
	
//	private void work() {}
//	����: �������̵��� �޼ҵ��� ���� ������ ������ �� ����.
	
	//���ٹ����� ������ �������̵��� �޼ҵ�
	protected void work() {
		System.out.println("���뿡 �ö� �ǾƳ븦 �մϴ�.");
	}
}






