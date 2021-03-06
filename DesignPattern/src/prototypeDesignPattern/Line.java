package prototypeDesignPattern;

public class Line implements IShape{
	

	private int x1,x2,y1,y2;
	public Line(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Line is drawn in : "+x1+" "+y1+" "+x2+" "+y2);
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
