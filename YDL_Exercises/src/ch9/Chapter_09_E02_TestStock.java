package ch9;

public class Chapter_09_E02_TestStock {

	public static void main(String[] args) {
		
		Stock s1 = new Stock("ORCL", "Oracle Corporation");
		
		s1.previousClosingPrice = 34.5;
		s1.currentPrice = 34.35;
		
		System.out.println("The price change percantage for the ORCL stock is " + s1.getChangePercent());

	}

}
