package bridgeDesignPattern;

public class ToshibaRemote extends Remote {


	public ToshibaRemote(ElectronicDevice ed) {
		super(ed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void middleButton() {
		System.out.println("Toshiba Remote  Middle button PAUSE");
		
	}

}
