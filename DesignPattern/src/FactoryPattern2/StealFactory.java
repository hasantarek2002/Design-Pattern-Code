package FactoryPattern2;

public class StealFactory extends AbstractFactory{

	@Override
	public IRoom createRoom() {
		return new StealRoom();
	}

	@Override
	public IWindow createWindow() {
		// TODO Auto-generated method stub
		return new StealWindow();
	}

	@Override
	public IDoor createDoor() {
		// TODO Auto-generated method stub
		return new StealDoor();
	}

}
