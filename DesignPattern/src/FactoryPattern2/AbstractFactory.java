package FactoryPattern2;


public abstract class AbstractFactory {

		public abstract IRoom createRoom();
		public abstract IWindow createWindow();
		public abstract IDoor createDoor();
}
