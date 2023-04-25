package tratamentoDeErroeExcecao;

public class Basico {
	public static void main(String[] args) {
		Aluno a1 = null;

		// Para tratarmos o erro, é necessário usar o 'Try/Catch'
		try {
			imprimirNomeDoAluno(a1);

		} catch (Exception excecao) {
			System.out.println("Ocorreu um erro, pois a variável não foi inicializada!!");
		}
		/*
		 * Sem o 'try/catch' daria um erro, que no caso seria 'NullPointerException', ou
		 * seja, não foi inicializado nenhum valor ou o objeto não foi instanciado. E
		 * pra isso é necessário usar o Try/Catch para poder tratar o erro. Para usá-lo,
		 * é necessário dentro das chaves do try colocar a expressão ou valor que voce
		 * quer usar e no catch colocar o tipo do erro e o nome da variável que irá ser
		 * colocada/usada dando abaixo a mensagem de erro que irá aparecer na tela.
		 */

		// Vai dar erro devido que nenhum número pode ser dividido por zero
		try {
			System.out.println(7 / 0);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
			/*
			 * O método 'getMessage', mostra o motivo do erro na tela do usuário pela classe
			 * que no caso é a 'ArithméticException'.
			 */
		}
		System.out.println("Fim do programa");
	}

	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
