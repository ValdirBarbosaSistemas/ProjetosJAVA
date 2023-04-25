package orientacaoObjeto.composicao;

import java.util.ArrayList;

public class Compra {
	String cliente;
	ArrayList<Item> item = new ArrayList<Item>();

	double obterValorTotal() {
		double total = 0;
		for (Item itens : item) {
			total += itens.quantidade * itens.preco;
		}
		return total;
	}
}
