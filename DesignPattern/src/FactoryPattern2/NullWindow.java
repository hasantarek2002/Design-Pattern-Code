package FactoryPattern2;

public class NullWindow implements IWindow{

	@Override
	public void printTypeOfWindow() {
		System.out.println("Invalid Window Try again");
		
	}

}
