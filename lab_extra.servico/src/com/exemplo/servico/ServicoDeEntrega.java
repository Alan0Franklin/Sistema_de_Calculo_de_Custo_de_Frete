package com.exemplo.servico;

import java.util.ArrayList;
import com.exemplo.modelo.Fretavel;

public class ServicoDeEntrega {
	private ArrayList<Fretavel> Lista;
	private double distanciaEmKm;
	
	public ServicoDeEntrega(double distanciaEmKm, ArrayList<Fretavel> Lista) {
		this.distanciaEmKm = distanciaEmKm;
		this.Lista = new ArrayList<>(Lista);
	}
	public double calcularCustoTotal() {
		double soma = 0;
		for (Fretavel f : Lista) {soma += f.calcularCustoFrete(this.distanciaEmKm);}
		return soma;
	}
	public ArrayList<Fretavel> getLista() {return Lista;}
	public double getDistanciaEmKm() {return distanciaEmKm;}
}
