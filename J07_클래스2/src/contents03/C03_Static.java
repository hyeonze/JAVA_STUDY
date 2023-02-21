/* static ������
# ���� ���(static member)
���� ����� Ŭ������ ������ ����μ� ��ü �������ο� ������� �����Ѵ�. 
���� ����� ���α׷��� �����ϸ� ���� ���� ���������.  

# ���� ��� ����
class Ŭ������{
	static Ÿ�� �������;
	static ����Ÿ�� �޼ҵ�();
}

# ���� ��� ���
	Ŭ������.��������;
	Ŭ������.�����޼ҵ�();
	
������ ����� ��ü�� �������� 'Ŭ������.�����'���� �ٷ� ��� ����
static ����� ��ü �� �����ϴ� ������ ������(���� ���).

# static �޼ҵ�� �������̵� �Ұ���

# static main() �޼ҵ�
���α׷��� �����ϸ� ���� ���� ����Ǵ� ���� �޼ҵ�
�ڹ� ���� �ӽ��� Ŭ������.main() �޼ҵ带 ���� ���� �����Ų��.

*/
package contents03;

public class C03_Static {
	public static void main(String[] args) {
		/* static ����� ��ü ���� ���� ��� ���� */
		//Ŭ������.���������� �ڵ�� �ٷ� ��밡��
		Member.staticVar = "Ŭ��������";
		System.out.println("Member.staticVar: "+Member.staticVar);
		Member.sttMsg();
		System.out.println("=======================");
		
		/* cf) �Ϲ� ����� ��ü�� �����ؾ߸� ��� ���� */
//		Member.instVar = "";
//		Member.instMsg();
		Member mem = new Member();
		mem.instVar = "�ν��Ͻ�����";
		mem.instMsg();
		System.out.println("=======================");
		
		/* static ����� ������ Ư�� */
		Member m1 = new Member();
		m1.staticVar = "���� �������";//��ü��.��������� �ڵ�ε� ���� ����
		System.out.println("m1.staticVar: " + m1.staticVar);
		
		//�ٸ� ��ü������ static����� �����Ͱ��� ����(�����Ѵ�).
		Member m2 = new Member();
		System.out.println("Ŭ�������� ��: " + m2.staticVar);
		m2.staticVar = "m2��ü�� �����Ͽ� �� ����";
		System.out.println(m1.staticVar);
		System.out.println(Member.staticVar == m1.staticVar);
		System.out.println("=======================");
		
		Member.staticMth();
	}
}











