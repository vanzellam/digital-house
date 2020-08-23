package animais;

//final-> ultima classe, não pode herdar dela

public class Mamifero extends Animal {

	public Mamifero() {
		super();
		
	}

	public Mamifero(String nome) {
		super(nome);
		
	}

	//final-> não pode sobrescrever o método
	@Override
	public void falar() {
		System.out.println("Mamando...");
	}
}
