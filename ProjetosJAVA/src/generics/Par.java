package generics;

public class Par<C, V> {

	// Criando um Generics com uma estrutura chave/valor
	private C chave;
	private V valor;

	// Construtor

	public Par() {

	}

	public Par(C chave, V valor) {
		this.chave = chave;
		this.valor = valor;
	}

	// Métodos Getters e Setters

	public C getChave() {
		return chave;
	}

	public void setChave(C chave) {
		this.chave = chave;
	}

	public V getValor() {
		return valor;
	}

	public void setValor(V valor) {
		this.valor = valor;
	}

	// Gerando Equals e Hashcode em relação a chave

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chave == null) ? 0 : chave.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Par<?, ?> other = (Par<?, ?>) obj;
		if (chave == null) {
			if (other.chave != null)
				return false;
		} else if (!chave.equals(other.chave))
			return false;
		return true;
	}
}
