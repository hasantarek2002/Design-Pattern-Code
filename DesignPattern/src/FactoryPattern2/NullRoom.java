package FactoryPattern2;

public class NullRoom implements IRoom{

	@Override
	public void printTypeOfRoom() {
		System.out.println("Invalid room Try again");
		
	}

}
