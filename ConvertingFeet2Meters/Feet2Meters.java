import java.util.Scanner;


public class Feet2Meters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Obj = new Scanner(System.in);
		
		System.out.println("Enter a value in feet:");
		double value_feet = Obj.nextDouble();
		
		double feet2inches = value_feet * 0.3048;
		
		System.out.println(value_feet + " feet to " + feet2inches + " meters");

	}

}
