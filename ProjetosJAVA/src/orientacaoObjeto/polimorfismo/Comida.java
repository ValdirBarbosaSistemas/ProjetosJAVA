package orientacaoObjeto.polimorfismo;

public class Comida {

	private double peso;

	// Construtor

	public Comida(double peso) {
		setPeso(peso);
	}

	// Getters e Setters

	public double getPeso() {
		return peso;
	}

	public void setPeso(double pesoComida) {
		if (peso >= 0) {
			this.peso = pesoComida;
		}
	}

}
