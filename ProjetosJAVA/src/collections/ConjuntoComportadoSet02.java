package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportadoSet02 {
	public static void main(String[] args) {

		/*
		 * Neste caso a collection foi 'amarrada' como sendo do tipo STRING, ou seja,
		 * agora nessa collection so se pode colocar String, caso contrario dara ERRO
		 */
		Set<String> lista = new HashSet<String>();
		lista.add("Ana");
		lista.add("Carlos");
		lista.add("Luca");
		lista.add("Pedro");

		for (String listaCandidatos : lista) {
			System.out.println(listaCandidatos);

			/*
			 * Note que a ordenacao feita pelo Set (Nao respeita a ordem de insercao). Para
			 * ordenar teria que ser usado o metodo 'TreeSet' ou seja...
			 * 
			 * Set<String> lista = new TreeSet<String>() No caso teria que fazer a
			 * importacao do TreeSet
			 *  
			 */

			// Neste caso fizemos como o anterior, sendo que com numeros inteiros
			Set<Integer> nums = new HashSet<Integer>();
			nums.add(1);
			nums.add(2);
			nums.add(120);
			nums.add(6);

			for (int a : nums) {
				System.out.println(a);

			}
		}
	}
}
