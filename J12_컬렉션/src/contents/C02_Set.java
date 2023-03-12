package contents;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class C02_Set {
	public static void main(String[] args) {
		/* Set : ������ ���� �ߺ��� ������� �ʴ� �������� ���� */ //����X -> index X
		//Set �������̽��� ��밡���� Ŭ����
		Set<Double> setH = new HashSet<>();
		Set<Double> setT = new TreeSet<>(); //���İ� �˻� ��� �߰�
		Set<Double> setL = new LinkedHashSet<>(); //������� ������� �߰�
		
		/* String �������� HashSet ��ü ����ϱ� */
		HashSet<String> menu = new HashSet<>(); 
		
		//������ �߰�
		menu.add("����");
		menu.add("�ܹ���");
		menu.add("����"); //�ߺ� ���X
		menu.add("������");
		menu.add("�Ľ�Ÿ");
		menu.add("����");
		
		//������ Ȯ��
		System.out.println("menu: " + menu); //������� ����X
		System.out.println("menu �� ����: " + menu.size());
		
		//������ �˻�
		System.out.println(menu.contains("������"));//�ش� ������ �ִ��� Ȯ��
		System.out.println(menu.contains("������"));
		
		//������ �������� by Iterator
		//IteratorŬ����: �÷����� �����͸� �ϳ��� �о�ö� ���
		Iterator<String> iterator = menu.iterator();
//		System.out.println(iterator.next()); //next(): ���� ������ ��������
		while(iterator.hasNext()) {//���� �����Ͱ� ������� ������ �ݺ�
			//hasNext(): ���� �����Ͱ� ����ִ��� Ȯ��(true/false)
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		//������ �������� by ���� for��
		for(String element : menu) {
			System.out.print(element + " ");
		}
		System.out.println();
		
		//������ ����
		menu.remove("�ܹ���");
		System.out.println("menu: " + menu);
		
		System.out.println("Set�� ����ִ°�? " + menu.isEmpty());
		menu.clear();
		System.out.println("menu: " + menu);
		System.out.println("Set�� ����ִ°�? " + menu.isEmpty());
		
		/* Integer �������� TreeSet ��ü ����ϱ� */
		//TreeSet�� HashSet���� ������ ���İ� �˻� ����� �߰�
		Integer[] arr = {20, 50, 30, 50, 10, 40};
		TreeSet<Integer> num = new TreeSet<>(List.of(arr));//�� <- ����Ʈ <- �迭
		
		//1. ������ ����
		//TreeSet�� �����͸� ������������ ���
		System.out.println(num);
		
		//descendingSet(): ������ ������ �������� �ٲ�
		System.out.println(num.descendingSet());//�������� ���
		System.out.println(num.descendingSet().descendingSet());
		
		//2. ������ �˻�
		//first(), last(): �ּҰ�, �ִ밪 ����
		System.out.println("num.first(): " + num.first());
		System.out.println("num.last(): " + num.last());
		
		//lower(E), higher(E): �Է� ���Һ��� �ϳ� ���ų� ���� �� 
		System.out.println("num.lower(30): " + num.lower(30));
		System.out.println("num.higher(30): " + num.higher(30));
		
		//floor(E), ceiling(E): �Է� ���� ���� Ȥ�� �̻��� ��
		System.out.println("num.floor(30): " + num.floor(30));
		System.out.println("num.ceiling(15): " + num.ceiling(15));
		
		//toArray(): �迭 <- Set ��ȯ
		Integer[] setArr = num.toArray(new Integer[0]);
		System.out.println("setArr[0]: " + setArr[0]);
		System.out.println("setArr: " + Arrays.toString(setArr));
	}
}








