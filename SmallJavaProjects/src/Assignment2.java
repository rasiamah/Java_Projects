import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Obj = new Scanner(System.in);
		
		System.out.println("This program will calculate the number of 230"
				+ " calorie candy bars to eat to maintain your weight.\n");
		
		System.out.println("What is your age in years:");
		
		
		double get_age = Obj.nextDouble();
		System.out.println("Age is : " + get_age); 
		
		
		double feet,inch;
		System.out.println("PLease Entyer your height in feet and Inches separated by a space:");
		feet = Obj.nextDouble();
		inch = Obj.nextDouble();
		
		double inchestofeet = feet * 12;
		double inchestoinches = ((inch/10.00) * 12);
		
	//	System.out.println(inchestofeet + inchestoinches);
		
		double get_height = (inchestofeet + inchestoinches);
		
		System.out.println("Height is : " + get_height);
		
		System.out.println("Enter your height in pounds");
		double get_weight = Obj.nextDouble();
		System.out.println("Wight is "+ get_weight);
		
		
			double BMR_women = (655 + (4.3 * get_weight) + (4.7 * get_height) - (4.7 * get_age));
			System.out.println("The female with those measurements should eat "+ BMR_women + " candy "
					+ "bars per day to maintain her weight.");

			double BMR_men = 66 + (6.3 * get_weight) + (12.9 * get_height) - (6.8 * get_age);
			System.out.println("The male with those measurements should eat "+ BMR_men + " candy "
					+ "bars per day to maintain her weight.");
		

	}

}
