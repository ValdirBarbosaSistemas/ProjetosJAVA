package orientacaoObjeto.composicao;

public class Item {
	String nome;
	int quantidade;
	double preco;
	
	//Construtor
	Item(String nomeItem, int quantidadeItem, double precoItem){
		this.nome = nomeItem;
		this.quantidade = quantidadeItem;
		this.preco = precoItem;
	}
}
