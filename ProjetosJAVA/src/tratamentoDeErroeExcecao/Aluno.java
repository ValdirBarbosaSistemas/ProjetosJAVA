package tratamentoDeErroeExcecao;

public class Aluno {

	// Atributos
	public final String nome;
	public final double nota;

	// Construtor
	public Aluno(String nomeAluno, double notaAluno) {
		this.nome = nomeAluno;
		this.nota = notaAluno;
	}

	// Método para ser usado no capítulo de Match 
	@Override
	public String toString() {
		return nome + " tem a nota " + nota;
	}

	// Método para ser usado no capítulo de Min e Max
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(nota);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(nota) != Double.doubleToLongBits(other.nota))
			return false;
		return true;
	}
}