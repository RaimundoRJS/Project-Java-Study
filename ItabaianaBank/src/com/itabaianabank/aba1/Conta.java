package com.itabaianabank.aba1;



import java.time.LocalDate;

public  class Conta {
	private int numero;
	private float saldo;
	private LocalDate dataAbertura;
	private LocalDate dataEncerramento;
	private String tipo;
	

	public Conta(int numero, float saldo, LocalDate dataAbertura, LocalDate dataEncerramento, String tipo,
			com.itabaianabank.aba1.CorrentistaFisico correntistaFisico) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.dataAbertura = dataAbertura;
		this.dataEncerramento = dataEncerramento;
		this.tipo = tipo;		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public LocalDate getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public LocalDate getDataEncerramento() {
		return dataEncerramento;
	}

	public void setDataEncerramento(LocalDate dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}
	
}
