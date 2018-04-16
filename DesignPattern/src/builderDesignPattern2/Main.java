package builderDesignPattern2;

public class Main {

	public static void main(String[] args) {
		Phone phone=new Phone();
		
		phone.printConfiguration();
		System.out.println("after setting SamsungGalaxyS10Builder new configuration is ");
		Director d=new Director(new SamsungGalaxyS10Builder());
		d.createPhone();
		PhonePlan p=d.getPhone();
		
		Phone phonePlan=(Phone) d.getPhone();
		phonePlan.printConfiguration();
	}

}
