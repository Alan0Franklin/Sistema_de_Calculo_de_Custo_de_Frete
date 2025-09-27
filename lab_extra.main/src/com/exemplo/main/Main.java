package com.exemplo.main;

import java.util.ArrayList;
import com.exemplo.modelo.*;
import com.exemplo.veiculos.*;
import com.exemplo.entregadores.*;
import com.exemplo.servico.ServicoDeEntrega;

public class Main {
	public static void main(String[] args) {
		ArrayList<Fretavel> Lista = new ArrayList<Fretavel>();

		// Simule uma entrega de 10km feita por um Funcionario com um Carro. Adicione os dois à lista e calcule o custo total.
		Lista.add(new Funcionario());
		Lista.add(new Carro("HOM-2916", 2006)); 
		ServicoDeEntrega simulacao1 = new ServicoDeEntrega(10, Lista);
		System.out.printf("Custo Total Resultado da Primeira Simulação: R$ %.2f%n", simulacao1.calcularCustoTotal());
		
		Lista.clear();
		// Simule outra entrega de 25km feita por um Autonomo com uma Motocicleta. Calcule o custo total.
		Lista.add(new Autonomo());
		Lista.add(new Motocicleta("MZW-9770", 2022)); 
		ServicoDeEntrega simulacao2 = new ServicoDeEntrega(25, Lista);
		System.out.printf("Custo Total Resultado da Segunda Simulação: R$ %.2f%n", simulacao2.calcularCustoTotal());
	}
}
