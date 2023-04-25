package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
	public static void main(String[] args) {
		Consumer<String> print = System.out::print;

		/*
		 * O map no caso serve para 'mapear os elementos', ou seja, se temos uma stream
		 * de 8 elementos ela irá fazer um mapeamento e irá retornar uma stream de 8
		 * elementos TRANSFORMADA. O Map recebe uma FUNCTION como Interface funcional. (VER A TABELA
		 * DAS INTEFACES FUNCIONAIS PARA VER COMO FUNCIONA)
		 */

		List<String> marcas = Arrays.asList("bmw ", "Audi ", "Honda ");
		// Imprimindo através do MAP todas as letras maiúsculas
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);

		UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		UnaryOperator<String> grito = n -> n + "!!!";
		/*
		 * Uma letra com índice '0' + "" vai gerar uma String que vai ter o primeiro
		 * caracter da letra indicada
		 */
		System.out.println("\n\nUsando composição!");
		marcas.stream().map(maiuscula).map(primeiraLetra).map(grito).forEach(print);
	}
}
