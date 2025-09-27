package com.exemplo.entregadores;

import com.exemplo.modelo.Fretavel;
import com.exemplo.modelo.Entregador;

public class Autonomo extends Entregador implements Fretavel {
	@Override
	public double calcularCustoFrete(double distanciaEmKm) {return distanciaEmKm * 0.95;}
}
