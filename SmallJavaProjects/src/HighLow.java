import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class HighLow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//set variable to be taking user input
		Scanner scan = new Scanner(System.in);
		
		//set an array to hold 4 int values
		int n=4;
		int numbers[] = new int[n];
		
		System.out.print("Enter your numbers: ");
		for (int i = 0; i < n; i++)
		{
			numbers[i] = scan.nextInt();
		}
		
		scan.close();
		
		System.out.println ("The numbers entered are:" + Arrays.toString(numbers));
		
		//initialize maximum element
		int max = numbers[0];
		// Traverse array elements from second and 
        // compare every element with current max   
        for (int x = 1; x < numbers.length; x++) 
            if (numbers[x] > max) 
                max = numbers[x]; 
		System.out.println("Larget numner is : "+max );
		
		int min = numbers[0];
		// Traverse array elements from second and 
        // compare every element with current min   
        for (int y = 1; y < numbers.length; y++) 
            if (numbers[y] < min) 
                min = numbers[y]; 
		System.out.println("Smallest numner is :"+min );
	}
	
}
