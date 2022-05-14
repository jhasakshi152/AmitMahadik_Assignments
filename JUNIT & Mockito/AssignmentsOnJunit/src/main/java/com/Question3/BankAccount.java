package com.Question3;

@SuppressWarnings("serial")
class InsufficientFundsExpcetion extends Exception {

	public InsufficientFundsExpcetion(String string) {
		super(string);
	}
}

public class BankAccount {
	private int balance = 20000;

	public void withdraw(int amount) throws InsufficientFundsExpcetion {
		if (amount > balance) {
			throw new InsufficientFundsExpcetion("Insufficient funds");
		}
		balance = balance - amount;
	}

}
