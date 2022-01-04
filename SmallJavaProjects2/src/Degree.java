import java.lang.Math;
public class Degree {
	
	public static final double degreeFah = 87.6;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Using double for variables since its has a decimal
		 //double degreeFahrenheit = 87.6;
		 
		double degreeCelcius = ((degreeFah - 32)*.5555555556);
		
		System.out.println("Fahrenheit: "+ degreeFah);
		 System.out.print("Celcius: "+Math.round(degreeCelcius*100.0)/100.0);
	}
}
