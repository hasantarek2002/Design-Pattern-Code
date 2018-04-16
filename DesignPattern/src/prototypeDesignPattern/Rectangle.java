package prototypeDesignPattern;

public class Rectangle extends CompositeShape{

	@Override
	public void buildShape() {
		
		arr.add(new Line(1,2,3,4));
		arr.add(new Line(5,6,7,8));	
		arr.add(new Line(9,10,11,12));
		arr.add(new Line(13,14,15,16));
		
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
