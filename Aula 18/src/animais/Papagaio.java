package animais;

public class Papagaio extends Animal{

	public Papagaio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Papagaio(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void falar() {
		System.out.println("Falando...");
	}
}
