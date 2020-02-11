package util;

public class CurrencyConverter {

	public static double convert(double dolar, double dolarBought) {
		double amount = dolar * dolarBought;
		amount += amount * 0.06;  
		return amount;
	}

}
