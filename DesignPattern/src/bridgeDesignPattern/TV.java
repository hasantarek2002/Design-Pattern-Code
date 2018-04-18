package bridgeDesignPattern;

public class TV extends ElectronicDevice{

	@Override
	public void left() {
		System.out.println("previous Channel");
		
	}

	@Override
	public void right() {
		System.out.println("Next Channel");
		
	}

}
