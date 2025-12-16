package estudoheranca;

public class Funcionario extends Pessoa {
	private String setor;
	private boolean trabalho;
	
	public void mudarTrabalho() {
		this.trabalho = ! this.trabalho;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean isTrabalho() {
		return trabalho;
	}

	public void setTrabalho(boolean trabalho) {
		this.trabalho = trabalho;
	}

	
	
	
}
