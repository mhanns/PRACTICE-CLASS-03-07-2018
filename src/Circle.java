//Maurice Hanns CSC 2422 03/07/2018

public class Circle {

	double radius;
	
	public Circle(double rad){
		
	radius = rad;
	
	}//main
	
	public static double getArea(double RD){
		
		double Area = ((RD * RD) * 3.14); 
		return Area;
	}//getArea
	
	public static double getCircumference(double RD){
		
		double Circ = (2 * 3.14 * RD);
		return Circ;
	}//getCirc
	
	
}//class
