//Maurice Hanns CSC 2422 03/07/2018

	//String Name;
	//String Location;
	//double Balance;

import java.util.Scanner;

public class AboutBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("ACME BANK Systems Online");
		System.out.println("************************\n\n");
		
		for (int i = 0; i < 3; i++){
			
		
		System.out.println("Please enter your name:");
		String name1 = input.nextLine();
		
		System.out.println("Please enter your location:");
		String location1 = input.nextLine();
		
		System.out.println("Please enter the balance:");
		double balance1 = input.nextDouble();
		
		Bank bank = new Bank(name1, location1, balance1);
		
		System.out.println("Would you like to make a withdraw (1) or a deposit(2)");
		int userSelection = input.nextInt();
		
		
		
		if (userSelection == 1){
			System.out.println("How much would you like to withdraw:");	
			double userinput = input.nextDouble();
			double NewBalance = Bank.withdraw(balance1, userinput);
			System.out.println("The new balance is: " + NewBalance);
		}
		else if (userSelection == 2){
			System.out.println("How much would you like to deposit:");	
			double userinput = input.nextDouble();
			double NewBalance = Bank.deposit(balance1, userinput);	
			System.out.println("The new balance is: " + NewBalance);
		}
		else {
			
		}
				
		
		
		}//for
	
	}//main

}//class