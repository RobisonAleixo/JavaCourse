package util;

public class CurrencyConverter {
	
	public static double converter(double dollarPrice, double dollarAmount) {
		return (dollarPrice * dollarAmount) * 1.06; 
	}
}
