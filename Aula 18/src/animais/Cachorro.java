package animais;

public class Cachorro extends Mamifero {

	public Cachorro() {
		super();
		
	}

	public Cachorro(String nome) {
		super(nome);
		
	}

	@Override
	public void falar() {
		System.out.println("Latindo...");
	}
}
