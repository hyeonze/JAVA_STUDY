package contents02;

public class Actor extends Human{
	String movie;

	//�ڽ�Ŭ������ ����� �⺻ �����ڿ� super() �ڵ带 
	//�ۼ����� �ʾƵ� �ڵ����� �����Ǿ� �ִ�.
	public Actor() {
		super();
		//super()�� �θ��� �⺻�����ڸ� ȣ���ϴ� �ڵ�
		//super()�� �����Ǿ �ڵ������� �����ϰ� �ִ�. 
		System.out.println("���� ��ȭ����Դϴ�.");
	}

	public Actor(String movie) {
//		super();
		this.movie = movie;
	}
	
	public Actor(String name, int age, String movie) {
		/* �θ� �ʵ� �ʱ�ȭ�ϱ�1 */
//		super(name, age); //�θ� ������(�Ű�����O) ȣ��, super()ȣ��X
		
		/* �θ� �ʵ� �ʱ�ȭ�ϱ�2 */
//		super(); //�θ� �⺻������(�Ű�����X) ȣ��
		this.name = name;
		this.age = age;
		
		this.movie = movie;
		System.out.println("���� �̸��� ����, �⿪��ǰ�� �ֽ��ϴ�.");
	}

	//�θ� �ʵ� 2��, �ڽ� �ʵ� 1�� ��� ���
	void showData() {
		System.out.println("���� "+name+"�̰� ���̴� "+age+
				"���̸� ��ȭ "+movie+"�� �ֿ��Դϴ�. ");
	}
}













