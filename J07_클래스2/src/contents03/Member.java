package contents03;

public class Member {
	String instVar; //�ν��Ͻ�(�Ϲ�) ��� ����
	static String staticVar; //static��� ���� (Ŭ���� ����)
	
	void instMsg() {//�ν��Ͻ�(�Ϲ�) �޼ҵ�
		System.out.println("�Ϲ� �޼ҵ�");
	}
	
	static void sttMsg() {//���� �޼ҵ�
		System.out.println("���� �޼ҵ�");
	}
	
	static void staticMth() {//���� �޼ҵ�
		/* static�޼ҵ忡���� static����� �̿� ���� */
//		System.out.println(instVar);
//		instMsg();
//		this.instVar = "this�� ������";
//		=> ����: static�޼ҵ�� ��ü ���� ���� ������� �����Ƿ�
//		���� �������� ���� �ν��Ͻ� ����� �̿��� �� ����.
		System.out.println("staticVar: " + staticVar);
		sttMsg();
		
		/* static�޼ҵ忡�� �ν��Ͻ� ��� ����ϱ� */
		//��ü�� �����ؼ� ���� ������ ����
		System.out.println("���� �޼ҵ忡�� ��ü ����!");
		Member m = new Member();
		m.instVar = "�ν��Ͻ� ����";
		System.out.println("m.instVar: " + m.instVar);
		m.instMsg();
	}
}






