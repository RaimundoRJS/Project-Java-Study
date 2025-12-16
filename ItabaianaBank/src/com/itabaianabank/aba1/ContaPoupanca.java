package com.itabaianabank.aba1;

import java.time.LocalDate;
public class ContaPoupanca extends Conta {
	public ContaPoupanca(int numero, float saldo, LocalDate dataAbertura, LocalDate dataEncerramento, String tipo,
			CorrentistaFisico correntistaFisico) {
		super(numero, saldo, dataAbertura, dataEncerramento, tipo, correntistaFisico);
		// TODO Auto-generated constructor stub
	}
	private float taxaVerificacao;
	private LocalDate diaVariacao;
	
	
	public float getTaxaVerificacao() {
		return taxaVerificacao;
	}

	public void setTaxaVerificacao(float taxaVerificacao) {
		this.taxaVerificacao = taxaVerificacao;
	}

	public LocalDate getDiaVariacao() {
		return diaVariacao;
	}

	public void setDiaVariacao(LocalDate diaVariacao) {
		this.diaVariacao = diaVariacao;
	}

}
