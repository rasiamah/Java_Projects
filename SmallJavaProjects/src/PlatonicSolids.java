//import java.util.Random;
import java.lang.Math;

public class PlatonicSolids {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare least value in the dice 
		int min = 1;
		
//		declare max values and their range
		int max1 = 4;
		int range1 = max1- min + 1;
		int dice1 = (int)(Math.random() * range1) + min;
		
		int max2 = 6;
		int range2 = max2 - min + 1;
		int dice2 = (int)(Math.random() * range2) + min;
		
		int max3 = 8;
		int range3 = max3 - min +1;
		int dice3 = (int)(Math.random() * range3) + min;
	
		int max4 = 12;
		int range4 = max4 - min +1; 
		int dice4 = (int)(Math.random() * range4) + min;
		
		int max5 = 20;
		int range5 = max5 - min +1;
		int dice5 = (int)(Math.random() * range5) + min;
		
//		print out the values of the dice thrown
		System.out.println("Roll: "+ dice1 +" "+dice2+" "
							+dice3+" "+ dice4+" "+ dice5);
	
	
	}

}
