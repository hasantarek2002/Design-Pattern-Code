package commandDesignPattern;

public class Circle {
	// reciever class
	private int x, y;

	public Circle(int x, int y) {

		this.x = x;
		this.y = y;
	}

	public void transform(int x, int y) {
		System.out.println(" axis is " + x + " " + y);

	}

	public void fillColor(String color) {
		System.out.println("changed color is " + color);

	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}
