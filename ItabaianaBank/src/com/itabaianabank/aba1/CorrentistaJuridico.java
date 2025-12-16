package com.itabaianabank.aba1;



public class CorrentistaJuridico extends Correntista implements Autenticavel{ 
	
	

	public CorrentistaJuridico(int codigo, String nome, long telefone, boolean estaLogado, String senha) {
		super(codigo, nome, telefone, estaLogado, senha);
		// TODO Auto-generated constructor stub
	}

	private long cnpj;
	
	

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public void login() {
		setEstaLogado(true);
	}
	@Override
	public void logout() {
		setEstaLogado(false);
	}
}
