package generics;

public class CaixaObjetoTeste {

	public static void main(String[] args) {
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3); // Valor primitivo do tipo double e irá converter para Double (Wrapper)

		Integer coisa = (Integer) caixaA.abrir();
		System.out.println(coisa);
		// Irá ocorrer uma excecão, pois o tipo declarado é um Double. (NEM TODO OBJECT
		// É DOUBLE).
	}
	/*
	 * Sem o Generics voce vai trabalhar muito com 'Casting' para converter os
	 * dados, e isso não é legal. Para esse tipo de cenário o Generics vai ser mais
	 * interessante.
	 */
}
