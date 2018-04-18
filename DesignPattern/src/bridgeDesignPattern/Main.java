package bridgeDesignPattern;

public class Main {

	public static void main(String[] args) {
		ElectronicDevice ed= new TV();
		Remote r=new ToshibaRemote(ed);
		r.up();
		r.down();
		r.left();
		r.right();
		r.middleButton();
	

	}

}
