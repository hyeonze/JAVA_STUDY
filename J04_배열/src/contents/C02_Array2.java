package contents;

public class C02_Array2 {
	public static void main(String[] args) {
		/* �Ǽ� Ÿ�� �迭 �����ϱ� */
		double[] grade = { 4.3, 3.7, 2.5, 3.3, 4.2, 4.0, 3.2 };
		
		//������ 3.5�̻��� �л� �� ã��
		int count = 0;
		for (int i = 0; i < grade.length; i++) {
			if(grade[i]>=3.5) {
				count++;
			}
		}
		System.out.println("������ 3.5�̻��� �л��� "+count+"���Դϴ�.");
		
		/* ���� Ÿ�� �迭 �����ϱ� */
		char[] ch = new char[5];
		ch[0] = 'H';
		ch[1] = 'a';
		ch[2] = 'p';
		ch[3] = 'p';
		ch[4] = 'y';
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		
		/* ���ڿ� �迭 �����ϱ� */
		String[] names = {"������", "���߱�", "������", "����", "����",
				"��", "���Ժ���", "����", "����", "ħ����", "��ȣ��"};
		
		System.out.println(names[3]);
		
		//�̸��� �α����� �ο� Ȯ���ϱ�
		int cnt = 0; //�α��� �ο� ī��Ʈ�� ����
		for (int i = 0; i < names.length; i++) {
			//���ڿ� ���� ���ϱ�: ���ڿ�.length()
			if(names[i].length() == 2) {
				cnt++;
			}
		}
		System.out.println("�̸��� �α����� ����� "+cnt+"���Դϴ�.");
		
		/* ���ڿ� ���ڿ��� ���� */
		String str = "winter";
		
		//���ڿ����� index������ ���ڸ� �о�� �� �ִ�.
		System.out.println(str.charAt(5)); 
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		//���ڿ� -> ���� �迭 ��ȯ�Ͽ� �����ϴ� ���
		char[] abc = str.toCharArray();
		for (int i = 0; i < abc.length; i++) {
			System.out.println(abc[i]);
		}
		
		//���� �迭 -> ���ڿ� ��ȯ�Ͽ� �����ϴ� ���
		String msg = new String(ch);
		System.out.println(msg);
		System.out.println("Ÿ��Ȯ��: " + msg.getClass().getName());
	}
}












