package practice;

import java.util.Scanner;

public class Prac06 {
	public static void main(String[] args) {
		/* 아파트 호수 배열 */
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
		
		/* 각 아파트 호에서의 관리비 배열 */
		int[][] pay = {
				{1000, 2100, 1300},	
				{4100, 2000, 1000},	
				{3000, 1600,  800}
			};
		
		//Q1) 각 층별 관리비 합 출력하기
		//결과) 1층 관리비: 4400
		//	   2층 관리비: 7100
		//	   3층 관리비: 5400
		for (int i = 0; i < 3; i++) {
			int sum = 0;
			for (int j = 0; j < 3; j++) {
				sum += pay[i][j];
			}
			System.out.println((i+1)+"층 관리비: " + sum);
		}
		
		//Q2) 호를 입력하면 관리비 출력하기
		//결과) 호 입력: 202	
		//	   관리비: 2000
		Scanner sc = new Scanner(System.in);
		System.out.print("호 입력: ");
		int ho = sc.nextInt();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(ho == apt[i][j]) {
					System.out.println("관리비: "+pay[i][j]);
					break;
				}
			}
		}
		
		//Q3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
		//결과) 가장 많이 나온 집: 201
		//	   가장 적게 나온 집: 303
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
		System.out.println("가장 많이 나온 집: " + maxHo);
		System.out.println("가장 적게 나온 집: " + minHo);
		
	}
}














