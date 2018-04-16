package prototypeDesignPattern;

public class Main {

	public static void main(String[] args) {
		/*IShape s=new Rectangle();
		s.draw();*/
		
		IShape s=new Circle(10,10,10);
		s.draw();
		// TODO Auto-generated method stub
		
		IShape s1=((Circle)s).copy();
		s1.draw();
		
		/*
		IShape s=new Flag();
		s.draw();
		
		IShape s1=((Flag)s).copy();
		s1.draw();*/
		
	}

}
