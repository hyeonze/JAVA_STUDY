package practice01;

public class Hotel extends Building {
	int vipRoom;
	
	void setData(String name, int price, int vipRoom) {
		setData(name, price);
		this.vipRoom = vipRoom;
	}
	
	void showHotel() {
		showData();
		System.out.println("vip·ë ¼ö: " +vipRoom);
	}
}






