package estudodeheranca;

public class Professor extends Pessoa{
	private String especialidade;
	private float salario;
	
	public void receberAum(){
		this.setSalario((getSalario()+ 500.20f));
		System.out.println("Aumento de salário de  "+ getNome() + " passando a receber agora: "+getSalario());
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
}
