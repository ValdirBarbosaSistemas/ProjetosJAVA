package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Tipos booleanos
		
		boolean bol01 = true;
		boolean bol02 = false;
		System.out.printf("%b %b\n", bol01, bol02); // 'System' FORMATADO
		/*
		 * O sinal '%b' serve para ser impresso o boolean na tela de maneira formatada e
		 * lembrando que '\n' serve para quebrar a linha.
		 */
		
		// Tipo CHAR
		
		char c1 = 'a';
		char c2 = '!';
		char c3 = '\u0050'; // tabela unicode 'Letra P'
		System.out.printf("%c %c %c\n", c1, c2, c3); // 'System' FORMATADO
		
		// Tipo primitivo inteiro
		
		byte b = 127; // vai até '127' que é o permitido. Se ultrapassar dá erro
		short s = 32767; // MÁXIMO PERMITIDO
		int i = 2_147_483_647; // MÁXIMO PERMITIDO '/' OPCIONAL
		long l = 9_223_372_036_854_775_807L;
		// 'L'Quando se passa do valor inteiro, usa-se a letra 'L'
		System.out.printf("%d %d %d %d\n", b, s, i, l);
		// Para ser impresso o número inteiro no formatado usa-se a letra '%d'
		System.out.println(Integer.toBinaryString(b)); // Escrever de forma BINÁRIA
		System.out.println(Integer.toBinaryString(s));
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Long.toBinaryString(l)); //'long' devido a não ser do tipo 'STRING'
		
		// Tipo Primitivos reais (Ponto Flutuante)
		float f = 3.1416f; // Mesma coisa do 'long' para usá-lo acrescentar 'f'
		double d = 2.45;
		System.out.printf("%f %f", f, d);
		
		/*ALGUMAS OBSERVACOES:
		 * byte, short, int, long = 0 (O VALOR PADRAO)
		 * float, double = 0.0
		 * boolean = false
		 * char = '\u0000'
		 * 
		 * O VALOR PADRAO SO VALE SE NAO FOR DEFINIDO SEJA NA CLASSE, INSTANCIA
		 * UMA VARIAVEL LOCAL NAO E INICIALIZADA POR PADRAO
		 */
	}
}
