package fascadeDesignPattern;

public class SecurityChecker {
	public boolean checkSecurityNumber(int num) {
		int number = 1234;
		if (num == number) {
			return true;
		}
		return false;
	}

}
