package lambdas.functionalInterface;

import java.util.function.Predicate;

public class PredicadoComposicao {
	public static void main(String[] args) {
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;
		System.out.println(isPar.and(isTresDigitos).test(22));

		/*
		 * Neste caso, (PREDICATE), que retorna um boolean, a composição de função é
		 * através das OPERAÇÕES LÓGICAS, ou seja, AND, OR ou NOT (NEGATE).
		 */
	}
}
