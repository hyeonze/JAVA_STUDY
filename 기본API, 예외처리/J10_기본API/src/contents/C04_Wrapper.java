package contents;

public class C04_Wrapper {
	public static void main(String[] args) {
		/* Wrapper Ŭ���� */
		//Byte, Short, Integer, Long
		//Character, Double, Float, Boolean
		//8���� �⺻ �ڷ����� ��ü�� �ٷ�� ���� Ŭ����
		
		//WrapperŬ������ ��ü ����
		Integer i1 = new Integer(90);
		System.out.println(i1 + ", " + i1.getClass().getName());
		
		Integer i2 = Integer.valueOf(90);
		System.out.println(i2 + ", " + i2.getClass().getName());
		
		Double d = Double.valueOf(3.141592);
		System.out.println(d + ", " + d.getClass().getName());
		
		Character c = Character.valueOf('B');
		System.out.println(c + ", " + c.getClass().getName());
		
		Boolean b = Boolean.valueOf(true);
		System.out.println(b + ", " + b.getClass().getName());
		
		String s = String.valueOf("�ָ�");
		System.out.println(s + ", " + s.getClass().getName());
		
		//���ڿ��� ���� �Ǵ� �������� Ÿ�� ��ȯ
		int numI = Integer.parseInt("100");
		double numD = Double.parseDouble("1.234");
		boolean bool = Boolean.parseBoolean("false");
		
		System.out.println(numI+50);
		System.out.println(numD+0.5);
		System.out.println(!bool);
		System.out.println();
		
		//�⺻ �ڷ����� ���ڿ��� Ÿ�� ��ȯ
		String str1 = Integer.toString(200);
		String str2 = Double.toString(52.15);
		String str3 = Character.toString('H');
		String str4 = Boolean.toString(true);
		
		System.out.println(str1+50);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		//IntegerŬ���� �� �˾ƺ���
		String strA = Integer.toHexString(17);
		String strB = Integer.toBinaryString(5);
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		System.out.println(strA);
		System.out.println(strB);
		System.out.println(max);
		System.out.println(min);
		
		/* �ڽ̰� ��ڽ� */
		//�ڽ�: �⺻ �ڷ����� ���� Wrapper ��ü�� ��ȯ�ϴ� ��
		//	WrapperŬ����Ÿ�� <- �⺻Ÿ��
		//	WrapperŸ�� ��ü�� = ��;
		Integer ten = 10; //�ڵ� �ڽ� Integer.valueOf(10);
		String str = "�ڵ� �ڽ�"; //String.valueOf("�ڵ� �ڽ�"); ���� �ڵ�ó��
		
		int num = 5;
		Integer five = num; //�ڵ� �ڽ�
		System.out.println("fiveŸ��: " + five.getClass().getName());
		
		//��ڽ�: �⺻Ÿ�� <- WrapperŸ��
		int reNum = five;
//		System.out.println(reNum.getClass().getName());
//		����: Ŭ���� Ÿ�Ը� Ȯ�� ����
	}
}










