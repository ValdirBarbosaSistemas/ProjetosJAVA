package lambdas.functionalInterface;

import java.util.function.Predicate;

//Predicate = Recebe um valor/par�metro qualquer e retorna VERDADEIRO OU FALSO (Boolean)
public class Predicado {
	public static void main(String[] args) {
		Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;

		Produto produto = new Produto("Notebook", 3983.89, 0.15);
		System.out.println(isCaro.test(produto)); // Test. � uma fun��o para ver resultados no Predicate
	}

}
