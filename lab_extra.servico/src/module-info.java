module lab_extra.servico {
	requires transitive lab_extra.modelo;
	requires lab_extra.veiculos;
	requires lab_extra.entregadores;
	exports com.exemplo.servico;
}