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
		 * Aprendemos na matématica a ordem de cálculos, ou seja, nesta ocasião
		 * fazemos o cálculo da esquerda para direita
		 */
		
		//Cuidado com a precedência
		
		//System.out.println(num1 + num3 * num2 / 2); O RESULTADO DA 13
		/*Sabemos nessa ocasião que primeiro multiplica-se e depois soma,
		 * PORÉM, SE QUISER 'FORÇAR' A PRECEDÊNCIA TERIA QUE FAZER USANDO OS
		 * PARÊNTESES.
		 */
		System.out.println((num1 + num3) * num2 / 2); // O resultado vai dar 16
		
		//RESTO DA DIVISÃO
		
		System.out.println(10 % 3); //resultado vai ser 1
	}
}
