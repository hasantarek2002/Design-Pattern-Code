package chainOfResponsibilityDesignPattern;

public class NullOperation implements ICalculation{

	@Override
	public double calculate(double a, double b, String operation) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setNexChain(ICalculation ic) {
		// TODO Auto-generated method stub
		
	}

}
