package aprovacao;

public class Estudante {

	public double nota1;
	public double nota2;
	public double nota3;
	public String nome;

	public double notaFinal() {
		double notaFinal = nota1 + nota2 + nota3;
		return notaFinal;
	}
	
	/*TODO ficaria mais inteligente fazer o teste e "separar" qual a nota que está fora dos limites e 
		printar qual a nota que está fora e pedir para redigitar somente as foras
	*/
	
	
	public boolean notaLimite() {
		if((nota1>30) && (nota2 > 35) && (nota3 > 35)) {
			System.out.println("Notas inválidas. Entre novamente as notas:");
			return false;
		}else if(nota1 > 30) {
			System.out.println("Nota 1 inválida. Entre novamente as notas:");
			return false;
		}else if((nota2 > 35) && (nota3 > 35)) {
			System.out.println("Notas 2 e 3 inválidas. Entre novamente as notas:");
			return false;
		}else if(nota2 > 35) {
			System.out.println("Nota 2 inválida. Entre novamente as notas:");
			return false;
		}else if(nota3 > 35) {
			System.out.println("Nota 3 inválida. Entre novamente as notas:");
			return false;
		}
		
		return true;
		
		
		
	}
	
	
	
	public void aprovacao(double notaFinal) {
		if(notaFinal >= 60){
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
			System.out.println("Faltam " + (60.0 - notaFinal) + " pontos.");
		}
	}



}
