package contents03;

public class Singer extends Musician {

	@Override//�������̵� �޼ҵ�
	public void showJob() {
		// TODO Auto-generated method stub
		super.showJob();//����Ŭ���� �޼ҵ� �״�� ����
	}
	
	//�����ε� �޼ҵ�
	public void showJob(String song) {
		System.out.println("���� <"+song+">�� �뷡�մϴ�.");
	}

	@Override
	void work() {
		// TODO Auto-generated method stub
		super.work();//����Ŭ���� �޼ҵ� �����ϰ�,
		System.out.println("������ �ݰ�����~!!");//���� �ڵ� ����
	}
	
	
}




