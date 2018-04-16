package builderDesignPattern2;

public class SamsungGalaxyS10Builder implements PhoneBuilder{
	PhonePlan phone;
	public SamsungGalaxyS10Builder() {
		phone=new Phone();
	}
	@Override
	public void buildRam() {
		phone.setRam(2);
		
	}
	@Override
	public void buildBattery() {
		phone.setBattery(2000);
		
	}
	@Override
	public void buildOs() {
		phone.setOs("HT");
		
	}
	@Override
	public void buildDimension() {
		phone.setDimension("gjgas");
		
	}
	@Override
	public void buildCamera() {
		phone.setCamera(14);
		
	}
	@Override
	public void buildCpu() {
		phone.setCpu(2);
		
	}
	@Override
	public PhonePlan getPhone() {
		// TODO Auto-generated method stub
		return phone;
	}


}
