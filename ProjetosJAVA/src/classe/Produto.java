package classe;

public class Produto {
	String nome; // atributo da classe produto
	double preco; // atributo da classe produto
	static double desconto = 0.25; // atributo da classe produto

	// Construtor
	Produto(String nomeInicial, double precoInicial) {
		this.nome = nomeInicial;
		this.preco = precoInicial;
	}

	// CONSTRUTOR PADRAO (OBS: NAO PRECISA DECLARAR TIPO DA VARIAVEL
	Produto() {
	}

	// METODO

	// fazer o preco com desconto 
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
}