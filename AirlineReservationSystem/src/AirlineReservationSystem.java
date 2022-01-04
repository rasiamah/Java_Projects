import java.util.Scanner; 

public class AirlineReservationSystem {
	
	public static void main(String[] args) {
		
		int [] ticketNumber = new int [10];
		
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1 for Firstclass and 2 for Economy:  ");
		int ticketClass = input.nextInt();
		input.close();
		
		for (int i = 0; i < ticketNumber.length; i++ ) {
			if (ticketClass == 1) {
				
				ticketNumber[i] = 1 ;
				while(ticketNumber.length < 6) {
					System.out.print("FirstClass ticket!!");
					System.out.print("Your Ticket Number is:" + ticketNumber[i]);
					ticketNumber[i]++;
				}
				
			
			} else if (ticketClass == 2) {
				System.out.print("Economy Ticket!!");
			
			} else {
				System.out.print("Wrong input!!");
			}
		}
		
	}

}
