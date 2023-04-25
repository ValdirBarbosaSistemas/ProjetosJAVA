package tratamentoDeErroeExcecao.excecaoPersonalizadaA;

import tratamentoDeErroeExcecao.Aluno;

public class TesteValidacoes {
	public static void main(String[] args) {
		try {
			Aluno aluno = new Aluno("Valdir", -7); // Caso não tivesse nome ele daria erro
			// Neste ponto de vista vai dá erro, pois o nome tá vazio e a nota abaixo de
			// zero
			Validar.aluno(aluno);
			/*
			 * Neste caso do CATCH voce teria duas opções, ou colocar outro catch, ou mesmo
			 * colocar um pipe '|' e o nome da outra classe que quer colocar no catch
			 */
		} catch (StringVaziaException | NumeroForadoIntervaloException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Fim do programa");
		// Caso tudo estiver certo, ele vai imprimir
	}
}