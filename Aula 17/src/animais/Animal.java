package animais;

public class Animal {
	
	private Integer quantidadeDePatas;
	private Double peso;
	private String especie;
	private String nome;
	//protected -> para poder acessar pela classe filha
	
	public Animal() { 
		
	}
	
	public Animal(Integer quantidadeDePatas, Double peso, String especie,
			String nome) {
		super();
		this.quantidadeDePatas = quantidadeDePatas;
		this.peso = peso;
		this.especie = especie;
		this.nome = nome;
	}

	public Integer getQuantidadeDePatas() {
		return quantidadeDePatas;
	}

	public void setQuantidadeDePatas(Integer quantidadeDePatas) {
		this.quantidadeDePatas = quantidadeDePatas;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void correr() {
		System.out.println("Estou correndo...");
	}
}


