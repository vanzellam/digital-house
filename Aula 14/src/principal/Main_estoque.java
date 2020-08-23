package principal;

import java.util.Scanner;

import estoque.produto;

public class Main_estoque {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		produto prod = new produto();
		
		System.out.println("Entre os dados do produto:");
		System.out.print("Nome: ");
		prod.nome = sc.next();
		
		System.out.print("Preço: ");
		prod.preco = sc.nextDouble();
		
		System.out.print("Quantidade: ");
		prod.qtd = sc.nextInt();
		
		double valorTotal = prod.TotalValueInsStock();
				
		System.out.println("Dados do produto: " + prod.nome + ", $ " + prod.preco + ", " + prod.qtd + " unidades, Total: $ " + valorTotal);
		
		System.out.println();
		System.out.print("Entre a quantidade de produtos para adicionar ao estoque: ");
		prod.AddProducts(sc.nextInt());
		
		System.out.println();
		System.out.print("Entre a quantidade de produtos para remover do estoque: ");
		prod.RemoveProducts(sc.nextInt());
		
		sc.close();
	}	
}
	