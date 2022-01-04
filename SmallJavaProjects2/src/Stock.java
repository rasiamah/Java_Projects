import java.util.Scanner;
public class Stock {

	   String symbol;  
	   String name; 
	   double prevCP;
	   double CurrP;
	   double price_Percentage;
		    
	   //parameterized constructor with two parameters
	   Stock(String Symbol, String Name, double P_C_P, double C_P){  
	       this.symbol = Symbol;  
	       this.name = Name;
	       this.prevCP = P_C_P;
	       this.CurrP = C_P;
	   }  
	   
	   void getinfo(){
		   
	       System.out.println("SYMBOL: "+ symbol +" NAME: "+ name );
	       System.out.println("PREVIOUS CLOSING PRICE: "+ prevCP  );
	       System.out.println("CURRENT PRICE: "+ CurrP );
	       double price_Percentage = (34.5 - 34.35)/100;
	       System.out.println("PRICE PERCENTAGE: "+ price_Percentage+"%");
	   }  
		   
	   public static void main(String args[]){  
		Stock obj1 = new Stock("ORCL","Oracle Corporation",34.5, 34.35);  
		obj1.getinfo();  
	   }  
}

