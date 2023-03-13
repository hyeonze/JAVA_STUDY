package contents;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class C01_List {
	public static void main(String[] args) {
		/* List: ������ �ְ� �ߺ��� ����ϴ� �������� ���� */ //����O -> index O
		//List �������̽��� ��� ������ Ŭ����
		List<String> listA = new ArrayList<>(); //�迭����� ����Ʈ
		List<String> listL = new LinkedList<>(); //�������� ����Ʈ. �������� �߰��� ������ ����.
		List<String> listV = new Vector<>(); //Vector�� �����Ǿ� ArrayList ����.
		List<String> listS = new Stack<>(); //LIFO ����
		
		/* String �������� ArrayList ��ü ����ϱ� */
		ArrayList<String> cafe = new ArrayList<>();
		ArrayList<String> cafe2 = new ArrayList<String>();//�޺κ� <>�� ������ �����ص� ���� Ÿ���� �������
		System.out.println("cafe Ÿ��: " + cafe.getClass().getName());
		
		//������ �߰�
		cafe.add("����");
		cafe.add("�Ƹ޸�ī��");
		cafe.add("����");
		cafe.add("���̽�ũ��");
		cafe.add("���Ƽ");
		
		//������ Ȯ��
		System.out.println("cafe: " + cafe.toString());
		System.out.println("cafe: " + cafe);
		System.out.println("cafe ����Ʈ ����: " + cafe.size());
		
		//index�� ������ �߰�
		cafe.add(1, "����ũ");
		System.out.println("cafe: " + cafe);
		System.out.println("cafe ����Ʈ ����: " + cafe.size());
		
		//������ ����
		cafe.set(4, "�����"); //index�� ������ ����
		System.out.println("cafe: " + cafe);
		
		//������ �˻�
		//	contains(): �ش� �����Ͱ� �ڷῡ ���ԵǾ� �ִ��� ���� Ȯ��
		System.out.println(cafe.contains("ī���"));
		System.out.println(cafe.contains("�Ƹ޸�ī��"));
		//	get(i): index�� ������ ����
		System.out.println(cafe.get(4));
		
		for (int i = 0; i < cafe.size(); i++) {
			if(cafe.get(i).equals("�Ƹ޸�ī��")) {
				System.out.println("�Ƹ޸�ī���� index: " + i);
			}
		}
		
		//������ ����
		//	remove(int index): index�� ������ ���� 
		cafe.remove(3); 
		System.out.println("cafe: " + cafe);
		//	remove(Object o): �ش� ��ü ������ ����
		cafe.remove("���Ƽ");
		System.out.println("cafe: " + cafe);
		
		System.out.println("List�� ����ִ°�? " + cafe.isEmpty());
		cafe.clear(); //��� ������ ����
		System.out.println("cafe: " + cafe);
		System.out.println("List�� ����ִ°�? " + cafe.isEmpty());
		
		/* Integer �������� ArrayList ��ü ����ϱ� */
		//List.of�� ���� �迭�� ���� �����ϰ� IntegerŬ������ �ڽ� 
		ArrayList<Integer> num = new ArrayList<>(List.of(30, 5, 2023, 20, 15, 10));
		
		//WrapperŬ���� IntegerŸ���� �迭�� ����Ʈ�� ��ȯ
		Integer[] arr = {30, 5, 2023, 20, 15, 10};
		ArrayList<Integer> num2 = new ArrayList<>(List.of(arr)); //num����Ʈ�� ����
		
		//������ ���� ����
		System.out.println("num: " + num);
		num.remove(2);
		System.out.println("num: " + num);
		num.add(25);
		System.out.println("num: " + num);
		
		//�������� ����
		Collections.sort(num);
		System.out.println("�������� ����: " + num);
		
		//�������� ����
		Collections.sort(num, Collections.reverseOrder());
		System.out.println("�������� ����: " + num);
		
		//toArray(): �迭 <- ����Ʈ ��ȯ
		Integer[] arrInteg = num.toArray(new Integer[0]);
		System.out.println("arrInteg[0]: " + arrInteg[0]);
		System.out.println("arrInteg: " + Arrays.toString(arrInteg));
		
		/* ����ڰ� ���� Ŭ���� Ÿ���� ArrayList��ü ����ϱ� */
		//WaffleŸ�� ����Ʈ�� �����ͷ� ��밡���� ArrayList ��ü ����
		ArrayList<Waffle> waf = new ArrayList<>();
//		waf.add(10); ����: WaffleŸ���� �ƴ� �����ʹ� ���� �Ұ���
		waf.add(new Waffle("���ڿ���", 3000));
		waf.add(new Waffle("���̽�ũ������", 5000));
		waf.add(new Waffle("���ڵ������", 7000));
		System.out.println(waf);
		
		for (int i = 0; i < waf.size(); i++) {
			waf.get(i).show(); //i��° ��ü�� show�޼ҵ� ����
		}
		
		//����)
		//���޼���: ArrayList is a raw type. 
		//References to generic type ArrayList<E> should be parameterized
		ArrayList list = new ArrayList(); //Ÿ�� ������� ������ ���� ���� but ����X
		list.add(10);
		list.add(22.5);
		list.add('K');
		list.add(true);
		System.out.println(list);
		
		list.add(new Waffle("���ڶ����", 5000));
		System.out.println(list);
		
		int a = num.get(0); //���� ��ڽ�: int <- Integer �ڵ����� Ÿ�Ժ�ȯ
		System.out.println(a);
		
//		int b = list.get(0); //��ڽ��� �ڵ����� �����ش�
		int b = (int)list.get(0); //���� ��ڽ�
	}
}

class Waffle{
	String name; 
	int price;
	
	public Waffle(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void show() {
		System.out.println(this.name+" "+this.price+"��");
	}
}








