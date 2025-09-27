package com.exemplo.veiculos;

import com.exemplo.modelo.Fretavel;
import com.exemplo.modelo.Veiculo;

public class Carro extends Veiculo implements Fretavel {
	public Carro(String placa, int ano) {super(placa, ano);}
	
	@Override
	public double calcularCustoFrete(double distanciaEmKm) {return distanciaEmKm * 1.25;}
}
