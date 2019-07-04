package com.sapient.pe.bank;

abstract class Account {
	protected final long accountNumber;
	protected Person user;
	protected double balance;
	static int accounts=100001;
	Account(Person user){
		this.user=user;
		this.accountNumber=++accounts;
		this.balance=0;
	}
	public static void setAccounts(int accounts) {
		Account.accounts = accounts;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public float getAccountNumber() {
		return accountNumber;
	}
	public static int getAccounts() {
		return accounts;
	}
	
			
	public Person getUser() {
		return user;
	}
	public void setUser(Person user) {
		this.user = user;
	}
	
	abstract double depositMoney(double i);
	abstract double withdrawMoney(double i);
	
	@Override
	public String toString() {
		return "a/c : "+accountNumber+"\n"+user.toString()+"\nBalance : "+balance;
	}
}
