import java.util.Scanner;

public class XXXYYY5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String XXX;
		String YYY;
		//String Merge;
		Scanner OBJ = new Scanner(System.in); 
		
		System.out.println("Input merge format sentence:");
		String Merge = OBJ.nextLine();  
		 
		System.out.println("Input XXX replacement: ");
		String replaceX = OBJ.nextLine();
		
		System.out.println("Input YYY replacement: ");
		String replaceY = OBJ.nextLine();
		
		String replaceXXX=Merge.replace("XXX",replaceX);//replaces all occurrences of XXX
		String replaceYYY=replaceXXX.replace("YYY",replaceY);//replaces all occurrences of YYY
		
		System.out.println(replaceYYY); 
		

	}

}
