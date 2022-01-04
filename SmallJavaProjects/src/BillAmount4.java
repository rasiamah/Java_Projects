import java.util.Scanner;
import java.util.*;

public class BillAmount4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stud	
			double tax = 0.6;
			double tip = 1.5;
			double total;
		
		System.out.println("What is the bill amount?");
		
		Scanner Obj = new Scanner(System.in);
		double bill = Obj.nextFloat();
		double billround = Math.round(bill * 100.0)/100.0;
		 tax = (bill * .06) ;
		 double taxround = Math.round(tax * 100.0)/100.0;
		 
		 tip = (bill * .15) ;
		 double tipround = Math.round(tip * 100.0)/100.0;
		 
		 total = Math.round((bill + tip + tax)* 100.0)/100.0; 
		 
		 System.out.println("Bill    "+billround);
		 System.out.println("Tax     "+taxround);
		 System.out.println("Tip     "+tipround);
		 System.out.println("Total   "+total);
		 
		 
	}

}
