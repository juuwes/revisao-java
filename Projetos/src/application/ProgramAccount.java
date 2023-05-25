package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ProgramAccount {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.next();
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDouble = sc.nextDouble();
			account = new Account(number, holder, initialDouble);
		} else {
			account = new Account(number, holder);
		}
		
		System.out.println("Account Data: ");
		System.out.println(account);
		
		System.out.print("Enter a deposit value: ");
		double amount = sc.nextDouble();
		account.deposit(amount);
		System.out.print("Updated Account Data: ");
		System.out.println(account);
		
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		account.withdraw(amount);
		System.out.print("Updated Account Data: ");
		System.out.println(account);
				
		sc.close();
	}

}