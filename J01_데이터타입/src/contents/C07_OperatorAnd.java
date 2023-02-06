/*
# ��������
&&, ||, !
���ǽĿ� ���� ����� �� �Ǵ� �������� �����Ѵ�.

&&: ���� ������(AND)
	���� ���ǽ��� ��� ���� ��� => ����� ��

||: ���� ������(OR)
	�ϳ��� ���ǽ��̶� ���� ��� => ����� ��
	
! : ���� ������(NOT)
	�� ���ǽ��� ����� ������
	

���ǽ�	������	���ǽ�	AND(&&)		OR(||)
true	@@		true	true		true
false	@@		true	false		true
true	@@		false	false		true
false	@@		false	false		false

*/
package contents;

public class C07_OperatorAnd {
	public static void main(String[] args) {
		/* �������� Ȯ���ϱ� */
		int music = 90;
		int art = 70;
		
		boolean p1 = music > 80; //��
		boolean p2 = art > 80; //����
		
		System.out.println("p1&&p2: " + (p1&&p2)); //��&&���� ����
		System.out.println("p1||p2: " + (p1||p2)); //��||���� ����
		System.out.println("!p1: " + !p1); //!�� ����
		System.out.println("!p2: " + !p2); //!���� ����
		
		System.out.println(20 > 10 && 20 == 10); //��&&���� ����
		System.out.println(20 > 10 || 20 == 10); //��||���� ����
		System.out.println(!(20 > 10)); //!�� ����
	}
}












