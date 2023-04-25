package collections;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	public static void main(String[] args) {
		List<Usuario> lista = new ArrayList<Usuario>();
		Usuario u1 = new Usuario("Ana");
		lista.add(u1); // Uma maneira de se criar listas

		lista.add(new Usuario("Carlos")); // Outra maneira de se criar listas
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));

		System.out.println(lista.get(3)); // Acesso pelo índice

		lista.remove(1); // removeu o item de nome 'Carlos'

		// For each para percorrer os itens da lista
		for (Usuario u : lista) {
			System.out.println(u.nome);
		}
		System.out.println("Tem? " + lista.contains(new Usuario("Lia")));
	}
}
