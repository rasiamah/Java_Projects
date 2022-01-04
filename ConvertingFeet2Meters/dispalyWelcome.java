
public class dispalyWelcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(" Welcome to Java, Welcome to Computer Science, and Programming is fun.\n");
		int[] list = {8,-4,10,6,-5,-2,7,3};
		System.out.print("question 2: " );
		for (int i= 1; i < list.length; i++) {
			list[i] += list[i-1];
			
			System.out.print( list[i] + " ");
		}
		System.out.print( "\n");
		
		int[] data1 = new int[8];
		data1[4]=-2;
		data1[1]=4;
		data1[6]=3;
		int x = data1[5];
		data1[x] = 44;
		data1[2] = data1[4] + data1[6] + data1[1];
		System.out.print("question 1: " );
		for (int e= 0; e < data1.length; e++) {
		System.out.print(data1[e]  + " ");
		}
	}

}
