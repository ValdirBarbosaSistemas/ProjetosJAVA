package orientacaoObjeto.polimorfismo;

public class Pessoa {
	private double peso;

	// Construtor

	public Pessoa(double peso) {
		setPeso(peso);
	}

	// Getters e Setters

	public double getPeso() {
		return peso;
	}

	public void setPeso(double pesoPessoa) {
		if (peso >= 0) {
			this.peso = pesoPessoa;
		}
	}

	public void comer(Comida comida) {
		this.peso += comida.getPeso();
	}
}
