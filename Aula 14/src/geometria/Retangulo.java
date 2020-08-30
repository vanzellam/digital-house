package geometria;

public class Retangulo {
	public double largura;
	public double altura;
	
	public double Area() {
		double area = largura * altura;
		return area;
	}
	
	public double Perimetro() {
		double perimetro = 2 * (largura + altura);
		return perimetro;
	}
	
	public double Diagonal() {
		double diagonal = Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
		return diagonal;
	}
	
	
	
	
	
	
}

