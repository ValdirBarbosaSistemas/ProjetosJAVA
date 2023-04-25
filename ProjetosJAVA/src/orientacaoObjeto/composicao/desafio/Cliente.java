package orientacaoObjeto.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	String nome;
	List<Compras> compra = new ArrayList<Compras>();

	// Construtor

	Cliente(String nomeCliente) {
		this.nome = nomeCliente;
	}

	double obterValorTotal() {
		double total = 0;

		for (Compras compras : compra) {
			total += compras.obterValorTotal();
		}

		return total;
	}
}
