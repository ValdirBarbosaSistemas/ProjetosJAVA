package fundamentos;

public class OperadoresBinariosAritmeticos {
	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 4;
		int num3 = 5;
		
		//Operadores: + - * / %
		int soma = num1 + num2 + num3 + 6;
		System.out.println(soma);
		System.out.println(num1 - num2 - num3);
		
		/*
		 * Aprendemos na mat�matica a ordem de c�lculos, ou seja, nesta ocasi�o
		 * fazemos o c�lculo da esquerda para direita
		 */
		
		//Cuidado com a preced�ncia
		
		//System.out.println(num1 + num3 * num2 / 2); O RESULTADO DA 13
		/*Sabemos nessa ocasi�o que primeiro multiplica-se e depois soma,
		 * POR�M, SE QUISER 'FOR�AR' A PRECED�NCIA TERIA QUE FAZER USANDO OS
		 * PAR�NTESES.
		 */
		System.out.println((num1 + num3) * num2 / 2); // O resultado vai dar 16
		
		//RESTO DA DIVIS�O
		
		System.out.println(10 % 3); //resultado vai ser 1
	}
}
