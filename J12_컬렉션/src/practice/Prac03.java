/* list, set, map
Q)	��ٸ�Ÿ�⸦ �����غ���.
	���� �ο����� �Է¹޾Ƽ� �ش� �ο��� ���������� �����ϴµ�
	������ ���� �д� ������ ��ٸ�Ÿ��� ���ϱ�� �Ͽ���.
	����ó�� �ο�����ŭ �̸��� ������ ����ڷκ��� �Է� �ް�,
	��ٶ�Ÿ�� ��÷ ����� ȭ�鿡 ��Ÿ������ �����غ���.
	
	�� Console ��	
	�ο��� �Է�: 5
	�̸�1: A
	�̸�2: B
	�̸�3: C
	�̸�4: D
	�̸�5: E
	����1: PPT����
	����2: �ڷ�����
	����3: ��ǥ
	����4: �����ۼ�
	����5: ���ӽ���
	��÷���Դϴ�..
	
	- ��÷ ��� -
	A -> �����ۼ�
	B -> ��ǥ
	C -> ���ӽ���
	D -> �ڷ�����
	E -> PPT����

*/

package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Prac03 {
	public static void main(String[] args) {
		String[] nameArr = {"A", "B", "C", "D", "E"};
		String[] pickArr = {"PPT����", "�ڷ�����", "��ǥ", "�����ۼ�", "���ӽ���"};
		int num = nameArr.length; //�ο��� ����
		
		Random rd = new Random();
		
		/* ���1. List�� ������ Ư���� �̿� */
		System.out.println("====���1====");
		//�̸��� �׸� ������ ���� List�� ����
		ArrayList<String> name = new ArrayList<>();
		for(String put : nameArr) {//�̸� ����Ʈ ����
			name.add(put);
		}
		
		ArrayList<String> pick = new ArrayList<>();
		for(String put : pickArr) {//���� ����Ʈ ����
			pick.add(put);
		}
		
		//�̸��� Key��, ������ Value�� Map�� ����
		HashMap<String, String> result = new HashMap<>();
		
		int index = num;
		for(int i = 0; i < num; i++) {
			int rdKey = rd.nextInt(index);
			int rdValue = rd.nextInt(index);
			
			//Map�� ������ �߰�
			result.put(name.get(rdKey), pick.get(rdValue));
			
			//Map���� �߰��� Key�� Value ������ ����Ʈ���� ����
			name.remove(rdKey);
			pick.remove(rdValue);
			index--;//����� ����Ʈ index�� ����
		}
		
		//��ٶ�Ÿ�� ��� ���
		for (String key : result.keySet()) {
			System.out.println(key + " -> " + result.get(key));
		}
		
		/* ���2. HashSet�� ���� ������ ����(=����)�� �̿� */
		//��, �ߺ��Ǵ� �̸��̳� �׸��� ���� ��츸 ��� ����
		System.out.println("====���2====");
		HashSet<String> name2 = new HashSet<>();
		for(String put : nameArr) {
			name2.add(put);
		}
		
		HashSet<String> pick2 = new HashSet<>();
		for(String put : pickArr) {
			pick2.add(put);
		}
		
		HashMap<String, String> result2 = new HashMap<>();
		Iterator<String> namekey = name2.iterator();
		Iterator<String> pickValue = pick2.iterator();
		for (int i = 0; i < nameArr.length; i++) {
			//name2�� pick2�� Set���� �ϳ��� ������ key, value ������ Map�� �߰�
			result2.put(namekey.next(), pickValue.next());
		}
		
		for(String key : result.keySet()) {
			System.out.println(key+" -> "+result2.get(key));
		} 
		
		/* ���3. shuffle() �޼ҵ� */
		System.out.println("====���3====");
		ArrayList<String> nameS = new ArrayList<>();
		for(String put : nameArr) {
			nameS.add(put);
		}
		
		ArrayList<String> pickS = new ArrayList<>();
		for(String put : pickArr) {
			pickS.add(put);
		}
		
		//CollectionsŬ������ shuffle()�޼ҵ�� ����Ʈ ������ ���� ����
		Collections.shuffle(pickS); //key�� value �� �ϳ��� �����ϸ� �ȴ�.
		
		//�̸��� ���� ����Ʈ �����͸� key, value������ Map�� �߰�
		HashMap<String, String> result3 = new HashMap<>();
		for(int i=0;i<num;i++) {
			result3.put(nameS.get(i), pickS.get(i));
		}
		
		for(String key : result.keySet()) {
			System.out.println(key+" -> "+result3.get(key));
		}
		
	}
}







