package estoque;

public class produto {
	
	public String nome;
	public double preco;
	public int qtd;

	
	public double TotalValueInsStock() {
		 double ttValue = preco * qtd;
		 
		 return ttValue;
	}
	
	public void AddProducts(int quantidade) {
		qtd = qtd + quantidade;
		double newValue = TotalValueInsStock();
		System.out.println("Dados atualizados: " + nome + ", $ " + preco + ", " + qtd + " unidades, Total: $ " + newValue);
		
	}
	
	public void RemoveProducts(int quantidade) {
		qtd = qtd - quantidade;
		double newValue = TotalValueInsStock();
		System.out.println("Dados atualizados: " + nome + ", $ " + preco + ", " + qtd + " unidades, Total: $ " + newValue);
	}
}
