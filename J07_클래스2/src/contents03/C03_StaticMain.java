package contents03;

public class C03_StaticMain {
	//���� �޼ҵ�
	public static void main(String[] args) {
		System.out.println("Do");
		System.out.println(sttStr);
		sttMsg();
		
//		System.out.println(instStr);
//		instMsg();
		
		//static�޼ҵ忡���� ��ü �����ؼ� �Ϲݸ�� ���
		C03_StaticMain obj = new C03_StaticMain();
		System.out.println(obj.instStr);
		obj.instMsg();
		
//		static int k; 
//		����: static�޼ҵ� ������ static��� ���� �Ұ�
	}
	
	//�ʵ�
	String instStr = "�Ϲ� �������";
	static String sttStr = "���� �������";
	
	//�޼ҵ�
	void instMsg() {
		System.out.println("�Ϲ� �޼ҵ�");
	}
	static void sttMsg() {
		System.out.println("���� �޼ҵ�");
	}
}
