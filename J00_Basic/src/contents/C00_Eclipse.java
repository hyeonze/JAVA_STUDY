/* 이클립스 환경 알아보기
# 주석문(comments)
메모 또는 코드를 설명하는 용도. 코드실행X
한줄주석: ctrl + /
여러줄주석: ctrl + shift + / (제거: ￦)
색상수정: preferences > java > editor > syntax coloring > comments
노: 230, 219, 116
초: 142, 183, 116

# font 수정
주석 수정. customize가능 
자동완성 기능
콘솔창 수정 Windows > Preferences > General > Appearance > Colors and Fonts > Debug > Console font
폰트 확대, 축소: ctrl + '+'/'-'

# 한글깨짐 처리하기
- UTF-8 설정(한글깨짐 방지)
Windows>preference>general>workspace>text file encoding: 'UTF-8'
						  >content types>Java Class File> Default encoding: MS949 입력하고 update

- 프로젝트 가져와서 실행시 Console창 실행화면 한글 깨짐 해결: 
run > run configration > common >endcoding: MS949 입력 후 실행

# 이클립스 UI 확대하기
이클립스가 설치되어 있는 폴더의 eclipse.ini 메모장으로 오픈
다음 코드 입력. autoScale = 원하는크기 

-Dswt.enable.autoScale=true 
-Dswt.autoScale=200
-Dswt.autoScale.method=nearest

# 프로젝트창 
이클립스 레이아웃 초기화: Window - Perespective - Reset Perspective
폴더구성: 워크스페이스-프로젝트-소스폴더-패키지-클래스

# 파일 작명규칙 공통
대소문자를 구분함
특수문자는 '_', '$'만 가능
숫자로 시작X
자바 키워드X
한글명O

Project-package-Class
프로젝트: 대문자 시작 권장
패키지: 소문자 시작 원칙
클래스: 대문자 시작 원칙

*/
package contents;

public class C00_Eclipse {
	//"main"+ctrl+space: 메인공간 자동완성
	public static void main(String[] args) {
		// 한줄 주석
		/*
		 * 여러줄 주석
		 * 여러줄에 주석 처리
		 */

		//"syso"+ctrl+space: 출려문 자동완성
//		System.out.println("자바 시작!");
		System.out.println("OT");
		
		/* 여러줄 주석 처리
		 * System.out.println("OT"); System.out.println("OT"); System.out.println("OT");
		 */
		
		//실행(Run): ctrl + F11
		System.out.println("출력문");
		System.out.println("실행하기");
		 
//		system.out.println();
//		=> 에러: 빨간줄이 표시되면 에러 발생. 실행X
	}
}




