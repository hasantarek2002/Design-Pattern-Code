package bridgeDesignPattern;

public class LGRemote extends Remote{

	
	public LGRemote(ElectronicDevice ed) {
		super(ed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void middleButton() {
		System.out.println("Lg Middle button mute");
		
	}

}
