package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {

		// FunÃ§Ã£o lambda
		Calculo calc = (x, y) -> {
			return x + y;
		};
		System.out.println(calc.executar(2, 3));

		/*
		 * Outra forma de fazer lambda Ã© SEM A INCLUSÃƒO DA PALAVRA 'RETURN', basta nÃ£o
		 * tirar as chaves '{}', pois ele automaticamente irÃ¡ retornar o valor. ISSO
		 * SÃ“ Ã‰ VÃ�LIDO EM APENAS UMA ÃšNICA SENTENÃ‡A DE CÃ“DIGO, POIS SE FOR MAIS DE UMA
		 * DÃ� ERRO E Ã‰ NECESSÃ�RIO COLOCAR AS CHAVES.
		 */
		calc = (x, y) -> x * y;
		System.out.println(calc.executar(2, 3));
	}
}
