package bridgeDesignPattern;

public abstract class ElectronicDevice {
	
	public void up() {
		System.out.println("Volume up");
	}
	
	public void down() {
		System.out.println("Volume down");
	}
	
	public abstract void left();
	public abstract void right();
}
