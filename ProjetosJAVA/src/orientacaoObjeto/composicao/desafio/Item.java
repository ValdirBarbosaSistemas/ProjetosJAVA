package orientacaoObjeto.composicao.desafio;

public class Item {
	Produto produto;
	int quantidade;

	// Construtor

	Item(Produto produtoItem, int quantidadeItem) {
		this.produto = produtoItem;
		this.quantidade = quantidadeItem;
	}
}
