package FactoryPattern2;

public class WoodenFactory extends AbstractFactory {

	@Override
	public IRoom createRoom() {
		// TODO Auto-generated method stub
		return new WoodenRoom();
	}

	@Override
	public IWindow createWindow() {
		// TODO Auto-generated method stub
		return new WoodenWindow();
	}

	@Override
	public IDoor createDoor() {
		// TODO Auto-generated method stub
		return new WoodenDoor();
	}

}
