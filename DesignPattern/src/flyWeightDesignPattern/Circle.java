package flyWeightDesignPattern;

public class Circle {
	
	private int x,y,r;
	private String color;
	public Circle(int x, int y, int r, String color) {
		this.x = x;
		this.y = y;
		this.r = r;
		this.color = color;
	}
	
	public void print() {
		System.out.println("circle is drawn at "+ x+","+y+" radius "+r+" color "+color);
	}
	

}
