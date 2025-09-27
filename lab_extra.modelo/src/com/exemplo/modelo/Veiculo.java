package com.exemplo.modelo;

public abstract class Veiculo {
	protected String placa;
	protected int ano;
	
	public Veiculo(String placa, int ano) {
		this.placa = placa;
		this.ano = ano;
	}
	public String getPlaca() {return placa;}
	public int getAno() {return ano;}
}
