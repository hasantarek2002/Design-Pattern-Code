package commandDesignPattern;

public class Main {

	public static void main(String[] args) {
		Circle c = new Circle(1, 2);
		// c.transform(x, y);
		TransformCommand tc = new TransformCommand(c, 3, 4);
		Invoker iv = new Invoker();
		iv.execute(tc);
		iv.undo(tc);

	}

}
