package generics;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<C extends Number, V> {
// Aqui ele meio que 'amarrou' a classe para que a chave só receber objetos do tipo NUMBER

	private final Set<Par<C, V>> itens = new HashSet<>();

	public void adicionar(C chave, V valor) {
		if (chave == null)
			return; // Ele vai sair do método só com o 'return'
		Par<C, V> novoPar = new Par<C, V>(chave, valor);

		if (itens.contains(novoPar)) {
			itens.remove(novoPar);
		}

		itens.add(novoPar);
	}

	public V getValor(C chave) {
		if (chave == null)
			return null;

		Optional<Par<C, V>> parOpcional = itens.stream()
				.filter(par -> chave.equals(par.getChave()))
				.findFirst();

		return parOpcional.isPresent() ? parOpcional.get().getValor() : null;
	}
}
