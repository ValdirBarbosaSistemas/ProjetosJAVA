package collections;

import java.util.HashSet;

public class hash {
	public static void main(String[] args) {
		HashSet<Usuario> usuarios = new HashSet<Usuario>();

		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Ana"));
		usuarios.add(new Usuario("Guilherme"));
		usuarios.add(new Usuario("João"));

		// Pode-se fazer dessa forma
		usuarios.contains(new Usuario("João"));

		// Como também pode-se fazer dessa forma
		boolean resultado = usuarios.contains(new Usuario("João"));
		System.out.println(resultado);
	}
}
