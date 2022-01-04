import java.util.Random;
import java.util.Scanner;

public class RandNum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();

		Scanner Obj = new Scanner(System.in);
		
		System.out.println("Enter the lowest value: ");
		int low = Obj.nextInt();
		
		System.out.println("Enter the highets value: ");
		int high = Obj.nextInt();
		
		int result = r.nextInt(high-low) + low;
		
		System.out.println("A number between "+ low + " and "+ 
						high+ " is "+ result);
	}

}
