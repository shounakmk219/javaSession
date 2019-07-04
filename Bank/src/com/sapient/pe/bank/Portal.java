package com.sapient.pe.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Portal {
	public static void main(String args[]) {
		Map<Long,Account> accountList=new HashMap<>();
		boolean flag=true;
		Scanner scan=new Scanner(System.in);
		do {
			System.out.print("Select transaction:-\n1. Create Account\n2. Transactions\n3. Exit Portal\nEnter option: ");
			String choice=scan.next();
			switch(choice) {
			case "1":
				System.out.println("============================Account Creation Form=======================");
				Person person=getPersonData();
				Address address=getAddresstData();
				person.setAddress(address);
				Account account=getAccountData(person);
				accountList.put(account.accountNumber, account);
				System.out.println("Account Created Successfully ( a/c no.: "+account.accountNumber+")");
				break;
			case "2":
				System.out.print("Enter a/c number: ");
				Account account2=accountList.get(scan.nextLong());
				if(account2!=null) {
					System.out.println("Welcome "+account2.getUser().getFirstName()+" "+account2.getUser().getLastName()+"!");
					flag=true;
					do {
						System.out.print("Select transaction:-\n1. Deposit\n2. Withdraw\n3. Display account\nEnter option: ");
						choice=scan.next();
						switch(choice) {
						case "1":
							System.out.print("Enter amount to deposit : ");
							System.out.println("New balance: "+account2.depositMoney(scan.nextInt()));
							break;
						case "2":
							System.out.print("Enter amount to withdraw : ");
							System.out.println("Amount withdrawn: "+account2.withdrawMoney(scan.nextInt()));
							break;
						default : displayAccount(account2);
						}
						System.out.print("Want to perform another transaction on your account ?(y/n): ");
						choice=scan.next().toLowerCase();
						if(choice.equals("n"))
							flag=false;
					}while(flag);
					flag=true;
				}
				else System.out.println("Incorrect a/c number!");
				break;
				default:
					flag=false;
					break;
			}
			
		}while(flag);
		
		
		
		System.out.println("Thank you!");
	}
	
	public static void displayAccount(Account account) {
		System.out.println("======================================\n"+
							account.toString()+"\n======================================\n");	
	}
	public static Account getAccountData(Person person) {
		System.out.print("Select a/c type-\n1. Saving\n2. Current\n3. Loan\nEnter option: ");
		Scanner scan=new Scanner(System.in);
		int choice=scan.nextInt();
		switch(choice) {
			case 1: return new SavingAccount(person);
			case 2: return new CurrentAccount(person);
			case 3: 
				System.out.println("Enter Loan amount: ");
				LoanAccount acc= new LoanAccount(person);
				acc.setLoanAmount(scan.nextInt());
				acc.setOutstandingBalance(acc.getLoanAmount());
				return acc;
		}
		return null;
	}
	public static Person getPersonData() {
		Person person;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter first name: ");
		String fname=scan.next();
		System.out.print("Enter last name: ");
		person=new Person(fname, scan.next());
		return person;
	}
	public static Address getAddresstData() {
		Address address=new Address();
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter street name: ");
		address.setStreet(scan.nextLine());
		System.out.print("Enter city name: ");
		address.setCity(scan.nextLine());
		System.out.print("Enter state name: ");
		address.setState(scan.nextLine());
		return address;
	}
}
