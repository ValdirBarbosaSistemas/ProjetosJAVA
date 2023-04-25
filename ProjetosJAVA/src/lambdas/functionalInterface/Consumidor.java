package lambdas.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		/*
		 * A interface funcional CONSUMER ela tem como entrada UM valor qualquer e não
		 * retorna NADA
		 */

		// Abaixo, ele tá só imprimindo o nome.
		Consumer<Produto> imprimir = p -> System.out.println(p.nome);

		Produto p1 = new Produto("Caneta", 12.34, 0.10);
		imprimir.accept(p1);
		// O consumer usa um método para mostrar o dado do produto com o ACCEPT
		/*
		 * OBS1 - O MÉTODO Foreach tem como parâmetro um consumer, ou seja, não é
		 * necessário colocar a palavra ACCEPT nele, pois o mesmo já tem. Veja exemplo
		 * abaixo.
		 */

		Produto p2 = new Produto("Notebook", 2.000, 0.25);
		List<Produto> produtos = Arrays.asList(p1, p2);
		produtos.forEach(imprimir); // Irá imprimir os nomes SEM USAR O ACCEPT
		produtos.forEach(p -> System.out.println(p.preco)); // Usando Lambda
		produtos.forEach(System.out::print); // Usando METHOD REFERENCE ele irá imprimir OS PRODUTOS
	}
}
