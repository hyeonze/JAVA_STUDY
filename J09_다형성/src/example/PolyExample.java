package example;

public class PolyExample {
	public static void main(String[] args) {
//		Bird bird = new Bird();
//		Duck duck = new Duck();
//		Tiger tiger = new Tiger();
//		bird.cry();
//		duck.cry();
//		tiger.cry();
		
		//업캐스팅하여 객체 생성
		Animal bird = new Bird();
		Animal duck = new Duck();
		Animal tiger = new Tiger();
		Animal[] ani = {bird, duck, tiger};
		for (int i = 0; i < ani.length; i++) {
			ani[i].cry();
		}
		System.out.println("==============");
		Nature nature = new Nature();
		for (int i = 0; i < ani.length; i++) {
			nature.sound(ani[i]);
		}
		Waterfall wf = new Waterfall();
		nature.sound(wf);
	}
}








