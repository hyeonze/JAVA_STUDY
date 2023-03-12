package contents;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class C03_Map {
	public static void main(String[] args) {
		/* Map : Ű(Key)�� ��(Value)�� ������ �̷���� �������� ���� */
		//Map �������̽��� ��밡���� Ŭ����
		Map<String, Integer> mapH = new HashMap<>();
		Map<Integer, Boolean> mapT = new TreeMap<>(); //���İ� �˻� ��� �߰�
		Map<Character, Integer> mapL = new LinkedHashMap<>(); //������� ������� �߰�
		
		/* HashMap ��ü ����ϱ� */
		HashMap<String, Integer> road = new HashMap<>();
		
		//������ �߰�
		road.put("������", 3000);
		road.put("����", 4000);
		road.put("�", 1000);
		road.put("���", 3000);
		road.put("�ֵ���", 1000);
		road.put("���", 5000); //key�� �ߺ� �Ұ�
		
		//������ Ȯ��
		System.out.println("road: " + road);
		System.out.println("road �� �� ��: " + road.size());
		
		//������ �˻�
		System.out.println(road.containsKey("����"));//�ش� Key�� �ִ��� Ȯ��
		System.out.println(road.get("����"));//�ش� Key�� Value ��������
		System.out.println(road.containsValue(1000)); //�ش� Value�� �ִ��� Ȯ��
		
		System.out.println("road.keySet(): " + road.keySet()); //��� Key�� Set�� ��� ���ϡ�
		
		//������ �������� by Iterator
		Set<String> keySet = road.keySet(); 
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next(); //�ݺ��ؼ� Key�� �޾ƿ�
			System.out.println(key + " : " + road.get(key));
		}
		System.out.println();
		
		//������ �������� by ���� for��
		for(String key : road.keySet()) {
			System.out.println(key + " : " + road.get(key));
		}
		
		//������ ����
		road.remove("�ֵ���");
		System.out.println("road: " + road);
		
		System.out.println("Map�� ����ִ°�? " + road.isEmpty());
		road.clear();
		System.out.println("road: " + road);
		System.out.println("Map�� ����ִ°�? " + road.isEmpty());
	}
}












