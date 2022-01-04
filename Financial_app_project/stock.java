
public class stock {
	
	private String symbol;
    private String name;

    private double previousClosingPrice;
    private double currentPrice;
    private double cashDividend;
    private double beginningPrice;
    private double endingPrice;
    
    public stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEndingPrice() {
        return endingPrice;
    }
    

    public void setEndingPrice(double endingPrice) {
        this.beginningPrice = this.endingPrice;
        this.endingPrice = endingPrice; 
    }

    public double getBeginningPrice() {
        return beginningPrice;
    }

    public void setBeginningPrice(double beginningPrice) {
        this.beginningPrice = beginningPrice;
    }
    
    public double getcashDividend() {
    	return cashDividend;
    }

    public void setcashDividend(double cashDividend) {
        this.cashDividend = cashDividend;
    }
    
    public double getChangePercent() {
        return (currentPrice - previousClosingPrice ) / previousClosingPrice;
    }
    
    public double getHPR() {
        return (endingPrice - beginningPrice + cashDividend) / beginningPrice;
    }
}
