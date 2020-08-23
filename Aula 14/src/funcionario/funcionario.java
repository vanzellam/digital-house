package funcionario;

public class funcionario {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiq() {
		double salarioLiq = salarioBruto - imposto;
		return salarioLiq;
	}
	
	public void AumentoSalario(double porcento) {
		salarioBruto = Math.round((salarioBruto * (1 + porcento/100)*100d)/100d);
		double novoSalario = salarioLiq();
		System.out.println("Dados atualizados: " + nome + ", $ " + novoSalario);
	}

}
