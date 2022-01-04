
public class financial_app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stock stock1 = new stock("CRM", "Salesforce.com, Inc.");
        stock1.setEndingPrice(163.92);
        stock1.setEndingPrice(222.40);
        stock1.setcashDividend(0);
        System.out.println("Stock name: " + stock1.getName() + " Symbol: " + stock1.getSymbol());
        System.out.println("Beginning price: " + stock1.getBeginningPrice());
        System.out.println("Ending price: " + stock1.getEndingPrice());
       // System.out.println("Percent changed: " + stock1.getChangePercent());
        System.out.println("HPR: " + stock1.getHPR());
	}

}
