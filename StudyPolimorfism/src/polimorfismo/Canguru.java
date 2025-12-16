package polimorfismo;

public class Canguru extends Mamifero {
	public void usarBolsa() {
		System.out.println("Cuidando do filhote");
	}
	@Override
	public void locomover() {
		System.out.println("Pulando");
	}
}
