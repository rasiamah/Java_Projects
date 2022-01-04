import java.util.Scanner;

public class Splitand6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Input a string with the word 'and' in it:");
		String s = input.nextLine();
		
		String[] words=s.split("and");//splits the string based on and  
		//using java for each loop to print elements of string array  
		for(String w:words)
		{ 
		System.out.println(w); 
		}
 
	}
}
