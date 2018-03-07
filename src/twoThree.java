//Maurice Hanns CSC 2422 03/07/2018


import java.util.Scanner;

public class twoThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		boolean answer = true;
		
		System.out.println("Enter a number: ");
		int var1 = input.nextInt();
		
		
		if (var1 % 2 == 0 && var1 % 3 == 0 ){
			
			System.out.println("Is the number divisible by 2 and three? That is : " + answer);
			
		}
		else {
			answer = false;
			System.out.println("Is the number divisible by 2 and three? That is : " + answer);
			
		}
	}

}
