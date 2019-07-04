package com.sapient.pe.bank;

public class LoanAccount extends Account{
	private int loanAmount;
	LoanAccount(Person user) {
		super(user);
		// TODO Auto-generated constructor stub
	}
	@Override
	double depositMoney(double i) {
		if(i<=balance)
			balance-=i;
		return balance;
	}
	@Override
	double withdrawMoney(double i) {
		System.out.println("Invalid transaction!");
		return 0;
	}
	public double getOutstandingBalance() {
		return balance;
	}
	public void setOutstandingBalance(int outstandingBalance) {
		this.balance = outstandingBalance;
	}
	public int getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	@Override
	public String toString() {
		return "a/c : "+accountNumber+"\n"+user.toString()+"\nOutstanding Balance : "+balance;
	}
}
