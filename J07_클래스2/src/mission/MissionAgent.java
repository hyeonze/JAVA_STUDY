package mission;

public class MissionAgent {
	/* default ������� */
	String name;//default������ �ڵ� ����
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
		System.out.println("�̸�: "+getName());
		
		//private����� ���� Ŭ�������� ȣ��
		System.out.println("�ڵ��ȣ: "+getCodeNum());
	}
}







