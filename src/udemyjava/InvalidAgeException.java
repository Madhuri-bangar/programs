package udemyjava;
//user defined exception

//voting app
public class InvalidAgeException extends Exception { // checked
	public InvalidAgeException(String errStr) {
		super(errStr);
	}

}
//bank app
class InSuffiientFundsException extends Exception {
	public InSuffiientFundsException(String errStr) {
		super(errStr);
	}
}
