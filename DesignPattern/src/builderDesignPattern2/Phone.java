package builderDesignPattern2;

public class Phone implements PhonePlan {
	private int ram;
	private int battery;
	private String os;
	private String dimension;
	private double camera;
	private double cpu;
	public Phone() {
		this.ram = 4;
		this.battery = 3000;
		this.os = "samsung";
		this.dimension = "4:3";
		this.camera = 13;
		this.cpu = 4;
	}

	@Override
	public void setRam(int ram) {
		this.ram = ram;

	}

	@Override
	public void setBattery(int battery) {
		this.battery = battery;
	}

	@Override
	public void setOs(String os) {
		this.os = os;

	}

	@Override
	public void setDimension(String dimension) {
		this.dimension = dimension;

	}

	@Override
	public void setCamera(double camera) {
		this.camera = camera;

	}

	@Override
	public void setCpu(double cpu) {
		this.cpu = cpu;

	}
	public void printConfiguration() {
		System.out.println("Ram is "+ram+" Os is  "+os+" dimension is "+dimension +" camera is "+camera+"px cpu is "+cpu);
	}

}
