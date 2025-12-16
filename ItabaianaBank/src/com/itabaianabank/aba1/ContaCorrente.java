package com.itabaianabank.aba1;

import java.time.LocalDate;

public class ContaCorrente extends Conta {
	

	public ContaCorrente(int numero, float saldo, LocalDate dataAbertura, LocalDate dataEncerramento, String tipo,
			CorrentistaFisico correntistaFisico) {
		super(numero, saldo, dataAbertura, dataEncerramento, tipo, correntistaFisico);
		// TODO Auto-generated constructor stub
	}

	private float taxaMovimentacao;
	
	

	private float movimentacao;

	
	
	public float getMovimentacao() {
		return movimentacao;
	}

	public void setMovimentacao(float movimentacao) {
		this.movimentacao = movimentacao;
	}

	
	public float getTaxaMovimentacao() {
		return taxaMovimentacao;
	}

	public void setTaxaMovimentacao(float taxaMovimentacao) {
		this.taxaMovimentacao = 0.006f;
	}

}
