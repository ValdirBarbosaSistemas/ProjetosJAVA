package tratamentoDeErroeExcecao;

public class ChecadaVsNaoChecada {
	public static void main(String[] args) {

		// Usando o try/catch
		try {
			geraErro01();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			geraErro02();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Fim do programa!!!");
	}

	/*
	 * Do jeito que está abaixo NÃO VAI OCORRER NADA! Pois para ocorrer o erro não
	 * basta apenas criar o erro, tem que lançar o erro. Daí a palavra 'TROW' que
	 * obrigatoriamente tem que ser usada. Throw quer dizer 'lançar'
	 */

	/*
	 * static void geraErro01() { 
	 * 		new RuntimeException("Ocorreu um erro aqui#01!!!"); 
	 * 	}
	 */

	/*
	 * No momento que eu passei uma 'RuntimeException' eu tenho uma Exceção NÃO
	 * CHECADA ou NÃO VERIFICADA. Que nada mais é que um erro que eu não quero
	 * tratar, ou seja, eu posso ou não posso tratar o erro. NÃO É OBRIGATÓRIO.
	 * 
	 */
	static void geraErro01() {
		throw new RuntimeException("Ocorreu um erro aqui#01!!!");
	}

	/*
	 * Neste caso aqui temos uma Exceção CHECADA, devido a palavra EXCEPTION, ou
	 * seja no momento em que tem o EXCEPTION voce É OBRIGADO a colocar a palavra
	 * THROW e também na assinatura do método colocar a palavra reservada 'THROWS'
	 * no plural logo após dos parênteses, e também a classe 'Exception' pois se
	 * voce não colocar, o sistema nem vai compilar o programa e ele não será
	 * executado. Devido a isso voce OBRIGATORIAMENTE deve tratar o erro.
	 */

	static void geraErro02() throws Exception {
		throw new Exception("Ocorreu outro erro aqui#02!!!");
	}
}