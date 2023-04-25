package classe.desafio;

public class DesafioPessoa {
	// atributos
	String nome;
	int peso;

	// construtor
	DesafioPessoa(String nome, int peso) {
		this.nome = nome;
		this.peso = peso;
	}

	// Método
	void comer(DesafioComida comida) {
		if (comida != null) {
			this.peso += comida.peso;
		}
	}

	// Método
	String apresentacao() {
		return "Olá meu nome é" + nome + "e tenho" + peso + "Kg";
	}
}
