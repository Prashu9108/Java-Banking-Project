package com.bankingapp;

import java.util.Scanner;

class DB{
	private static final String storedUsername = "admin";
	private static final String storedPassword = "admin";
	
	public static String getUsername() {
		return storedUsername;
	}
	public static String getPassword() {
		return storedPassword;
	}
	
	 Scanner sc = new Scanner(System.in);
	    int minimumbalance = 500;
	    int balance = minimumbalance;
	    

public void Deposite() {
	int depo;
	System.out.println("Enter the deposite amount");
	depo = sc.nextInt();
	if (depo > 0) {
		balance += depo;
		System.out.println(depo + " Successful! Current balance: " + minimumbalance);
	} else {
		System.out.println("Invalid! Please enter a valid amount");
	}
}

public void Withdraw() {
	int withdrawal;
	System.out.println("Enter the withdraw amount");
	withdrawal = sc.nextInt();
	if (balance-withdrawal>=minimumbalance) {
		balance -= withdrawal;
		System.out.println("Rs." + withdrawal + " Withdrawal successful. Current balance: " + balance);
	} else {
		System.out.println("Insufficient funds! Minimum balance is required " + minimumbalance);
	}
}

public void balEnquiry() {
	System.out.println("Current balance in your account is " + balance);
}
}	
public class TransactionStatus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DB obj = new DB();
		System.out.println("Enter the username");
		String enteredUsername = sc.next();
		if(enteredUsername.equals(DB.getUsername())) {
			System.out.println("Enter your password");
			String enteredPassword = sc.next();
			if(enteredPassword.equals(DB.getPassword())) {
				System.out.println("Welcome "+enteredUsername);
				char ch;
				 do {
	                    System.out.println("Here Select an option to continue");
	                    System.out.println("1) Deposite 2) Withdraw 3) Balance");
	                    int option = sc.nextInt();
	                    switch (option) {
	                        case 1:
	                            obj.Deposite();
	                            break;
	                        case 2:
	                            obj.Withdraw();
	                            break;
	                        case 3:
	                            obj.balEnquiry();
	                            break;
	                        default:
	                            System.out.println("Invalid Option");
	                    }
	                    System.out.println("Do you want to continue :Y/N");
	                    ch = sc.next().charAt(0);
	                } while (ch == 'Y');
			}else{
				System.out.println("Wrong password!!!");

			}
		}else {
			System.out.println("Invalid username");
		}
	}
		
		
		    
	}