package principal;

import java.util.Scanner;

import dolar.CurrencyConverter;

//import geometria.Circulo;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
//		System.out.print("Entre o valor do raio: ");
//		double raio = sc.nextDouble();
//		
//		System.out.printf("Circunferência: %.2f \nVolume: %.2f \npi: %.2f",
//				Circulo.circunf(raio),
//				Circulo.volume(raio),
//				Math.PI);
		
		
		System.out.print("Valor do dólar: ");
		CurrencyConverter.dollar = sc.nextDouble();
		
		System.out.print("Quantidade comprada: ");
		CurrencyConverter.amount = sc.nextDouble();
		
		System.out.printf("Valor pago em reais: %.2f", CurrencyConverter.Dollar());
		
		
		sc.close();
	}

}
