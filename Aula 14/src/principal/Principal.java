package principal;

import java.util.Scanner;

import geometria.Triangulo;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
						
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
						
		System.out.println("Digite os três lados do triângulo X:");
		x.ladoA = sc.nextDouble();
		x.ladoB = sc.nextDouble();
		x.ladoC = sc.nextDouble();
		
		System.out.println("Digite os três lados do triângulo Y:");
		y.ladoA = sc.nextDouble();
		y.ladoB = sc.nextDouble();
		y.ladoC = sc.nextDouble();
		
		double xArea = x.calcularArea();	
		double yArea = y.calcularArea();
				
		System.out.println("A área do triângulo X é: " + xArea);
		System.out.println("A área do triângulo Y é: " + yArea);
		
		if(xArea > yArea) {
			System.out.println("A área do triângulo X é maior.");
		}else if(xArea < yArea){
			System.out.println("A área do triângulo Y é maior.");
		}else {
			System.out.println("A área dos dois triângulos é igual.");
		}
		
		
		sc.close();
		
	}
	
}
