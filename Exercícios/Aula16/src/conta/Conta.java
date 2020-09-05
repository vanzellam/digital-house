package conta;

public class Conta {

	int numeroConta;
	double saldo;
	Cliente titular;

	Conta(){
		
	}

	
	public Conta(int numeroConta, double saldo, Cliente titular) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.titular = titular;
	}


	public int getNumeroConta() {
		return numeroConta;
	}


	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public Cliente getTitular() {
		return titular;
	}


	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	
	public void fazerDeposito(double valor) {
		saldo += valor;
		
		System.out.println("Operação realizada: Depósito");
		System.out.println("Saldo atual: R$ " + saldo );
	}

	public void fazerSaque(double valor) {
		if(valor > saldo) {
			System.out.println("Saldo insuficiente.");
		} else {
			saldo -= valor;
			System.out.println("Operação realizada: Depósito");
			System.out.println("Saldo atual: R$ " + saldo );
		}
		
	}
	
	
	
}
