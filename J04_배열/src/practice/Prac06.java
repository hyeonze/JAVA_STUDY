package practice;

import java.util.Scanner;

public class Prac06 {
	public static void main(String[] args) {
		/* ����Ʈ ȣ�� �迭 */
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
		
		/* �� ����Ʈ ȣ������ ������ �迭 */
		int[][] pay = {
				{1000, 2100, 1300},	
				{4100, 2000, 1000},	
				{3000, 1600,  800}
			};
		
		//Q1) �� ���� ������ �� ����ϱ�
		//���) 1�� ������: 4400
		//	   2�� ������: 7100
		//	   3�� ������: 5400
		for (int i = 0; i < 3; i++) {
			int sum = 0;
			for (int j = 0; j < 3; j++) {
				sum += pay[i][j];
			}
			System.out.println((i+1)+"�� ������: " + sum);
		}
		
		//Q2) ȣ�� �Է��ϸ� ������ ����ϱ�
		//���) ȣ �Է�: 202	
		//	   ������: 2000
		Scanner sc = new Scanner(System.in);
		System.out.print("ȣ �Է�: ");
		int ho = sc.nextInt();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(ho == apt[i][j]) {
					System.out.println("������: "+pay[i][j]);
					break;
				}
			}
		}
		
		//Q3) ������ ���� ���� ���� ��, ���� ���� �� ���
		//���) ���� ���� ���� ��: 201
		//	   ���� ���� ���� ��: 303
		int maxPay = pay[0][0];
		int minPay = pay[0][0];
		int maxHo = 0;
		int minHo = 0;
	
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(maxPay < pay[i][j]) {
					maxPay = pay[i][j];
					maxHo = apt[i][j];
				}
				if(minPay > pay[i][j]) {
					minPay = pay[i][j];
					minHo = apt[i][j];
				}
			}
		}
		System.out.println("���� ���� ���� ��: " + maxHo);
		System.out.println("���� ���� ���� ��: " + minHo);
		
	}
}














