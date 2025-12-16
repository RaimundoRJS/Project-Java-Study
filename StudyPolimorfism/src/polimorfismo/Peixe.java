package polimorfismo;

public class Peixe extends Animal{
	private String corDaescama;
	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Comendo substâncias");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Peixe não faz som");
	}
	public void  soltarBolha() {
		System.out.println("Soltando Bolhas"); 
	}

	public String getCorDaescama() {
		return corDaescama;
	}

	public void setCorDaescama(String corDaescama) {
		this.corDaescama = corDaescama;
	}

}
