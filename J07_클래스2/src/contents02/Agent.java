package contents02;

public class Agent {
	/* private �������, public �޼ҵ� */
	//private: Ŭ���� �������� ���� ����
	private String name;
	private int age;
	
	//setter�޼ҵ�� private��������� �����Ͽ� ������ ����
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		/* getter/setter�޼ҵ��� ��� ���� */
		//���̴� ������ �� ���⶧���� ������� ���� �Ǽ��� �����ϰ�
		//���� ����� ��ȯ�ؼ� �����ϵ��� ����
		if(age<0) {
			this.age = - age;
		}else {
			this.age = age;
		}
	}

	//getter�޼ҵ�� private������� �����͸� ��ȯ ����
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	
}
