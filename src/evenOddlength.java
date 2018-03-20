//Maurice Hanns CSC 242

import java.util.Scanner;
	
public class evenOddlength {

		public static void main(String[] args) {
		// TODO Auto-generated method stub


					
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the string: ");
			
			String string1 = input.nextLine();
			boolean what = even(string1);
			System.out.println("Is the number even: " + what);

								
		}//main

		public static boolean even(String strg){
			
			boolean val = false;	
			int length = strg.length();
		
			System.out.println(length);
			System.out.println(strg);

		
			if (length % 2 == 0) {
				val = true;
			}
			else if (length % 2 != 0){
				val = false;
			}
		
			return val;
		}//even
		
	}//class
