//Maurice Hanns CSC 2422 03/07/2018

public class Bank {

	String Name;
	String Location;
	double Balance;
	
	public Bank(String NM, String LOC, double BAL){
		
		Name = NM;
		Location = LOC;
		Balance = BAL;
	
	}//class
	
	public static double withdraw(double BL, double UI){
		
		double NewBAL = (BL - UI);
		return NewBAL;
		
	}//withdraw
	
	public static double deposit(double BL, double UI){
		
		double NewBAL = (BL + UI);
		return NewBAL;
		
	}//deposit
		
}//Bank