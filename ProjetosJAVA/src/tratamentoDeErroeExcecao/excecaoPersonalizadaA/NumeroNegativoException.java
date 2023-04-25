package tratamentoDeErroeExcecao.excecaoPersonalizadaA;

@SuppressWarnings("serial")
public class NumeroNegativoException extends RuntimeException {
	private String nomeDoAtributo;

	public NumeroNegativoException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}

	@Override
	public String getMessage() {
		return String.format("O número %s é NEGATIVO", nomeDoAtributo);
	}
	/*
	 * Aqui ele tá querendo receber o nome do atributo e quando lançar a exceção,
	 * mandar a mensagem de erro que está FORA DO INTERVALO.
	 */
}
