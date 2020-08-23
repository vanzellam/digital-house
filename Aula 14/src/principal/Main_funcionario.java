package principal;

import java.util.Scanner;

import funcionario.funcionario;


public class Main_funcionario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		funcionario func = new funcionario();
		
		System.out.print("Nome: ");
		func.nome = sc.nextLine();
		
		System.out.print("Salário bruto: ");
		func.salarioBruto = sc.nextDouble();
		
		System.out.print("Imposto: ");
		func.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println("Funcionário: " + func.nome + ", $ " + func.salarioLiq());
		
		System.out.println();
		System.out.print("Aumento de salário?");
		
		
		func.AumentoSalario(sc.nextDouble());
		
		sc.close();
	}
}