package estudodeheranca;

public class ProjetoPessoas { 

	public static void main(String[] args) {
		//Pessoa p1 = new Pessoa();
		Visitante v1 = new Visitante();
		Aluno a1 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		Bolsista b1 = new Bolsista();
		
		
		v1.setNome("Raimundo");
		a1.setNome("Iris");
		p3.setNome("Jilvan");
		p4.setNome("Osvaldo");
		b1.setNome("Renata");
		
		v1.setIdade(20);
		a1.setIdade(20);
		p3.setIdade(30);
		p4.setIdade(25);
		b1.setIdade(22);
		
		
		v1.setSexo("M");
		a1.setSexo("F");
		p3.setSexo("M");
		p4.setSexo("M");
		b1.setSexo("F");
		
		
		a1.setCurso("C.Comp");
		p3.setSalario(2500.75f);
		p4.setSetor("Estoque");
		a1.setMatr(1111111);
		a1.pagarMensalidade();
		p3.receberAum();
		b1.setBolsa(12.5f);
		b1.pagarMensalidade();
		
		
		System.out.println(v1.toString());
		System.out.println(a1.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		//a
	}

}
