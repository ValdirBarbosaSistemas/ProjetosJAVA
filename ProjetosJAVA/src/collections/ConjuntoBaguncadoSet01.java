package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncadoSet01 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("teste"); // String
		conjunto.add(1); // int -> Integer
		conjunto.add('X'); // char -> Character
		// Lembrando que na collection nao suporta tipos primitivos, ou seja, ele ira
		// converter para os do tipo WRAPPER que sao para objetos

		// na collection para ver o tamanho nao e length e sim size
		System.out.println("O tamanho do conjunto e: " + conjunto.size());

		conjunto.add("teste"); // Vimos que nao pode colocar valores iguais na collection, ou seja,
		// Ele nao vai dar erro, ele so nao vai incluir na collection
		
		System.out.println("O tamanho do conjunto e: " + conjunto.size());
		
		//para remover um elemento da collection coloca-se a palavra 'remove'
		conjunto.remove("teste");
		
		//caso ele remover o item certo, ele ira retornar um true. Caso o item nao exista ele retornara false
		System.out.println("O tamanho do conjunto e: " + conjunto.size());
		
		/* Na collection tambem existe um metodo chamado 'contains' que serve para ver se ha um 
		 * determinado item na collection. Se houver ele retornara¡ true, caso nao retornara false
		 */
		
		System.out.println(conjunto.contains(1.2)); //True porque existe
		System.out.println(conjunto.contains("teste")); // False porque foi removido
		
		Set nums = new HashSet(); //Esse modo de criacao de collection tambem e possivel
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.addAll(nums); // Ira adicionar TUDO da collection (nums) para a collection (conjunto)
		System.out.println(conjunto);
		
		//conjunto.clear(); Serve para limpar TODO o conjunto da collection
	}
}
