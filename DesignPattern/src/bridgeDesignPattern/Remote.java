package bridgeDesignPattern;

public abstract class Remote {
	private ElectronicDevice ed;

	public Remote(ElectronicDevice ed) {
		this.ed = ed;
	}

	public void up() {
		ed.up();
	}

	public void down() {
		ed.down();
	}

	public void left() {
		ed.left();
	}

	public void right() {
		ed.right();
	}

	public abstract void middleButton();

}
