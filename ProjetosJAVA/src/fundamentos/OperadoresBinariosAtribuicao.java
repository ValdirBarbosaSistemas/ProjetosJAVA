package fundamentos;

public class OperadoresBinariosAtribuicao {
	public static void main(String[] args) {
		int a = 7;
		int b = 3;

		b+= a; /* o valor de 'a' vai ser 'acrescentado' a vari�vel 'b' 
				e n�o vai haver uma substitui��o, ou seja, o resultado vai ser 10 (b = b + a)*/
		b*= 4; // isso significa b = b * 4
		b/= 2; // isso significa b = b / 2
		b-= 2; // isso significa b = b - 2
		b%= 2; 
		System.out.println(b);
	}
}
