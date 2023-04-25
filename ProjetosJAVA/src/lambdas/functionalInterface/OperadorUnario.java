package lambdas.functionalInterface;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	public static void main(String[] args) {

		/*
		 * No UnaryOperator, o tipo de parâmetro que voce passa é o tipo de retorno que
		 * vai ser mostrado. E com ele voce pode fazer 'encadeamento' de várias chamadas
		 * de função para ficar melhor a composição da função. Ou seja, ele tem como
		 * parâmetro uma String e retorna uma String.
		 */
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;

		int resultado1 = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0);

		System.out.println(resultado1);

		/*
		 * No UnaryOperator temos outro tipo de função para fazer a composição de função
		 * que é chamado de 'compose'. Que no caso ele faz ao contrário do 'andThen' (E
		 * então). No 'andThen' ele faz de cima pra baixo e no 'compose' ele faz de
		 * baixo pra cima.
		 */

		int resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(0);

		System.out.println(resultado2);
	}
}
