package streamAPI;

public class Produto {
    // Atributos

    final String nome;
    final double preco;
    final double desconto;
    final double valorFrete;

    // Construtor

    public Produto(String nomeProduto, double precoProduto, double descontoProduto, double valorFrete) {
        this.nome = nomeProduto;
        this.preco = precoProduto;
        this.desconto = descontoProduto;
        this.valorFrete = valorFrete;
    }
}