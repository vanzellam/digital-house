package exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import contatos.Contato;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Contato> contatos = new ArrayList<>();
		
		int op, n = 0;
		
		do {
			menu();
			
			op = sc.nextInt();
			
			switch(op) {
				case 1: Contato.adicionar(contatos);
					n++;
					break;
				
				case 2: Contato.remover(n, contatos);
					break;
				
				case 3: Contato.listar(n, contatos);
					break;
										
				case 4: Contato.buscar(n, contatos);
					break;
					
				case 0: System.out.println("Encerrando o programa.");
					break;	
					
				default: System.out.println("Opção inválida");
					break;
			}
		
		}while(op !=0);
		
		sc.close();
	}

	public static void menu() {
		System.out.printf("**** Menu Principal *****\n");
		System.out.printf("[ 1 ] Incluir Contato\n"); //add
		System.out.printf("[ 2 ] Excluir Contato\n"); //remove
		System.out.printf("[ 3 ] Listar Contatos\n"); //for
		System.out.printf("[ 4 ] Pesquisar Contato\n"); //for
		System.out.printf("[ 0 ] Encerrar o Programa\n");
		System.out.printf("\nOpção Desejada: ");

	}
}
	
	

