/*
# 이클립스 단축키
1. 프로젝트창
현재페이지 전체화면: ctrl + M 
화면 세로 분할: ctrl + shift + {
화면 가로 분할: ctrl + shift + __ 

2. 코드 작성시
코드 자동정렬: ctrl + shift + f
한줄(영역) 이동: alt + ↓,↑
한줄(영역) 복사: alt + ctrl + ↓,↑
한줄(영역) 삭제: ctrl + D
*/
package contents;

public class C00_Shortcut {
	public static void main(String[] args) {
		int[] arr = { 20, 55, 10, 3, 85, 36, 70, 64 };
		int max = arr[0];
		int min = arr[0];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
			sum += arr[i];
		}

		double avg = (double) sum / arr.length;
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		System.out.println("평균값: " + avg);
	}
}
