package geometria;

public class Circulo {
	
	public static final double pi = 3.1415;
	
	
	public static double circunf(double r) {
		double circunf = 2 * Math.PI * r;
		return circunf;
	}
	
	public static double volume(double r) {
		double vol = 4 * Math.PI * Math.pow(r, 3)/3;
		return vol;
	}
}

// com static não preciso criar um objeto
// posso chamar diretamente pela classe
// funciona tb para atributos

//final: atributo imutável