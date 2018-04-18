package chainOfResponsibilityDesignPattern;

public class Subtract implements ICalculation {
	private ICalculation ic;

	@Override
	public double calculate(double a, double b, String operation) {
		if(operation.equals("sub")) {
			return a-b;
		}
		// TODO Auto-generated method stub
		return ic.calculate(a, b, operation);
	}

	@Override
	public void setNexChain(ICalculation ic) {
		this.ic= ic;
	}

}
