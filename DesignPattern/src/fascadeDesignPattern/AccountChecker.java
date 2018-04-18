package fascadeDesignPattern;

public class AccountChecker {

	public boolean checkAccountNumber(int num) {
		int number = 1234;
		if (num == number) {
			return true;
		}
		return false;
	}
}
