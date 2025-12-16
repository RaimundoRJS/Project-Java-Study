package uec;

public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	
	
	
	
	public Lutador(String no, String na, int id, double al, double pe, int vi, int de,
			int em) {
		
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.altura = al;
		this.setPeso(pe);
		this.vitorias = vi;
		this.derrotas = de;
		this.empates = em;
	}

	public void apresentar() {
		System.out.println("##############################################");
		System.out.println("Chegou a hora do Lutador "+ getNome());
		System.out.println("direto do(a) "+ getNacionalidade());
		System.out.println("Com "+getIdade()+" anos");
		System.out.println("Possui "+getAltura()+" m de altura");
		System.out.println("Pesando "+ getPeso());
		System.out.println("Possui "+ getVitorias()+" Vitórias");
		System.out.println("Perdeu "+ getDerrotas()+" Lutas");
		System.out.println("Empatou "+ getEmpates()+" Lutas");
		System.out.println("##############################################");
	}
	
	public void status() {
		System.out.println("##############################################");
		System.out.println(getNome());
		System.out.println("É um peso "+ getCategoria());
		System.out.println("Ganhou "+ getVitorias());
		System.out.println("Perdeu "+ getDerrotas());
		System.out.println("Empatou "+ getEmpates());
		System.out.println("##############################################");
	}
	
	public void ganharLuta() {
		this.setVitorias(getVitorias()+1);
	}
	
	public void perderLuta() {
		this.setDerrotas(getDerrotas()+1);
	}
	
	public void empatarLuta() {
		this.setEmpates(getEmpates()+1);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String no) {
		this.nome = no;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double pe) {
		this.peso = pe;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		
		if (this.peso<52.2) {
			this.categoria = "Inválido";			
		}else if (this.peso <=70.3) {
			this.categoria = "Leve";
			
		}else if (this.peso <= 83.9) {
			this.categoria = "Médio";
			
		}else if (this.peso<=120.2) {
			this.categoria = "Pesado";
			
		}else {
			System.out.println("Inválido");
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}
