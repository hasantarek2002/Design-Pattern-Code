package FactoryPattern2;

public class GlassFactory extends AbstractFactory{

	@Override
	public IRoom createRoom() {
		// TODO Auto-generated method stub
		return new GlassRoom();
	}

	@Override
	public IWindow createWindow() {
		// TODO Auto-generated method stub
		return new GlassWindow();
	}

	@Override
	public IDoor createDoor() {
		// TODO Auto-generated method stub
		return new GlassDoor();
	}

}
