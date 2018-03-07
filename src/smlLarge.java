//Maurice Hanns CSC 2422 03/07/2018

import java.util.Scanner;

public class smlLarge {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter three numnbers\n");
		
		System.out.println("Enter the first number: ");
		int var1 = input.nextInt();
	
		System.out.println("Enter the second number: ");
		int var2 = input.nextInt();
		
		System.out.println("Enter the third number: ");
		int var3 = input.nextInt();
		
		if (var1 > var2 && var1 > var3){
			System.out.println("The first number is the largest!");
		}
		else if (var2 > var3){
			System.out.println("The second number is the largest!");
		}
		else {
			System.out.println("The third number is the largest!");
		}
	
		if (var1 < var2 && var1 < var3){
			System.out.println("The first number is the smallest!");
		}
		else if (var2 < var3){
			System.out.println("The second number is the smallest!");
		}
		else {
			System.out.println("The third number is the smallest!");
		}
		
	}//main

}//smlLarge
