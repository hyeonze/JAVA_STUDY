/*
	@필드 
	private String name: 이름 
	private String subject: 과목
	private int[] marking = new int[5]: 학생이 기입한 정답
	
	@생성자
	Exam(?): 이름, 과목, 학생정답 초기화

	@메소드
	showGrade():
	학생이 입력한 정답과 실제 정답을 비교하여 성적을 산출하고
	학생의 이름, 과목, 성적을 출력문으로로 나타내는 메소드
	int[] answer = {3, 1, 3, 4, 2}; //실제 정답
*/

package practice03;

public class Exam {
	//필드
	private String name;//이름
	private String subject;//과목
	private int[] marking = new int[5];//학생정답
	
	//생성자
	public Exam(String name, String subject, int[] marking) {
		this.name = name;
		this.subject = subject;
		this.marking = marking;
	}
	
	//성적을 계산해서 나타내는 메소드
	void showGrade() {
		int[] answer = {3, 1, 3, 4, 2}; //실제 정답
		int correct = 0; //맞은 정답 개수를 카운트할 변수
		char grade = ' ';//성적 등급 구할 문자 변수
		
		//맞은 정답 개수 구하기
		for (int i = 0; i < 5; i++) {
			if(this.marking[i] == answer[i]) {
				correct++;
			}
		}
		
		//맞은 정답 개수에 따른 성적 대응
		switch(correct) {
		case 5, 4:
			grade = 'A';
			break;
		case 3, 2:
			grade = 'B';
			break;
		case 1, 0:
			grade = 'C';
			break;
		}
		
		System.out.println(this.name+"님의 "+this.subject+
				" 시험 성적은 "+grade+"입니다.");
	}

}










