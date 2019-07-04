package bank;

public class Portal {
	public static void main(String args[]) {
		Account account=new Account("amey bhilegaonkar", "colive, bangalore");
		account.depositMoney(60000);
		System.out.println("Balance: "+account.getBalance());
		System.out.println(account.withdrawMoney(60000));
		System.out.println(account.withdrawMoney(5000));
		System.out.println("Balance: "+account.getBalance());			
	}
}
