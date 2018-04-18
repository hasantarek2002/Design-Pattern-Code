package chainOfResponsibilityDesignPattern;

public interface ICalculation {
	public double calculate(double a, double b, String operation);
	public void setNexChain(ICalculation ic);
}
