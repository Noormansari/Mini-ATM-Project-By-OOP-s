package com.Mini_ATM_Project_By_OOPs;

import java.util.Scanner;

public class ATM {

	float Balance;
	int PIN = 7860;

	public void checkpin() {
		for (int i = 1; i <= 4; i++) {
			System.out.println("Enter your pin number: ");
			Scanner sc = new Scanner(System.in);
			int enterepin = sc.nextInt();
			if (enterepin == PIN) {
				menu();

			}
			else if(enterepin !=PIN && i<3) {
				System.out.println("Please Entere Valid Pin");
			}
			else if(i==4) {
				System.out.println("Your card has been blocked for 24 hours");
			}
		}

	}

	public void menu() {
		System.out.println("Enter your choice: ");
		System.out.println("1. Check A/C balance");
		System.out.println("2. Withdraw money");
		System.out.println("3. Deposit money");
		System.out.println("4. Exit");

		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();

		if (opt == 1) {
			checkBalance();
		} else if (opt == 2) {
			withdrawMoney();
		} else if (opt == 3) {
			depositMoney();
		} else if (opt == 4) {
			return;
		} else {
			System.out.println("Madam.. Enter a valid choice");
			menu();
		}
	}

	public void checkBalance() {
		System.out.println("Balance: " + Balance);
		menu();
	}

	public void withdrawMoney() {
		System.out.println("Enter amount to withdraw: ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		if (amount > Balance) {
			System.out.println("Indufficient Balance");
		} else {
			Balance = Balance - amount;
			System.out.println("Money withdrawal successful");
		}
		menu();
	}

	public void depositMoney() {
		System.out.println("Enter the amount: ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		Balance = Balance + amount;
		System.out.println("Money Deposited Succesfully");
		menu();
	}

}
