package contents;

import java.io.File;
import java.util.Arrays;

public class C05_Object {
	public static void main(String[] args) {
		/* Object Ŭ���� */
//		�ڹٿ��� ���Ǵ� ��� Ŭ�������� �ֻ��� �θ�Ŭ����(����Ŭ����)
//		��� Ŭ������ ObjectŬ������ �ڵ����� ��� �޴´�. 
		
		//ObjectŬ�������� �����ϴ� �⺻ �޼ҵ��
		Object obj = new Object();
//		obj.
		
		//Object�� ��� �޼ҵ带 �ٸ� Ŭ�����鿡�� �⺻������ ��� ����
		Example ex = new Example();
//		ex.
		
		/* Object �޼ҵ� */
		//getClass(): ��ü�� Ŭ���� Ȯ��
		System.out.println(ex.getClass());
		System.out.println(obj.getClass().getName());
		System.out.println("winter".getClass().getName());
		char[] arr = new char[10];
		System.out.println(arr.getClass().getName());
		
		//equals(): ���� ���� ��ü���� ��
		String str = "spring";
		System.out.println(str.equals("winter"));
		
		Example ample = new Example();
		System.out.println(ex.equals(ample));
		ample = ex; //���� ����(����, �ּҺ���)
		System.out.println(ex.equals(ample));
		
		//toString(): ��ü�� ���ڿ� Ȯ��
		System.out.println(ample.toString());
		System.out.println(arr.toString());
		
		//toString() �޼ҵ� �������̵��Ͽ� ����ϱ�
		ExOver ov = new ExOver();
		ov.msg = "toString �������̵�";
		System.out.println(ov.toString());//�������̵��� toString�޼ҵ�� ȣ��
		
		File f = new File("D:\\����\\workspace\\J10_�⺻API\\src\\contents");
		System.out.println(f.toString());//�������̵�: ��ü�� ���� ��ġ ��θ� ���
		
		//cf)
		int[] abc = {10,20,30,40};
		System.out.println(Arrays.toString(abc)); //�����ε��� �޼ҵ�
	}
}

class Example{
	
}

class ExOver{
	String msg;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "���� �޼��� ���: " + msg;
	}
	
}







