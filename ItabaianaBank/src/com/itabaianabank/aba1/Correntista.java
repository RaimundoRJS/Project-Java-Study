package com.itabaianabank.aba1;

import java.util.Scanner;
//import com.itabaianabank.aba1.Conta;
public class Correntista {
	private int codigo;
	private String nome;
	protected long telefone;
	protected boolean estaLogado;
	private String senha;
	private String tipoConta;
	
	
	public Correntista(int codigo, String nome, long telefone, boolean estaLogado, String senha) {
		this.codigo = 2024000;
		this.nome = nome;
		this.telefone = telefone;
		this.estaLogado = estaLogado;
		this.senha = senha;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	public boolean getEstaLogado() {
		return estaLogado;
	}
	public void setEstaLogado(boolean estaLogado) {
		this.estaLogado = estaLogado;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	public String getTipoConta() {
		return tipoConta;
	}

	public void setipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	Scanner veriiden = new Scanner(System.in);
	public void cad_New_User(String nome, long telefone, String senha) {
 
		setNome(nome);
	    setTelefone(telefone);	    
	    setSenha(senha);
	    setCodigo(getCodigo() + 1);
		String iden = veriiden.next();
		if(iden.length()> 11) {
			CorrentistaJuridico correntisataJuridico = new CorrentistaJuridico(codigo, nome, telefone, estaLogado, senha);
			correntisataJuridico.setCnpj(0);
			System.out.println("Novo Usuário cadastrado user: " + getNome() + " " + getCodigo()+ " "+ correntisataJuridico.getCnpj());

		}else {
			CorrentistaFisico correntistaFisico = new CorrentistaFisico(codigo, nome, telefone, estaLogado, senha);
			correntistaFisico.setCpf(null);
			System.out.println("Novo Usuário cadastrado user: " + getNome() + " " + getCodigo()+ " "+ correntistaFisico.getCpf());
		}
	}
	
	public void cad_conta() {
		if (getEstaLogado()) {
		Conta conta = new Conta(codigo, telefone, null, null, nome, null);	
		conta.setNumero(conta.getNumero()+1);
		conta.setSaldo(conta.getSaldo());
		conta.setDataAbertura(conta.getDataAbertura());
		conta.setTipo(tipoConta);
		}else {
			System.out.println("Por favor realize o login no sistema para realizar o cadastro!!\n"
					+ "Agradeço a compreenção");
		}
	}
	public  void debito(float valor_solicitado) {
		Conta conta = new Conta(codigo, telefone, null, null, nome, null);
		ContaCorrente contacc = new ContaCorrente(codigo, valor_solicitado, null, null, tipoConta, null);
		if (getEstaLogado()&& getTipoConta().equalsIgnoreCase("cp")) {
		conta.setSaldo((conta.getSaldo()- valor_solicitado));
		System.out.println("Saque efetuado com sucesso!\nAguarde para a retirada do dinheiro");
		}else if(getEstaLogado()&& getTipoConta().equalsIgnoreCase("cc")) {
			conta.setSaldo((conta.getSaldo()- valor_solicitado));
			conta.setSaldo((conta.getSaldo()* contacc.getTaxaMovimentacao())-conta.getSaldo());
			System.out.println("Saque efetuado com sucesso!\nAguarde para a retirada do dinheiro");
		}else {
			System.out.println("Saques são permitidos apenas quando o usuário estiver logado na conta!!");
		}
	}
	
	public  void credito(float valor_informado) {
		Conta conta = new Conta(codigo, telefone, null, null, nome, null);
		conta.getTipo();
		conta.getNumero();
		if (getEstaLogado()) {
			conta.setSaldo(conta.getSaldo()+ valor_informado);
		}
	}
	
	public void exibirSaldo() {
		Conta conta = new Conta(codigo, telefone, null, null, nome, null);
		System.out.println("Seu saldo em conta é de : "+conta.getSaldo());
	}
	
	public void excluirCorrentista() {
		CorrentistaFisico correntistaFisico = new CorrentistaFisico(0, null, 0, false, null); 
		setNome(null);
	    setTelefone(0);
	    correntistaFisico.setCpf(null);
	    setSenha(null);
	    setCodigo(0);
	    System.out.println("Usuário removido do sistema");
	}
	@Override
	public String toString() {
		return "Correntista [codigo=" + codigo + ", nome=" + nome + ", telefone=" + telefone + ", estaLogado="
				+ estaLogado + ", senha=" + senha + "]";
	}

	
	
}
