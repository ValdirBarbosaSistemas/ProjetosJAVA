package lambdas.functionalInterface;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {

		Produto p = new Produto("Ipad", 3235.89, 0.13);
		/*
		 * 1. A partir do produto calcular o preco real (com desconto) 
		 * 2. Imposto Municipal: >= 2.500,00 (8,5%) / < 2.500,00 (Isento) 
		 * 3. Frete: >= 3.000,00 (100) / < 3.000,00 (50) 
		 * 4. Arredondar: Deixar duas casas decimais 
		 * 5. Formatar: R$ 1.234,56
		 */
		// Pedido 1;
		Function<Produto, Double> precoFinal = (p1) -> {
			return p1.preco * (1 - p1.desconto);
		};
		// Pedido 2, Pedido 3 e Pedido 4;
		UnaryOperator<Double> impostoMunicipal = (valor) -> {
			return valor >= 2500 ? valor * 1.085 : valor; // Operador ternário.
		};
		UnaryOperator<Double> frete = (precoProduto) -> {
			return precoProduto >= 3000 ? precoProduto + 100 : precoProduto + 50;
		};
		UnaryOperator<Double> arredondar = (precoArredondado) -> {
			return Double.parseDouble(String.format("%.2f", precoArredondado));
		};
		// Pedido 5;
		Function<Double, String> formatar = (precoFormatado) -> {
			return ("R$" + precoFormatado).replace(".", ",");
		};		
		String preco = precoFinal.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).andThen(formatar)
				.apply(p);
	
		System.out.println("O Preço Final é: " + preco);

	}
}
