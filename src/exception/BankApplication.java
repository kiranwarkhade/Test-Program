package exception;

import customexception.InsufficientFundsException;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount account=new BankAccount("12345", 500.0);
		
		try {
			account.withdraw(600.0);
			
		}catch(InsufficientFundsException e)
		{
			System.out.println("OOPS: "+ e.getMessage());
		}
		
	}

}
