package practice01;

public class Apart extends Building {
	int floor;
	
	void setData(String name, int price, int floor) {
		setData(name, price);
		this.floor = floor;
	}
	
	void showApart() {
		showData();
		System.out.println("Ãþ¼ö: " + floor);
	}
}
