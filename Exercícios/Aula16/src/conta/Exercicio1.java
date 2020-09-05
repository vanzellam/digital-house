package conta;

import java.util.Random;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("João","Silva");
		Cliente cliente2 = new Cliente("Maria", "Souza");
		
		Random r = new Random();
		
		
		Conta conta1 = new Conta(1, Math.round(100 * r.nextDouble() * 1000) / 100, cliente1);
		Conta conta2 = new Conta(2, Math.round(100 * r.nextDouble() * 1000) / 100, cliente2);
		Conta conta = new Conta();
		
		Scanner sc = new Scanner(System.in);
		
		int numeroConta = 0;
		
		while(numeroConta != 1 && numeroConta != 2) {
			System.out.print("Entre o número da conta: ");
			numeroConta = sc.nextInt();
			if(numeroConta == 1) {
				System.out.println("Saldo atual: R$ " + conta1.saldo);
				conta = conta1;
			}else if(numeroConta == 2) {
				System.out.println("Saldo atual: R$ " + conta2.saldo);
				conta = conta2;
			}else {
				System.out.println("Conta inválida.");
			}
		}
				
		int operacao = 0;
		while(operacao != 1 && operacao != 2) {
			System.out.println("Entre a operação que deseja realizar: 1 - Depósito  2 - Saque");
			operacao = sc.nextInt();
			if(operacao != 1 && operacao !=2) {
				System.out.println("Operação inválida.");
			}
		}
		
		System.out.print("Entre o valor que deseja movimentar: ");
		double valor = sc.nextDouble();
		
		if(operacao == 1) {
			conta.fazerDeposito(valor);
		}else if(operacao == 2){
			conta.fazerSaque(valor);
		}
		
		sc.close();

	}

}
