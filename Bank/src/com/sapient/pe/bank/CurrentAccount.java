package com.sapient.pe.bank;

public class CurrentAccount extends Account{
	static int MIN_ACCOUNT_BALANCE=25000;
	static int MAX_WITHDRAW_AMOUNT=Integer.MAX_VALUE;
	static int MAX_DEPOSIT_AMOUNT=Integer.MAX_VALUE;
	CurrentAccount(Person user) {
		super(user);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double withdrawMoney(double amount) {
		if(this.balance-amount>=MIN_ACCOUNT_BALANCE) {
			this.balance-=amount;
			return amount;
		}
		return 0;
	}
	
	@Override
	public double depositMoney(double amount) {
		this.balance+=amount;
		return this.balance;
	}
}