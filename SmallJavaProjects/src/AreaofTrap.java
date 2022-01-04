import java.util.Scanner;

public class AreaofTrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter one side of the lenght: ");
		int side1 = obj.nextInt();
		
		System.out.println("Enter the other side of the length: ");
		int side2 = obj.nextInt();
		
		System.out.println("Input the height: ");
		int height = obj.nextInt();
		
		int Area = ((side1 + side2)/2) * height;
		
		System.out.println("Area: "+Area);
		

	}

}
