package customexception;

public class InsufficientFundsException extends Exception {

	private double amount;
	public InsufficientFundsException(String message)
	{
		super(message);
		
	}
	

}
