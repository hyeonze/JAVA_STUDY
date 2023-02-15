/*
# 2차원 배열 선언
	자료형[][] 배열명 = {{데이터목록1}, {데이터목록2}, {데이터목록3},... };
	자료형[][] 배열명 = new 자료형[행개수][열개수];
	
# 행렬(Matrix): [가로행][세로열]

*/
package contents;

public class C03_2D_Array {
	public static void main(String[] args) {
		/* 2차원 배열 생성하기1 */
		System.out.println("=====2차원 배열 생성하기1=====");
		int[] numbers1 = { 5, 10, 15, 20, 25 };
		int[] numbers2 = { 10, 20, 30, 40, 50 };
		int[] numbers3 = { 15, 30, 45, 60, 75 };
		
		//동일한 두 배열 생성
		int[][] arr1 = {
				{ 5, 10, 15, 20, 25 },
				{ 10, 20, 30, 40, 50 },
				{ 15, 30, 45, 60, 75 }
		};
		int[][] arr2 = {numbers1, numbers2, numbers3};
		
		//2차원 배열의 길이(개수, 크기)
		System.out.println("행개수: "+ arr1.length);
		System.out.println("열개수: "+ arr1[0].length);
		
		//2차원 배열 데이터 접근하기
		System.out.println(arr1[0][0]);
		System.out.println(arr1[0][2]);
		System.out.println(arr1[1][3]);
		System.out.println(arr1[2][2]);
		
		//2차원 배열 전체 데이터 확인하기
		for (int i = 0; i < arr1.length; i++) {//행개수(3)
			for (int j = 0; j < arr1[i].length; j++) {// 열개수(5)
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}
		
		/* 2차원 배열 생성하기2 */
		System.out.println("=====2차원 배열 생성하기2=====");
		int[][] num = new int[2][3];
		int a = 1;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				num[i][j] = a;
				a++;
			}
		}
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(num[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("======================");
		
		//예제: 이중for문으로 arr1과 같은 배열을 만들고 출력해보기
		int[][] arr3 = new int[3][5];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				arr3[i][j] = 5 * (j + 1) * (i + 1);
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr3[i][j] + "\t");
			}
			System.out.println();
		}
	}
}









