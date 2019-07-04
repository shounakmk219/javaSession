package bank;

public class Account {
	private int accountNumber;
	private String userName;
	private int balance;
	private String address;
	static int accounts=100001;
	static int MIN_ACCOUNT_BALANCE=1000;
	Account(String userName, String address){
		this.accountNumber=accounts;
		accounts++;
		this.userName=userName;
		this.address=address;
		this.balance=0;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public static void setAccounts(int accounts) {
		Account.accounts = accounts;
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public static int getAccounts() {
		return accounts;
	}
	public int depositMoney(int amount) {
		this.balance+=amount;
		return this.balance;
	}
	
	public int withdrawMoney(int amount) {
		if(this.balance-amount>=MIN_ACCOUNT_BALANCE) {
			this.balance-=amount;
			return amount;
		}
		return 0;
	}
}
