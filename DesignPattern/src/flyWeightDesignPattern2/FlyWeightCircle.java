package flyWeightDesignPattern2;

public class FlyWeightCircle {
	
	private String color;
	public FlyWeightCircle(String color) {
		this.color = color;
	}
	
	public void draw(int x, int y, int r) {
		System.out.println("circle is drawn at "+ x+","+y+" radius "+r+" color "+color);
	}
	

}
