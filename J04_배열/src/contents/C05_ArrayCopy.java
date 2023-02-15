package contents;

import java.util.Arrays;

public class C05_ArrayCopy {
	public static void main(String[] args) {
		//참조타입과 기본타입에서 데이터를 복사하는 형태가 서로 다르다.
		int a = 100;
		int b = a;
		System.out.println(a==b);
		
		/* 배열의 복사 */
		int[] arr = {10, 20, 30};//원본 배열
		
		//1. 얕은 복사(레퍼런스 복사)
		//배열이 참조하는 객체를 공유
		int[] refCopy = arr;//배열의 주소 복사
		System.out.println(refCopy==arr); //서로 같은 주소 공유

		//주소가 같은 두 배열은 데이터도 같은 값을 공유
		arr[0] = 500; //원본 데이터 변경
		System.out.println("arr[0]: " + arr[0]);
		System.out.println("refCopy[0]: " + refCopy[0]);
		refCopy[1] = 1000;
		System.out.println("arr 데이터: " + Arrays.toString(arr));
		System.out.println("refCopy 데이터: " + Arrays.toString(refCopy));
		
		System.out.println("============================");
		arr[0] = 10;
		arr[1] = 20;
		
		//2. 깊은 복사(값 복사)
		//배열의 값만 복사해서 저장
		int[] valCopy = {arr[0], arr[1], arr[2]}; //배열의 데이터값 복사
		System.out.println(Arrays.toString(valCopy));
		System.out.println(valCopy==arr);
		valCopy[0] = -1;
		System.out.println("valCopy 데이터: " + Arrays.toString(valCopy));
		System.out.println("arr 데이터: " + Arrays.toString(arr));
		
		//clone(): 배열 값만 복사
		int[] arrClone = arr.clone();
		System.out.println("arrClone 데이터: " + Arrays.toString(arrClone));
		System.out.println(arrClone==arr);
		
		//주소 확인
		System.out.println("arr: " + arr);
		System.out.println("refCopy: " + refCopy);
		System.out.println("valCopy: " + valCopy);
		System.out.println("arrClone: " + arrClone);
	}
}






