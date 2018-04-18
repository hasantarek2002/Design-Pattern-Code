package chainOfResponsibilityDesignPattern;

public class Addition implements ICalculation {
	private ICalculation ic;

	@Override
	public double calculate(double a, double b, String operation) {
		if(operation.equals("add")) {
			return a+b;
		}
		// TODO Auto-generated method stub
		return ic.calculate(a, b, operation);
	}

	@Override
	public void setNexChain(ICalculation ic) {
		this.ic=ic;
		
	}

}
