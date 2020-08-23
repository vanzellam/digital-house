package geometria;

public class Retangulo {
	public double largura;
	public double altura;
	
	public double Area() {
		double area = largura * altura;
		return area;
	}
	
	public double Perimetro() {
		double perim = 2 * (largura + altura);
		return perim;
	}
	
	public double Diagonal() {
		double diag = Math.sqrt(altura * altura + largura * largura);
		return diag;
	}
	
	
	
	
	
	
}

