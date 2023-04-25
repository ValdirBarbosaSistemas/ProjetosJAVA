package generics;

public class CaixaTeste {
	public static void main(String[] args) {
		// Caixa caixaA = new Caixa();
		/*
		 * Neste caso agente vai conseguir instanciar o objeto mesmo sem colocar o tipo
		 * dele, mas não é uma melhor solução. A melhor solução seria voce 'Criar' o
		 * tipo do objeto que quer inserir.
		 */
		Caixa<String> caixaA = new Caixa<String>();
		caixaA.guardar("Olá, tudo bem?");
		System.out.println(caixaA.abrir());

		Caixa<Double> caixaB = new Caixa<Double>();
		caixaB.guardar(3.1415);
		System.out.println(caixaB.abrir());
		/*
		 * Agora com o Generics, voce pode criar qualquer tipo de objeto que serão
		 * resolvidos em outro momento.
		 */
	}
}
