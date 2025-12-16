package projetofinal;

import java.util.Arrays;

public class Livro extends Pessoa{
	private String editora;
	private String autores;
	private int edicao;
	private int anoPublicacao;
	public Livro(int codId , String nome ,String editora, String autores, int edicao, int anoPublicacao) {
		super();
		this.setCodId(codId);
		this.setNome(nome);
		this.editora = editora;
		this.autores = autores;
		this.edicao = edicao;
		this.anoPublicacao = anoPublicacao;
	}
	

	
	
	
}
