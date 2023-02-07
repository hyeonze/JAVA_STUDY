/*
# switch��
������ � ���� �������� ���� case�� �����Ͽ� ���๮�� ����

	switch(����){
	case ��A:
		���๮..
		break;
	case ��B:
		���๮..
		break;
	...
	default:
		���๮..
	}

- case�� ���� ����, ���Ϲ���, ���ڿ��� ����
- switch���� ��� if������ ���� �� ����
- switch������ break�� switch���� ���������� ����

*/
package contents;

public class C04_Switch {
	public static void main(String[] args) {
		/* switch(���� ����) */
		System.out.println("1.������ 2.���� 3.Ƣ��");
		int menu = 1;
		System.out.println("�޴�����: " + menu);
		
		//if������ �ۼ�
		if (menu == 1) {
			System.out.println("�����̸� �����߽��ϴ�.");
		} else if (menu == 2) {
			System.out.println("���븦 �����߽��ϴ�.");
		} else if (menu == 3) {
			System.out.println("Ƣ���� �����߽��ϴ�.");
		} else {
			System.out.println("���� �޴��Դϴ�!");
		}
		
		//switch�� �ۼ�
		switch(menu) {
		case 1://menu==1
			System.out.println("�����̸� �����߽��ϴ�.");
			break;
		case 2://menu==2
			System.out.println("���븦 �����߽��ϴ�.");
			break;
		case 3://menu==3
			System.out.println("Ƣ���� �����߽��ϴ�.");
			break;
		default://menu�� case���鿡 �ش����� ������ ����
			System.out.println("���� �޴��Դϴ�!");
		}
		
		/* switch(���� ����) */
		System.out.println("�����Ͻðڽ��ϱ�?(y/n)");
		char save = 'N';
		
		switch(save) {
		case 'Y'://break�� ������ ���� ���� ��� ����
		case 'y': 
			System.out.println("����Ǿ����ϴ�.");
			break;
		case 'N':
		case 'n':
			System.out.println("������� �ʾҽ��ϴ�.");
			break;
		default:
			System.out.println("�߸��� �����Դϴ�.");
		}
		
		/* switch(String ����) */
		String season = "����";
		
		System.out.print(season);
		switch(season) {
		case "�ܿ�":
			System.out.println("���� ���� �ɴϴ�.");
			break;
		case "��":
			System.out.println("���� ������ �̴ϴ�.");
			break;
		case "����":
			System.out.println("���� �帶�� �ɴϴ�.");
			break;
		case "����":
			System.out.println("���� ��ǳ�� ����ϴ�.");
			break;
		default:
			System.out.println("��(��) ������ �ƴմϴ�.");
		}
	}
}













