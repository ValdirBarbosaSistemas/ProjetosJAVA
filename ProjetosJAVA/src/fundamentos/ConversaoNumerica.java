package fundamentos;

public class ConversaoNumerica {
	public static void main(String[] args) {

		/*
		 * Para se fazer o casting voce antes do valor entre o parêntese coloca o tipo
		 * em que quer fazer o casting, ou seja, ver a fórmula abaixo...
		 */
		//Exemplo01 (CONVERSAO EXPLICITA)
		float f = (float) 0.1;
		System.out.println(f);
		//USANDO O CASTING
		
		//Exemplo02 (CONVERSAO EXPLICITA)
		int i1 = (int) 7.9;
		System.out.println(i1);
		
		//Exemplo03 (CONVERSAO IMPLICITA)
		
		int i2 = 'a';
		System.out.println(i2); //o valor caractere tem um inteiro associado
		
		//Exemplo04 (CONVERSAO IMPLICITA)
		
		double d = 1001;
		System.out.println(d);
	}
}
