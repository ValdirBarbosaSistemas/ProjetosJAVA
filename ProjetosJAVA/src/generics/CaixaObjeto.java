package generics;

public class CaixaObjeto {
	private Object coisa;

	// Set
	public void guardar(Object coisa) {
		this.coisa = coisa;
	}

	// Get
	public Object abrir() {
		return coisa;
	}
	// Basicamente o que temos aqui é get e set
}
