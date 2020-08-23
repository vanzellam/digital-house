package animais;

public class Vaca extends Animal{

	public Vaca() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vaca(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void falar() {
		System.out.println("Mugindo...");
	}
}
