package contents01;

/*
<Ŭ���� ��� ��� ����>
# Ŭ������ ����
	class{
		�ʵ�;
		������;
		�޼ҵ�;
	}

# Ŭ������ �������
=> �Ӽ� + ��� + ����(��������, ĸ��ȭ)
=> �ʵ� + �޼ҵ� + ������

# Ŭ���� ���
��� = Ŭ������ �������� �ʵ�, ������, �޼ҵ�
�ʵ� = ��� ����
�޼ҵ� = ��� �Լ�
���� = static

# �ʵ��� ����
1. �ν��Ͻ� �ʵ� = �ν��Ͻ� ��� ����
2. static �ʵ� = static ��� ���� = Ŭ���� ����
+. static final ���

# ������ ����
1. �ν��Ͻ� (���) ����
2. Ŭ���� (���) ����
3. ���� ����: �޼ҵ� {}�������� ����ϴ� ����
			�ʵ�(�������)�� �ƴ�.

*/
public class Ŭ����������� {
	int abc; //1. �ν��Ͻ� ����
	static int kgb; //2.Ŭ���� ����(���� ��� ����)
	
	void exampleArea() {
		int num; //3. ���� ����
		num = 50;
		System.out.println(num);
	}
	
	void anotherArea() {//�ν��Ͻ� �޼ҵ�
//		System.out.println(num);
//		����: �������� num���������� �ش� �޼ҵ忡���� ����
		System.out.println(abc);
		System.out.println(kgb);
	}
	
	static void sttArea() {//���� �޼ҵ�
//		System.out.println(this.abc);
//		exampleArea();
		System.out.println(kgb);
	}
}








