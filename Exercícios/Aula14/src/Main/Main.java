package Main;

import java.util.Scanner;

import aprovacao.Estudante;


class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Estudante estudante = new Estudante();
		
		System.out.print("Nome do aluno: ");
		estudante.nome = sc.nextLine();
		
		System.out.println("Notas do aluno: ");
		do {
			estudante.nota1 = sc.nextDouble();
			sc.nextLine();
			estudante.nota2 = sc.nextDouble();
			sc.nextLine();
			estudante.nota3 = sc.nextDouble();
		}
		
				
		while(estudante.notaLimite() == false);
		
		
		
		System.out.println("Nota Final = " + estudante.notaFinal());
		estudante.aprovacao(estudante.notaFinal());
		
		
		
		
		
		
		
		
		

		
		sc.close();
		
		
		
		
	}

}
