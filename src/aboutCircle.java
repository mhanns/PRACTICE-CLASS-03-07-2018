//Maurice Hanns CSC 2422 03/07/2018

import java.util.Scanner;

public class aboutCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your radius: ");
		double userinput = input.nextDouble();
		
		Circle circle = new Circle(userinput);
		
		double CircleArea = Circle.getArea(userinput);
	
		double CircleCirc = Circle.getCircumference(userinput);
		
		System.out.println("The Area of the circle is: " + CircleArea);		
		System.out.println("The Circumference of the circle is: " + CircleCirc);				
		
	}//main

}//class
