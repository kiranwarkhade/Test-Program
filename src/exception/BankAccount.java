package exception;

import customexception.InsufficientFundsException;

public class BankAccount {
private String accountNumber;
private double balance;


public BankAccount(String accountNumber, double balance) {
	super();
	this.accountNumber = accountNumber;
	this.balance = balance;
}


public void withdraw(double amount) throws InsufficientFundsException
{
	if(amount > balance)
	{
		throw new InsufficientFundsException("Withdrawal amount exceeds current balance. ");
	}
	balance -=amount;
	System.out.println("Withdrawal successful. newbalance : $"+ balance);
}


}
