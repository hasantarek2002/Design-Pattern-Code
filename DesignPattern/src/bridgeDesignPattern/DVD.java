package bridgeDesignPattern;

public class DVD extends ElectronicDevice {

	@Override
	public void left() {
		System.out.println("previous Video song");
		
	}

	@Override
	public void right() {
		System.out.println("Next Video song");
		
	}

}
