/*
# �������̵�(overriding), �޼ҵ� ������
�θ�Ŭ�������� ��ӹ��� ���� �̸��� �޼ҵ带 ������(����)�ϴ� ��
�޼ҵ� �����.

- �θ�Ŭ������ �޼ҵ�� �̸�, �Ű�����, ����Ÿ���� ���ƾ��Ѵ�.
- �θ�Ŭ������ �޼ҵ庸�� ���� �������� ������ ������ �� ����. 

# �����ε� vs �������̵�
�����ε�(overloading): �̸��� ���� �Ű������� �ٸ� ���ο� �޼ҵ带 �����Ѵ�.
�������̵�(overriding): "��� ����" ���� �̸��� �޼ҵ带 ������(�����)�Ѵ�.

*/
package contents03;

public class C03_Overriding {
	public static void main(String[] args) {
		//�θ�Ŭ���� Musician�� ��ü
		Musician mus = new Musician();
		mus.showJob();//�θ�Ŭ���� �޼ҵ� ȣ��
		mus.work();
		System.out.println("==================");
		
		//�ڽ�Ŭ���� Pianist�� ��ü
		Pianist monk = new Pianist();
		monk.showJob();//�������̵��� �޼ҵ� ȣ��
		monk.showJob("����");//�����ε��� �޼ҵ� ȣ��
		
		monk.showJob_super();//�θ��� ������ �޼ҵ� ȣ��
		monk.work();
		System.out.println("==================");
		
		//�ڽ�Ŭ���� Singer�� ��ü
		Singer younha = new Singer();
		younha.showJob();
		younha.showJob("����� ����");
		younha.work();
	}
}










