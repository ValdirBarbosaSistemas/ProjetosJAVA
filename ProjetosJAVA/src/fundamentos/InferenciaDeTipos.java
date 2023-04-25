package fundamentos;

public class InferenciaDeTipos {
	public static void main(String[] args) {
		double a = 4.5; // TIPO DOUBLE
		System.out.println(a);
		
		var b = 4.5; // TIPO DOUBLE
		System.out.println(b);
		
		var c = "Isso e um texto"; // TIPO STRING
		System.out.println(c);
		
		c = "Outro texto"; // TIPO STRING
		System.out.println(c);
		
		//c = 4.5; //Nao pode fazer isso, pois esta 'quebrando a inferencia de tipos';
		
		/* Ou seja, o que e INFERENCIA? Inferencia e tudo aquilo que voce pode declarar sem
		 * precisar de dizer o tipo da variavel. Ela vai saber de acordo com o tipo que voce
		 * colocar na atribuicao do valor.
		 */
	}
}
