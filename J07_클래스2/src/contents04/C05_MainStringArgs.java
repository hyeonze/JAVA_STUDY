package contents04;

import java.util.Arrays;

public class C05_MainStringArgs {
	public static void main(String[] args) {
		/* (String[] args) �Ű����� �˾ƺ��� */
		//���� ������ Ŭ������ ���� �޼ҵ� �Ű����� Ȱ���ϱ�
		System.out.println(args);
		System.out.println("���θ޼ҵ� �Ű����� ����(����): " + args.length);
		
		//Run > Run Configurations > Ŭ������ > Arguments > Program arguments: ���� �Է� > Run
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(Arrays.toString(args));
		args[0] = "Funny";
		System.out.println(Arrays.toString(args));
		
		//�ٸ� Ŭ������ ���� �޼ҵ带 �����غ���
		//���ڿ� �迭�� ����(Arguments) ���� �־ ���� �޼ҵ� ����
		String[] msg = {"Time", "waits", "for", "no", "one"};
		ArgsEx.main(msg);//ArgsExŬ������ ���θ޼ҵ带 �����ϴµ� �ʿ��� �ڷḦ ����
	}
}





