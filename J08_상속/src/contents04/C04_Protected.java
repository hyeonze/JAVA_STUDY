package contents04;

public class C04_Protected {
	public static void main(String[] args) {
//		protected는 같은 패키지의 모든 클래스에서,
//		또는 다른 패키지의 상속받은 클래스에서 접근 가능
		SubProt subprot = new SubProt();
		subprot.getSuperMsg();
	}
}
