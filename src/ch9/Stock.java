package ch9;

public class Stock {
	
	public String symbol;
	public String name;
	public double previousClosingPrice;
	public double currentPrice;
	
	Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;	
	}
	
	double getChangePercent() {
		
		return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
		
	}

}
