package exercicios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
//		//System.out.println("Hello World");
//		int idade = 18;
//		String nome = "Melissa";
//		double nota = 10.5;
//		char letra = 'a';
//		
//		
//		System.out.println(nome + " tem " + idade + " anos de idade");
//		// >, <, >=, <=, !=
//		// &&, ||, !
//		if((idade >= 16) && (idade < 18)) {
//			System.out.println(nome + " pode votar mas não é obrigatório.");
//		}else {
//			System.out.println(nome + " é menor de idade.");
//		}
//		
//		for(int i = 0; i <= 10; i++) {
//			System.out.println("8 x "+ i + " = " + 8 * i);
//		}
//		
//		int j = 0;
//		while(j <=10) {
//			System.out.println("8 x "+ j + " = " + 8 * j);
//			j++;
//		}
		
		Scanner sc = new Scanner(System.in);
		int op = 0, num1 = 0, num2 = 0;
		
		do {
			menu();
			op = sc.nextInt();
			
			if((op > 0) && (op < 5)) {
				System.out.println("DIGITE UM NÚMERO: ");
				num1 = sc.nextInt();
				System.out.println("DIGITE UM NÚMERO: ");
				num2 = sc.nextInt();
			}
			
			switch(op) {
				case 1: somar(num1, num2);
						break;
				case 2: subtrair(num1, num2);
						break;
				case 3: multiplicar(num1, num2);
						break;
				case 4: dividir(num1, num2);
						break;
				case 5: System.out.println("OBRIGADO! VOLTE SEMPRE!");
						break;
				default: System.out.println("OPÇÃO INVÁLIDA");
			}	
		}while(op != 5);
		
		int[] arr = {2, 3, 4, 5, 6};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void somar(int num1, int num2) {
		System.out.println("O RESULTADO DA OPERAÇÃO É: " + (num1 + num2));	
	}
	
	public static void subtrair(int num1, int num2) {
		System.out.println("O RESULTADO DA OPERAÇÃO É: " + (num1 - num2));
	}
	
	public static void multiplicar(int num1, int num2) {
		System.out.println("O RESULTADO DA OPERAÇÃO É: " + (num1 * num2));
	}
	
	public static void dividir(int num1, int num2) {
		System.out.println("O RESULTADO DA OPERAÇÃO É: " + (num1 / num2));
	}
	
	public static void menu() {
		System.out.println("ESCOLHA UMA OPÇÃO");
		System.out.println("1 - SOMAR");
		System.out.println("2 - SUBTRAIR");
		System.out.println("3 - MULTIPLICARAR");
		System.out.println("4 - DIVIDIR");
		System.out.println("5 - SAIR");
	}

}
