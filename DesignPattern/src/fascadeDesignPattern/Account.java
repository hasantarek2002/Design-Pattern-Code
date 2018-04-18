package fascadeDesignPattern;

public class Account {
	AccountChecker ac = new AccountChecker();
	SecurityChecker sc = new SecurityChecker();
	Transaction t = new Transaction();

	public void balanceChecker() {
		if (ac.checkAccountNumber(1234) && sc.checkSecurityNumber(1234)) {
			t.checkBalance();
			t.deposit();
			t.withDraw();
		} else {
			System.out.println("security number or account number mismatched");
		}
	}
}
