package commandDesignPattern;

public class Invoker {
	public void execute(TransformCommand tc) {
		tc.execute();
	}
	
	public void undo(TransformCommand tc) {
		tc.undo();
	}

}
