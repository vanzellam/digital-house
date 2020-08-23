package dolar;

public class CurrencyConverter {
	
	public static final double iof = 0.06;
	
	public static double dollar, amount;
	
	public static double Dollar() {
		double reais = amount * dollar * (1 + iof);
		return reais;
	}

}
