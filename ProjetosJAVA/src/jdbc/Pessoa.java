package jdbc;

public class Pessoa {
	private String nome;
	private int codigo;

	// Construtor

	public Pessoa(String nome, int codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}

	// Métodos Getters e Setters

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}
