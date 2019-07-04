package company;

import java.util.Scanner;

public class Client {

	public static void main(String args[]) {
		Employee amey=new Employee(123, "Amey Bhilegaonkar", 45000);
		Scanner scan=new Scanner(System.in);
		int leaves=scan.nextInt();
		if(amey.applyForVacation(leaves))
			System.out.println("Leave granted.");
		else System.out.println("insufficient leaves");
	}
}
