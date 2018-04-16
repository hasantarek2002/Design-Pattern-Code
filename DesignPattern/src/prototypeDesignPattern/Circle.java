package prototypeDesignPattern;

public class Circle implements IShape {
	private int x1,y1,r;
	public Circle(int x1, int y1, int r) {
		
		this.x1 = x1;
		this.y1 = y1;
		this.r = r;
	}

	
	
	@Override
	public void draw() {
		System.out.println("circle is drawn : "+x1+" "+y1+" radius "+r);
		
	}

	public IShape copy() {
		try {
			return (IShape) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
