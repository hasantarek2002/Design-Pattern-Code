package chainOfResponsibilityDesignPattern;

public class Divide implements ICalculation {
	private ICalculation ic;
	@Override
	public double calculate(double a, double b, String operation) {
		if(operation.equals("div")) {
			return a/b;
		}
		// TODO Auto-generated method stub
		return ic.calculate(a, b, operation);
	}

	@Override
	public void setNexChain(ICalculation ic) {
		// TODO Auto-generated method stub
		this.ic=ic;
	}

}
