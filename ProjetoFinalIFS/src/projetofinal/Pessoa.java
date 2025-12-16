package projetofinal;
import java.util.ArrayList;
public abstract class Pessoa  {
	private int codId;
	private String nome;	
	
	//geters and seters
	
	public String getNome() {
		return nome;
	}
	public int getCodId() {
		return codId;
	}
	public void setCodId(int codId) {
		this.codId = codId;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
