package estudoheranca;

public class ProjetoPessoas { 

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		
		p1.setNome("Raimundo");
		p2.setNome("Iris");
		p3.setNome("Jilvan");
		p4.setNome("Osvaldo");
		
		p1.setIdade(20);
		p2.setIdade(20);
		p3.setIdade(30);
		p4.setIdade(25);
		
		p1.setSexo("M");
		p2.setSexo("F");
		p3.setSexo("M");
		p4.setSexo("M");
		
		
		
		p2.setCurso("C.Comp");
		p3.setSalario(2500.75f);
		p4.setSetor("Estoque");
		p3.receberAum();
		
		
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		//a
	}

}
