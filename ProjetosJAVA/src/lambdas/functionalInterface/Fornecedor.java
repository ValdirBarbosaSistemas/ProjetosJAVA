package lambdas.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	public static void main(String[] args) {

		/*
		 * Na interface funcional SUPPLIER voce pode colocar uma lista dentro dele. Ela
		 * não recebe NENHUM parâmetro, mas lhe retorna um valor qualquer.
		 */
		Supplier<List<String>> umaLista = () -> Arrays.asList("Bia", "Lia", "Gui");
		System.out.println(umaLista.get()); // Para mostrar o conteúdo usa-se o 'get'
	}
}
