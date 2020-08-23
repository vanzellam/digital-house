package contatos;

import java.util.List;
import java.util.Scanner;

public class Contato {
	
	private Integer id;
	private String nome;
	private Integer idade;
	private String fone;
	private Endereco endereco;
	
	public Contato() {
		
	}
	
	public Contato(Integer id, String nome, Integer idade, String fone, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.fone = fone;
		this.endereco = endereco;
	}
	
	public Integer getId() {
		return id;
	}
		
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getIdade() {
		return idade;
	}
		
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public String getFone() {
		return fone;
	}
	
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	public static void adicionar(List<Contato> contatos){
		Scanner sc = new Scanner(System.in);
		int id, idade, numero;
		String nome, fone, rua, bairro, cidade, estado;
		System.out.print("Digite o ID: ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o nome: ");
		nome = sc.nextLine();
		System.out.print("Digite a idade: ");
		idade = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o telefone: ");
		fone = sc.nextLine();
		System.out.print("Digite a rua: ");
		rua = sc.nextLine();
		System.out.print("Digite o número: ");
		numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o bairro: ");
		bairro = sc.nextLine();
		System.out.print("Digite a cidade: ");
		cidade = sc.nextLine();
		System.out.print("Digite o estado: ");
		estado = sc.nextLine();
		
		contatos.add(new Contato(id,nome,idade,fone, new Endereco(rua, numero, bairro, cidade, estado)));
		System.out.println("\n Contato adicionado com sucesso. \n");
		
		sc.close();
	}
	
	public static void remover(int n, List<Contato> contatos) {
		Scanner scn = new Scanner(System.in);
		if (n != 0) {
			System.out.print("DIGITE O ID: ");
			int id = scn.nextInt();
			for (Contato contato : contatos) {
				if (id == contato.getId()) {
					contatos.remove(contato);
					n--;
					System.out.println("\n~CONTATO REMOVIDO COM SUCESSO!!!\n");
					break;
				} else {
					System.out.println("\n~CONTATO NÃO ENCONTADO!!!\n");
				}
			}
		} else {
			System.out.println("\n~CADASTRE UM CONTATO PRIMEIRO!!!\n");
		}
		scn.close();
	}
	
	public static void listar(int n, List<Contato> contatos) {
			
			if (n != 0) {
				System.out.println("\n.:: LISTA DE CONTATOS ::.\n");
				for (Contato contato : contatos) {
					System.out.println(contato);
				}
				System.out.println("");
			} else {
				System.out.println("\n~CADASTRE UM CONTATO PRIMEIRO!!!\n");
			}
	}
	
	public static void buscar(int n, List<Contato> contatos) {
		Scanner scn = new Scanner(System.in);
		if (n != 0) {
			System.out.println("\n.:: PESQUISAR CONTATO ::.");
			System.out.print("DIGITE O ID: ");
			int id = scn.nextInt();
			for (Contato contato : contatos) {
				if (id == contato.getId()) {
					System.out.println(contato);
				} else {
					System.out.println("\n~CONTATO NÃO ENCONTADO!!!\n");
				}
			}
		} else {
			System.out.println("\n~CADASTRE UM CONTATO PRIMEIRO!!!\n");
		}
		scn.close();
	}
	
	
	@Override
	public String toString() {
		return "----------------------------------------------------------------\n"
				+ "id: " + id + ", nome: " + nome + ", idade: " + idade + ", telefone: " + fone + ", endereço: " + endereco;
	}
		
		
}
