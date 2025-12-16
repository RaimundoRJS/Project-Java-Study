package estudodeheranca;

public class Bolsista extends Aluno{
	private float bolsa;
	
	
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + this.getNome());
	}
	@Override
	public void pagarMensalidade() {
		System.out.println("pagando mensalidae d0 Bolsista "   + this.getNome()+ " Pagamento faciliitado");
	}

//Geters and Seters
	public float getBolsa() {
		return bolsa;
	}



	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
}
