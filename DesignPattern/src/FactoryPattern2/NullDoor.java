package FactoryPattern2;

public class NullDoor implements IDoor{

	@Override
	public void printTypeOfDoor() {
		System.out.println("Invalid Door Try again");
		
	}

}
