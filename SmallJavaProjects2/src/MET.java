import java.lang.Math;
public class MET {
	
	//constants MET values for each activity in MET
	public static final int runMET = 10;
	public static final int basketballMET = 8;
	public static final int sleepMET = 1;
	
	//constant value of the individuals activity 
	public static final int weight = 150; //lbs
	public static final int MilesRun = 6; //MPH
	public static final int TimeRun = 30; //minutes
	public static final int TimeBasketball = 30; //minutes
	public static final int TimeSleep = 360; //6 hours
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 double run_calorie =(0.0175 + weight + runMET)* TimeRun;
		 double basketball_calorie =(0.0175 + weight + basketballMET)* TimeBasketball;
		 double sleep_calorie =(0.0175 + weight + sleepMET)* TimeSleep;
		 
		 double totalcalorie = ( run_calorie + basketball_calorie + sleep_calorie);
		 
		 System.out.print("Calorie Burned: "+ Math.round(totalcalorie*100.0)/100.0);
	
		 
		 
		
		//1kg = 2.2lbs

	}

}
