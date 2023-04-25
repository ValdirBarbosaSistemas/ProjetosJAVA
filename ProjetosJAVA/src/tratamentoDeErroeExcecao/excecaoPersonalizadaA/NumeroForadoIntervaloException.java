package tratamentoDeErroeExcecao.excecaoPersonalizadaA;

@SuppressWarnings("serial")
/*
 * Aqui serve para ocultar o erro que ocorre quando chamamos a classe
 * 'RuntimeException'. Pois ele geraria uma serialização em java, que é guardar
 * um objeto em um código de serial. Mais informações sobre o assunto favor ver
 * na internet (SERIALIZAÇÃO EM JAVA).
 */

// EXCEÇÃO NÃO CHECADA
public class NumeroForadoIntervaloException extends RuntimeException {
	private String nomeDoAtributo;

	public NumeroForadoIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}

	@Override
	public String getMessage() {
		return String.format("O atributo %s está FORA DO INTERVALO", nomeDoAtributo);
	}
	/*
	 * Aqui ele tá querendo receber o nome do atributo e quando lançar a exceção,
	 * mandar a mensagem de erro que está FORA DO INTERVALO.
	 */
}
