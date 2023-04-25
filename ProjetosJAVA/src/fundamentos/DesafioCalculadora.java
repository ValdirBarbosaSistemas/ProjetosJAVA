package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		//Ler num1, num2
		//+ - * / %
		Scanner entrada = new Scanner (System.in);
		double num1 = entrada.nextDouble();
		double num2 = entrada.nextDouble();
		System.out.println("Informe um número: ");
		System.out.println("Informe mais um número: ");
		System.out.println("Informe o operador: ");
		String op = entrada.next();
		
		//LÓGICA
		
		double resultado = "+".equals(op)? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
		entrada.close();
	}
}
