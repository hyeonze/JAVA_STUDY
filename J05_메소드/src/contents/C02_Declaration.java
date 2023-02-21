/* �޼ҵ� �����ϱ�(method declaration)
# �޼ҵ� ����� �帧
(�Է�) -> �޼ҵ� -> (���)
(�Ű�����) -> �޼ҵ� -> (���ϰ�)

# �޼ҵ� ���� ����Ǽ�
���ϰ�	�Ű�����		�޼ҵ� ����
X		X			void func(){}
O		X			int func(){return 10;}
X		O			void func(int num){}
O		O			int func(int num){return 10;}

# �޼ҵ� ����� ����ϱ�
1. ������� �޼ҵ��� ����� �����Ѵ�.
2. ��ɿ� �´� �޼ҵ��̸��� ���Ѵ�.
3. ����Ÿ��(���)�� �Ű�����(�Է�) ������ ����Ͽ� �޼ҵ带 �����.
4. �޼ҵ��̸��� �Ű������� �Է��Ͽ� �޼ҵ带 ����Ѵ�.

�Ű�����(parameter): �޼ҵ� ����� ()�ȿ� �ʿ��� ����. variable
����(argument): �޼ҵ� ȣ��� ���޵Ǵ� ������(��). value
("����" = "�μ�" = "�Ű���")

*/
package contents;

public class C02_Declaration {
	//Case1) ����X, �Ű�����X �޼ҵ�
	//	����: "�ȳ��ϼ���" ���ڿ��� 5�� ����ϴ� �޼ҵ带 ����� �����Ͻÿ�.
	static void printHello() {
		for (int i = 0; i < 5; i++) {
			System.out.println("�ȳ��ϼ���");
		}
	}
	
	//Case2) ����O, �Ű�����X �޼ҵ�
	//	����: "�����մϴ�" ���ڿ��� ��ȯ�ϴ� �޼ҵ带 ����� ��¹����� ȣ���Ͽ� Ȯ���Ͻÿ�.
	static String thank() {
		return "�����մϴ�";
	}
	
	//Case3) ����X, �Ű�����O �޼ҵ�
	//	����: �Ű������� ���ڿ��� ���ڸ� �Է¹ް�,
	//		 ���� ������ Ƚ����ŭ ���� ���ڿ� ������ ����ϴ� �޼ҵ带 �ۼ��ϰ� �����Ͻÿ�.
	static void repeatMsg(String str, int times) {
		for (int i = 0; i < times; i++) {
			System.out.println(str);
		}
	}
	
	//Case4) ����O, �Ű�����O �޼ҵ�
	//	����: �Ű������� �� ������ �Է¹ް� ��հ��� �����ϴ� �޼ҵ带 �ۼ��ϰ� �����Ͻÿ�.
	static double average(int a, int b, int c) { //a,b,c�� �Ű�����(parameter)
		return (a+b+c)/3.0;
	}
	
	//����: ���� �迭�� �Ű������� �޾� ����� �����ϴ� �޼ҵ带 ����
	static double arrAverage(int[] arr) {//arr�� �Ű�����
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return (double)sum/arr.length;
	}
	
	public static void main(String[] args) {
		System.out.println("=====Case1=====");
		printHello();
		
		System.out.println("=====Case2=====");
		System.out.println(thank());
		String msg = thank();
		System.out.println(msg);
		
		System.out.println("=====Case3=====");
		repeatMsg("2���� ����", 4);
		
		System.out.println("=====Case4=====");
		double avg = average(5, 10, 20); //5, 10, 20�� ����(argument)
		System.out.println("�� ���� ���: " + avg);
		
		int[] num1 = {5, 10, 20};
		System.out.println("num1�迭�� ���: " + arrAverage(num1));//num1�� ����
		
		int[] num2 = { 10, 20, 30, 40, 50, 60 };
		System.out.println("num2�迭�� ���: " + arrAverage(num2));//num2�� ����
	}
}






