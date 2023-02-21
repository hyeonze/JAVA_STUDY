/*
	@�ʵ� 
	private String name: �̸� 
	private String subject: ����
	private int[] marking = new int[5]: �л��� ������ ����
	
	@������
	Exam(?): �̸�, ����, �л����� �ʱ�ȭ

	@�޼ҵ�
	showGrade():
	�л��� �Է��� ����� ���� ������ ���Ͽ� ������ �����ϰ�
	�л��� �̸�, ����, ������ ��¹����η� ��Ÿ���� �޼ҵ�
	int[] answer = {3, 1, 3, 4, 2}; //���� ����
*/

package practice03;

public class Exam {
	//�ʵ�
	private String name;//�̸�
	private String subject;//����
	private int[] marking = new int[5];//�л�����
	
	//������
	public Exam(String name, String subject, int[] marking) {
		this.name = name;
		this.subject = subject;
		this.marking = marking;
	}
	
	//������ ����ؼ� ��Ÿ���� �޼ҵ�
	void showGrade() {
		int[] answer = {3, 1, 3, 4, 2}; //���� ����
		int correct = 0; //���� ���� ������ ī��Ʈ�� ����
		char grade = ' ';//���� ��� ���� ���� ����
		
		//���� ���� ���� ���ϱ�
		for (int i = 0; i < 5; i++) {
			if(this.marking[i] == answer[i]) {
				correct++;
			}
		}
		
		//���� ���� ������ ���� ���� ����
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
		
		System.out.println(this.name+"���� "+this.subject+
				" ���� ������ "+grade+"�Դϴ�.");
	}

}










