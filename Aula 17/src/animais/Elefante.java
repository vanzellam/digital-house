package animais;

public class Elefante extends Animal{

	private Integer tamanhoDaTromba;

	public Elefante() {	
		
	}

	public Elefante(Integer quantidadeDePatas, Double peso, String especie,
			String nome, Integer tamanhoDaTromba) {
		super(quantidadeDePatas, peso, especie, nome);
		this.tamanhoDaTromba = tamanhoDaTromba;
	}


	public Integer getTamanhoDaTromba() {
		return tamanhoDaTromba;
	}

	public void setTamanhoDaTromba(Integer tamanhoDaTromba) {
		this.tamanhoDaTromba = tamanhoDaTromba;
	}

	@Override
	//para sobrescrever o método do pai
	
	public void correr() {
		System.out.println("Estou correndo...");
	}
}
