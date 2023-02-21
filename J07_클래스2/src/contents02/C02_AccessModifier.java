/*
# ����������(Access Modifier) 
public > protected > (default) > private
������ ���ѽ�Ű�� Ű����
������� �� �޼ҵ忡 ����

������		~ ����(���) ���� ���� ~
public		��� ������ ���� ���
protected	���� ��Ű���� ��� Ŭ��������,
			�Ǵ� �ٸ� ��Ű���� ��ӹ��� Ŭ�������� ���� ����
(default)	���� ��Ű�� �������� ���� ����
private		���� Ŭ���� �������� ���� ����

-default(=package): ���������ڸ� �Է����� ������ default �����ڰ�
					�ڵ����� ����ȴ�.

# Getters and Setters
��ü���� ���α׷��ֿ����� �Ϲ������� ��������� �ܺο��� ���� �����ϴ�
���� ���Ƴ��� �޼ҵ�� ��������� �����ϴ� ����� ��ȣ�Ѵ�.

setter: ��������� ���� �����ϴ� �޼ҵ�
	void set���������(�Ű�����){
		this.������� = �Ű�����;
	}
	
getter: ��������� ���� �����ϴ� �޼ҵ�
	����Ÿ�� get���������(){
		return �������;
	}

*/
package contents02;

import mission.MissionAgent;

public class C02_AccessModifier {
	public static void main(String[] args) {
		/* private �������, public �޼ҵ� �˾ƺ��� */
		Agent bourne = new Agent();
//		bourne.name = "�� ���̸�";
//		����: private �����ڴ� �ٸ� Ŭ�������� ���ٺҰ�
		
		//public�޼ҵ�� private������� ���� ����
		bourne.setName("�� ���̸�");
		bourne.setAge(-50);
		System.out.println("�̸�: " + bourne.getName());
		System.out.println("����: " + bourne.getAge());
		
		/* default �� �پ��� ���������ڷ� ������ ��� �˾ƺ��� */
		MissionAgent tom = new MissionAgent();
//		tom.name = "�� ũ����";
//		����: default�����ڴ� �ٸ� ��Ű������ ���ٺҰ�
		
		tom.setName("�� ũ����");//public�޼ҵ�� default�ʵ� ����
		tom.codeNum = 301;//public�����ڴ� ��𼭵� ���� ����
		
//		System.out.println(tom.getCodeNum());
//		����: private�����ڴ� �ٸ� Ŭ�������� ���ٺҰ�
		
		tom.showData();
	}
}










