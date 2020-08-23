package principal;

import java.util.Scanner;

import geometria.Retangulo;

public class Main_retangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret = new Retangulo();
		
		System.out.println("Entre a largura e a altura do retângulo:");
		
		ret.largura = sc.nextDouble();
		ret.altura = sc.nextDouble();
		
		System.out.println("Área = " + ret.Area());
		System.out.println("Perímetro = " + ret.Perimetro());
		System.out.println("Diagonal = " + ret.Diagonal());
		
		sc.close();
	}

}
