package builderDesignPattern2;

public interface PhoneBuilder {
	public void buildRam();

	public void buildBattery();

	public void buildOs();

	public void buildDimension();

	public void buildCamera();

	public void buildCpu();
	public PhonePlan getPhone();
	
	

}
