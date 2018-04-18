package commandDesignPattern;

public class TransformCommand implements ICommand {

	
	private Circle c;
	private int x,y,oldX,oldY;
	
	public TransformCommand(Circle c, int x, int y) {
		
		this.c = c;
		this.x = x;
		this.y = y;
	}
	
	
	
	@Override
	public void execute() {
		this.oldX=c.getX();
		this.oldY=c.getY();
		c.transform(x, y);	
	}

	@Override
	public void undo() {
		c.transform(oldX, oldY);
		
	}

}
