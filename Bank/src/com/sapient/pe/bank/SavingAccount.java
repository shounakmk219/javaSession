package com.sapient.pe.bank;

public class SavingAccount extends Account {
	static int MIN_ACCOUNT_BALANCE=10000;
	static int MAX_WITHDRAW_AMOUNT=25000;
	static int MAX_DEPOSIT_AMOUNT=50000;
	SavingAccount(Person user) {
		super(user);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double withdrawMoney(double amount) {
		if(amount<=MAX_WITHDRAW_AMOUNT)
		if(this.balance-amount>=MIN_ACCOUNT_BALANCE) {
			this.balance-=amount;
			return amount;
		}
		System.out.println("Insufficient balance!");
		return 0;
	}
	
	@Override
	public double depositMoney(double amount) {
		System.out.println("in SA depo");
		if(amount<=MAX_DEPOSIT_AMOUNT)
			this.balance+=amount;
		else System.out.println();
		return this.balance;
	}
}
