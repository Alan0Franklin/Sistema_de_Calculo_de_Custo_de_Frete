package com.exemplo.veiculos;

import com.exemplo.modelo.Fretavel;
import com.exemplo.modelo.Veiculo;

public class Motocicleta extends Veiculo implements Fretavel {
	public Motocicleta(String placa, int ano) {super(placa, ano);}
	
	@Override
	public double calcularCustoFrete(double distanciaEmKm) {return distanciaEmKm * 0.45;}
}
