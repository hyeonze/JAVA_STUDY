package contents05;

public class C05_ObjectArray {
	public static void main(String[] args) {
		//���� ��ü ����
		Waffle w = new Waffle("�Ϲ�", 3000);
		w.showOrder();
		System.out.println();
		
		/* ��ü �迭 ���� �� ȣ���ϱ� */
//		int[] arr = new int[5];
		Waffle[] waf = new Waffle[3];
		
		waf[0] = new Waffle("���̽�ũ��", 5000);
		waf[1] = new Waffle("���ڶ�", 4000);
		waf[2] = new Waffle("����ٳ���", 6000);
		
		for (int i = 0; i < waf.length; i++) {
			waf[i].showOrder();
		}
	}
}







