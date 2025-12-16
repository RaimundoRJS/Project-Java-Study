package com.itabaianabank.aba1;



public class CorrentistaFisico extends Correntista implements Autenticavel{
	

	public CorrentistaFisico(int codigo, String nome, long telefone, boolean estaLogado, String senha) {
		super(codigo, nome, telefone, estaLogado, senha);
		// TODO Auto-generated constructor stub
	}
	protected String cpf;
	
	public void teste() {
		
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public void login() {
		setEstaLogado(true);
	}
	@Override
	public void logout() {
		if(getEstaLogado()) {
			setEstaLogado(false);
		}
	}
	
}
