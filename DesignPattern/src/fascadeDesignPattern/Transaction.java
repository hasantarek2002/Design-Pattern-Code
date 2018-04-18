package fascadeDesignPattern;

public class Transaction {
	public void checkBalance() {
		System.out.println("balance is " + 10000);
	}

	public void withDraw() {
		System.out.println("withdrawal balance is " + 100);
	}

	public void deposit() {
		System.out.println("deposit balance is " + 200);
	}

}
