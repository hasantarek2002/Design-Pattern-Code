package builderDesignPattern2;

public class Director {
	PhoneBuilder phoneBuilder;
	public Director(PhoneBuilder builder) {
		phoneBuilder = builder;
	}
	
	public void createPhone() {
		phoneBuilder.buildBattery();
		phoneBuilder.buildRam();
		phoneBuilder.buildCamera();
		phoneBuilder.buildCpu();
		phoneBuilder.buildDimension();
		phoneBuilder.buildOs();
	}
	
	public PhonePlan getPhone() {
		return phoneBuilder.getPhone();
	}
	
	
	
	
	
}
