/* ��Ŭ���� ȯ�� �˾ƺ���
# �ּ���(comments)
�޸� �Ǵ� �ڵ带 �����ϴ� �뵵. �ڵ����X
�����ּ�: ctrl + /
�������ּ�: ctrl + shift + / (����: ��)
�������: preferences > java > editor > syntax coloring > comments
��: 230, 219, 116
��: 142, 183, 116

# font ����
�ּ� ����. customize���� 
�ڵ��ϼ� ���
�ܼ�â ���� Windows > Preferences > General > Appearance > Colors and Fonts > Debug > Console font
��Ʈ Ȯ��, ���: ctrl + '+'/'-'

# �ѱ۱��� ó���ϱ�
- UTF-8 ����(�ѱ۱��� ����)
Windows>preference>general>workspace>text file encoding: 'UTF-8'
						  >content types>Java Class File> Default encoding: MS949 �Է��ϰ� update

- ������Ʈ �����ͼ� ����� Consoleâ ����ȭ�� �ѱ� ���� �ذ�: 
run > run configration > common >endcoding: MS949 �Է� �� ����

# ��Ŭ���� UI Ȯ���ϱ�
��Ŭ������ ��ġ�Ǿ� �ִ� ������ eclipse.ini �޸������� ����
���� �ڵ� �Է�. autoScale = ���ϴ�ũ�� 

-Dswt.enable.autoScale=true 
-Dswt.autoScale=200
-Dswt.autoScale.method=nearest

# ������Ʈâ 
��Ŭ���� ���̾ƿ� �ʱ�ȭ: Window - Perespective - Reset Perspective
��������: ��ũ�����̽�-������Ʈ-�ҽ�����-��Ű��-Ŭ����

# ���� �۸��Ģ ����
��ҹ��ڸ� ������
Ư�����ڴ� '_', '$'�� ����
���ڷ� ����X
�ڹ� Ű����X
�ѱ۸�O

Project-package-Class
������Ʈ: �빮�� ���� ����
��Ű��: �ҹ��� ���� ��Ģ
Ŭ����: �빮�� ���� ��Ģ

*/
package contents;

public class C00_Eclipse {
	//"main"+ctrl+space: ���ΰ��� �ڵ��ϼ�
	public static void main(String[] args) {
		// ���� �ּ�
		/*
		 * ������ �ּ�
		 * �����ٿ� �ּ� ó��
		 */

		//"syso"+ctrl+space: ����� �ڵ��ϼ�
//		System.out.println("�ڹ� ����!");
		System.out.println("OT");
		
		/* ������ �ּ� ó��
		 * System.out.println("OT"); System.out.println("OT"); System.out.println("OT");
		 */
		
		//����(Run): ctrl + F11
		System.out.println("��¹�");
		System.out.println("�����ϱ�");
		 
//		system.out.println();
//		=> ����: �������� ǥ�õǸ� ���� �߻�. ����X
	}
}




