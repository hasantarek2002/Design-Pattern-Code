package chainOfResponsibilityDesignPattern;

public class Main {

	public static void main(String[] args) {
		Addition ad = new Addition();
		Subtract sb = new Subtract();
		Multiplication ml = new Multiplication();
		Divide d = new Divide();
		NullOperation n = new NullOperation();

		ad.setNexChain(sb);
		sb.setNexChain(ml);
		ml.setNexChain(d);
		// d.setNexChain(null);
//		ad.setNexChain(ml);
//		sb.setNexChain(d);
//		ml.setNexChain(sb);

		// double res=ad.calculate(2, 3, "add");
		double res = ad.calculate(2, 3, "sub");
		System.out.println(res);

	}

}
