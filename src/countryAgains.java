//Maurice Hanns CSC 2422 03/07/2018

import java.util.Scanner;

public class countryAgains {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter the country: ");
	String CTRY1 = input.nextLine();
	
	System.out.println("Please enter the countrys area: ");
	double ARA1 = input.nextDouble();
	
	System.out.println("Please enter the country population: ");
	int PP1 = input.nextInt();
	input.nextInt();
	
	
	countryThree country1 = new countryThree(CTRY1, ARA1, PP1);
	

	System.out.println("Please enter the country: ");
	String CTRY2 = input.nextLine();
	
	System.out.println("Please enter the countrys area: ");
	double ARA2 = input.nextDouble();
	
	System.out.println("Please enter the country population: ");
	int PP2 = input.nextInt();
	
	countryThree country2 = new countryThree(CTRY2, ARA2, PP2);
	
	comparePopulation(country1.Country, country1.Population, country2.Country, country2.Population);
	
	}//main
	


	public static void comparePopulation(String A, int B, String C, int D)
	{
		if (B > D)
		{
			System.out.println("The " + A + " is larger");
		}
		else
		{
			System.out.println(C + " is larger");			
		}
			
		return;
	}
	
	
	
}//class
